/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqz;

public final class zzmr
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
        Preconditions.checkArgument(object2[0] instanceof zzqz);
        object = ((zzqz)object2[0]).zzk();
        object = ((String)object).trim();
        object2 = new zzqz((String)object);
        return object2;
    }
}

