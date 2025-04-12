/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgf$zzf$zza;
import com.google.android.gms.internal.measurement.zzgf$zzh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;
import java.util.List;

public final class zzgf$zzf
extends zzkg
implements zzlo {
    private static final zzgf$zzf zzc;
    private static volatile zzlz zzd;
    private int zze;
    private zzkm zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        zzgf$zzf zzgf$zzf;
        zzc = zzgf$zzf = new zzgf$zzf();
        zzkg.zza(zzgf$zzf.class, zzgf$zzf);
    }

    private zzgf$zzf() {
        zzkm zzkm2;
        this.zzf = zzkm2 = zzkg.zzcl();
        this.zzg = "";
    }

    public static /* synthetic */ void zza(zzgf$zzf zzgf$zzf) {
        zzkm zzkm2;
        zzgf$zzf.zzf = zzkm2 = zzkg.zzcl();
    }

    public static /* synthetic */ void zza(zzgf$zzf zzgf$zzf, int n3) {
        zzgf$zzf.zzl();
        zzgf$zzf.zzf.remove(n3);
    }

    public static /* synthetic */ void zza(zzgf$zzf zzgf$zzf, int n3, zzgf$zzh zzgf$zzh) {
        zzgf$zzh.getClass();
        zzgf$zzf.zzl();
        zzgf$zzf.zzf.set(n3, zzgf$zzh);
    }

    public static /* synthetic */ void zza(zzgf$zzf zzgf$zzf, long l2) {
        int n3;
        zzgf$zzf.zze = n3 = zzgf$zzf.zze | 4;
        zzgf$zzf.zzi = l2;
    }

    public static /* synthetic */ void zza(zzgf$zzf zzgf$zzf, zzgf$zzh zzgf$zzh) {
        zzgf$zzh.getClass();
        zzgf$zzf.zzl();
        zzgf$zzf.zzf.add(zzgf$zzh);
    }

    public static /* synthetic */ void zza(zzgf$zzf object, Iterable iterable) {
        ((zzgf$zzf)object).zzl();
        object = ((zzgf$zzf)object).zzf;
        zzio.zza(iterable, (List)object);
    }

    public static /* synthetic */ void zza(zzgf$zzf zzgf$zzf, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzf.zze = n3 = zzgf$zzf.zze | 1;
        zzgf$zzf.zzg = string2;
    }

    public static /* synthetic */ void zzb(zzgf$zzf zzgf$zzf, long l2) {
        int n3;
        zzgf$zzf.zze = n3 = zzgf$zzf.zze | 2;
        zzgf$zzf.zzh = l2;
    }

    public static zzgf$zzf$zza zze() {
        return (zzgf$zzf$zza)zzc.zzcg();
    }

    public static /* bridge */ /* synthetic */ zzgf$zzf zzf() {
        return zzc;
    }

    private final void zzl() {
        zzkm zzkm2 = this.zzf;
        boolean bl2 = zzkm2.zzc();
        if (!bl2) {
            this.zzf = zzkm2 = zzkg.zza(zzkm2);
        }
    }

    public final int zza() {
        return this.zzj;
    }

    public final zzgf$zzh zza(int n3) {
        return (zzgf$zzh)this.zzf.get(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgf$zzf>)zzgi.zza;
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
                clazz = zzgf$zzf.class;
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
                objectArray[2] = zzgf$zzh.class;
                objectArray[3] = "zzg";
                objectArray[4] = "zzh";
                objectArray[5] = "zzi";
                objectArray[6] = "zzj";
                return zzkg.zza(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000\u0003\u1002\u0001\u0004\u1002\u0002\u0005\u1004\u0003", objectArray);
            }
            case 2: {
                return new zzgf$zzf$zza(null);
            }
            case 1: 
        }
        return new zzgf$zzf();
    }

    public final int zzb() {
        return this.zzf.size();
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final List zzh() {
        return this.zzf;
    }

    public final boolean zzi() {
        int n3 = this.zze & 8;
        return n3 != 0;
    }

    public final boolean zzj() {
        int n3 = this.zze & 4;
        return n3 != 0;
    }

    public final boolean zzk() {
        int n3 = this.zze & 2;
        return n3 != 0;
    }
}

