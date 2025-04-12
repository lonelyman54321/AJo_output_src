/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType;
import java.util.Date;

class DefaultDateTypeAdapter$DateType$1
extends DefaultDateTypeAdapter$DateType {
    public DefaultDateTypeAdapter$DateType$1(Class clazz) {
        super(clazz);
    }

    public Date deserialize(Date date) {
        return date;
    }
}

