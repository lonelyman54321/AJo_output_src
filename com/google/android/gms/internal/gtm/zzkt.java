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

public final class zzkt
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        boolean bl2 = true;
        Preconditions.checkArgument(bl2);
        boolean bl3 = ((zzqo[])object2).length;
        if (bl3 != bl2) {
            bl2 = false;
            object = null;
        }
        Preconditions.checkArgument(bl2);
        object2 = -zzjn.zzb(object2[0]);
        object = new zzqq((Double)object2);
        return object;
    }
}

