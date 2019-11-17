package com.smile.controller;

import com.smile.service.HashSetWithoutHashFunction;
import com.smile.service.HashSetWithoutHashFunctionFixed;
import com.smile.service.StaticFieldHolding;
import com.smile.service.StaticFieldHoldingFixed;
import com.smile.service.UnClosedStreams;
import com.smile.service.UnClosedStreamsFixed;
import com.smile.service.UnclosedConnections;
import com.smile.service.UnclosedConnectionsFixed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class PerfController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PerfController.class);


    @GetMapping(value = "/ping")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String ping() {
        String currentTime = Long.toString(System.currentTimeMillis());
        LOGGER.info("Ping request {}", currentTime);
        return currentTime;
    }

    @GetMapping(value = "/static-field-holding")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String staticFieldHolding() throws InterruptedException {
        LOGGER.info("staticFieldHolding request found");
        StaticFieldHolding staticFieldHolding = new StaticFieldHolding();
        staticFieldHolding.populateData();
        return "Completed";
    }

    @GetMapping(value = "/static-field-holding/fixed")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String staticFieldHoldingFixed() throws InterruptedException {
        LOGGER.info("staticFieldHolding fixed request found");
        StaticFieldHoldingFixed staticFieldHolding = new StaticFieldHoldingFixed();
        staticFieldHolding.populateData();
        return "Completed";
    }

    @GetMapping(value = "/unclosed-streams")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String unclosedStreams() throws InterruptedException, IOException {
        LOGGER.info("unclosedStreams request found");
        UnClosedStreams unClosedStreams = new UnClosedStreams();
        unClosedStreams.callOpenAPI();
        return "Completed";
    }

    @GetMapping(value = "/unclosed-streams/fixed")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String unclosedStreamsFixed() throws InterruptedException, IOException {
        LOGGER.info("unclosedStreams request found");
        UnClosedStreamsFixed unClosedStreams = new UnClosedStreamsFixed();
        unClosedStreams.callOpenAPI();
        return "Completed";
    }

    @GetMapping(value = "/unclosed-connections")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String unclosedConnections() throws InterruptedException, IOException {
        LOGGER.info("unclosedConnections request found");
        UnclosedConnections unclosedConnections = new UnclosedConnections();
        unclosedConnections.callOpenAPI();
        return "Completed";
    }

    @GetMapping(value = "/unclosed-connections/fixed")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String unclosedConnectionsFixed() throws InterruptedException, IOException {
        LOGGER.info("unclosedConnections request found");
        UnclosedConnectionsFixed unclosedConnectionsFixed = new UnclosedConnectionsFixed();
        unclosedConnectionsFixed.callOpenAPI();
        return "Completed";
    }

    @GetMapping(value = "/hash-function")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String hashFunction() {
        LOGGER.info("hashSetWithoutHashFunction request found");
        HashSetWithoutHashFunction hashSetWithoutHashFunction = new HashSetWithoutHashFunction();
        hashSetWithoutHashFunction.buildMap();
        return "Completed";
    }

    @GetMapping(value = "/hash-function/fixed")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String hashFunctionFixed() {
        LOGGER.info("hashSetWithoutHashFunction fixed request found");
        HashSetWithoutHashFunctionFixed hashSetWithoutHashFunctionFixed = new HashSetWithoutHashFunctionFixed();
        hashSetWithoutHashFunctionFixed.buildMap();
        return "Completed";
    }
}
