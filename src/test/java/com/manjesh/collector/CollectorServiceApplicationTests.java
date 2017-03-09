package com.manjesh.collector;

import com.manjesh.collector.domain.Event;
import com.manjesh.collector.domain.OID;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = {CollectorServiceApplication.class},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
@ContextConfiguration
public class CollectorServiceApplicationTests {

    @Value("${local.server.port}")
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testPost() {
        Event addEvent = new Event(444, "Jai", "Ganesh", new OID[]{
                new OID(1, "Ganesh"),
                new OID(2, "Vignesh")});
        ResponseEntity<Event> response = this.restTemplate.postForEntity("/event", addEvent, Event.class,
                Collections.EMPTY_MAP);
        Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
    }

}
