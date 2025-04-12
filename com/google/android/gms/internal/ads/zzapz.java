/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzapy;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgd;

final class zzapz {
    public static Pair zza(zzadv object) {
        object.zzj();
        int n3 = 8;
        Object object2 = new zzfu(n3);
        object2 = zzapz.zzd(1684108385, (zzadv)object, (zzfu)object2);
        ((zzadi)object).zzo(n3, false);
        object = object.zzf();
        object2 = ((zzapy)object2).zzb;
        return Pair.create((Object)object, (Object)object2);
    }

    public static zzapx zzb(zzadv zzadv2) {
        byte[] byArray;
        boolean bl2;
        Object object = zzadv2;
        int n3 = 16;
        Object object2 = new zzfu(n3);
        int n4 = 1718449184;
        zzapy zzapy2 = zzapz.zzd(n4, zzadv2, (zzfu)object2);
        long l2 = zzapy2.zzb;
        long l3 = 16;
        long l4 = l2 - l3;
        Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object3 >= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            byArray = null;
        }
        zzeq.zzf(bl2);
        byArray = ((zzfu)object2).zzM();
        zzadv zzadv3 = object;
        zzadv3 = (zzadi)object;
        ((zzadi)zzadv3).zzm(byArray, 0, n3, false);
        ((zzfu)object2).zzK(0);
        int n7 = ((zzfu)object2).zzk();
        int n8 = ((zzfu)object2).zzk();
        int n10 = ((zzfu)object2).zzj();
        int n14 = ((zzfu)object2).zzj();
        int n15 = ((zzfu)object2).zzk();
        int n16 = ((zzfu)object2).zzk();
        long l7 = zzapy2.zzb;
        n3 = (int)l7 + -16;
        if (n3 > 0) {
            object2 = new byte[n3];
            ((zzadi)zzadv3).zzm((byte[])object2, 0, n3, false);
        } else {
            object2 = zzgd.zzf;
        }
        l7 = zzadv2.zze();
        long l8 = zzadv2.zzf();
        object = (zzadi)object;
        n3 = (int)(l7 -= l8);
        ((zzadi)object).zzo(n3, false);
        object = new zzapx(n7, n8, n10, n14, n15, n16, (byte[])object2);
        return object;
    }

    public static boolean zzc(zzadv object) {
        Object object2 = new zzfu(8);
        Object object3 = zzapy.zza((zzadv)object, (zzfu)object2);
        int n3 = ((zzapy)object3).zza;
        int n4 = 1380533830;
        if (n3 != n4 && n3 != (n4 = 1380333108)) {
            return false;
        }
        object3 = ((zzfu)object2).zzM();
        object = (zzadi)object;
        n4 = 4;
        ((zzadi)object).zzm((byte[])object3, 0, n4, false);
        ((zzfu)object2).zzK(0);
        int n7 = ((zzfu)object2).zzg();
        int n8 = 1463899717;
        if (n7 != n8) {
            object2 = new StringBuilder("Unsupported form type: ");
            ((StringBuilder)object2).append(n7);
            object = ((StringBuilder)object2).toString();
            zzfk.zzc("WavHeaderReader", (String)object);
            return false;
        }
        return true;
    }

    private static zzapy zzd(int n3, zzadv object, zzfu zzfu2) {
        int n4;
        zzapy zzapy2 = zzapy.zza((zzadv)object, zzfu2);
        while ((n4 = zzapy2.zza) != n3) {
            long l2;
            long l3;
            String string2 = "Ignoring unknown WAV chunk: ";
            String string3 = "WavHeaderReader";
            w12_0.a(n4, string2, string3);
            long l4 = zzapy2.zzb;
            long l7 = 1L & l4;
            long l8 = 0L;
            long l12 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
            l7 = (long)8 + l4;
            if (l12 != false) {
                l7 = (long)9 + l4;
            }
            if ((l3 = (l2 = l7 - (l4 = Integer.MAX_VALUE)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) <= 0) {
                int n7 = (int)l7;
                zzadv zzadv2 = object;
                zzadv2 = (zzadi)object;
                string2 = null;
                ((zzadi)zzadv2).zzo(n7, false);
                zzapy2 = zzapy.zza((zzadv)object, zzfu2);
                continue;
            }
            n3 = zzapy2.zza;
            object = new StringBuilder("Chunk is too large (~2GB+) to skip; id: ");
            ((StringBuilder)object).append(n3);
            throw zzch.zzc(((StringBuilder)object).toString());
        }
        return zzapy2;
    }
}

