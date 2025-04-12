/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqp;

public abstract class zzoq
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        Object zzqo2;
        boolean bl2 = true;
        Preconditions.checkArgument(bl2);
        boolean bl3 = ((Object)object2).length;
        boolean bl4 = 2 != 0;
        boolean bl5 = false;
        if (bl3 == bl4) {
            bl3 = true;
        } else {
            bl3 = false;
            zzqo2 = null;
        }
        Preconditions.checkArgument(bl3);
        try {
            zzqo2 = object2[0];
        }
        catch (IllegalArgumentException illegalArgumentException) {
            object2 = Boolean.FALSE;
            object = new zzqp((Boolean)object2);
            return object;
        }
        double d2 = zzjn.zzb((zzqo)zzqo2);
        object = object2[bl2];
        double d5 = zzjn.zzb((zzqo)object);
        bl5 = Double.isNaN(d2);
        if (!bl5 && !(bl5 = Double.isNaN(d5))) {
            bl2 = this.zzb(d2, d5);
            object = bl2;
            object2 = new zzqp((Boolean)object);
            return object2;
        }
        object2 = Boolean.FALSE;
        object = new zzqp((Boolean)object2);
        return object;
    }

    public abstract boolean zzb(double var1, double var3);
}

