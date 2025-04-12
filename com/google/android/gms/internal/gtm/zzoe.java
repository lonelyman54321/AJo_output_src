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

public final class zzoe
extends zzjo {
    private static final zzqq zza;
    private static final zzqq zzb;

    static {
        zzqq zzqq2;
        Double d2 = 0.0;
        zza = zzqq2 = new zzqq(d2);
        d2 = 2.147483647E9;
        zzb = zzqq2 = new zzqq(d2);
    }

    private static final boolean zzb(zzqo object) {
        double d2;
        boolean bl2;
        boolean bl3 = object instanceof zzqq;
        return bl3 && !(bl2 = Double.isNaN(d2 = ((Double)(object = ((zzqq)object).zzi())).doubleValue()));
    }

    public final zzqo zza(zzhx object, zzqo ... object2) {
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        int n4 = ((zzqo[])object2).length;
        zzqo zzqo2 = n4 > 0 ? object2[0] : zza;
        object = n4 > n3 ? object2[n3] : zzb;
        boolean bl2 = zzoe.zzb(zzqo2);
        double d2 = 0.0;
        double d5 = 2.147483647E9;
        if (bl2 && (bl2 = zzoe.zzb((zzqo)object)) && (bl2 = zzjn.zzf(zzqo2, (zzqo)object))) {
            object2 = ((zzqq)zzqo2).zzi();
            d2 = (Double)object2;
            object = ((zzqq)object).zzi();
            d5 = (Double)object;
        }
        double d7 = Math.random();
        object2 = (double)Math.round((d5 - d2) * d7 + d2);
        object = new zzqq((Double)object2);
        return object;
    }
}

