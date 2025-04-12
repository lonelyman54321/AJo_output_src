/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgf$zze$zza;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;

public final class zzgf$zze
extends zzkg
implements zzlo {
    private static final zzgf$zze zzc;
    private static volatile zzlz zzd;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        zzgf$zze zzgf$zze;
        zzc = zzgf$zze = new zzgf$zze();
        zzkg.zza(zzgf$zze.class, zzgf$zze);
    }

    private zzgf$zze() {
    }

    public static /* synthetic */ void zza(zzgf$zze zzgf$zze, int n3) {
        int n4;
        zzgf$zze.zze = n4 = zzgf$zze.zze | 1;
        zzgf$zze.zzf = n3;
    }

    public static /* synthetic */ void zza(zzgf$zze zzgf$zze, long l2) {
        int n3;
        zzgf$zze.zze = n3 = zzgf$zze.zze | 2;
        zzgf$zze.zzg = l2;
    }

    public static zzgf$zze$zza zzc() {
        return (zzgf$zze$zza)zzc.zzcg();
    }

    public static /* bridge */ /* synthetic */ zzgf$zze zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgf$zze>)zzgi.zza;
        byte by2 = 1;
        object -= by2;
        object = clazz[object];
        clazz = null;
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
                clazz = zzgf$zze.class;
                synchronized (clazz) {
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
                Object[] objectArray = new Object[3];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                return zzkg.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1002\u0001", objectArray);
            }
            case 2: {
                return new zzgf$zze$zza(null);
            }
            case 1: 
        }
        return new zzgf$zze();
    }

    public final long zzb() {
        return this.zzg;
    }

    public final boolean zze() {
        int n3 = this.zze & 2;
        return n3 != 0;
    }

    public final boolean zzf() {
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }
}

