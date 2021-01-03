package uk.co.poggs.example.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * First Demo Component A
 */
@Component
public class FirstDemoComponentA {

    public static final Logger logger = LoggerFactory.getLogger(FirstDemoComponentA.class);

    public FirstDemoComponentA() {
        logger.info("Hello from FirstDemoComponentA!");
    }

    public void dummyMethod() {
        logger.info("Dummy method called");
    }

}
