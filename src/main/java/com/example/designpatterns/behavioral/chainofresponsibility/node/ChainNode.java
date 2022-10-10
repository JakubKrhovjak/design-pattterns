package com.example.designpatterns.behavioral.chainofresponsibility.node;

import com.example.designpatterns.behavioral.chainofresponsibility.ChainProcessor;
import com.example.designpatterns.behavioral.chainofresponsibility.ChainRequest;

/**
 * Created by Jakub Krhovják on 10/10/22.
 */
public interface ChainNode {

    void next(ChainRequest request, ChainProcessor chainProcessor);

}
