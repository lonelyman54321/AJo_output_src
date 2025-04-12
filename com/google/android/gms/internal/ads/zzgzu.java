/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzy;
import com.google.android.gms.internal.ads.zzhac;

final class zzgzu
extends zzgzy {
    private final int zzc;
    private final int zzd;

    public zzgzu(byte[] byArray, int n3, int n4) {
        super(byArray);
        int n7 = n3 + n4;
        int n8 = byArray.length;
        zzhac.zzq(n3, n7, n8);
        this.zzc = n3;
        this.zzd = n4;
    }

    public final byte zza(int n3) {
        int n4 = this.zzd;
        zzhac.zzz(n3, n4);
        byte[] byArray = this.zza;
        int n7 = this.zzc + n3;
        return byArray[n7];
    }

    public final byte zzb(int n3) {
        int n4 = this.zzc;
        byte[] byArray = this.zza;
        return byArray[n4 += n3];
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final void zze(byte[] byArray, int n3, int n4, int n7) {
        int n8 = this.zzc;
        byte[] byArray2 = this.zza;
        System.arraycopy(byArray2, n8 += n3, byArray, n4, n7);
    }
}

