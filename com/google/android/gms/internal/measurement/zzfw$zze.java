/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfw$zzc;
import com.google.android.gms.internal.measurement.zzfw$zze$zza;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;

public final class zzfw$zze
extends zzkg
implements zzlo {
    private static final zzfw$zze zzc;
    private static volatile zzlz zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private zzfw$zzc zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        zzfw$zze zzfw$zze;
        zzc = zzfw$zze = new zzfw$zze();
        zzkg.zza(zzfw$zze.class, zzfw$zze);
    }

    private zzfw$zze() {
    }

    public static /* synthetic */ void zza(zzfw$zze zzfw$zze, String string2) {
        int n3;
        string2.getClass();
        zzfw$zze.zze = n3 = zzfw$zze.zze | 2;
        zzfw$zze.zzg = string2;
    }

    public static zzfw$zze$zza zzc() {
        return (zzfw$zze$zza)zzc.zzcg();
    }

    public static /* bridge */ /* synthetic */ zzfw$zze zzd() {
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
        clazz = (Class<zzfw$zze>)zzfx.zza;
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
                clazz = zzfw$zze.class;
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
                Object[] objectArray = new Object[7];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                objectArray[3] = "zzh";
                objectArray[4] = "zzi";
                objectArray[5] = "zzj";
                objectArray[6] = "zzk";
                return zzkg.zza(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005", objectArray);
            }
            case 2: {
                return new zzfw$zze$zza(null);
            }
            case 1: 
        }
        return new zzfw$zze();
    }

    public final zzfw$zzc zzb() {
        zzfw$zzc zzfw$zzc = this.zzh;
        if (zzfw$zzc == null) {
            zzfw$zzc = zzfw$zzc.zzb();
        }
        return zzfw$zzc;
    }

    public final String zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzi;
    }

    public final boolean zzg() {
        return this.zzj;
    }

    public final boolean zzh() {
        return this.zzk;
    }

    public final boolean zzi() {
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public final boolean zzj() {
        int n3 = this.zze & 0x20;
        return n3 != 0;
    }
}

