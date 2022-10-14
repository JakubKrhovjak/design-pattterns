package com.example.designpatterns.structural.adapter;

import com.example.designpatterns.structural.bridge.controller.LocalController;
import com.example.designpatterns.structural.bridge.controller.RemoteController;
import com.example.designpatterns.structural.bridge.device.Pc;
import com.example.designpatterns.structural.bridge.device.Tv;

/**
 * Created by Jakub Krhovják on 10/14/22.
 */
public class Test {

    public static void main(String[] args) {
        var xmlSupplier = new XmlSupplier();
        var json = new XmlToJsonAdapter().convert(xmlSupplier.generate());
        new JsonConsumer().process(json);
    }


}
