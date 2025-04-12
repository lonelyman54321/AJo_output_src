/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzes;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgo;
import com.google.android.gms.internal.ads.zzgr;
import java.util.Collections;
import java.util.List;

public final class zzaek {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final String zzi;

    private zzaek(List list, int n3, int n4, int n7, int n8, int n10, int n14, int n15, int n16, float f5, String string2) {
        this.zza = list;
        this.zzb = n3;
        this.zzc = n8;
        this.zzd = n10;
        this.zze = n14;
        this.zzf = n15;
        this.zzg = n16;
        this.zzh = f5;
        this.zzi = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzaek zza(zzfu zzfu2) {
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        zzgo zzgo2;
        int n15;
        int n16;
        int n17;
        List<Object> list = zzfu2;
        int n18 = 21;
        try {
            zzfu2.zzL(n18);
            n18 = zzfu2.zzm() & 3;
            n17 = zzfu2.zzm();
            n16 = zzfu2.zzd();
            n15 = 0;
            zzgo2 = null;
            n14 = 0;
            n10 = 0;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw zzch.zza("Error parsing HEVC config", arrayIndexOutOfBoundsException);
        }
        while (true) {
            n8 = 1;
            if (n14 >= n17) break;
            ((zzfu)((Object)list)).zzL(n8);
            n8 = zzfu2.zzq();
            for (n4 = 0; n4 < n8; n10 += n7, ++n4) {
                n3 = zzfu2.zzq();
                n7 = n3 + 4;
                ((zzfu)((Object)list)).zzL(n3);
            }
            ++n14;
        }
        ((zzfu)((Object)list)).zzK(n16);
        byte[] byArray = new byte[n10];
        n3 = 1065353216;
        String string2 = null;
        n14 = 0;
        n4 = 0;
        int n19 = -1;
        int n20 = -1;
        int n21 = -1;
        int n22 = -1;
        int n24 = -1;
        int n25 = -1;
        int n26 = -1;
        float f5 = 1.0f;
        while (true) {
            int n27;
            Object object;
            int n28;
            float f6;
            List<byte[]> list2;
            if (n14 < n17) {
                n3 = zzfu2.zzm() & 0x3F;
                n7 = zzfu2.zzq();
                list2 = null;
            } else {
                list = n10 == 0 ? Collections.emptyList() : Collections.singletonList(byArray);
                list2 = list;
                n17 = 1;
                f6 = Float.MIN_VALUE;
                n28 = n18 + 1;
                object = list;
                return new zzaek(list2, n28, n19, n20, n21, n22, n24, n25, n26, f5, string2);
            }
            for (int i3 = 0; i3 < n7; ++i3) {
                int n29;
                int n30;
                int n32;
                n28 = zzfu2.zzq();
                byte[] byArray2 = zzgr.zza;
                n27 = n17;
                n17 = 4;
                f6 = 5.6E-45f;
                System.arraycopy(byArray2, 0, byArray, n4, n17);
                n17 = n4 + 4;
                byArray2 = zzfu2.zzM();
                n15 = zzfu2.zzd();
                System.arraycopy(byArray2, n15, byArray, n17, n28);
                n17 += n28;
                n15 = 33;
                if (n3 == n15 && i3 == 0) {
                    zzgo2 = zzgr.zzc(byArray, n4 += 6, n17);
                    n19 = zzgo2.zzi;
                    n20 = zzgo2.zzj;
                    n8 = zzgo2.zze;
                    n21 = n8 + 8;
                    n8 = zzgo2.zzf;
                    n22 = n8 + 8;
                    n8 = zzgo2.zzl;
                    n4 = zzgo2.zzm;
                    i3 = zzgo2.zzn;
                    n32 = n17;
                    f6 = zzgo2.zzk;
                    n17 = zzgo2.zza;
                    n25 = n8;
                    n8 = (int)(zzgo2.zzb ? 1 : 0);
                    n26 = n4;
                    n4 = zzgo2.zzc;
                    n30 = n3;
                    n3 = zzgo2.zzd;
                    n29 = n7;
                    object = zzgo2.zzg;
                    n15 = zzgo2.zzh;
                    string2 = zzes.zzb(n17, n8 != 0, n4, n3, (int[])object, n15);
                    f5 = f6;
                    n24 = n25;
                    n25 = n26;
                    n26 = i3;
                    i3 = 0;
                    list2 = null;
                } else {
                    n32 = n17;
                    n30 = n3;
                    n29 = n7;
                }
                ((zzfu)((Object)list)).zzL(n28);
                f6 = Float.MIN_VALUE;
                n17 = n27;
                n4 = n32;
                n3 = n30;
                n7 = n29;
                n15 = 0;
                zzgo2 = null;
                n8 = 1;
            }
            n27 = n17;
            ++n14;
            n15 = 0;
            zzgo2 = null;
            n8 = 1;
        }
    }
}

