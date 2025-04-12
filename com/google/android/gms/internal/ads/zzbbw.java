/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.ads.zzbbv;
import java.util.PriorityQueue;

public final class zzbbw {
    public static long zza(long l2, int n3) {
        int n4 = 1;
        if (n3 == n4) {
            return l2;
        }
        long l3 = l2 * l2;
        int n7 = n3 >> 1;
        long l4 = 0x4000FFFFL;
        l3 %= l4;
        if ((n3 &= n4) == 0) {
            return zzbbw.zza(l3, n7) % l4;
        }
        return zzbbw.zza(l3, n7) % l4 * l2 % l4;
    }

    public static String zzb(String[] object, int n3, int n4) {
        char c2;
        int n7 = ((String[])object).length;
        if (n7 < (n4 += n3)) {
            zzm.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (n3 < (c2 = n4 + -1)) {
            String string2 = object[n3];
            stringBuilder.append(string2);
            c2 = ' ';
            stringBuilder.append(c2);
            ++n3;
        }
        object = object[c2];
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    public static void zzc(String[] stringArray, int n3, int n4, PriorityQueue priorityQueue) {
        int n7;
        int n8;
        String[] stringArray2 = stringArray;
        int n10 = stringArray.length;
        int n14 = 0;
        int n15 = 6;
        if (n10 < n15) {
            long l2 = zzbbw.zze(stringArray, 0, n10);
            String string2 = zzbbw.zzb(stringArray, 0, n10);
            PriorityQueue priorityQueue2 = priorityQueue;
            zzbbw.zzd(n3, l2, string2, n10, priorityQueue);
            return;
        }
        long l3 = zzbbw.zze(stringArray, 0, n15);
        String string3 = zzbbw.zzb(stringArray, 0, n15);
        int n16 = 6;
        int n17 = n3;
        long l4 = l3;
        zzbbw.zzd(n3, l3, string3, n16, priorityQueue);
        for (n14 = 1; n14 < (n8 = (n7 = stringArray2.length) + -5); ++n14) {
            n8 = n14 + -1;
            String string4 = stringArray2[n8];
            n8 = zzbbs.zza(string4);
            n17 = n14 + 5;
            String string5 = stringArray2[n17];
            n17 = zzbbs.zza(string5);
            l4 = n8;
            long l7 = 0x4000FFFFL;
            l3 += l7;
            long l8 = n17;
            String string6 = zzbbw.zzb(stringArray2, n14, n15);
            long l12 = Integer.MAX_VALUE;
            l8 += l12;
            l4 += l12;
            l12 = 0x1001FFFL;
            int n18 = 5;
            long l14 = zzbbw.zza(l12, n18);
            l4 = l4 % l7 * l14 % l7;
            l3 = (l3 - l4) % l7 * l12 % l7;
            l8 = l8 % l7 + l3;
            l3 = l8 % l7;
            n8 = n3;
            zzbbw.zzd(n3, l3, string6, n7, priorityQueue);
        }
    }

    public static void zzd(int n3, long l2, String string2, int n4, PriorityQueue priorityQueue) {
        block6: {
            int n7;
            zzbbv zzbbv2;
            block5: {
                zzbbv2 = new zzbbv(l2, string2, n4);
                n7 = priorityQueue.size();
                if (n7 != n3) break block5;
                zzbbv zzbbv3 = (zzbbv)priorityQueue.peek();
                n7 = zzbbv3.zzc;
                int n8 = zzbbv2.zzc;
                if (n7 > n8) break block6;
                zzbbv3 = (zzbbv)priorityQueue.peek();
                l2 = zzbbv3.zza;
                long l3 = zzbbv2.zza;
                long l4 = l2 - l3;
                Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object > 0) break block6;
            }
            if ((n7 = (int)(priorityQueue.contains(zzbbv2) ? 1 : 0)) == 0) {
                priorityQueue.add(zzbbv2);
                n7 = priorityQueue.size();
                if (n7 > n3) {
                    priorityQueue.poll();
                }
            }
        }
    }

    private static long zze(String[] stringArray, int n3, int n4) {
        String string2 = stringArray[0];
        long l2 = zzbbs.zza(string2);
        long l3 = Integer.MAX_VALUE;
        l2 += l3;
        long l4 = 0x4000FFFFL;
        l2 %= l4;
        for (n3 = 1; n3 < n4; ++n3) {
            l2 = l2 * 0x1001FFFL % l4;
            String string3 = stringArray[n3];
            int n7 = zzbbs.zza(string3);
            long l7 = ((long)n7 + l3) % l4 + l2;
            l2 = l7 % l4;
        }
        return l2;
    }
}

