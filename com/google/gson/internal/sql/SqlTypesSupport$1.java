/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType;
import java.util.Date;

class SqlTypesSupport$1
extends DefaultDateTypeAdapter$DateType {
    public SqlTypesSupport$1(Class clazz) {
        super(clazz);
    }

    public java.sql.Date deserialize(Date date) {
        long l2 = date.getTime();
        java.sql.Date date2 = new java.sql.Date(l2);
        return date2;
    }
}

