/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Iterators$MergingIterator;
import com.google.common.collect.PeekingIterator;
import java.util.Comparator;

public final class c
implements Comparator {
    public final /* synthetic */ Comparator a;

    public /* synthetic */ c(Comparator comparator) {
        this.a = comparator;
    }

    public final int compare(Object object, Object object2) {
        object = (PeekingIterator)object;
        object2 = (PeekingIterator)object2;
        return Iterators$MergingIterator.a(this.a, (PeekingIterator)object, (PeekingIterator)object2);
    }
}

