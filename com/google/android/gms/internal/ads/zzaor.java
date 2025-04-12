/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeq;
import java.util.Arrays;

final class zzaor {
    public byte[] zza;
    public int zzb;
    private final int zzc;
    private boolean zzd;
    private boolean zze;

    public zzaor(int n3, int n4) {
        this.zzc = n3;
        byte[] byArray = new byte[131];
        this.zza = byArray;
        byArray[2] = 1;
    }

    public final void zza(byte[] byArray, int n3, int n4) {
        int n7;
        boolean bl2 = this.zzd;
        if (!bl2) {
            return;
        }
        byte[] byArray2 = this.zza;
        int n8 = byArray2.length;
        int n10 = this.zzb + (n4 -= n3);
        if (n8 < n10) {
            n10 += n10;
            this.zza = byArray2 = Arrays.copyOf(byArray2, n10);
        }
        byArray2 = this.zza;
        n8 = this.zzb;
        System.arraycopy(byArray, n3, byArray2, n8, n4);
        this.zzb = n7 = this.zzb + n4;
    }

    public final void zzb() {
        this.zzd = false;
        this.zze = false;
    }

    public final void zzc(int n3) {
        int n4 = this.zzd;
        boolean bl2 = true;
        zzeq.zzf(n4 ^ bl2);
        n4 = this.zzc;
        if (n3 != n4) {
            bl2 = false;
        }
        this.zzd = bl2;
        if (bl2) {
            this.zzb = n3 = 3;
            this.zze = false;
        }
    }

    public final boolean zzd(int n3) {
        int n4 = this.zzd;
        if (n4 == 0) {
            return false;
        }
        this.zzb = n4 = this.zzb - n3;
        this.zzd = false;
        n3 = 1;
        this.zze = n3;
        return n3 != 0;
    }

    public final boolean zze() {
        return this.zze;
    }
}

