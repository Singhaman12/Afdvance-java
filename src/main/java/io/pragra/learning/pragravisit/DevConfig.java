//package io.pragra.learning.pragravisit;
//
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//
//import javax.sql.DataSource;
//@Profile("prod")
//@Configuration
//
//public class DevConfig {
//    @Bean
//    public DataSource dataSource() {
//        return
//                DataSourceBuilder
//                        .create()
//                        .url("jdbc:h2:./app.db")
//                        .username("sa")
//                        .password("")
//                        .build();
//    }
//
//}
