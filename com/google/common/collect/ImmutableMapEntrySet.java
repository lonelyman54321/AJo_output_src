/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMapEntrySet$EntrySetSerializedForm;
import com.google.common.collect.ImmutableSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map;

abstract class ImmutableMapEntrySet
extends ImmutableSet {
    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("Use EntrySetSerializedForm");
        throw object;
    }

    public boolean contains(Object object) {
        boolean bl2 = object instanceof Map.Entry;
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            object = (Map.Entry)object;
            Object object2 = this.map();
            Object k2 = object.getKey();
            if ((object2 = ((ImmutableMap)object2).get(k2)) != null && (bl4 = object2.equals(object = object.getValue()))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public int hashCode() {
        return this.map().hashCode();
    }

    public boolean isHashCodeFast() {
        return this.map().isHashCodeFast();
    }

    public boolean isPartialView() {
        return this.map().isPartialView();
    }

    public abstract ImmutableMap map();

    public int size() {
        return this.map().size();
    }

    public Object writeReplace() {
        ImmutableMap immutableMap = this.map();
        ImmutableMapEntrySet$EntrySetSerializedForm immutableMapEntrySet$EntrySetSerializedForm = new ImmutableMapEntrySet$EntrySetSerializedForm(immutableMap);
        return immutableMapEntrySet$EntrySetSerializedForm;
    }
}

