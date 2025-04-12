/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaa;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzack;
import com.google.android.gms.internal.gtm.zzadm;
import java.util.List;

public final class zzab
extends zzacf
implements zzadm {
    private static final zzab zza;
    private zzack zzd;
    private zzack zze;
    private zzack zzf;
    private zzack zzg;
    private zzack zzh;
    private zzack zzi;
    private zzack zzj;
    private zzack zzk;
    private zzack zzl;
    private zzack zzm;

    static {
        zzab zzab2;
        zza = zzab2 = new zzab();
        zzacf.zzao(zzab.class, zzab2);
    }

    private zzab() {
        zzack zzack2;
        this.zzd = zzack2 = zzacf.zzah();
        this.zze = zzack2 = zzacf.zzah();
        this.zzf = zzack2 = zzacf.zzah();
        this.zzg = zzack2 = zzacf.zzah();
        this.zzh = zzack2 = zzacf.zzah();
        this.zzi = zzack2 = zzacf.zzah();
        this.zzj = zzack2 = zzacf.zzah();
        this.zzk = zzack2 = zzacf.zzah();
        this.zzl = zzack2 = zzacf.zzah();
        this.zzm = zzack2 = zzacf.zzah();
    }

    public static /* bridge */ /* synthetic */ zzab zza() {
        return zza;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        byte by2 = 1;
        int n4 = 5;
        int n7 = 4;
        int n8 = 3;
        int n10 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n10) {
                if (n3 != n8) {
                    by2 = 0;
                    if (n3 != n7) {
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzaa zzaa2 = new zzaa(null);
                    return zzaa2;
                }
                zzab zzab2 = new zzab();
                return zzab2;
            }
            Object[] objectArray = new Object[10];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            objectArray[n7] = "zzh";
            objectArray[n4] = "zzi";
            objectArray[6] = "zzj";
            objectArray[7] = "zzk";
            objectArray[8] = "zzl";
            objectArray[9] = "zzm";
            return zzacf.zzal(zza, "\u0004\n\u0000\u0000\u0001\n\n\u0000\n\u0000\u0001\u0016\u0002\u0016\u0003\u0016\u0004\u0016\u0005\u0016\u0006\u0016\u0007\u0016\b\u0016\t\u0016\n\u0016", objectArray);
        }
        return by2;
    }

    public final List zzc() {
        return this.zzj;
    }

    public final List zzd() {
        return this.zzl;
    }

    public final List zze() {
        return this.zzf;
    }

    public final List zzf() {
        return this.zzh;
    }

    public final List zzg() {
        return this.zze;
    }

    public final List zzh() {
        return this.zzd;
    }

    public final List zzi() {
        return this.zzk;
    }

    public final List zzj() {
        return this.zzm;
    }

    public final List zzk() {
        return this.zzg;
    }

    public final List zzl() {
        return this.zzi;
    }
}

