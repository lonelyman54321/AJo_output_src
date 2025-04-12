/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.NewInstanceSchema;
import com.google.protobuf.NewInstanceSchemaLite;
import java.lang.reflect.Constructor;

final class NewInstanceSchemas {
    private static final NewInstanceSchema FULL_SCHEMA = NewInstanceSchemas.loadSchemaForFullRuntime();
    private static final NewInstanceSchema LITE_SCHEMA;

    static {
        NewInstanceSchemaLite newInstanceSchemaLite = new NewInstanceSchemaLite();
        LITE_SCHEMA = newInstanceSchemaLite;
    }

    public static NewInstanceSchema full() {
        return FULL_SCHEMA;
    }

    public static NewInstanceSchema lite() {
        return LITE_SCHEMA;
    }

    private static NewInstanceSchema loadSchemaForFullRuntime() {
        Constructor constructor = "com.google.protobuf.NewInstanceSchemaFull";
        try {
            constructor = Class.forName((String)((Object)constructor));
        }
        catch (Exception exception) {
            return null;
        }
        constructor = ((Class)((Object)constructor)).getDeclaredConstructor(null);
        constructor = constructor.newInstance(null);
        return (NewInstanceSchema)((Object)constructor);
    }
}

