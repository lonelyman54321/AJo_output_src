/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgq;
import com.google.android.gms.internal.measurement.zzgr$zzd$zza;
import com.google.android.gms.internal.measurement.zzgr$zzd$zzb;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;
import java.util.List;

public final class zzgr$zzd
extends zzkg
implements zzlo {
    private static final zzgr$zzd zzc;
    private static volatile zzlz zzd;
    private int zze;
    private int zzf;
    private zzkm zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private double zzk;

    static {
        zzgr$zzd zzgr$zzd;
        zzc = zzgr$zzd = new zzgr$zzd();
        zzkg.zza(zzgr$zzd.class, zzgr$zzd);
    }

    private zzgr$zzd() {
        Object object = zzkg.zzcl();
        this.zzg = object;
        this.zzh = object = "";
        this.zzi = object;
    }

    public static /* bridge */ /* synthetic */ zzgr$zzd zzc() {
        return zzc;
    }

    public final double zza() {
        return this.zzk;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object objectArray, Object object2) {
        objectArray = zzgq.zza;
        byte by2 = 1;
        object -= by2;
        object = objectArray[object];
        objectArray = null;
        switch (object) {
            default: {
                throw null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                zzlz zzlz2 = zzd;
                if (zzlz2 != null) return zzlz2;
                objectArray = zzgr$zzd.class;
                synchronized (objectArray) {
                    try {
                        zzlz2 = zzd;
                        if (zzlz2 != null) return zzlz2;
                        object2 = zzc;
                        zzd = zzlz2 = new zzkg$zzc((zzkg)object2);
                        return zzlz2;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zzc;
            }
            case 3: {
                zzkl zzkl2 = zzgr$zzd$zzb.zzb();
                objectArray = new Object[9];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = zzkl2;
                objectArray[3] = "zzg";
                objectArray[4] = zzgr$zzd.class;
                objectArray[5] = "zzh";
                objectArray[6] = "zzi";
                objectArray[7] = "zzj";
                objectArray[8] = "zzk";
                return zzkg.zza(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u001b\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1007\u0003\u0006\u1000\u0004", objectArray);
            }
            case 2: {
                return new zzgr$zzd$zza(null);
            }
            case 1: 
        }
        return new zzgr$zzd();
    }

    public final zzgr$zzd$zzb zzb() {
        int n3 = this.zzf;
        zzgr$zzd$zzb zzgr$zzd$zzb = zzgr$zzd$zzb.zza(n3);
        if (zzgr$zzd$zzb == null) {
            zzgr$zzd$zzb = zzgr$zzd$zzb.zza;
        }
        return zzgr$zzd$zzb;
    }

    public final String zzd() {
        return this.zzh;
    }

    public final String zze() {
        return this.zzi;
    }

    public final List zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return this.zzj;
    }

    public final boolean zzh() {
        int n3 = this.zze & 8;
        return n3 != 0;
    }

    public final boolean zzi() {
        int n3 = this.zze & 0x10;
        return n3 != 0;
    }

    public final boolean zzj() {
        int n3 = this.zze & 4;
        return n3 != 0;
    }
}

