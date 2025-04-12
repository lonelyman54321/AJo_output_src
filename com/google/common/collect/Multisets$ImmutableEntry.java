/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.Multisets$AbstractEntry;
import java.io.Serializable;

class Multisets$ImmutableEntry
extends Multisets$AbstractEntry
implements Serializable {
    private static final long serialVersionUID;
    private final int count;
    private final Object element;

    public Multisets$ImmutableEntry(Object object, int n3) {
        this.element = object;
        this.count = n3;
        CollectPreconditions.checkNonnegative(n3, "count");
    }

    public final int getCount() {
        return this.count;
    }

    public final Object getElement() {
        return this.element;
    }

    public Multisets$ImmutableEntry nextInBucket() {
        return null;
    }
}

