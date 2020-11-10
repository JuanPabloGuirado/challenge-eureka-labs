package com.eureka_labs.challenge.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class JsonMarshaller {

    private static final Logger LOG = LoggerFactory.getLogger(JsonMarshaller.class);
    private static final String NULL = "null";

    @Autowired
    @Qualifier("jsonObjectMapper")
    private ObjectMapper mapper;

    public String marshal(Object object) {
        String jsonString = null;
        try {
            jsonString = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            LOG.error("Something went wrong trying to parse Object to json", e);
        }
        return (NULL.equalsIgnoreCase(jsonString)) ? null : jsonString;
    }

    public Object unmarshal(String body, Class type) {
        Object object = null;
        try {
            object = mapper.readValue(body, type);
        } catch (Exception e) {
            LOG.info("Something went wrong trying to parse json to object");
        }
        return object;
    }
}
