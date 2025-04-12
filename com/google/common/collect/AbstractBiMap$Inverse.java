/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractBiMap;
import com.google.common.collect.BiMap;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Objects;

class AbstractBiMap$Inverse
extends AbstractBiMap {
    private static final long serialVersionUID;

    public AbstractBiMap$Inverse(Map map2, AbstractBiMap abstractBiMap) {
        super(map2, abstractBiMap, null);
    }

    private void readObject(ObjectInputStream object) {
        ((ObjectInputStream)object).defaultReadObject();
        object = ((ObjectInputStream)object).readObject();
        Objects.requireNonNull(object);
        object = (AbstractBiMap)object;
        this.setInverse((AbstractBiMap)object);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        BiMap biMap = this.inverse();
        objectOutputStream.writeObject(biMap);
    }

    public Object checkKey(Object object) {
        return this.inverse.checkValue(object);
    }

    public Object checkValue(Object object) {
        return this.inverse.checkKey(object);
    }

    public Object readResolve() {
        return this.inverse().inverse();
    }
}

