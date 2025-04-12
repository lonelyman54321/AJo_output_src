/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzjj;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.internal.measurement.zzjm;
import com.google.android.gms.internal.measurement.zzkp;

public abstract class zzjk {
    private static volatile int zzd = 100;
    int zza;
    int zzb;
    zzjl zzc;
    private int zze;

    private zzjk() {
        int n3;
        this.zze = n3 = zzd;
    }

    public /* synthetic */ zzjk(zzjm zzjm2) {
        this();
    }

    public static long zza(long l2) {
        long l3 = l2 >>> 1;
        return -(l2 & 1L) ^ l3;
    }

    public static zzjk zza(byte[] byArray, int n3, int n4, boolean bl2) {
        Object object = new zzjj(byArray, 0, n4, false, null);
        try {
            ((zzjj)object).zza(n4);
            return object;
        }
        catch (zzkp zzkp2) {
            object = new IllegalArgumentException(zzkp2);
            throw object;
        }
    }

    public static int zze(int n3) {
        int n4 = n3 >>> 1;
        return -(n3 & 1) ^ n4;
    }

    public abstract double zza();

    public abstract int zza(int var1);

    public abstract float zzb();

    public abstract void zzb(int var1);

    public abstract int zzc();

    public abstract void zzc(int var1);

    public abstract int zzd();

    public abstract boolean zzd(int var1);

    public abstract int zze();

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzi();

    public abstract int zzj();

    public abstract long zzk();

    public abstract long zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract zziy zzq();

    public abstract String zzr();

    public abstract String zzs();

    public abstract boolean zzt();

    public abstract boolean zzu();

    public final void zzv() {
        int n3 = this.zza;
        int n4 = this.zzb;
        if ((n3 += n4) < (n4 = this.zze)) {
            return;
        }
        throw zzkp.zzh();
    }
}

