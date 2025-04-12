/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.LazyStringArrayList;
import java.util.AbstractList;
import java.util.RandomAccess;

class LazyStringArrayList$ByteArrayListView
extends AbstractList
implements RandomAccess {
    private final LazyStringArrayList list;

    public LazyStringArrayList$ByteArrayListView(LazyStringArrayList lazyStringArrayList) {
        this.list = lazyStringArrayList;
    }

    public void add(int n3, byte[] byArray) {
        LazyStringArrayList.access$200(this.list, n3, byArray);
        this.modCount = n3 = this.modCount + 1;
    }

    public byte[] get(int n3) {
        return this.list.getByteArray(n3);
    }

    public byte[] remove(int n3) {
        int n4;
        Object object = this.list.remove(n3);
        this.modCount = n4 = this.modCount + 1;
        return LazyStringArrayList.access$100(object);
    }

    public byte[] set(int n3, byte[] byArray) {
        int n4;
        Object object = LazyStringArrayList.access$000(this.list, n3, byArray);
        this.modCount = n4 = this.modCount + 1;
        return LazyStringArrayList.access$100(object);
    }

    public int size() {
        return this.list.size();
    }
}

