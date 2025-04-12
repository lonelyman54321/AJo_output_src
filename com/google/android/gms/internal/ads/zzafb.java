/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzaez;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzeq;

public final class zzafb {
    private final byte[] zza;
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public zzafb() {
        byte[] byArray = new byte[10];
        this.zza = byArray;
    }

    public final void zza(zzafa zzafa2, zzaez zzaez2) {
        int n3 = this.zzc;
        if (n3 > 0) {
            long l2 = this.zzd;
            int n4 = this.zze;
            int n7 = this.zzf;
            int n8 = this.zzg;
            zzafa2.zzs(l2, n4, n7, n8, zzaez2);
            zzafa2 = null;
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzafa zzafa2, long l2, int n3, int n4, int n7, zzaez zzaez2) {
        int n8 = this.zzg;
        int n10 = n4 + n7;
        n8 = n8 <= n10 ? 1 : 0;
        String string2 = "TrueHD chunk samples must be contiguous in the sample queue.";
        zzeq.zzg(n8 != 0, string2);
        n8 = this.zzb;
        if (n8 != 0) {
            int n14;
            n8 = this.zzc;
            this.zzc = n10 = n8 + 1;
            if (n8 == 0) {
                this.zzd = l2;
                this.zze = n3;
                this.zzf = 0;
            }
            this.zzf = n14 = this.zzf + n4;
            this.zzg = n7;
            n14 = 16;
            if (n10 >= n14) {
                this.zza(zzafa2, zzaez2);
            }
        }
    }

    public final void zzd(zzadv object) {
        int n3 = this.zzb;
        if (n3 == 0) {
            int n4;
            byte[] byArray = this.zza;
            int n7 = 10;
            object.zzh(byArray, 0, n7);
            object.zzj();
            object = this.zza;
            n3 = object[4];
            int n8 = -8;
            if (n3 == n8 && (n3 = object[5]) == (n8 = 114) && (n3 = object[6]) == (n8 = 111) && (n4 = object[7] & 0xFE) == (n3 = 186)) {
                n4 = 1;
                this.zzb = n4;
            }
        }
    }
}

