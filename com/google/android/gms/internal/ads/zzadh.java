/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzaeu;

public class zzadh
implements zzaet {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    /*
     * Enabled aggressive block sorting
     */
    public zzadh(long l2, long l3, int n3, int n4, boolean n7) {
        this.zza = l2;
        this.zzb = l3;
        n7 = -1;
        if (n4 == n7) {
            n4 = 1;
        }
        this.zzc = n4;
        this.zze = n3;
        long l4 = -1;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            this.zzd = l4;
            l2 = -9223372036854775807L;
        } else {
            this.zzd = l4 = l2 - l3;
            l2 = zzadh.zzc(l2, l3, n3);
        }
        this.zzf = l2;
    }

    private static long zzc(long l2, long l3, int n3) {
        l2 -= l3;
        l2 = Math.max(0L, l2) * 8000000L;
        l3 = n3;
        return l2 / l3;
    }

    public final long zza() {
        return this.zzf;
    }

    public final long zzb(long l2) {
        long l3 = this.zzb;
        int n3 = this.zze;
        return zzadh.zzc(l2, l3, n3);
    }

    public final zzaer zzg(long l2) {
        long l3 = this.zzd;
        long l4 = 0L;
        long l7 = -1;
        long l8 = l3 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object != false) {
            long l12;
            int n3 = this.zze;
            long l14 = (long)n3 * l2;
            int n4 = this.zzc;
            long l15 = 8000000L;
            l14 /= l15;
            long l16 = n4;
            l14 = l14 / l16 * l16;
            if (object != false) {
                l14 = Math.min(l14, l3 -= l16);
            }
            l3 = Math.max(l14, l4);
            l4 = this.zzb + l3;
            l3 = this.zzb(l4);
            zzaeu zzaeu2 = new zzaeu(l3, l4);
            l14 = this.zzd;
            long l17 = l14 - l7;
            n4 = (int)(l17 == 0L ? 0 : (l17 < 0L ? -1 : 1));
            if (n4 != 0 && (l12 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1)) < 0) {
                int n7 = this.zzc;
                l2 = n7;
                long l18 = (l4 += l2) - (l2 = this.zza);
                Object object2 = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
                if (object2 < 0) {
                    l2 = this.zzb(l4);
                    zzaeu zzaeu3 = new zzaeu(l2, l4);
                    zzaer zzaer2 = new zzaer(zzaeu2, zzaeu3);
                    return zzaer2;
                }
            }
            zzaer zzaer3 = new zzaer(zzaeu2, zzaeu2);
            return zzaer3;
        }
        l2 = this.zzb;
        zzaeu zzaeu4 = new zzaeu(l4, l2);
        zzaer zzaer4 = new zzaer(zzaeu4, zzaeu4);
        return zzaer4;
    }

    public final boolean zzh() {
        long l2 = this.zzd;
        long l3 = -1;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object != false;
    }
}

