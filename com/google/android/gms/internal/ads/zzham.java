/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhae;
import com.google.android.gms.internal.ads.zzhai;
import com.google.android.gms.internal.ads.zzhal;
import com.google.android.gms.internal.ads.zzhan;
import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhcd;
import java.io.InputStream;

public abstract class zzham {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb;
    zzhan zzc;

    public /* synthetic */ zzham(zzhal zzhal2) {
        int n3;
        this.zzb = n3 = zze;
    }

    public static int zzF(int n3) {
        int n4 = n3 & 1;
        n4 = -n4;
        return (n3 >>>= 1) ^ n4;
    }

    public static int zzG(int n3, InputStream inputStream) {
        int n4;
        int n7;
        int n8;
        block6: {
            n8 = n3 & 0x80;
            if (n8 == 0) {
                return n3;
            }
            n3 &= 0x7F;
            n8 = 7;
            while (true) {
                n7 = 32;
                n4 = -1;
                if (n8 >= n7) break block6;
                n7 = inputStream.read();
                if (n7 == n4) break;
                n4 = (n7 & 0x7F) << n8;
                n3 |= n4;
                if ((n7 &= 0x80) == 0) {
                    return n3;
                }
                n8 += 7;
            }
            throw zzhcd.zzj();
        }
        while (n8 < (n7 = 64)) {
            n7 = inputStream.read();
            if (n7 != n4) {
                if ((n7 &= 0x80) == 0) {
                    return n3;
                }
                n8 += 7;
                continue;
            }
            throw zzhcd.zzj();
        }
        throw zzhcd.zze();
    }

    public static long zzH(long l2) {
        long l3 = 1L & l2;
        l3 = -l3;
        return (l2 >>>= 1) ^ l3;
    }

    public static zzham zzI(InputStream object, int n3) {
        if (object == null) {
            object = zzhcb.zzd;
            int cfr_ignored_0 = ((Object)object).length;
            return zzham.zzJ((byte[])object, 0, 0, false);
        }
        zzhai zzhai2 = new zzhai((InputStream)object, 4096, null);
        return zzhai2;
    }

    public static zzham zzJ(byte[] byArray, int n3, int n4, boolean bl2) {
        zzhae zzhae2 = new zzhae(byArray, n3, n4, bl2, null);
        try {
            zzhae2.zze(n4);
            return zzhae2;
        }
        catch (zzhcd zzhcd2) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(zzhcd2);
            throw illegalArgumentException;
        }
    }

    public abstract void zzA(int var1);

    public abstract boolean zzC();

    public abstract boolean zzD();

    public abstract boolean zzE(int var1);

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

    public abstract zzhac zzw();

    public abstract String zzx();

    public abstract String zzy();

    public abstract void zzz(int var1);
}

