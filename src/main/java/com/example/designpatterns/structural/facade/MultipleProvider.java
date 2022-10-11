package com.example.designpatterns.structural.facade;

import lombok.RequiredArgsConstructor;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */

public class MultipleProvider {
    public Multiple getMultiple() {
        return new Multiple();
    }



}
