/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.LazyStringArrayList;
import java.util.AbstractList;
import java.util.RandomAccess;

class LazyStringArrayList$ByteStringListView
extends AbstractList
implements RandomAccess {
    private final LazyStringArrayList list;

    public LazyStringArrayList$ByteStringListView(LazyStringArrayList lazyStringArrayList) {
        this.list = lazyStringArrayList;
    }

    public void add(int n3, ByteString byteString) {
        LazyStringArrayList.access$500(this.list, n3, byteString);
        this.modCount = n3 = this.modCount + 1;
    }

    public ByteString get(int n3) {
        return this.list.getByteString(n3);
    }

    public ByteString remove(int n3) {
        int n4;
        Object object = this.list.remove(n3);
        this.modCount = n4 = this.modCount + 1;
        return LazyStringArrayList.access$400(object);
    }

    public ByteString set(int n3, ByteString byteString) {
        int n4;
        Object object = LazyStringArrayList.access$300(this.list, n3, byteString);
        this.modCount = n4 = this.modCount + 1;
        return LazyStringArrayList.access$400(object);
    }

    public int size() {
        return this.list.size();
    }
}

