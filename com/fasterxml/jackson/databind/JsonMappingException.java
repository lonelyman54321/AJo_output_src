/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.DatabindException;

public class JsonMappingException
extends DatabindException {
    private static final long serialVersionUID = 3L;

    public final String getLocalizedMessage() {
        return super.getMessage();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.getClass().getName();
        stringBuilder.append(string2);
        stringBuilder.append(": ");
        string2 = this.getMessage();
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

