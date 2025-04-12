/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgf$zzj$zza;
import com.google.android.gms.internal.measurement.zzgf$zzj$zzb;
import com.google.android.gms.internal.measurement.zzgf$zzk;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;
import java.util.List;

public final class zzgf$zzj
extends zzkg
implements zzlo {
    private static final zzgf$zzj zzc;
    private static volatile zzlz zzd;
    private int zze;
    private zzkm zzf;
    private String zzg;
    private String zzh;
    private int zzi;

    static {
        zzgf$zzj zzgf$zzj;
        zzc = zzgf$zzj = new zzgf$zzj();
        zzkg.zza(zzgf$zzj.class, zzgf$zzj);
    }

    private zzgf$zzj() {
        Object object = zzkg.zzcl();
        this.zzf = object;
        this.zzg = object = "";
        this.zzh = object;
    }

    public static zzgf$zzj$zzb zza(zzgf$zzj zzgf$zzj) {
        return (zzgf$zzj$zzb)zzc.zza(zzgf$zzj);
    }

    public static /* synthetic */ void zza(zzgf$zzj zzgf$zzj, int n3, zzgf$zzk zzgf$zzk) {
        zzgf$zzk.getClass();
        zzgf$zzj.zzi();
        zzgf$zzj.zzf.set(n3, zzgf$zzk);
    }

    public static /* synthetic */ void zza(zzgf$zzj zzgf$zzj, zzgf$zzk zzgf$zzk) {
        zzgf$zzk.getClass();
        zzgf$zzj.zzi();
        zzgf$zzj.zzf.add(zzgf$zzk);
    }

    public static /* synthetic */ void zza(zzgf$zzj object, Iterable iterable) {
        ((zzgf$zzj)object).zzi();
        object = ((zzgf$zzj)object).zzf;
        zzio.zza(iterable, (List)object);
    }

    public static /* synthetic */ void zza(zzgf$zzj zzgf$zzj, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzj.zze = n3 = zzgf$zzj.zze | 1;
        zzgf$zzj.zzg = string2;
    }

    public static zzgf$zzj$zzb zzb() {
        return (zzgf$zzj$zzb)zzc.zzcg();
    }

    public static /* synthetic */ void zzb(zzgf$zzj zzgf$zzj) {
        zzkm zzkm2;
        zzgf$zzj.zzf = zzkm2 = zzkg.zzcl();
    }

    public static /* synthetic */ void zzb(zzgf$zzj zzgf$zzj, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzj.zze = n3 = zzgf$zzj.zze | 2;
        zzgf$zzj.zzh = string2;
    }

    public static /* bridge */ /* synthetic */ zzgf$zzj zzc() {
        return zzc;
    }

    private final void zzi() {
        zzkm zzkm2 = this.zzf;
        boolean bl2 = zzkm2.zzc();
        if (!bl2) {
            this.zzf = zzkm2 = zzkg.zza(zzkm2);
        }
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final zzgf$zzk zza(int n3) {
        return (zzgf$zzk)this.zzf.get(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object objectArray, Object object2) {
        objectArray = zzgi.zza;
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
                objectArray = zzgf$zzj.class;
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
                zzkl zzkl2 = zzgf$zzj$zza.zzb();
                objectArray = new Object[7];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = zzgf$zzk.class;
                objectArray[3] = "zzg";
                objectArray[4] = "zzh";
                objectArray[5] = "zzi";
                objectArray[6] = zzkl2;
                return zzkg.zza(zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007\u1008\u0000\b\u1008\u0001\t\u180c\u0002", objectArray);
            }
            case 2: {
                return new zzgf$zzj$zzb(null);
            }
            case 1: 
        }
        return new zzgf$zzj();
    }

    public final String zzd() {
        return this.zzg;
    }

    public final String zze() {
        return this.zzh;
    }

    public final List zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public final boolean zzh() {
        int n3 = this.zze & 2;
        return n3 != 0;
    }
}

