/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

class ImmutableList$SubList
extends ImmutableList {
    final transient int length;
    final transient int offset;
    final /* synthetic */ ImmutableList this$0;

    public ImmutableList$SubList(ImmutableList immutableList, int n3, int n4) {
        this.this$0 = immutableList;
        this.offset = n3;
        this.length = n4;
    }

    public Object get(int n3) {
        int n4 = this.length;
        Preconditions.checkElementIndex(n3, n4);
        ImmutableList immutableList = this.this$0;
        int n7 = this.offset;
        return immutableList.get(n3 += n7);
    }

    public Object[] internalArray() {
        return this.this$0.internalArray();
    }

    public int internalArrayEnd() {
        int n3 = this.this$0.internalArrayStart();
        int n4 = this.offset;
        n3 += n4;
        n4 = this.length;
        return n3 + n4;
    }

    public int internalArrayStart() {
        int n3 = this.this$0.internalArrayStart();
        int n4 = this.offset;
        return n3 + n4;
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.length;
    }

    public ImmutableList subList(int n3, int n4) {
        int n7 = this.length;
        Preconditions.checkPositionIndexes(n3, n4, n7);
        ImmutableList immutableList = this.this$0;
        int n8 = this.offset;
        return immutableList.subList(n3 += n8, n4 += n8);
    }
}

