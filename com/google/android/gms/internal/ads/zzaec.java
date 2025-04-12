/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzady;
import com.google.android.gms.internal.ads.zzaeb;
import com.google.android.gms.internal.ads.zzaeg;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgd;

public final class zzaec {
    public static int zza(zzfu zzfu2, int n3) {
        switch (n3) {
            default: {
                return -1;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return 256 << (n3 += -8);
            }
            case 7: {
                return zzfu2.zzq() + 1;
            }
            case 6: {
                return zzfu2.zzm() + 1;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return 576 << (n3 += -2);
            }
            case 1: 
        }
        return 192;
    }

    public static long zzb(zzadv object, zzaeg zzaeg2) {
        object.zzj();
        zzadv zzadv2 = object;
        zzadv2 = (zzadi)object;
        int n3 = 1;
        ((zzadi)zzadv2).zzl(n3, false);
        byte[] byArray = new byte[n3];
        ((zzadi)zzadv2).zzm(byArray, 0, n3, false);
        int n4 = byArray[0] & n3;
        boolean bl2 = n3 == n4;
        int n7 = 2;
        ((zzadi)zzadv2).zzl(n7, false);
        int n8 = n3 != n4 ? 6 : 7;
        zzfu zzfu2 = new zzfu(n8);
        byArray = zzfu2.zzM();
        n8 = zzady.zza((zzadv)object, byArray, 0, n8);
        zzfu2.zzJ(n8);
        object.zzj();
        object = new zzaeb();
        boolean bl3 = zzaec.zzd(zzfu2, zzaeg2, bl2, (zzaeb)object);
        if (bl3) {
            return ((zzaeb)object).zza;
        }
        throw zzch.zza(null, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean zzc(zzfu zzfu2, zzaeg zzaeg2, int n3, zzaeb zzaeb2) {
        int n4;
        int n7;
        long l2;
        long l3;
        long l4;
        long l7;
        long l8;
        int n8;
        int n10;
        long l12;
        int n14;
        long l14;
        int n15;
        zzaeg zzaeg3;
        Object object;
        block11: {
            int n16;
            block10: {
                object = zzfu2;
                zzaeg3 = zzaeg2;
                n15 = zzfu2.zzd();
                l14 = zzfu2.zzu();
                n14 = 16;
                long l15 = l14 >>> n14;
                l12 = n3;
                n10 = 0;
                Object object2 = l15 == l12 ? 0 : (l15 < l12 ? -1 : 1);
                if (object2 != false) {
                    return false;
                }
                l12 = 1L;
                int n17 = 1;
                long l16 = (l15 &= l12) - l12;
                Object object3 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                n14 = object3 == false ? 1 : 0;
                n8 = 12;
                l8 = l14 >> n8;
                int n18 = 8;
                l7 = l14 >> n18;
                long l17 = l14 >> 4;
                l4 = l14 >> n17;
                l14 &= l12;
                l3 = 15;
                l2 = l17 & l3;
                n16 = (int)l2;
                n10 = 7;
                n7 = -1;
                if (n16 > n10) break block10;
                n10 = zzaeg3.zzg + n7;
                if (n16 != n10) return 0 != 0;
                break block11;
            }
            n10 = 10;
            if (n16 > n10) return 0 != 0;
            n10 = zzaeg3.zzg;
            int n19 = 2;
            if (n10 != n19) return 0 != 0;
        }
        l2 = l4 & (long)7;
        int n20 = (int)l2;
        if (n20 != 0) {
            n10 = zzaeg3.zzi;
            if (n20 != n10) return 0 != 0;
        }
        if ((n10 = (int)(l14 == l12 ? 0 : (l14 < l12 ? -1 : 1))) == 0) return 0 != 0;
        int n21 = zzaec.zzd((zzfu)object, zzaeg3, n14 != 0, zzaeb2);
        if (n21 == 0) return 0 != 0;
        l14 = l8 & l3;
        int n22 = (int)l14;
        n21 = zzaec.zza((zzfu)object, n22);
        if (n21 == n7) return 0 != 0;
        n22 = zzaeg3.zzb;
        if (n21 > n22) return 0 != 0;
        l14 = l7 & l3;
        n14 = zzaeg3.zze;
        n22 = (int)l14;
        if (n22 != 0) {
            n21 = 11;
            if (n22 <= n21) {
                n4 = zzaeg3.zzf;
                if (n22 != n4) {
                    return 0 != 0;
                }
            } else if (n22 == n8) {
                n4 = zzfu2.zzm() * 1000;
                if (n4 != n14) return 0 != 0;
            } else {
                n4 = 14;
                if (n22 > n4) return 0 != 0;
                n21 = zzfu2.zzq();
                if (n22 == n4) {
                    n21 *= 10;
                }
                if (n21 != n14) return 0 != 0;
            }
        }
        n4 = zzfu2.zzm();
        n21 = zzfu2.zzd();
        object = zzfu2.zzM();
        n22 = 0;
        int n24 = zzgd.zzf((byte[])object, n15, n21 += n7, 0);
        if (n4 != n24) return 0 != 0;
        return 1 != 0;
    }

    private static boolean zzd(zzfu zzfu2, zzaeg zzaeg2, boolean bl2, zzaeb zzaeb2) {
        long l2;
        block2: {
            try {
                l2 = zzfu2.zzw();
                if (bl2) break block2;
            }
            catch (NumberFormatException numberFormatException) {
                return false;
            }
            int n3 = zzaeg2.zzb;
            long l3 = n3;
            l2 *= l3;
        }
        zzaeb2.zza = l2;
        return true;
    }
}

