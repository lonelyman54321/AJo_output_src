/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzexv;

public final class zzeqy
implements zzexv {
    public final zzq zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public zzeqy(zzq zzq2, String string2, boolean bl2, String string3, float f5, int n3, int n4, String string4, boolean bl3) {
        Preconditions.checkNotNull(zzq2, "the adSize must not be null");
        this.zza = zzq2;
        this.zzb = string2;
        this.zzc = bl2;
        this.zzd = string3;
        this.zze = f5;
        this.zzf = n3;
        this.zzg = n4;
        this.zzh = string4;
        this.zzi = bl3;
    }
}

