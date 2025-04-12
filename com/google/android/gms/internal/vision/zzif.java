/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzie;
import com.google.android.gms.internal.vision.zzig;
import com.google.android.gms.internal.vision.zzih;
import com.google.android.gms.internal.vision.zzjk;

public abstract class zzif {
    int zza;
    int zzb = 100;
    zzig zzc;
    private int zzd = -1 >>> 1;
    private boolean zze = false;

    private zzif() {
    }

    public /* synthetic */ zzif(zzie zzie2) {
        this();
    }

    public static long zza(long l2) {
        long l3 = l2 >>> 1;
        return -(l2 & 1L) ^ l3;
    }

    public static zzif zza(byte[] byArray, int n3, int n4, boolean bl2) {
        Object object = new zzih(byArray, 0, n4, false, null);
        try {
            ((zzih)object).zzc(n4);
            return object;
        }
        catch (zzjk zzjk2) {
            object = new IllegalArgumentException(zzjk2);
            throw object;
        }
    }

    public static int zze(int n3) {
        int n4 = n3 >>> 1;
        return -(n3 & 1) ^ n4;
    }

    public abstract int zza();

    public abstract void zza(int var1);

    public abstract double zzb();

    public abstract boolean zzb(int var1);

    public abstract float zzc();

    public abstract int zzc(int var1);

    public abstract long zzd();

    public abstract void zzd(int var1);

    public abstract long zze();

    public abstract int zzf();

    public abstract long zzg();

    public abstract int zzh();

    public abstract boolean zzi();

    public abstract String zzj();

    public abstract String zzk();

    public abstract zzht zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract int zzo();

    public abstract long zzp();

    public abstract int zzq();

    public abstract long zzr();

    public abstract long zzs();

    public abstract boolean zzt();

    public abstract int zzu();
}

