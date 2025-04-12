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

public final class zzkm
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... zzqoArray) {
        zzqp zzqp2;
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        boolean bl2 = zzqoArray.length;
        boolean bl3 = 2 != 0;
        if (bl2 == bl3) {
            bl2 = true;
        } else {
            bl2 = false;
            zzqp2 = null;
        }
        Preconditions.checkArgument(bl2);
        zzqo zzqo2 = zzqoArray[0];
        object = zzqoArray[n3];
        object = zzjn.zze(zzqo2, (zzqo)object);
        zzqp2 = new zzqp((Boolean)object);
        return zzqp2;
    }
}

