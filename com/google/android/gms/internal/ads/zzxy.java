/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgci;
import com.google.android.gms.internal.ads.zzgcn;
import com.google.android.gms.internal.ads.zzxw;
import com.google.android.gms.internal.ads.zzya;
import com.google.android.gms.internal.ads.zzzf;
import com.google.android.gms.internal.ads.zzzu;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class zzxy
extends zzya {
    private final zzzu zzd;
    private final zzgbc zze;
    private final zzer zzf;

    public zzxy(zzde zzde2, int[] nArray, int n3, zzzu zzzu2, long l2, long l3, long l4, int n4, int n7, float f5, float f6, List list, zzer zzer2) {
        super(zzde2, nArray, 0);
        Object object = zzzu2;
        this.zzd = zzzu2;
        this.zze = object = zzgbc.zzk(list);
        object = zzer2;
        this.zzf = zzer2;
    }

    public static /* bridge */ /* synthetic */ zzgbc zzf(zzzf[] zzzfArray) {
        int n3;
        double d2;
        Object object;
        Object object2;
        zzde zzde2;
        Object object3;
        int n4;
        int n7;
        long[] lArray;
        long[] lArray2;
        Object object4;
        long l2;
        Object object5;
        int n8;
        int n10;
        int n14;
        double d5;
        long l3;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n15 = 0;
        Object object6 = null;
        int n16 = 0;
        long[][] lArrayArray = null;
        while (true) {
            l3 = 0L;
            d5 = 0.0;
            n14 = 2;
            n10 = 1;
            if (n16 >= n14) break;
            Object object7 = zzzfArray[n16];
            if (object7 != null && (n14 = ((Object)(object7 = (Object)((zzzf)object7).zzb)).length) > n10) {
                object7 = new zzgaz();
                zzxw zzxw2 = new zzxw(l3, l3);
                ((zzgaz)object7).zzf(zzxw2);
                arrayList.add(object7);
            } else {
                n8 = 0;
                object5 = null;
                arrayList.add(null);
            }
            ++n16;
        }
        lArrayArray = new long[n14][];
        int n17 = 0;
        int[] nArray = null;
        while (true) {
            l2 = -1;
            if (n17 >= n14) break;
            object4 = zzzfArray[n17];
            if (object4 == null) {
                lArray2 = new long[]{};
                lArrayArray[n17] = lArray2;
            } else {
                lArray = new long[((zzzf)object4).zzb.length];
                lArrayArray[n17] = lArray;
                lArray = null;
                for (n7 = 0; n7 < (n4 = ((long[])(object3 = (Object)((zzzf)object4).zzb)).length); ++n7) {
                    zzde2 = ((zzzf)object4).zza;
                    long l4 = object3[n7];
                    object3 = zzde2.zzb((int)l4);
                    l4 = object3.zzj;
                    long l7 = l4;
                    object2 = lArrayArray[n17];
                    object = l7 == l2 ? 0 : (l7 < l2 ? -1 : 1);
                    if (object == false) {
                        l7 = l3;
                    }
                    object2[n7] = l7;
                }
                lArray2 = lArrayArray[n17];
                Arrays.sort(lArray2);
            }
            ++n17;
        }
        nArray = new int[n14];
        object4 = new long[n14];
        lArray = null;
        for (n7 = 0; n7 < n14; ++n7) {
            long l8;
            object3 = lArrayArray[n7];
            n4 = ((long[])object3).length;
            if (n4 == 0) {
                l8 = l3;
                d2 = d5;
            } else {
                l8 = object3[0];
            }
            object4[n7] = l8;
        }
        zzxy.zzg(arrayList, (long[])object4);
        object5 = zzgci.zzc(zzgcn.zzc()).zzb(n14).zza();
        Integer n18 = null;
        for (n3 = 0; n3 < n14; ++n3) {
            lArray = lArrayArray[n3];
            n7 = lArray.length;
            if (n7 > n10) {
                long l12;
                Object object8;
                double d7;
                object3 = new double[n7];
                n4 = 0;
                zzde2 = null;
                while (true) {
                    object2 = lArrayArray[n3];
                    object = ((long[])object2).length;
                    d7 = 0.0;
                    if (n4 >= object) break;
                    long l14 = object2[n4];
                    long l15 = l14 - l2;
                    object8 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                    if (object8 != false) {
                        l12 = (long)((double)l14);
                        d7 = Math.log(l12);
                    }
                    object3[n4] = (long)d7;
                    ++n4;
                    n14 = 2;
                    n10 = 1;
                }
                l12 = object3[n7 += -1];
                d2 = object3[0];
                l12 -= d2;
                n4 = 0;
                zzde2 = null;
                while (n4 < n7) {
                    long l16 = object3[n4];
                    long l17 = object3[++n4];
                    l16 += l17;
                    object8 = l12 == d7 ? 0 : (l12 > d7 ? 1 : -1);
                    if (object8 == false) {
                        l16 = (long)1.0;
                    } else {
                        l16 *= 0.5;
                        l17 = object3[0];
                        l16 = (l16 - l17) / l12;
                    }
                    object2 = (double)l16;
                    object6 = n3;
                    object5.zzq(object2, object6);
                    n15 = 0;
                    object6 = null;
                }
            }
            n15 = 0;
            object6 = null;
            n14 = 2;
            n10 = 1;
        }
        object6 = zzgbc.zzk(object5.zzr());
        object5 = null;
        for (n8 = 0; n8 < (n3 = ((AbstractCollection)object6).size()); ++n8) {
            n18 = (Integer)object6.get(n8);
            n3 = n18;
            n14 = nArray[n3];
            n10 = 1;
            nArray[n3] = n14 += n10;
            lArray2 = lArrayArray[n3];
            long l18 = lArray2[n14];
            object4[n3] = l18;
            zzxy.zzg(arrayList, (long[])object4);
        }
        n15 = 2;
        lArrayArray = null;
        for (n16 = 0; n16 < n15; ++n16) {
            object5 = arrayList.get(n16);
            if (object5 == null) continue;
            l3 = (long)object4[n16];
            l3 += l3;
            object4[n16] = l3;
        }
        zzxy.zzg(arrayList, (long[])object4);
        object6 = new zzgaz();
        lArrayArray = null;
        for (n16 = 0; n16 < (n8 = arrayList.size()); ++n16) {
            object5 = (zzgaz)arrayList.get(n16);
            object5 = object5 == null ? zzgbc.zzm() : ((zzgaz)object5).zzi();
            ((zzgaz)object6).zzf(object5);
        }
        return ((zzgaz)object6).zzi();
    }

    private static void zzg(List list, long[] lArray) {
        int n3;
        int n4;
        int n7 = 0;
        long l2 = 0L;
        zzgaz zzgaz2 = null;
        for (n4 = 0; n4 < (n3 = 2); ++n4) {
            long l3 = lArray[n4];
            l2 += l3;
        }
        while (n7 < (n4 = list.size())) {
            zzgaz2 = (zzgaz)list.get(n7);
            if (zzgaz2 != null) {
                long l4 = lArray[n7];
                zzxw zzxw2 = new zzxw(l2, l4);
                zzgaz2.zzf(zzxw2);
            }
            ++n7;
        }
    }
}

