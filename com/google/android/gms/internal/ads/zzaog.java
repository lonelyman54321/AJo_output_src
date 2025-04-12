/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzeq;

final class zzaog {
    private final zzafa zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzaog(zzafa zzafa2) {
        this.zza = zzafa2;
    }

    public final void zza(byte[] byArray, int n3, int n4) {
        int n7 = this.zzc;
        if (n7 != 0) {
            n7 = n3 + 1;
            int n8 = this.zzf;
            if ((n7 -= n8) < n4) {
                int n10 = (byArray[n7] & 0xC0) >> 6;
                n3 = 0;
                if (n10 == 0) {
                    n10 = 1;
                } else {
                    n10 = 0;
                    byArray = null;
                }
                this.zzd = n10;
                this.zzc = false;
                return;
            }
            this.zzf = n4 = n4 - n3 + n8;
        }
    }

    public final void zzb(long l2, int n3, boolean n4) {
        long l3 = this.zzh;
        long l4 = -9223372036854775807L;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        int n7 = object != false ? 1 : 0;
        zzeq.zzf(n7 != 0);
        n7 = this.zze;
        int n8 = 182;
        if (n7 == n8 && n4 != 0 && (n4 = (int)(this.zzb ? 1 : 0)) != 0) {
            l3 = this.zzg;
            l3 = l2 - l3;
            int n10 = this.zzd;
            zzafa zzafa2 = this.zza;
            long l8 = this.zzh;
            int n14 = (int)l3;
            zzafa2.zzs(l8, n10, n14, n3, null);
        }
        if ((n3 = this.zze) != (n4 = 179)) {
            this.zzg = l2;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void zzc(int var1_1, long var2_2) {
        this.zze = var1_1;
        this.zzd = false;
        var4_3 = true;
        var5_4 = 182;
        if (var1_1 == var5_4) ** GOTO lbl9
        var6_5 = 179;
        if (var1_1 == var6_5) {
            var1_1 = 179;
lbl9:
            // 2 sources

            var6_5 = 1;
        } else {
            var6_5 = 0;
        }
        this.zzb = var6_5;
        if (var1_1 != var5_4) {
            var4_3 = false;
        }
        this.zzc = var4_3;
        this.zzf = 0;
        this.zzh = var2_2;
    }

    public final void zzd() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }
}

