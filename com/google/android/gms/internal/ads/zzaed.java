/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzaef;
import com.google.android.gms.internal.ads.zzael;
import com.google.android.gms.internal.ads.zzaho;
import com.google.android.gms.internal.ads.zzahq;
import com.google.android.gms.internal.ads.zzcd;
import com.google.android.gms.internal.ads.zzfu;
import java.util.Arrays;

public final class zzaed {
    public static zzcd zza(zzadv object, boolean bl2) {
        zzaho zzaho2;
        if (bl2) {
            bl2 = false;
            zzaho2 = null;
        } else {
            zzaho2 = zzahq.zza;
        }
        zzael zzael2 = new zzael();
        object = zzael2.zza((zzadv)object, zzaho2);
        if (object != null && (bl2 = ((zzcd)object).zza())) {
            return object;
        }
        return null;
    }

    public static zzaef zzb(zzfu object) {
        ((zzfu)object).zzL(1);
        int n3 = ((zzfu)object).zzo();
        int n4 = ((zzfu)object).zzd();
        long l2 = n4;
        long l3 = n3;
        long[] lArray = new long[n3 /= 18];
        long[] lArray2 = new long[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            long l4;
            long l7 = ((zzfu)object).zzt();
            long l8 = l7 - (l4 = (long)-1);
            Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object2 == false) {
                lArray = Arrays.copyOf(lArray, i3);
                lArray2 = Arrays.copyOf(lArray2, i3);
                break;
            }
            lArray[i3] = l7;
            lArray2[i3] = l7 = ((zzfu)object).zzt();
            int n7 = 2;
            ((zzfu)object).zzL(n7);
        }
        l2 += l3;
        l3 = ((zzfu)object).zzd();
        n3 = (int)(l2 - l3);
        ((zzfu)object).zzL(n3);
        object = new zzaef(lArray, lArray2);
        return object;
    }
}

