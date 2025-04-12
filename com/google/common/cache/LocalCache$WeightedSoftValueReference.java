/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache$SoftValueReference;
import com.google.common.cache.LocalCache$ValueReference;
import com.google.common.cache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;

final class LocalCache$WeightedSoftValueReference
extends LocalCache$SoftValueReference {
    final int weight;

    public LocalCache$WeightedSoftValueReference(ReferenceQueue referenceQueue, Object object, ReferenceEntry referenceEntry, int n3) {
        super(referenceQueue, object, referenceEntry);
        this.weight = n3;
    }

    public LocalCache$ValueReference copyFor(ReferenceQueue referenceQueue, Object object, ReferenceEntry referenceEntry) {
        int n3 = this.weight;
        LocalCache$WeightedSoftValueReference localCache$WeightedSoftValueReference = new LocalCache$WeightedSoftValueReference(referenceQueue, object, referenceEntry, n3);
        return localCache$WeightedSoftValueReference;
    }

    public int getWeight() {
        return this.weight;
    }
}

