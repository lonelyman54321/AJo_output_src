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

public final class zzly
extends zzjo {
    public final zzqo zza(zzhx zzhx2, zzqo ... zzqoArray) {
        zzqo zzqo2;
        Object object = zzqoArray;
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        boolean bl2 = zzqoArray.length;
        boolean bl3 = 2 != 0;
        int n4 = 0;
        if (bl2 == bl3) {
            bl2 = true;
        } else {
            bl2 = false;
            zzqo2 = null;
        }
        Preconditions.checkArgument(bl2);
        zzqo2 = object[0];
        double d2 = zzjn.zzb(zzqo2);
        object = object[n3];
        double d5 = zzjn.zzb((zzqo)object);
        Object object2 = Double.isNaN(d2);
        double d7 = 0.0 / 0.0;
        if (object2 == 0 && (object2 = Double.isNaN(d5)) == 0) {
            object2 = Double.isInfinite(d2);
            if (object2 != 0 && (object2 = Double.isInfinite(d5)) != 0) {
                Double d9 = d7;
                object = new zzqq(d9);
                return object;
            }
            double d12 = 0.0;
            double d13 = Double.compare(d2, d12);
            double d9 = d13 - d12;
            object2 = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
            if (object2 < 0) {
                object2 = 1;
            } else {
                object2 = 0;
                object = null;
            }
            int n7 = Double.compare(d5, d12);
            d13 = n7;
            double d15 = d13 == d12 ? 0 : (d13 < d12 ? -1 : 1);
            if (d15 < 0) {
                n4 = 1;
            }
            n7 = (int)(Double.isInfinite(d2) ? 1 : 0);
            object2 ^= n4;
            double d16 = -1.0 / 0.0;
            double d17 = 1.0 / 0.0;
            if (n7 != 0 && (n4 = (int)(Double.isInfinite(d5) ? 1 : 0)) == 0) {
                if (n3 != object2) {
                    d16 = d17;
                }
                Double d18 = d16;
                object = new zzqq(d18);
                return object;
            }
            n4 = (int)(Double.isInfinite(d2) ? 1 : 0);
            if (n4 == 0 && (n4 = (int)(Double.isInfinite(d5) ? 1 : 0)) != 0) {
                Double d19 = d12;
                object = new zzqq(d19);
                return object;
            }
            n4 = (int)(d2 == d12 ? 0 : (d2 > d12 ? 1 : -1));
            if (n4 == 0) {
                object2 = d5 == d12 ? 0 : (d5 > d12 ? 1 : -1);
                if (object2 == 0) {
                    Double d20 = d7;
                    object = new zzqq(d20);
                    return object;
                }
                Double d22 = d12;
                object = new zzqq(d22);
                return object;
            }
            boolean bl4 = Double.isInfinite(d2);
            if (!bl4 && n4 != 0 && (n4 = (int)(d5 == d12 ? 0 : (d5 > d12 ? 1 : -1))) == 0) {
                if (n3 != object2) {
                    d16 = d17;
                }
                Double d23 = d16;
                object = new zzqq(d23);
                return object;
            }
            Double d24 = d2 /= d5;
            object = new zzqq(d24);
            return object;
        }
        Double d25 = d7;
        object = new zzqq(d25);
        return object;
    }
}

