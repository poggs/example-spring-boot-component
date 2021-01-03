package uk.co.poggs.example.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@SpringBootApplication
public class FirstDemoComponentApplication implements ApplicationListener<ContextRefreshedEvent> {

    public static void main(String[] args) {
        SpringApplication.run(FirstDemoComponentApplication.class, args);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Logger logger = LoggerFactory.getLogger(FirstDemoComponentApplication.class);
        logger.info("FirstDemoComponentApplication loaded");

    }

}
