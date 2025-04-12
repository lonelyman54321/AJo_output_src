/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.ktx;

import com.google.android.play.core.ktx.AssetPackManagerKtxKt;

final class zzb
extends h80_0 {
    /* synthetic */ Object zza;
    int zzb;

    public zzb(f80_0 f80_02) {
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.zza = object;
        this.zzb = n3 = this.zzb | -1 << -1;
        return AssetPackManagerKtxKt.requestPackStates(null, null, this);
    }
}

