/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgf$zzh$zza;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzc;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlz;
import java.util.List;

public final class zzgf$zzh
extends zzkg
implements zzlo {
    private static final zzgf$zzh zzc;
    private static volatile zzlz zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private float zzi;
    private double zzj;
    private zzkm zzk;

    static {
        zzgf$zzh zzgf$zzh;
        zzc = zzgf$zzh = new zzgf$zzh();
        zzkg.zza(zzgf$zzh.class, zzgf$zzh);
    }

    private zzgf$zzh() {
        Object object = "";
        this.zzf = object;
        this.zzg = object;
        this.zzk = object = zzkg.zzcl();
    }

    public static /* synthetic */ void zza(zzgf$zzh zzgf$zzh) {
        int n3;
        zzgf$zzh.zze = n3 = zzgf$zzh.zze & 0xFFFFFFEF;
        zzgf$zzh.zzj = 0.0;
    }

    public static /* synthetic */ void zza(zzgf$zzh zzgf$zzh, double d2) {
        int n3;
        zzgf$zzh.zze = n3 = zzgf$zzh.zze | 0x10;
        zzgf$zzh.zzj = d2;
    }

    public static /* synthetic */ void zza(zzgf$zzh zzgf$zzh, long l2) {
        int n3;
        zzgf$zzh.zze = n3 = zzgf$zzh.zze | 4;
        zzgf$zzh.zzh = l2;
    }

    public static /* synthetic */ void zza(zzgf$zzh zzgf$zzh, zzgf$zzh zzgf$zzh2) {
        zzgf$zzh2.getClass();
        zzgf$zzh.zzo();
        zzgf$zzh.zzk.add(zzgf$zzh2);
    }

    public static /* synthetic */ void zza(zzgf$zzh object, Iterable iterable) {
        ((zzgf$zzh)object).zzo();
        object = ((zzgf$zzh)object).zzk;
        zzio.zza(iterable, (List)object);
    }

    public static /* synthetic */ void zza(zzgf$zzh zzgf$zzh, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzh.zze = n3 = zzgf$zzh.zze | 1;
        zzgf$zzh.zzf = string2;
    }

    public static /* synthetic */ void zzb(zzgf$zzh zzgf$zzh) {
        int n3;
        zzgf$zzh.zze = n3 = zzgf$zzh.zze & 0xFFFFFFFB;
        zzgf$zzh.zzh = 0L;
    }

    public static /* synthetic */ void zzb(zzgf$zzh zzgf$zzh, String string2) {
        int n3;
        string2.getClass();
        zzgf$zzh.zze = n3 = zzgf$zzh.zze | 2;
        zzgf$zzh.zzg = string2;
    }

    public static /* synthetic */ void zzc(zzgf$zzh zzgf$zzh) {
        zzkm zzkm2;
        zzgf$zzh.zzk = zzkm2 = zzkg.zzcl();
    }

    public static /* synthetic */ void zzd(zzgf$zzh zzgf$zzh) {
        String string2;
        int n3;
        zzgf$zzh.zze = n3 = zzgf$zzh.zze & 0xFFFFFFFD;
        zzgf$zzh.zzg = string2 = zzgf$zzh.zzc.zzg;
    }

    public static zzgf$zzh$zza zze() {
        return (zzgf$zzh$zza)zzc.zzcg();
    }

    public static /* bridge */ /* synthetic */ zzgf$zzh zzf() {
        return zzc;
    }

    private final void zzo() {
        zzkm zzkm2 = this.zzk;
        boolean bl2 = zzkm2.zzc();
        if (!bl2) {
            this.zzk = zzkm2 = zzkg.zza(zzkm2);
        }
    }

    public final double zza() {
        return this.zzj;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzgf$zzh>)zzgi.zza;
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
                clazz = zzgf$zzh.class;
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
                objectArray[3] = "zzh";
                objectArray[4] = "zzi";
                objectArray[5] = "zzj";
                objectArray[6] = "zzk";
                objectArray[7] = zzgf$zzh.class;
                return zzkg.zza(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1001\u0003\u0005\u1000\u0004\u0006\u001b", objectArray);
            }
            case 2: {
                return new zzgf$zzh$zza(null);
            }
            case 1: 
        }
        return new zzgf$zzh();
    }

    public final float zzb() {
        return this.zzi;
    }

    public final int zzc() {
        return this.zzk.size();
    }

    public final long zzd() {
        return this.zzh;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzk;
    }

    public final boolean zzj() {
        int n3 = this.zze & 0x10;
        return n3 != 0;
    }

    public final boolean zzk() {
        int n3 = this.zze & 8;
        return n3 != 0;
    }

    public final boolean zzl() {
        int n3 = this.zze & 4;
        return n3 != 0;
    }

    public final boolean zzm() {
        int n3 = this.zze;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public final boolean zzn() {
        int n3 = this.zze & 2;
        return n3 != 0;
    }
}

