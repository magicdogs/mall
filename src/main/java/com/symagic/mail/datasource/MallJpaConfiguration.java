package com.symagic.mail.datasource;


import com.symagic.mail.MallApplication;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Map;

/**
 *
 * @author magicdog
 * @date 2017/8/16
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "entityManagerFactoryMail",
        transactionManagerRef = "transactionManagerMail",
        basePackageClasses = MallApplication.class
)
@EnableConfigurationProperties(JpaProperties.class)
public class MallJpaConfiguration {

    private JpaProperties jpaProperties;


    private DataSource dataSource;

    public MallJpaConfiguration(JpaProperties jpaProperties, @Qualifier("dataSource") DataSource dataSource){
        this.jpaProperties = jpaProperties;
        this.dataSource = dataSource;
    }

    @Bean(name = "entityManagerFactoryMail")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryKit(EntityManagerFactoryBuilder builder) {
        LocalContainerEntityManagerFactoryBean em = builder.dataSource(dataSource)
                .properties(getVendorProperties(dataSource))
                .packages("com.symagic.mail")
                .persistenceUnit("MailPersistenceUnit").build();
        return em;
    }

    @Bean(name = "transactionManagerMail")
    PlatformTransactionManager transactionManagerKit(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryKit(builder).getObject());
    }

    private Map<String, String> getVendorProperties(DataSource dataSource) {
        return jpaProperties.getHibernateProperties(dataSource);
    }

}

