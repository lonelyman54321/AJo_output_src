/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzc;
import com.google.android.gms.internal.ads.zzgbc;

final class zzgba
extends zzfzc {
    private final zzgbc zza;

    public zzgba(zzgbc zzgbc2, int n3) {
        int n4 = zzgbc2.size();
        super(n4, n3);
        this.zza = zzgbc2;
    }

    public final Object zza(int n3) {
        return this.zza.get(n3);
    }
}

