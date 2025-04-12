/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapEntryLite$Metadata;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MapFieldSchema;
import java.util.AbstractMap;
import java.util.Map;

class MapFieldSchemaLite
implements MapFieldSchema {
    private static int getSerializedSizeLite(int n3, Object iterator, Object object) {
        int n4;
        iterator = (MapFieldLite)((Object)iterator);
        object = (MapEntryLite)object;
        boolean n42 = ((AbstractMap)((Object)iterator)).isEmpty();
        int n7 = 0;
        if (n42) {
            return 0;
        }
        iterator = ((MapFieldLite)((Object)iterator)).entrySet().iterator();
        while ((n4 = iterator.hasNext()) != 0) {
            Map.Entry entry = (Map.Entry)iterator.next();
            Object k2 = entry.getKey();
            entry = entry.getValue();
            n4 = ((MapEntryLite)object).computeMessageSize(n3, k2, entry);
            n7 += n4;
        }
        return n7;
    }

    private static MapFieldLite mergeFromLite(Object object, Object object2) {
        object = (MapFieldLite)object;
        boolean bl2 = ((AbstractMap)(object2 = (MapFieldLite)object2)).isEmpty();
        if (!bl2) {
            bl2 = ((MapFieldLite)object).isMutable();
            if (!bl2) {
                object = ((MapFieldLite)object).mutableCopy();
            }
            ((MapFieldLite)object).mergeFrom((MapFieldLite)object2);
        }
        return object;
    }

    public Map forMapData(Object object) {
        return (MapFieldLite)object;
    }

    public MapEntryLite$Metadata forMapMetadata(Object object) {
        return ((MapEntryLite)object).getMetadata();
    }

    public Map forMutableMapData(Object object) {
        return (MapFieldLite)object;
    }

    public int getSerializedSize(int n3, Object object, Object object2) {
        return MapFieldSchemaLite.getSerializedSizeLite(n3, object, object2);
    }

    public boolean isImmutable(Object object) {
        return ((MapFieldLite)object).isMutable() ^ true;
    }

    public Object mergeFrom(Object object, Object object2) {
        return MapFieldSchemaLite.mergeFromLite(object, object2);
    }

    public Object newMapField(Object object) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    public Object toImmutable(Object object) {
        ((MapFieldLite)object).makeImmutable();
        return object;
    }
}

