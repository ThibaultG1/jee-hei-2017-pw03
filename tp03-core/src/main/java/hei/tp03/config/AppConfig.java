package hei.tp03.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

import static antlr.build.ANTLR.root;

/**
 * Created by thiba on 17/01/2017.
 */
@Configuration
@ComponentScan(basePackages = "hei.tp03.service")
public class AppConfig {

    @Bean
    public Properties dbProperties() {
        Properties prop = new Properties();
        prop.setProperty("driverClass","com.mysql.jdbc.Driver");
        prop.setProperty("jdbcUrl","jdbc:mysql://localhost:3306/hei_tp03");
        prop.setProperty("username","root");
        prop.setProperty("password","!L7!&NZJ]wURza");

        return prop;
    }
}
