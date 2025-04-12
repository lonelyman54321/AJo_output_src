/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqp;
import com.google.android.gms.internal.gtm.zzqq;
import com.google.android.gms.internal.gtm.zzqr;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqx;
import com.google.android.gms.internal.gtm.zzqz;
import com.google.android.gms.internal.gtm.zzra;

public final class zzla
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        boolean bl2;
        zzqo zzqo2;
        boolean bl3 = true;
        Preconditions.checkArgument(bl3);
        boolean bl4 = ((zzqo[])object2).length;
        if (bl4 == bl3) {
            bl4 = true;
        } else {
            bl4 = false;
            zzqo2 = null;
        }
        Preconditions.checkArgument(bl4);
        Preconditions.checkArgument(object2[0] instanceof zzqx ^ bl3);
        zzqo2 = object2[0];
        bl4 = zzra.zzi(zzqo2);
        Preconditions.checkArgument(bl3 ^= bl4);
        object = object2[0];
        object2 = zzqs.zze;
        object = object == object2 ? "undefined" : ((bl2 = object instanceof zzqp) ? "boolean" : ((bl2 = object instanceof zzqq) ? "number" : ((bl2 = object instanceof zzqz) ? "string" : ((bl3 = object instanceof zzqr) ? "function" : "object"))));
        object2 = new zzqz((String)object);
        return object2;
    }
}

