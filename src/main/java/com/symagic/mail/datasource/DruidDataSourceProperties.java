package com.symagic.mail.datasource;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @author magicdog
 * @date 2017/8/16
 */
@ConfigurationProperties(prefix = "druid")
public class DruidDataSourceProperties {

    private ConnProperties datasource;

    public ConnProperties getDatasource() {
        return datasource;
    }

    public void setDatasource(ConnProperties datasource) {
        this.datasource = datasource;
    }

    public static class ConnProperties{
        private String url;
        private String username;
        private String password;
        private String filters;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getFilters() {
            return filters;
        }

        public void setFilters(String filters) {
            this.filters = filters;
        }
    }

}

