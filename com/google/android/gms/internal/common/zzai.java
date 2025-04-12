/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.common;

import com.google.android.gms.internal.common.zzad;
import com.google.android.gms.internal.common.zzak;

final class zzai
extends zzad {
    private final zzak zza;

    public zzai(zzak zzak2, int n3) {
        int n4 = zzak2.size();
        super(n4, n3);
        this.zza = zzak2;
    }

    public final Object zza(int n3) {
        return this.zza.get(n3);
    }
}

