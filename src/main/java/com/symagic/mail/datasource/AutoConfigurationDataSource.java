package com.symagic.mail.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.bind.PropertySourceUtils;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author magicdog
 * @date 2017/8/16
 */
@Configuration
@ConditionalOnClass({ DruidDataSource.class })
@EnableConfigurationProperties(DruidDataSourceProperties.class)
public class AutoConfigurationDataSource {

    private Logger logger = LoggerFactory.getLogger(AutoConfigurationDataSource.class);
    private ConfigurableEnvironment env;
    private DruidDataSourceProperties druidDataSourceProperties;

    public AutoConfigurationDataSource(DruidDataSourceProperties druidDataSourceProperties, ConfigurableEnvironment environment){
        logger.info("druidDataSourceProperties: {}",druidDataSourceProperties);
        logger.info("environment:  {}", environment);
        this.druidDataSourceProperties = druidDataSourceProperties;
        this.env = environment;
    }

    @Bean
    public DataSource dataSource(){
        Map<String, Object> druidProperties = PropertySourceUtils.getSubProperties(this.env.getPropertySources(), "druid.datasource.");
        return getDataSource(druidProperties);
    }

    private void populateDefaultProperties(Map<String, Object> druidProperties) {
        if (druidProperties != null) {
            druidProperties.putIfAbsent("filters", "stat,wall");
            druidProperties.putIfAbsent("initialSize", "5");
            druidProperties.putIfAbsent("maxActive", "20");
            druidProperties.putIfAbsent("minIdle", "10");
            druidProperties.putIfAbsent("testWhileIdle", "true");
            druidProperties.putIfAbsent("connectionProperties", "druid.stat.slowSqlMillis=5000");
        }
    }

    public DataSource getDataSource(Map<String, Object> druidProperties) {
        druidProperties = new HashMap(druidProperties);
        this.populateDefaultProperties(druidProperties);
        DruidDataSource dataSource = null;
        try {
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(druidProperties);
            return dataSource;
        } catch (Exception e) {
            throw new RuntimeException("load datasource error, dbProperties is :" + druidProperties, e);
        }
    }
}

