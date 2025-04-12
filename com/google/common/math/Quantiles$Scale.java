/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.base.Preconditions;
import com.google.common.math.Quantiles$1;
import com.google.common.math.Quantiles$ScaleAndIndex;
import com.google.common.math.Quantiles$ScaleAndIndexes;
import com.google.common.primitives.Ints;
import java.util.Collection;

public final class Quantiles$Scale {
    private final int scale;

    private Quantiles$Scale(int n3) {
        boolean bl2 = n3 > 0;
        Preconditions.checkArgument(bl2, "Quantile scale must be positive");
        this.scale = n3;
    }

    public /* synthetic */ Quantiles$Scale(int n3, Quantiles$1 quantiles$1) {
        this(n3);
    }

    public Quantiles$ScaleAndIndex index(int n3) {
        int n4 = this.scale;
        Quantiles$ScaleAndIndex quantiles$ScaleAndIndex = new Quantiles$ScaleAndIndex(n4, n3, null);
        return quantiles$ScaleAndIndex;
    }

    public Quantiles$ScaleAndIndexes indexes(Collection object) {
        int n3 = this.scale;
        object = Ints.toArray((Collection)object);
        Quantiles$ScaleAndIndexes quantiles$ScaleAndIndexes = new Quantiles$ScaleAndIndexes(n3, (int[])object, null);
        return quantiles$ScaleAndIndexes;
    }

    public Quantiles$ScaleAndIndexes indexes(int ... nArray) {
        int n3 = this.scale;
        nArray = (int[])nArray.clone();
        Quantiles$ScaleAndIndexes quantiles$ScaleAndIndexes = new Quantiles$ScaleAndIndexes(n3, nArray, null);
        return quantiles$ScaleAndIndexes;
    }
}

