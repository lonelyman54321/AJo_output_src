/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqq;

public final class zzma
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        zzqo zzqo2;
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        int n4 = ((zzqo[])object2).length;
        int n7 = 2;
        int n8 = 0;
        if (n4 == n7) {
            n4 = 1;
        } else {
            n4 = 0;
            zzqo2 = null;
        }
        Preconditions.checkArgument(n4 != 0);
        zzqo2 = object2[0];
        double d2 = zzjn.zzb(zzqo2);
        object2 = object2[n3];
        double d5 = zzjn.zzb((zzqo)object2);
        Object object3 = Double.isNaN(d2);
        double d7 = 0.0 / 0.0;
        if (object3 == 0 && (object3 = Double.isNaN(d5)) == 0) {
            object3 = Double.isInfinite(d2);
            double d9 = 0.0;
            if (object3 != 0 && (object3 = d5 == d9 ? 0 : (d5 > d9 ? 1 : -1)) == 0 || (object3 = d2 == d9 ? 0 : (d2 > d9 ? 1 : -1)) == 0 && (object3 = Double.isInfinite(d5)) != 0) {
                object2 = d7;
                object = new zzqq((Double)object2);
                return object;
            }
            object3 = Double.isInfinite(d2);
            if (object3 == 0 && (object3 = Double.isInfinite(d5)) == 0) {
                object2 = d2 *= d5;
                object = new zzqq((Double)object2);
                return object;
            }
            double d12 = (d2 = (double)Double.compare(d2, d9)) - d9;
            object3 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
            if (object3 < 0) {
                object3 = 1;
            } else {
                object3 = 0;
                object2 = null;
            }
            n4 = Double.compare(d5, d9);
            d2 = n4;
            double d13 = d2 == d9 ? 0 : (d2 < d9 ? -1 : 1);
            if (d13 < 0) {
                n8 = 1;
            }
            double d14 = n3 != (object3 ^= n8) ? 1.0 / 0.0 : -1.0 / 0.0;
            object = d14;
            zzqo2 = new zzqq((Double)object);
            return zzqo2;
        }
        object2 = d7;
        object = new zzqq((Double)object2);
        return object;
    }
}

