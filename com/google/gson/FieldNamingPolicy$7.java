/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.FieldNamingPolicy;
import java.lang.reflect.Field;
import java.util.Locale;

final class FieldNamingPolicy$7
extends FieldNamingPolicy {
    public String translateName(Field object) {
        object = FieldNamingPolicy.separateCamelCase(((Field)object).getName(), '.');
        Locale locale = Locale.ENGLISH;
        return ((String)object).toLowerCase(locale);
    }
}

