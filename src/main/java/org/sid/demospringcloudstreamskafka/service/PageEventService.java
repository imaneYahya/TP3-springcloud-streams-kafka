package org.sid.demospringcloudstreamskafka.service;

import org.sid.demospringcloudstreamskafka.entities.PageEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

import static org.springframework.integration.graph.LinkNode.Type.input;

public class PageEventService {


    public Consumer<PageEvent> pageEventConsumer() {
        return (input)->{
            System.out.println("********------**********");
            System.out.println(input.toString());
            System.out.println("************----------***********");
        };
    }
}
