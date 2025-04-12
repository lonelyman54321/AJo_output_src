/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.cache.LocalCache$Segment;
import com.google.common.cache.LocalCache$Strength;
import com.google.common.cache.LocalCache$StrongValueReference;
import com.google.common.cache.LocalCache$ValueReference;
import com.google.common.cache.LocalCache$WeightedStrongValueReference;
import com.google.common.cache.ReferenceEntry;

final class LocalCache$Strength$1
extends LocalCache$Strength {
    public Equivalence defaultEquivalence() {
        return Equivalence.equals();
    }

    public LocalCache$ValueReference referenceValue(LocalCache$Segment object, ReferenceEntry referenceEntry, Object object2, int n3) {
        int n4 = 1;
        object = n3 == n4 ? new LocalCache$StrongValueReference(object2) : new LocalCache$WeightedStrongValueReference(object2, n3);
        return object;
    }
}

