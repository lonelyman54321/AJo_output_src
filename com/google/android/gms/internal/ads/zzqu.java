/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzan;

public final class zzqu
extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzan zzc;

    public zzqu(int n3, zzan zzan2, boolean bl2) {
        String string2 = hj0_0.a(n3, "AudioTrack write failed: ");
        super(string2);
        this.zzb = bl2;
        this.zza = n3;
        this.zzc = zzan2;
    }
}

