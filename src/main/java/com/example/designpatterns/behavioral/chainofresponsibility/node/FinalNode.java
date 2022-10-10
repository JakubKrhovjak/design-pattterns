package com.example.designpatterns.behavioral.chainofresponsibility.node;

import com.example.designpatterns.behavioral.chainofresponsibility.ChainProcessor;
import com.example.designpatterns.behavioral.chainofresponsibility.ChainRequest;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 10/10/22.
 */
@Slf4j
public class FinalNode implements ChainNode {

    @Override
    public void next(ChainRequest request, ChainProcessor chainProcessor) {
        log.info("FinalNode: {}", request.value());
        if(request.value() > 2) {
            chainProcessor.next(request);
        } else {
            log.info("FinalNode stopped");
        }

    }
}
