package com.example.designpatterns.behavioral.chainofresponsibility;

import com.example.designpatterns.behavioral.chainofresponsibility.node.ChainNode;

import java.util.ArrayDeque;
import java.util.Optional;
import java.util.Queue;

/**
 * Created by Jakub Krhovják on 10/10/22.
 */
public class ChainProcessor {

    Queue<ChainNode> chainNodes = new ArrayDeque();

    public void next(ChainRequest request) {
        Optional.ofNullable(chainNodes.poll())
                .ifPresent(node -> node.next(request, this));
    }

    public ChainProcessor addNode(ChainNode node) {
        chainNodes.add(node);
        return this;
    }
}
