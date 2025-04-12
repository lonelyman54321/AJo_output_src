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

public final class zzkq
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        zzqp zzqp2;
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        boolean bl2 = ((Object)object2).length;
        boolean bl3 = 2 != 0;
        if (bl2 == bl3) {
            bl2 = true;
        } else {
            bl2 = false;
            zzqp2 = null;
        }
        Preconditions.checkArgument(bl2);
        Object zzqo2 = object2[n3];
        object2 = object2[0];
        int n4 = zzjn.zzh((zzqo)zzqo2, (zzqo)object2);
        object = (n3 ^ n4) != 0;
        zzqp2 = new zzqp((Boolean)object);
        return zzqp2;
    }
}

