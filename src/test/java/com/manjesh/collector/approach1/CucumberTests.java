package com.manjesh.collector.approach1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

/**
 * Author: mg153v (Manjesh Gowda). Creation Date: 2/17/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.manjesh.collector.approach1"},
        features = {"src/test/resources/cucumber/approach1"}
)
public class CucumberTests {
}
