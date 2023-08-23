package com.example.springcomponentsusage;

import com.example.springcomponentsusage.usedComponents.UsedEnabledConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:some_config.xml")
@EnableConfigurationProperties(UsedEnabledConfigProperties.class)
@ConfigurationPropertiesScan("com.example.springcomponentsusage.usedComponents.scannedConfProps")
public class SpringComponentsUsageApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringComponentsUsageApplication.class, args);
    }

    @Autowired
    ApplicationContext ctx;

    @Override
    public void run(String... args) throws Exception {

    }
}
