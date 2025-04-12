/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqp;
import com.google.android.gms.internal.gtm.zzqv;

public final class zzmw
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
        object2 = object2[0] instanceof zzqv;
        object = new zzqp((Boolean)object2);
        return object;
    }
}

