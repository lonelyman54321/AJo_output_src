/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzady;
import com.google.android.gms.internal.ads.zzfu;

final class zzajp {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzfu zzf;
    private final zzfu zzg;
    private int zzh;
    private int zzi;

    public zzajp(zzfu zzfu2, zzfu zzfu3, boolean bl2) {
        this.zzg = zzfu2;
        this.zzf = zzfu3;
        this.zze = bl2;
        int n3 = 12;
        zzfu3.zzK(n3);
        int n4 = zzfu3.zzp();
        this.zza = n4;
        zzfu2.zzK(n3);
        n4 = zzfu2.zzp();
        this.zzi = n4;
        int n7 = zzfu2.zzg();
        n4 = 1;
        if (n7 != n4) {
            n4 = 0;
            zzfu3 = null;
        }
        zzady.zzb(n4 != 0, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        long l2;
        zzfu zzfu2;
        int n3 = this.zzb;
        int n4 = 1;
        this.zzb = n3 += n4;
        int n7 = this.zza;
        if (n3 == n7) {
            return false;
        }
        n3 = (int)(this.zze ? 1 : 0);
        if (n3 != 0) {
            zzfu2 = this.zzf;
            l2 = zzfu2.zzv();
        } else {
            zzfu2 = this.zzf;
            l2 = zzfu2.zzu();
        }
        this.zzd = l2;
        n3 = this.zzb;
        n7 = this.zzh;
        if (n3 == n7) {
            this.zzc = n3 = this.zzg.zzp();
            zzfu2 = this.zzg;
            zzfu2.zzL(4);
            n3 = this.zzi;
            n7 = -1;
            this.zzi = n3 += n7;
            if (n3 > 0) {
                zzfu2 = this.zzg;
                n3 = zzfu2.zzp();
                n7 += n3;
            }
            this.zzh = n7;
        }
        return n4 != 0;
    }
}

