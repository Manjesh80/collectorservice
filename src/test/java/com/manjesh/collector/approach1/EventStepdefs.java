package com.manjesh.collector.approach1;

import com.manjesh.collector.CollectorServiceApplication;
import com.manjesh.collector.domain.Event;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Author: mg153v (Manjesh Gowda). Creation Date: 2/17/2017.
 */
//@WebAppConfiguration
//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(
        classes = {CollectorServiceApplication.class},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
@ContextConfiguration
public class EventStepdefs {

    @Value("${local.server.port}")
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;
    //private RestTemplate restTemplate = (new TestRestTemplate()).getRestTemplate();

    @Given("^the application is setup$")
    public void theApplicationIsSetup() throws Throwable {
        //throw new PendingException();
    }

    @When("^the event number is (\\d+) present$")
    public void theEventNumberIsPresent(int arg0) throws Throwable {
        //throw new PendingException();
    }

    /*@Then("^the service should return the event with name$")
    public void theServiceShouldReturnTheEventWithName() throws Throwable {
        //throw new PendingException();
        ResponseEntity<Event> response = restTemplate.exchange("/event/444", HttpMethod.GET, null, Event.class, new HashMap<>());
        assertTrue(response.getBody().getEventID() == 444);
    }*/

    @Then("^the service should return the event with name$")
    public void theServiceShouldReturnTheEventWithName() throws Throwable {
        String caller = "";
        ResponseEntity<String> response = restTemplate.exchange("/event/1", HttpMethod.GET, null, String.class, caller);
        assertEquals(response.getBody(), "{\"eventID\":1,\"eventName\":\"Ganesh\",\"networkID\":\"Network 100\"}");
    }
}
