/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.FieldNamingPolicy;
import java.lang.reflect.Field;

final class FieldNamingPolicy$2
extends FieldNamingPolicy {
    public String translateName(Field field) {
        return FieldNamingPolicy.upperCaseFirstLetter(field.getName());
    }
}

