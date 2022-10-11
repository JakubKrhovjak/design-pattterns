package com.example.designpatterns.structural.facade;

import lombok.RequiredArgsConstructor;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */


public class SimpleProvider {

    public Simple getSimple() {
        return new Simple();
    }
}
