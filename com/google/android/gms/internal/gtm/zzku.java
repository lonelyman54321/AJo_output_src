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

public final class zzku
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... zzqoArray) {
        zzqp zzqp2;
        boolean bl2 = true;
        Preconditions.checkArgument(bl2);
        boolean bl3 = zzqoArray.length;
        if (bl3 == bl2) {
            bl3 = true;
        } else {
            bl3 = false;
            zzqp2 = null;
        }
        Preconditions.checkArgument(bl3);
        boolean bl4 = zzjn.zzg(zzqoArray[0]);
        object = bl2 ^ bl4;
        zzqp2 = new zzqp((Boolean)object);
        return zzqp2;
    }
}

