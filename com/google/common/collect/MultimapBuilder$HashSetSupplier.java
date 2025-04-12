/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Supplier;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.Platform;
import java.io.Serializable;
import java.util.Set;

final class MultimapBuilder$HashSetSupplier
implements Supplier,
Serializable {
    private final int expectedValuesPerKey;

    public MultimapBuilder$HashSetSupplier(int n3) {
        this.expectedValuesPerKey = n3 = CollectPreconditions.checkNonnegative(n3, "expectedValuesPerKey");
    }

    public Set get() {
        return Platform.newHashSetWithExpectedSize(this.expectedValuesPerKey);
    }
}

