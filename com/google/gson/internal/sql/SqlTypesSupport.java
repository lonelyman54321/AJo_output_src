/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.sql;

import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType;
import com.google.gson.internal.sql.SqlDateTypeAdapter;
import com.google.gson.internal.sql.SqlTimeTypeAdapter;
import com.google.gson.internal.sql.SqlTimestampTypeAdapter;
import com.google.gson.internal.sql.SqlTypesSupport$1;
import com.google.gson.internal.sql.SqlTypesSupport$2;
import java.sql.Date;
import java.sql.Timestamp;

public final class SqlTypesSupport {
    public static final DefaultDateTypeAdapter$DateType DATE_DATE_TYPE;
    public static final TypeAdapterFactory DATE_FACTORY;
    public static final boolean SUPPORTS_SQL_TYPES;
    public static final DefaultDateTypeAdapter$DateType TIMESTAMP_DATE_TYPE;
    public static final TypeAdapterFactory TIMESTAMP_FACTORY;
    public static final TypeAdapterFactory TIME_FACTORY;

    static {
        boolean bl2;
        Object object = "java.sql.Date";
        try {
            Class.forName((String)object);
            bl2 = true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            bl2 = false;
            object = null;
        }
        SUPPORTS_SQL_TYPES = bl2;
        if (bl2) {
            DATE_DATE_TYPE = object = new SqlTypesSupport$1(Date.class);
            Class<Timestamp> clazz = Timestamp.class;
            TIMESTAMP_DATE_TYPE = object = new SqlTypesSupport$2(clazz);
            DATE_FACTORY = SqlDateTypeAdapter.FACTORY;
            TIME_FACTORY = SqlTimeTypeAdapter.FACTORY;
            TIMESTAMP_FACTORY = object = SqlTimestampTypeAdapter.FACTORY;
        } else {
            bl2 = false;
            object = null;
            DATE_DATE_TYPE = null;
            TIMESTAMP_DATE_TYPE = null;
            DATE_FACTORY = null;
            TIME_FACTORY = null;
            TIMESTAMP_FACTORY = null;
        }
    }

    private SqlTypesSupport() {
    }
}

