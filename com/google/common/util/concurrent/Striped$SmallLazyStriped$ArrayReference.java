/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class Striped$SmallLazyStriped$ArrayReference
extends WeakReference {
    final int index;

    public Striped$SmallLazyStriped$ArrayReference(Object object, int n3, ReferenceQueue referenceQueue) {
        super(object, referenceQueue);
        this.index = n3;
    }
}

