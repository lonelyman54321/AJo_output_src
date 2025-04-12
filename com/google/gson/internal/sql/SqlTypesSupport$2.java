/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType;
import java.sql.Timestamp;
import java.util.Date;

class SqlTypesSupport$2
extends DefaultDateTypeAdapter$DateType {
    public SqlTypesSupport$2(Class clazz) {
        super(clazz);
    }

    public Timestamp deserialize(Date date) {
        long l2 = date.getTime();
        Timestamp timestamp = new Timestamp(l2);
        return timestamp;
    }
}

