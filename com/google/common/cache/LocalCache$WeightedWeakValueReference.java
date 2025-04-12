/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache$ValueReference;
import com.google.common.cache.LocalCache$WeakValueReference;
import com.google.common.cache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;

final class LocalCache$WeightedWeakValueReference
extends LocalCache$WeakValueReference {
    final int weight;

    public LocalCache$WeightedWeakValueReference(ReferenceQueue referenceQueue, Object object, ReferenceEntry referenceEntry, int n3) {
        super(referenceQueue, object, referenceEntry);
        this.weight = n3;
    }

    public LocalCache$ValueReference copyFor(ReferenceQueue referenceQueue, Object object, ReferenceEntry referenceEntry) {
        int n3 = this.weight;
        LocalCache$WeightedWeakValueReference localCache$WeightedWeakValueReference = new LocalCache$WeightedWeakValueReference(referenceQueue, object, referenceEntry, n3);
        return localCache$WeightedWeakValueReference;
    }

    public int getWeight() {
        return this.weight;
    }
}

