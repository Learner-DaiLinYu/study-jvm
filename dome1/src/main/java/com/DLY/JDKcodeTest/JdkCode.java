package com.DLY.JDKcodeTest;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class JdkCode {
    public static void main(String[] args) throws IOException {
        String str="{"+
                "\"name\":null,"+
                "\"age\": 11"+
                "}";
        ObjectMapper objectMapper = new ObjectMapper();
        Map map = objectMapper.readValue(str, Map.class);
        System.out.println(map.getOrDefault("name","Holle Word!"));
    }
}
