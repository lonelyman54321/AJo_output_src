/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgb;
import com.google.android.gms.internal.ads.zzgd;

final class zzaox {
    private final zzgb zza;
    private final zzfu zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public zzaox() {
        long l2;
        Object object = new zzgb(0L);
        this.zza = object;
        this.zzf = l2 = -9223372036854775807L;
        this.zzg = l2;
        this.zzh = l2;
        this.zzb = object = new zzfu();
    }

    public static long zzc(zzfu zzfu2) {
        int n3;
        int n4 = zzfu2.zzd();
        int n7 = zzfu2.zzb();
        if (n7 >= (n3 = 9)) {
            int n8;
            byte[] byArray = new byte[n3];
            int n10 = 0;
            zzfu2.zzG(byArray, 0, n3);
            zzfu2.zzK(n4);
            byte by2 = byArray[0];
            n4 = by2 & 0xC4;
            n3 = 68;
            if (n4 == n3 && (n3 = (n4 = byArray[2]) & 4) == (n10 = 4) && (n8 = (n3 = byArray[n10]) & 4) == n10) {
                n10 = 5;
                n8 = byArray[n10];
                int n14 = 1;
                if ((n8 &= n14) == n14) {
                    n8 = byArray[8];
                    int n15 = 3;
                    if ((n8 &= n15) == n15) {
                        long l2 = by2;
                        long l3 = byArray[n14];
                        long l4 = n4;
                        long l7 = byArray[n15];
                        long l8 = n3;
                        long l12 = 248L;
                        l8 = (l8 & l12) >> n15;
                        long l14 = 255L;
                        l7 = (l7 & l14) << n10;
                        l12 = (l12 & l4) >> n15;
                        long l15 = (l2 & (long)56) >> n15;
                        long l16 = 3;
                        long l17 = l2 & l16;
                        long l18 = l3 & l14;
                        l14 = l15 << 30;
                        long l19 = l17 << 28 | l14;
                        l18 = l18 << 20 | l19;
                        l19 = l12 << 15;
                        return (l4 &= l16) << 13 | (l18 |= l19) | l7 | l8;
                    }
                }
            }
        }
        return -9223372036854775807L;
    }

    private final int zzf(zzadv zzadv2) {
        byte[] byArray = zzgd.zzf;
        int cfr_ignored_0 = byArray.length;
        this.zzb.zzI(byArray, 0);
        this.zzc = true;
        zzadv2.zzj();
        return 0;
    }

    private static final int zzg(byte[] byArray, int n3) {
        int n4 = byArray[n3] & 0xFF;
        int n7 = n3 + 1;
        n7 = byArray[n7] & 0xFF;
        int n8 = n3 + 2;
        n8 = byArray[n8] & 0xFF;
        int n10 = byArray[n3 += 3] & 0xFF;
        n3 = n4 << 24;
        n4 = n7 << 16;
        n3 |= n4;
        n4 = n8 << 8;
        return n10 | (n3 |= n4);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int zza(zzadv object, zzaeq object2) {
        boolean bl2 = this.zze;
        int n3 = 442;
        long l2 = 20000L;
        int n4 = 1;
        long l3 = -9223372036854775807L;
        if (!bl2) {
            void var3_6;
            long l4 = object.zzd();
            int n7 = (int)Math.min(l2, l4);
            l2 = n7;
            l4 -= l2;
            l2 = object.zzf();
            long l7 = l2 - l4;
            Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object3 != false) {
                ((zzaeq)object2).zza = l4;
                return n4;
            }
            this.zzb.zzH(n7);
            object.zzj();
            object2 = this.zzb.zzM();
            ((zzadi)object).zzm((byte[])object2, 0, n7, false);
            object = this.zzb;
            int n8 = ((zzfu)object).zzd();
            int n10 = ((zzfu)object).zze() + -4;
            while (var3_6 >= n8) {
                byte[] byArray = ((zzfu)object).zzM();
                int n14 = zzaox.zzg(byArray, (int)var3_6);
                if (n14 == n3) {
                    n14 = var3_6 + 4;
                    ((zzfu)object).zzK(n14);
                    l2 = zzaox.zzc((zzfu)object);
                    long l8 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (l8 != false) {
                        l3 = l2;
                        break;
                    }
                }
                var3_6 += -1;
            }
            this.zzg = l3;
            this.zze = n4;
            return 0;
        }
        long l12 = this.zzg;
        long l14 = l12 - l3;
        Object object4 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object4 == false) {
            this.zzf((zzadv)object);
            return 0;
        }
        boolean bl3 = this.zzd;
        if (!bl3) {
            l12 = object.zzd();
            int n15 = (int)Math.min(l2, l12);
            l2 = object.zzf();
            long l15 = l2 - (l12 = 0L);
            Object object5 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
            if (object5 != false) {
                ((zzaeq)object2).zza = l12;
                return n4;
            } else {
                int n16;
                void var13_21;
                this.zzb.zzH(n15);
                object.zzj();
                object2 = this.zzb.zzM();
                ((zzadi)object).zzm((byte[])object2, 0, n15, false);
                object = this.zzb;
                int n17 = ((zzfu)object).zzd();
                int n18 = ((zzfu)object).zze();
                while (var13_21 < (n16 = n18 + -3)) {
                    byte[] byArray = ((zzfu)object).zzM();
                    n16 = zzaox.zzg(byArray, (int)var13_21);
                    if (n16 == n3) {
                        n16 = var13_21 + 4;
                        ((zzfu)object).zzK(n16);
                        l2 = zzaox.zzc((zzfu)object);
                        long l16 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                        if (l16 != false) {
                            l3 = l2;
                            break;
                        }
                    }
                    ++var13_21;
                }
                this.zzf = l3;
                this.zzd = n4;
                return 0;
            }
        }
        long l17 = this.zzf;
        long l18 = l17 - l3;
        Object object6 = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
        if (object6 == false) {
            this.zzf((zzadv)object);
            return 0;
        }
        object2 = this.zza;
        l17 = ((zzgb)object2).zzb(l17);
        l2 = this.zzg;
        this.zzh = l2 = ((zzgb)object2).zzc(l2) - l17;
        this.zzf((zzadv)object);
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzgb zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}

