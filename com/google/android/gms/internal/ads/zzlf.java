/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzmg;

public final class zzlf {
    public zzmg zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    public boolean zze;
    public int zzf;
    private boolean zzg;

    public zzlf(zzmg zzmg2) {
        this.zza = zzmg2;
    }

    public static /* bridge */ /* synthetic */ boolean zze(zzlf zzlf2) {
        return zzlf2.zzg;
    }

    public final void zza(int n3) {
        int n4 = 1;
        int n7 = this.zzg | n3;
        if (n4 != n7) {
            n4 = 0;
        }
        this.zzg = n4;
        this.zzb = n7 = this.zzb + n3;
    }

    public final void zzb(int n3) {
        boolean bl2;
        this.zzg = bl2 = true;
        this.zze = bl2;
        this.zzf = n3;
    }

    public final void zzc(zzmg zzmg2) {
        boolean bl2;
        boolean bl3 = this.zzg;
        zzmg zzmg3 = this.zza;
        if (zzmg3 != zzmg2) {
            bl2 = true;
        } else {
            bl2 = false;
            zzmg3 = null;
        }
        this.zzg = bl3 |= bl2;
        this.zza = zzmg2;
    }

    public final void zzd(int n3) {
        int n4;
        int n7 = this.zzc;
        boolean bl2 = true;
        if (n7 != 0 && (n7 = this.zzd) != (n4 = 5)) {
            if (n3 != n4) {
                bl2 = false;
            }
            zzeq.zzd(bl2);
            return;
        }
        this.zzg = bl2;
        this.zzc = bl2;
        this.zzd = n3;
    }
}

