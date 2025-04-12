/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfw$zza$zza;
import com.google.android.gms.internal.measurement.zzfw$zzb;
import com.google.android.gms.internal.measurement.zzfw$zze;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;
import java.util.List;

public final class zzfw$zza
extends zzkg
implements zzlo {
    private static final zzfw$zza zzc;
    private static volatile zzlz zzd;
    private int zze;
    private int zzf;
    private zzkm zzg;
    private zzkm zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        zzfw$zza zzfw$zza;
        zzc = zzfw$zza = new zzfw$zza();
        zzkg.zza(zzfw$zza.class, zzfw$zza);
    }

    private zzfw$zza() {
        zzkm zzkm2;
        this.zzg = zzkm2 = zzkg.zzcl();
        this.zzh = zzkm2 = zzkg.zzcl();
    }

    public static /* synthetic */ void zza(zzfw$zza zzfw$zza, int n3, zzfw$zzb zzfw$zzb) {
        zzfw$zzb.getClass();
        zzkm zzkm2 = zzfw$zza.zzh;
        boolean bl2 = zzkm2.zzc();
        if (!bl2) {
            zzfw$zza.zzh = zzkm2 = zzkg.zza(zzkm2);
        }
        zzfw$zza.zzh.set(n3, zzfw$zzb);
    }

    public static /* synthetic */ void zza(zzfw$zza zzfw$zza, int n3, zzfw$zze zzfw$zze) {
        zzfw$zze.getClass();
        zzkm zzkm2 = zzfw$zza.zzg;
        boolean bl2 = zzkm2.zzc();
        if (!bl2) {
            zzfw$zza.zzg = zzkm2 = zzkg.zza(zzkm2);
        }
        zzfw$zza.zzg.set(n3, zzfw$zze);
    }

    public static /* bridge */ /* synthetic */ zzfw$zza zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzfw$zzb zza(int n3) {
        return (zzfw$zzb)this.zzh.get(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzfw$zza>)zzfx.zza;
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
                clazz = zzfw$zza.class;
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
                Object[] objectArray = new Object[8];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                objectArray[3] = zzfw$zze.class;
                objectArray[4] = "zzh";
                objectArray[5] = zzfw$zzb.class;
                objectArray[6] = "zzi";
                objectArray[7] = "zzj";
                return zzkg.zza(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u1004\u0000\u0002\u001b\u0003\u001b\u0004\u1007\u0001\u0005\u1007\u0002", objectArray);
            }
            case 2: {
                return new zzfw$zza$zza(null);
            }
            case 1: 
        }
        return new zzfw$zza();
    }

    public final int zzb() {
        return this.zzh.size();
    }

    public final zzfw$zze zzb(int n3) {
        return (zzfw$zze)this.zzg.get(n3);
    }

    public final int zzc() {
        return this.zzg.size();
    }

    public final List zze() {
        return this.zzh;
    }

    public final List zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }
}

