package com.example.designpatterns.structural.facade;

import com.example.designpatterns.structural.bridge.controller.LocalController;
import com.example.designpatterns.structural.bridge.controller.RemoteController;
import com.example.designpatterns.structural.bridge.device.Pc;
import com.example.designpatterns.structural.bridge.device.Tv;

import java.util.List;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */
public class Test {

    public static void main(String[] args) {
     var facade = new DataFacade(new SimpleProvider(), new MultipleProvider());

        List<DataName> dataNames = facade.getDataNames();
    }
}