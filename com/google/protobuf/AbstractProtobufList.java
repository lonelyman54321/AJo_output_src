/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Internal$ProtobufList;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class AbstractProtobufList
extends AbstractList
implements Internal$ProtobufList {
    protected static final int DEFAULT_CAPACITY = 10;
    private boolean isMutable;

    public AbstractProtobufList() {
        this(true);
    }

    public AbstractProtobufList(boolean bl2) {
        this.isMutable = bl2;
    }

    public void add(int n3, Object object) {
        this.ensureIsMutable();
        super.add(n3, object);
    }

    public boolean add(Object object) {
        this.ensureIsMutable();
        return super.add(object);
    }

    public boolean addAll(int n3, Collection collection) {
        this.ensureIsMutable();
        return super.addAll(n3, collection);
    }

    public boolean addAll(Collection collection) {
        this.ensureIsMutable();
        return super.addAll(collection);
    }

    public void clear() {
        this.ensureIsMutable();
        super.clear();
    }

    public void ensureIsMutable() {
        boolean bl2 = this.isMutable;
        if (bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n4 = object instanceof List;
        if (n4 == 0) {
            return false;
        }
        n4 = object instanceof RandomAccess;
        if (n4 == 0) {
            return super.equals(object);
        }
        object = (List)object;
        n4 = this.size();
        if (n4 != (n3 = object.size())) {
            return false;
        }
        for (n3 = 0; n3 < n4; ++n3) {
            Object e2;
            Object e5 = this.get(n3);
            boolean bl3 = e5.equals(e2 = object.get(n3));
            if (bl3) continue;
            return false;
        }
        return bl2;
    }

    public int hashCode() {
        int n3 = this.size();
        int n4 = 1;
        for (int i3 = 0; i3 < n3; ++i3) {
            n4 *= 31;
            Object e2 = this.get(i3);
            int n7 = e2.hashCode();
            n4 += n7;
        }
        return n4;
    }

    public boolean isModifiable() {
        return this.isMutable;
    }

    public final void makeImmutable() {
        boolean bl2 = this.isMutable;
        if (bl2) {
            bl2 = false;
            this.isMutable = false;
        }
    }

    public Object remove(int n3) {
        this.ensureIsMutable();
        return super.remove(n3);
    }

    public boolean remove(Object object) {
        this.ensureIsMutable();
        int n3 = this.indexOf(object);
        int n4 = -1;
        if (n3 == n4) {
            return false;
        }
        this.remove(n3);
        return true;
    }

    public boolean removeAll(Collection collection) {
        this.ensureIsMutable();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        this.ensureIsMutable();
        return super.retainAll(collection);
    }

    public Object set(int n3, Object object) {
        this.ensureIsMutable();
        return super.set(n3, object);
    }
}

