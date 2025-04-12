/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzgdz;
import com.google.android.gms.internal.ads.zzgeb;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class zzgea
extends zzgeb {
    public static /* bridge */ /* synthetic */ int zza(int[] nArray, int n3, int n4, int n7) {
        block2: {
            while (n4 < n7) {
                int n8 = nArray[n4];
                if (n8 != n3) {
                    ++n4;
                    continue;
                }
                break block2;
            }
            n4 = -1;
        }
        return n4;
    }

    public static int zzb(long l2) {
        int n3 = (int)l2;
        long l3 = n3;
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object == false;
        zzfyg.zzg(bl2, "Out of range: %s", l2);
        return n3;
    }

    public static int zzc(int n3, int n4, int n7) {
        int n8 = -1 >>> 2;
        zzfyg.zzh(true, "min (%s) must be less than or equal to max (%s)", n4, n8);
        return Math.min(Math.max(n3, n4), n8);
    }

    public static int zzd(byte[] byArray) {
        int n3 = byArray.length;
        int n4 = 0;
        int n7 = 1;
        int n8 = 4;
        boolean bl2 = n3 >= n8;
        zzfyg.zzh(bl2, "array too small: %s < %s", n3, n8);
        n3 = byArray[0] << 24;
        n4 = byArray[n7] & 0xFF;
        n7 = byArray[2] & 0xFF;
        int n10 = byArray[3] & 0xFF;
        n3 |= (n4 <<= 16);
        n4 = n7 << 8;
        return n10 | (n3 |= n4);
    }

    public static int zze(long l2) {
        long l3 = Integer.MAX_VALUE;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            return -1 >>> 1;
        }
        l3 = 0x80000000L;
        long l7 = l2 - l3;
        object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object < 0) {
            return -1 << -1;
        }
        return (int)l2;
    }

    public static List zzf(int ... nArray) {
        int n3 = nArray.length;
        if (n3 == 0) {
            return Collections.emptyList();
        }
        zzgdz zzgdz2 = new zzgdz(nArray, 0, n3);
        return zzgdz2;
    }

    public static int[] zzg(Collection objectArray) {
        objectArray = objectArray.toArray();
        int n3 = objectArray.length;
        int[] nArray = new int[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            Object object = objectArray[i3];
            object.getClass();
            object = (Number)object;
            nArray[i3] = n4 = ((Number)object).intValue();
        }
        return nArray;
    }
}

