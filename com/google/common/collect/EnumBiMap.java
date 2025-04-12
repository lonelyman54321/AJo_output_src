/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractBiMap;
import com.google.common.collect.EnumHashBiMap;
import com.google.common.collect.Platform;
import com.google.common.collect.Serialization;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

public final class EnumBiMap
extends AbstractBiMap {
    private static final long serialVersionUID;
    transient Class keyTypeOrObjectUnderJ2cl;
    transient Class valueTypeOrObjectUnderJ2cl;

    private EnumBiMap(Class clazz, Class clazz2) {
        EnumMap enumMap = new EnumMap(clazz);
        EnumMap enumMap2 = new EnumMap(clazz2);
        super(enumMap, enumMap2);
        this.keyTypeOrObjectUnderJ2cl = clazz;
        this.valueTypeOrObjectUnderJ2cl = clazz2;
    }

    public static EnumBiMap create(Class clazz, Class clazz2) {
        EnumBiMap enumBiMap = new EnumBiMap(clazz, clazz2);
        return enumBiMap;
    }

    public static EnumBiMap create(Map map2) {
        Serializable serializable = EnumBiMap.inferKeyTypeOrObjectUnderJ2cl(map2);
        Class clazz = EnumBiMap.inferValueTypeOrObjectUnderJ2cl(map2);
        serializable = EnumBiMap.create((Class)serializable, clazz);
        ((EnumBiMap)serializable).putAll(map2);
        return serializable;
    }

    public static Class inferKeyTypeOrObjectUnderJ2cl(Map map2) {
        boolean bl2 = map2 instanceof EnumBiMap;
        if (bl2) {
            return ((EnumBiMap)map2).keyTypeOrObjectUnderJ2cl;
        }
        bl2 = map2 instanceof EnumHashBiMap;
        if (bl2) {
            return ((EnumHashBiMap)map2).keyTypeOrObjectUnderJ2cl;
        }
        Preconditions.checkArgument(map2.isEmpty() ^ true);
        return Platform.getDeclaringClassOrObjectForJ2cl((Enum)map2.keySet().iterator().next());
    }

    private static Class inferValueTypeOrObjectUnderJ2cl(Map map2) {
        boolean bl2 = map2 instanceof EnumBiMap;
        if (bl2) {
            return ((EnumBiMap)map2).valueTypeOrObjectUnderJ2cl;
        }
        Preconditions.checkArgument(map2.isEmpty() ^ true);
        return Platform.getDeclaringClassOrObjectForJ2cl((Enum)map2.values().iterator().next());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        EnumMap enumMap = objectInputStream.readObject();
        Objects.requireNonNull(enumMap);
        enumMap = (Class)((Object)enumMap);
        this.keyTypeOrObjectUnderJ2cl = enumMap;
        enumMap = objectInputStream.readObject();
        Objects.requireNonNull(enumMap);
        enumMap = (Class)((Object)enumMap);
        this.valueTypeOrObjectUnderJ2cl = enumMap;
        Serializable serializable = this.keyTypeOrObjectUnderJ2cl;
        enumMap = new EnumMap(serializable);
        Class clazz = this.valueTypeOrObjectUnderJ2cl;
        serializable = new EnumMap(clazz);
        this.setDelegates(enumMap, (Map)((Object)serializable));
        Serialization.populateMap(this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        Class clazz = this.keyTypeOrObjectUnderJ2cl;
        objectOutputStream.writeObject(clazz);
        clazz = this.valueTypeOrObjectUnderJ2cl;
        objectOutputStream.writeObject(clazz);
        Serialization.writeMap(this, objectOutputStream);
    }

    public Enum checkKey(Enum enum_) {
        return (Enum)Preconditions.checkNotNull(enum_);
    }

    public Enum checkValue(Enum enum_) {
        return (Enum)Preconditions.checkNotNull(enum_);
    }

    public Class keyType() {
        return this.keyTypeOrObjectUnderJ2cl;
    }

    public Class valueType() {
        return this.valueTypeOrObjectUnderJ2cl;
    }
}

