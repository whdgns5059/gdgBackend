package com.example.gdg.commons;

import static com.google.common.base.Preconditions.checkNotNull;

public class Id<R, V> {

    private final Class<R> reference;

    private final V value;

    private Id(Class<R> reference, V value) {
        this.reference = reference;
        this.value = value;
    }

    public static <R,V> Id<R, V> of(Class<R> reference, V value){
        checkNotNull(reference, "reference must be provided");
        checkNotNull(value, "value must be provided");

        return new Id<>(reference, value);

    }
}
