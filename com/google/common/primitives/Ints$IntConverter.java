/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Converter;
import java.io.Serializable;

final class Ints$IntConverter
extends Converter
implements Serializable {
    static final Ints$IntConverter INSTANCE;
    private static final long serialVersionUID = 1L;

    static {
        Ints$IntConverter ints$IntConverter;
        INSTANCE = ints$IntConverter = new Ints$IntConverter();
    }

    private Ints$IntConverter() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public String doBackward(Integer n3) {
        return n3.toString();
    }

    public Integer doForward(String string2) {
        return Integer.decode(string2);
    }

    public String toString() {
        return "Ints.stringConverter()";
    }
}

