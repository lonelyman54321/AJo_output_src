/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzfu;

final class zzaiz {
    private final zzfu zza;
    private int zzb;

    public zzaiz() {
        zzfu zzfu2;
        this.zza = zzfu2 = new zzfu(8);
    }

    private final long zzb(zzadv zzadv2) {
        Object object = this.zza.zzM();
        zzadv2 = (zzadi)zzadv2;
        int n3 = 0;
        int n4 = 1;
        ((zzadi)zzadv2).zzm((byte[])object, 0, n4, false);
        object = this.zza.zzM();
        int n7 = object[0] & 0xFF;
        if (n7 != 0) {
            int n8;
            int n10;
            int n14 = 128;
            int n15 = 0;
            while (true) {
                n10 = n15 + 1;
                int n16 = n7 & n14;
                if (n16 != 0) break;
                n14 >>= 1;
                n15 = n10;
            }
            n7 &= (n14 ^= 0xFFFFFFFF);
            byte[] byArray = this.zza.zzM();
            ((zzadi)zzadv2).zzm(byArray, n4, n15, false);
            while (n3 < n15) {
                n8 = n7 << 8;
                object = this.zza;
                object = object.zzM();
                n7 = (object[++n3] & 0xFF) + n8;
            }
            this.zzb = n8 = this.zzb + n10;
            return n7;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zzadv zzadv2) {
        long l2;
        Object object;
        long l3;
        long l4;
        long l7;
        long l8 = zzadv2.zzd();
        long l12 = -1;
        long l14 = 1024L;
        Object object2 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
        if (object2 != false && (l7 = l8 == l14 ? 0 : (l8 < l14 ? -1 : 1)) <= 0) {
            l14 = l8;
        }
        Object object3 = this.zza.zzM();
        zzadv zzadv3 = zzadv2;
        zzadv3 = (zzadi)zzadv2;
        int n3 = 4;
        ((zzadi)zzadv3).zzm((byte[])object3, 0, n3, false);
        object3 = this.zza;
        long l15 = object3.zzu();
        this.zzb = n3;
        while (true) {
            int n4;
            long l16 = 440786851L;
            l7 = 1;
            n3 = (int)(l15 == l16 ? 0 : (l15 < l16 ? -1 : 1));
            if (n3 == 0) break;
            n3 = (int)l14;
            this.zzb = n4 = this.zzb + l7;
            if (n4 == n3) {
                return false;
            }
            byte[] byArray = this.zza.zzM();
            ((zzadi)zzadv3).zzm(byArray, 0, (int)l7, false);
            l4 = l15 << 8;
            object3 = this.zza.zzM();
            l7 = object3[0] & 0xFF;
            l3 = l7;
            l15 = (l4 &= 0xFFFFFFFFFFFFFF00L) | l3;
        }
        l14 = this.zzb(zzadv2);
        n3 = this.zzb;
        l4 = n3;
        l3 = Long.MIN_VALUE;
        long l17 = l14 - l3;
        Object object4 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
        if (object4 != false && (object2 == false || (object = (l2 = (l4 += l14) - l8) == 0L ? 0 : (l2 < 0L ? -1 : 1)) < 0)) {
            int n7;
            long l18;
            while ((object = (l18 = (l8 = (long)(n7 = this.zzb)) - l4) == 0L ? 0 : (l18 < 0L ? -1 : 1)) < 0) {
                l8 = this.zzb(zzadv2);
                long l19 = l8 - l3;
                object = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
                if (object == false) {
                    return false;
                }
                l8 = this.zzb(zzadv2);
                long l20 = l8 - (l14 = 0L);
                object2 = l20 == 0L ? 0 : (l20 < 0L ? -1 : 1);
                if (object2 >= 0) {
                    if (object2 == false) continue;
                    int n8 = (int)l8;
                    ((zzadi)zzadv3).zzl(n8, false);
                    this.zzb = n7 = this.zzb + n8;
                    continue;
                }
                return false;
            }
            if (object == false) {
                return (boolean)l7;
            }
        }
        return false;
    }
}

