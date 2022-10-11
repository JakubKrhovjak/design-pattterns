package com.example.designpatterns.structural.facade;

import java.util.List;

import lombok.RequiredArgsConstructor;

/**
 * Created by Jakub Krhovják on 10/11/22.
 */

@RequiredArgsConstructor
public class DataFacade {

    private final SimpleProvider simpleProvider;

    private final MultipleProvider multipleProvider;

    List<DataName> getDataNames() {
        return List.of(new DataName(simpleProvider.getSimple().getName()), new DataName(multipleProvider.getMultiple().getName()));
    }

}
