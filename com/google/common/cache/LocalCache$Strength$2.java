/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.cache.LocalCache$Segment;
import com.google.common.cache.LocalCache$SoftValueReference;
import com.google.common.cache.LocalCache$Strength;
import com.google.common.cache.LocalCache$ValueReference;
import com.google.common.cache.LocalCache$WeightedSoftValueReference;
import com.google.common.cache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;

final class LocalCache$Strength$2
extends LocalCache$Strength {
    public Equivalence defaultEquivalence() {
        return Equivalence.identity();
    }

    public LocalCache$ValueReference referenceValue(LocalCache$Segment object, ReferenceEntry referenceEntry, Object object2, int n3) {
        LocalCache$SoftValueReference localCache$SoftValueReference;
        int n4 = 1;
        if (n3 == n4) {
            object = ((LocalCache$Segment)object).valueReferenceQueue;
            localCache$SoftValueReference = new LocalCache$SoftValueReference((ReferenceQueue)object, object2, referenceEntry);
        } else {
            object = ((LocalCache$Segment)object).valueReferenceQueue;
            LocalCache$WeightedSoftValueReference localCache$WeightedSoftValueReference = new LocalCache$WeightedSoftValueReference((ReferenceQueue)object, object2, referenceEntry, n3);
            localCache$SoftValueReference = localCache$WeightedSoftValueReference;
        }
        return localCache$SoftValueReference;
    }
}

