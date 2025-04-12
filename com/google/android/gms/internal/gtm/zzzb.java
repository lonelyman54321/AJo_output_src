/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacq;
import com.google.android.gms.internal.gtm.zzyx;
import com.google.android.gms.internal.gtm.zzyy;
import com.google.android.gms.internal.gtm.zzza;
import com.google.android.gms.internal.gtm.zzzc;

public abstract class zzzb {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb;
    zzzc zzc;

    private zzzb() {
        int n3;
        this.zzb = n3 = zze;
    }

    public /* synthetic */ zzzb(zzza zzza2) {
        int n3;
        this.zzb = n3 = zze;
    }

    public static int zzF(int n3) {
        int n4 = n3 & 1;
        n4 = -n4;
        return (n3 >>>= 1) ^ n4;
    }

    public static long zzG(long l2) {
        long l3 = 1L & l2;
        l3 = -l3;
        return (l2 >>>= 1) ^ l3;
    }

    public static zzzb zzH(byte[] byArray, int n3, int n4, boolean bl2) {
        Object object = new zzyy(byArray, 0, n4, bl2, null);
        try {
            ((zzyy)object).zze(n4);
            return object;
        }
        catch (zzacq zzacq2) {
            object = new IllegalArgumentException(zzacq2);
            throw object;
        }
    }

    public abstract void zzA(int var1);

    public abstract boolean zzC();

    public abstract boolean zzD();

    public abstract boolean zzE(int var1);

    public final void zzI() {
        block2: {
            int n3;
            while ((n3 = this.zzm()) != 0) {
                int n4 = this.zza;
                int n7 = this.zzb;
                if (n4 < n7) {
                    this.zza = ++n4;
                    n3 = (int)(this.zzE(n3) ? 1 : 0);
                    this.zza = n4 = this.zza + -1;
                    if (n3 != 0) continue;
                }
                break block2;
            }
            return;
        }
        zzacq zzacq2 = new zzacq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        throw zzacq2;
    }

    public abstract double zzb();

    public abstract float zzc();

    public abstract int zzd();

    public abstract int zze(int var1);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract long zzt();

    public abstract long zzu();

    public abstract long zzv();

    public abstract zzyx zzw();

    public abstract String zzx();

    public abstract String zzy();

    public abstract void zzz(int var1);
}

