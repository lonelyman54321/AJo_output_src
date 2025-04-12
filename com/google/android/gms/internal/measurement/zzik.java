/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzim;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSetMultimap$Builder;

public final class zzik {
    public static final Supplier zza;

    static {
        zzim zzim2 = new zzim();
        zza = Suppliers.memoize(zzim2);
    }

    public static /* synthetic */ ImmutableSetMultimap zza() {
        ImmutableSetMultimap$Builder immutableSetMultimap$Builder = new ImmutableSetMultimap$Builder();
        return immutableSetMultimap$Builder.build();
    }
}

