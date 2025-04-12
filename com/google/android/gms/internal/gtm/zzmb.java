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

public final class zzmb
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        zzqq zzqq2;
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        boolean bl2 = ((Object)object2).length;
        boolean bl3 = 2 != 0;
        if (bl2 == bl3) {
            bl2 = true;
        } else {
            bl2 = false;
            zzqq2 = null;
        }
        Preconditions.checkArgument(bl2);
        object = -zzjn.zzb((zzqo)object2[n3]);
        zzqq2 = new zzqq((Double)object);
        object2 = zzjn.zzc((zzqo)object2[0], zzqq2);
        object = new zzqq((Double)object2);
        return object;
    }
}

