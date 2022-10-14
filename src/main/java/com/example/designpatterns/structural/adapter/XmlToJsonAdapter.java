package com.example.designpatterns.structural.adapter;

/**
 * Created by Jakub Krhovják on 10/14/22.
 */
public class XmlToJsonAdapter {

    String convert(String xml) {
        return "{\"data\": \"simple string\"}";
    }

}
