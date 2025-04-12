/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Converter;
import java.io.Serializable;

final class Shorts$ShortConverter
extends Converter
implements Serializable {
    static final Shorts$ShortConverter INSTANCE;
    private static final long serialVersionUID = 1L;

    static {
        Shorts$ShortConverter shorts$ShortConverter;
        INSTANCE = shorts$ShortConverter = new Shorts$ShortConverter();
    }

    private Shorts$ShortConverter() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public String doBackward(Short s7) {
        return s7.toString();
    }

    public Short doForward(String string2) {
        return Short.decode(string2);
    }

    public String toString() {
        return "Shorts.stringConverter()";
    }
}

