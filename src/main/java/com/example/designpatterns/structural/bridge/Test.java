package com.example.designpatterns.structural.bridge;

import com.example.designpatterns.behavioral.strategy.StrategyProcessor;
import com.example.designpatterns.behavioral.strategy.strtegies.ImmediateStopStrategy;
import com.example.designpatterns.behavioral.strategy.strtegies.LongStartStrategy;
import com.example.designpatterns.structural.bridge.controller.LocalController;
import com.example.designpatterns.structural.bridge.controller.RemoteController;
import com.example.designpatterns.structural.bridge.device.Pc;
import com.example.designpatterns.structural.bridge.device.Tv;

/**
 * Created by Jakub Krhovják on 10/10/22.
 */
public class Test {

    public static void main(String[] args) {

        var localTvController = new LocalController(new Tv());
        localTvController.on();
        localTvController.off();

        var localPcController = new LocalController(new Pc());
        localPcController.on();
        localPcController.off();


        var remoteTvController = new RemoteController(new Tv());
        remoteTvController.on();
        remoteTvController.off();

        var remotePcController = new RemoteController(new Pc());
        remotePcController.on();
        remotePcController.off();
    }
}
