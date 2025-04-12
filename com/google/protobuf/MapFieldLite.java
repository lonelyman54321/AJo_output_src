/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Internal;
import com.google.protobuf.Internal$EnumLite;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class MapFieldLite
extends LinkedHashMap {
    private static final MapFieldLite EMPTY_MAP_FIELD;
    private boolean isMutable = true;

    static {
        MapFieldLite mapFieldLite;
        EMPTY_MAP_FIELD = mapFieldLite = new MapFieldLite();
        mapFieldLite.makeImmutable();
    }

    private MapFieldLite() {
    }

    private MapFieldLite(Map map2) {
        super(map2);
    }

    public static int calculateHashCodeForMap(Map object) {
        int n3;
        object = object.entrySet().iterator();
        int n4 = 0;
        while ((n3 = object.hasNext()) != 0) {
            Map.Entry entry = (Map.Entry)object.next();
            Object k2 = entry.getKey();
            int n7 = MapFieldLite.calculateHashCodeForObject(k2);
            entry = entry.getValue();
            n3 = MapFieldLite.calculateHashCodeForObject(entry) ^ n7;
            n4 += n3;
        }
        return n4;
    }

    private static int calculateHashCodeForObject(Object object) {
        boolean bl2 = object instanceof byte[];
        if (bl2) {
            return Internal.hashCode((byte[])object);
        }
        bl2 = object instanceof Internal$EnumLite;
        if (!bl2) {
            return object.hashCode();
        }
        object = new UnsupportedOperationException();
        throw object;
    }

    private static void checkForNullKeysAndValues(Map map2) {
        boolean bl2;
        Iterator iterator = map2.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            Internal.checkNotNull(object);
            object = map2.get(object);
            Internal.checkNotNull(object);
        }
    }

    private static Object copy(Object object) {
        int n3 = object instanceof byte[];
        if (n3 != 0) {
            object = (byte[])object;
            n3 = ((Object)object).length;
            object = Arrays.copyOf((byte[])object, n3);
        }
        return object;
    }

    public static Map copy(Map object) {
        int n3 = object.size() * 4 / 3 + 1;
        LinkedHashMap linkedHashMap = new LinkedHashMap(n3);
        object = object.entrySet().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Object object2 = (Map.Entry)object.next();
            Object k2 = object2.getKey();
            object2 = MapFieldLite.copy(object2.getValue());
            linkedHashMap.put(k2, object2);
        }
        return linkedHashMap;
    }

    public static MapFieldLite emptyMapField() {
        return EMPTY_MAP_FIELD;
    }

    private void ensureMutable() {
        boolean bl2 = this.isMutable();
        if (bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    private static boolean equals(Object object, Object object2) {
        boolean bl2 = object instanceof byte[];
        if (bl2 && (bl2 = object2 instanceof byte[])) {
            object = (byte[])object;
            object2 = (byte[])object2;
            return Arrays.equals((byte[])object, (byte[])object2);
        }
        return object.equals(object2);
    }

    public static boolean equals(Map object, Map map2) {
        int n3;
        boolean bl2 = true;
        if (object == map2) {
            return bl2;
        }
        int n4 = object.size();
        if (n4 != (n3 = map2.size())) {
            return false;
        }
        object = object.entrySet().iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Map.Entry entry = (Map.Entry)object.next();
            Object object2 = entry.getKey();
            n3 = (int)(map2.containsKey(object2) ? 1 : 0);
            if (n3 == 0) {
                return false;
            }
            object2 = entry.getValue();
            entry = entry.getKey();
            n4 = (int)(MapFieldLite.equals(object2, entry = map2.get(entry)) ? 1 : 0);
            if (n4 != 0) continue;
            return false;
        }
        return bl2;
    }

    public void clear() {
        this.ensureMutable();
        super.clear();
    }

    public Set entrySet() {
        boolean bl2 = ((AbstractMap)this).isEmpty();
        Set<Object> set = bl2 ? Collections.emptySet() : super.entrySet();
        return set;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof Map;
        if (bl3 && (bl2 = MapFieldLite.equals(this, (Map)(object = (Map)object)))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public int hashCode() {
        return MapFieldLite.calculateHashCodeForMap(this);
    }

    public boolean isMutable() {
        return this.isMutable;
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public void mergeFrom(MapFieldLite mapFieldLite) {
        this.ensureMutable();
        boolean bl2 = ((AbstractMap)mapFieldLite).isEmpty();
        if (!bl2) {
            this.putAll((Map)mapFieldLite);
        }
    }

    public MapFieldLite mutableCopy() {
        boolean bl2 = ((AbstractMap)this).isEmpty();
        MapFieldLite mapFieldLite = bl2 ? new MapFieldLite() : new MapFieldLite((Map)this);
        return mapFieldLite;
    }

    public Object put(Object object, Object object2) {
        this.ensureMutable();
        Internal.checkNotNull(object);
        Internal.checkNotNull(object2);
        return super.put(object, object2);
    }

    public Object put(Map.Entry entry) {
        Object k2 = entry.getKey();
        entry = entry.getValue();
        return this.put(k2, entry);
    }

    public void putAll(Map map2) {
        this.ensureMutable();
        MapFieldLite.checkForNullKeysAndValues(map2);
        super.putAll(map2);
    }

    public Object remove(Object object) {
        this.ensureMutable();
        return super.remove(object);
    }
}

