/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzac;
import com.google.android.gms.internal.gtm.zzace;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzack;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzaex;
import com.google.android.gms.internal.gtm.zzap;
import java.util.List;

public final class zzad
extends zzacf
implements zzadm {
    public static final zzace zza;
    private static final zzad zzd;
    private int zze;
    private zzack zzf;
    private zzack zzg;
    private zzack zzh;
    private int zzi;
    private zzack zzj;
    private int zzk;
    private int zzl;

    static {
        zzad zzad2;
        zzd = zzad2 = new zzad();
        zzacf.zzao(zzad.class, zzad2);
        zzap zzap2 = zzap.zzi();
        zzaex zzaex2 = zzaex.zzk;
        zza = zzacf.zzac(zzap2, zzad2, zzad2, null, 101, zzaex2, zzad.class);
    }

    private zzad() {
        zzack zzack2;
        this.zzf = zzack2 = zzacf.zzah();
        this.zzg = zzack2 = zzacf.zzah();
        this.zzh = zzack2 = zzacf.zzah();
        this.zzj = zzack2 = zzacf.zzah();
    }

    public static /* bridge */ /* synthetic */ zzad zze() {
        return zzd;
    }

    public final int zza() {
        return this.zzk;
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
                            return zzd;
                        }
                        throw null;
                    }
                    zzac zzac2 = new zzac(null);
                    return zzac2;
                }
                zzad zzad2 = new zzad();
                return zzad2;
            }
            Object[] objectArray = new Object[8];
            objectArray[0] = "zze";
            objectArray[by2] = "zzf";
            objectArray[n10] = "zzg";
            objectArray[n8] = "zzh";
            objectArray[n7] = "zzi";
            objectArray[n4] = "zzj";
            objectArray[6] = "zzk";
            objectArray[7] = "zzl";
            return zzacf.zzal(zzd, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001\u0016\u0002\u0016\u0003\u0016\u0004\u1004\u0000\u0005\u0016\u0006\u1004\u0001\u0007\u1004\u0002", objectArray);
        }
        return by2;
    }

    public final int zzc() {
        return this.zzg.size();
    }

    public final int zzd() {
        return this.zzh.size();
    }

    public final List zzf() {
        return this.zzf;
    }

    public final List zzg() {
        return this.zzg;
    }

    public final List zzh() {
        return this.zzh;
    }

    public final List zzi() {
        return this.zzj;
    }
}

