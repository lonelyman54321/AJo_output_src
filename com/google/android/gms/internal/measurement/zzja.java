/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzje;
import java.util.Comparator;

final class zzja
implements Comparator {
    public final /* synthetic */ int compare(Object object, Object object2) {
        int n3;
        object = (zziy)object;
        object2 = (zziy)object2;
        zzje zzje2 = (zzje)((zziy)object).iterator();
        zzje zzje3 = (zzje)((zziy)object2).iterator();
        while ((n3 = zzje2.hasNext()) != 0 && (n3 = zzje3.hasNext()) != 0) {
            n3 = zziy.zza(zzje2.zza());
            int n4 = zziy.zza(zzje3.zza());
            if ((n3 = Integer.compare(n3, n4)) == 0) continue;
            return n3;
        }
        int n7 = ((zziy)object).zzb();
        int n8 = ((zziy)object2).zzb();
        return Integer.compare(n7, n8);
    }
}

