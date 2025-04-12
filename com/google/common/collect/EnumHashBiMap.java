/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractBiMap;
import com.google.common.collect.EnumBiMap;
import com.google.common.collect.Serialization;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class EnumHashBiMap
extends AbstractBiMap {
    private static final long serialVersionUID;
    transient Class keyTypeOrObjectUnderJ2cl;

    private EnumHashBiMap(Class clazz) {
        EnumMap enumMap = new EnumMap(clazz);
        HashMap hashMap = new HashMap();
        super(enumMap, hashMap);
        this.keyTypeOrObjectUnderJ2cl = clazz;
    }

    public static EnumHashBiMap create(Class clazz) {
        EnumHashBiMap enumHashBiMap = new EnumHashBiMap(clazz);
        return enumHashBiMap;
    }

    public static EnumHashBiMap create(Map map2) {
        EnumHashBiMap enumHashBiMap = EnumHashBiMap.create(EnumBiMap.inferKeyTypeOrObjectUnderJ2cl(map2));
        enumHashBiMap.putAll(map2);
        return enumHashBiMap;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        EnumMap enumMap = objectInputStream.readObject();
        Objects.requireNonNull(enumMap);
        enumMap = (Class)((Object)enumMap);
        this.keyTypeOrObjectUnderJ2cl = enumMap;
        Serializable serializable = this.keyTypeOrObjectUnderJ2cl;
        enumMap = new EnumMap(serializable);
        serializable = new HashMap();
        this.setDelegates(enumMap, (Map)((Object)serializable));
        Serialization.populateMap(this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        Class clazz = this.keyTypeOrObjectUnderJ2cl;
        objectOutputStream.writeObject(clazz);
        Serialization.writeMap(this, objectOutputStream);
    }

    public Enum checkKey(Enum enum_) {
        return (Enum)Preconditions.checkNotNull(enum_);
    }

    public Object forcePut(Enum enum_, Object object) {
        return super.forcePut(enum_, object);
    }

    public Class keyType() {
        return this.keyTypeOrObjectUnderJ2cl;
    }

    public Object put(Enum enum_, Object object) {
        return super.put(enum_, object);
    }
}

