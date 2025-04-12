/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import java.io.Serializable;
import java.util.Map;

class HashBasedTable$Factory
implements Supplier,
Serializable {
    private static final long serialVersionUID;
    final int expectedSize;

    public HashBasedTable$Factory(int n3) {
        this.expectedSize = n3;
    }

    public Map get() {
        return Maps.newLinkedHashMapWithExpectedSize(this.expectedSize);
    }
}

