/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Supplier;
import com.google.common.collect.CollectPreconditions;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

final class MultimapBuilder$ArrayListSupplier
implements Supplier,
Serializable {
    private final int expectedValuesPerKey;

    public MultimapBuilder$ArrayListSupplier(int n3) {
        this.expectedValuesPerKey = n3 = CollectPreconditions.checkNonnegative(n3, "expectedValuesPerKey");
    }

    public List get() {
        int n3 = this.expectedValuesPerKey;
        ArrayList arrayList = new ArrayList(n3);
        return arrayList;
    }
}

