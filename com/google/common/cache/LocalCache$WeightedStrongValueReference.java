/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache$StrongValueReference;

final class LocalCache$WeightedStrongValueReference
extends LocalCache$StrongValueReference {
    final int weight;

    public LocalCache$WeightedStrongValueReference(Object object, int n3) {
        super(object);
        this.weight = n3;
    }

    public int getWeight() {
        return this.weight;
    }
}

