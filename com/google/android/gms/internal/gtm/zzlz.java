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

public final class zzlz
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        Object zzqo2;
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        boolean bl2 = ((Object)object2).length;
        boolean bl3 = 2 != 0;
        boolean bl4 = false;
        if (bl2 == bl3) {
            bl2 = true;
        } else {
            bl2 = false;
            zzqo2 = null;
        }
        Preconditions.checkArgument(bl2);
        zzqo2 = object2[0];
        double d2 = zzjn.zzb((zzqo)zzqo2);
        object = object2[n3];
        double d5 = zzjn.zzb((zzqo)object);
        bl4 = Double.isNaN(d2);
        double d7 = 0.0 / 0.0;
        if (!bl4 && !(bl4 = Double.isNaN(d5))) {
            double d9;
            double d12;
            bl4 = Double.isInfinite(d2);
            if (!bl4 && (bl4 = (d12 = d5 - (d9 = 0.0)) == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1))) {
                Object object3 = Double.isInfinite(d2);
                if (!object3 && (object3 = Double.isInfinite(d5))) {
                    object2 = d2;
                    object = new zzqq((Double)object2);
                    return object;
                }
                object3 = d2 == d9 ? 0 : (d2 > d9 ? 1 : -1);
                if (!object3 && bl4 && !(bl4 = Double.isInfinite(d5))) {
                    object2 = d2;
                    object = new zzqq((Double)object2);
                    return object;
                }
                object2 = d2 %= d5;
                object = new zzqq((Double)object2);
                return object;
            }
            object2 = d7;
            object = new zzqq((Double)object2);
            return object;
        }
        object2 = d7;
        object = new zzqq((Double)object2);
        return object;
    }
}

