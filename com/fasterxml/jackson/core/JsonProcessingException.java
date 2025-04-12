/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JacksonException;

public class JsonProcessingException
extends JacksonException {
    private static final long serialVersionUID = 123L;

    public String a() {
        return null;
    }

    public String getMessage() {
        String string2;
        String string3 = super.getMessage();
        if (string3 == null) {
            string3 = "N/A";
        }
        if ((string2 = this.a()) != null) {
            int n3 = 100;
            StringBuilder stringBuilder = new StringBuilder(n3);
            stringBuilder.append(string3);
            stringBuilder.append(string2);
            string3 = stringBuilder.toString();
        }
        return string3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.getClass().getName();
        stringBuilder.append(string2);
        stringBuilder.append(": ");
        string2 = this.getMessage();
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

