/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.MapFieldSchema;
import com.google.protobuf.MapFieldSchemaLite;
import java.lang.reflect.Constructor;

final class MapFieldSchemas {
    private static final MapFieldSchema FULL_SCHEMA = MapFieldSchemas.loadSchemaForFullRuntime();
    private static final MapFieldSchema LITE_SCHEMA;

    static {
        MapFieldSchemaLite mapFieldSchemaLite = new MapFieldSchemaLite();
        LITE_SCHEMA = mapFieldSchemaLite;
    }

    public static MapFieldSchema full() {
        return FULL_SCHEMA;
    }

    public static MapFieldSchema lite() {
        return LITE_SCHEMA;
    }

    private static MapFieldSchema loadSchemaForFullRuntime() {
        Constructor constructor = "com.google.protobuf.MapFieldSchemaFull";
        try {
            constructor = Class.forName((String)((Object)constructor));
        }
        catch (Exception exception) {
            return null;
        }
        constructor = ((Class)((Object)constructor)).getDeclaredConstructor(null);
        constructor = constructor.newInstance(null);
        return (MapFieldSchema)((Object)constructor);
    }
}

