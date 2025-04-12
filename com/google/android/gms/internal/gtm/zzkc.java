/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqv;

public final class zzkc
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        Preconditions.checkNotNull(object2);
        boolean bl2 = ((zzqo[])object2).length;
        boolean bl3 = true;
        if (bl2 != bl3) {
            bl3 = false;
        }
        Preconditions.checkArgument(bl3);
        bl2 = object2[0] instanceof zzqv;
        Preconditions.checkArgument(bl2);
        object = zzqs.zze;
        object2 = ((zzqv)object2[0]).zzk();
        bl3 = object2.isEmpty();
        if (!bl3) {
            object = (zzqo)object2.remove(0);
        }
        return object;
    }
}

