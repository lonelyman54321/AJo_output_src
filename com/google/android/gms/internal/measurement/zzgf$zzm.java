/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgf$zze;
import com.google.android.gms.internal.measurement.zzgf$zzm$zza;
import com.google.android.gms.internal.measurement.zzgf$zzn;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;
import java.util.List;

public final class zzgf$zzm
extends zzkg
implements zzlo {
    private static final zzgf$zzm zzc;
    private static volatile zzlz zzd;
    private zzkn zze;
    private zzkn zzf;
    private zzkm zzg;
    private zzkm zzh;

    static {
        zzgf$zzm zzgf$zzm;
        zzc = zzgf$zzm = new zzgf$zzm();
        zzkg.zza(zzgf$zzm.class, zzgf$zzm);
    }

    private zzgf$zzm() {
        zzkm zzkm2;
        this.zze = zzkm2 = zzkg.zzck();
        this.zzf = zzkm2 = zzkg.zzck();
        zzkm2 = zzkg.zzcl();
        this.zzg = zzkm2;
        zzkm2 = zzkg.zzcl();
        this.zzh = zzkm2;
    }

    public static /* synthetic */ void zza(zzgf$zzm zzgf$zzm) {
        zzkm zzkm2;
        zzgf$zzm.zzg = zzkm2 = zzkg.zzcl();
    }

    public static /* synthetic */ void zza(zzgf$zzm object, Iterable iterable) {
        zzkm zzkm2 = ((zzgf$zzm)object).zzg;
        boolean bl2 = zzkm2.zzc();
        if (!bl2) {
            ((zzgf$zzm)object).zzg = zzkm2 = zzkg.zza(zzkm2);
        }
        object = ((zzgf$zzm)object).zzg;
        zzio.zza(iterable, (List)object);
    }

    public static /* synthetic */ void zzb(zzgf$zzm zzgf$zzm) {
        zzkn zzkn2;
        zzgf$zzm.zzf = zzkn2 = zzkg.zzck();
    }

    public static /* synthetic */ void zzb(zzgf$zzm object, Iterable iterable) {
        zzkn zzkn2 = ((zzgf$zzm)object).zzf;
        boolean bl2 = zzkn2.zzc();
        if (!bl2) {
            ((zzgf$zzm)object).zzf = zzkn2 = zzkg.zza(zzkn2);
        }
        object = ((zzgf$zzm)object).zzf;
        zzio.zza(iterable, (List)object);
    }

    public static /* synthetic */ void zzc(zzgf$zzm zzgf$zzm) {
        zzkm zzkm2;
        zzgf$zzm.zzh = zzkm2 = zzkg.zzcl();
    }

    public static /* synthetic */ void zzc(zzgf$zzm object, Iterable iterable) {
        zzkm zzkm2 = ((zzgf$zzm)object).zzh;
        boolean bl2 = zzkm2.zzc();
        if (!bl2) {
            ((zzgf$zzm)object).zzh = zzkm2 = zzkg.zza(zzkm2);
        }
        object = ((zzgf$zzm)object).zzh;
        zzio.zza(iterable, (List)object);
    }

    public static /* synthetic */ void zzd(zzgf$zzm zzgf$zzm) {
        zzkn zzkn2;
        zzgf$zzm.zze = zzkn2 = zzkg.zzck();
    }

    public static /* synthetic */ void zzd(zzgf$zzm object, Iterable iterable) {
        zzkn zzkn2 = ((zzgf$zzm)object).zze;
        boolean bl2 = zzkn2.zzc();
        if (!bl2) {
            ((zzgf$zzm)object).zze = zzkn2 = zzkg.zza(zzkn2);
        }
        object = ((zzgf$zzm)object).zze;
        zzio.zza(iterable, (List)object);
    }

    public static zzgf$zzm$zza zze() {
        return (zzgf$zzm$zza)zzc.zzcg();
    }

    public static /* bridge */ /* synthetic */ zzgf$zzm zzf() {
        return zzc;
    }

    public static zzgf$zzm zzg() {
        return zzc;
    }

    public final int zza() {
        return this.zzg.size();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgf$zzm>)zzgi.zza;
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
                clazz = zzgf$zzm.class;
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
                Object[] objectArray = new Object[6];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                objectArray[3] = zzgf$zze.class;
                objectArray[4] = "zzh";
                objectArray[5] = zzgf.zzn.class;
                return zzkg.zza(zzc, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", objectArray);
            }
            case 2: {
                return new zzgf$zzm$zza(null);
            }
            case 1: 
        }
        return new zzgf$zzm();
    }

    public final int zzb() {
        return this.zzf.size();
    }

    public final int zzc() {
        return this.zzh.size();
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final List zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzf;
    }

    public final List zzj() {
        return this.zzh;
    }

    public final List zzk() {
        return this.zze;
    }
}

