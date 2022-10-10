package com.example.designpatterns.behavioral.chainofresponsibility;

import com.example.designpatterns.behavioral.chainofresponsibility.node.FinalNode;
import com.example.designpatterns.behavioral.chainofresponsibility.node.MiddleNode;
import com.example.designpatterns.behavioral.chainofresponsibility.node.StartNode;

/**
 * Created by Jakub Krhovják on 10/10/22.
 */
public class Test {

    public static void main(String[] args) {
        var chainProcessor = new ChainProcessor();
        chainProcessor.addNode(new StartNode())
                      .addNode(new MiddleNode())
                      .addNode(new FinalNode());

//        chainProcessor.next(new ChainRequest("test", 1));
//        chainProcessor.next(new ChainRequest("test", 2));
        chainProcessor.next(new ChainRequest("test", 3));
    }

}
