/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multiset$Entry;
import com.google.common.collect.Serialization$FieldSetter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class Serialization {
    private Serialization() {
    }

    public static Serialization$FieldSetter getFieldSetter(Class annotatedElement, String object) {
        try {
            annotatedElement = annotatedElement.getDeclaredField((String)object);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            object = new AssertionError((Object)noSuchFieldException);
            throw object;
        }
        object = new Serialization$FieldSetter((Field)annotatedElement, null);
        return object;
    }

    public static void populateMap(Map map2, ObjectInputStream objectInputStream) {
        int n3 = objectInputStream.readInt();
        Serialization.populateMap(map2, objectInputStream, n3);
    }

    public static void populateMap(Map map2, ObjectInputStream objectInputStream, int n3) {
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            map2.put(object, object2);
        }
    }

    public static void populateMultimap(Multimap multimap, ObjectInputStream objectInputStream) {
        int n3 = objectInputStream.readInt();
        Serialization.populateMultimap(multimap, objectInputStream, n3);
    }

    public static void populateMultimap(Multimap multimap, ObjectInputStream objectInputStream, int n3) {
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = objectInputStream.readObject();
            object = multimap.get(object);
            int n4 = objectInputStream.readInt();
            for (int i8 = 0; i8 < n4; ++i8) {
                Object object2 = objectInputStream.readObject();
                object.add(object2);
            }
        }
    }

    public static void populateMultiset(Multiset multiset, ObjectInputStream objectInputStream) {
        int n3 = objectInputStream.readInt();
        Serialization.populateMultiset(multiset, objectInputStream, n3);
    }

    public static void populateMultiset(Multiset multiset, ObjectInputStream objectInputStream, int n3) {
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = objectInputStream.readObject();
            int n4 = objectInputStream.readInt();
            multiset.add(object, n4);
        }
    }

    public static int readCount(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    public static void writeMap(Map object, ObjectOutputStream objectOutputStream) {
        int n3 = object.size();
        objectOutputStream.writeInt(n3);
        object = object.entrySet().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Map.Entry entry = (Map.Entry)object.next();
            Object k2 = entry.getKey();
            objectOutputStream.writeObject(k2);
            entry = entry.getValue();
            objectOutputStream.writeObject(entry);
        }
    }

    public static void writeMultimap(Multimap object, ObjectOutputStream objectOutputStream) {
        Iterator iterator = object.asMap();
        int n3 = iterator.size();
        objectOutputStream.writeInt(n3);
        object = object.asMap().entrySet().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            iterator = (Map.Entry)object.next();
            Object object2 = iterator.getKey();
            objectOutputStream.writeObject(object2);
            object2 = (Collection)iterator.getValue();
            int n4 = object2.size();
            objectOutputStream.writeInt(n4);
            iterator = ((Collection)iterator.getValue()).iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object2 = iterator.next();
                objectOutputStream.writeObject(object2);
            }
        }
    }

    public static void writeMultiset(Multiset object, ObjectOutputStream objectOutputStream) {
        Object object2 = object.entrySet();
        int n3 = object2.size();
        objectOutputStream.writeInt(n3);
        object = object.entrySet().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (Multiset$Entry)object.next();
            Object object3 = object2.getElement();
            objectOutputStream.writeObject(object3);
            n3 = object2.getCount();
            objectOutputStream.writeInt(n3);
        }
    }
}

