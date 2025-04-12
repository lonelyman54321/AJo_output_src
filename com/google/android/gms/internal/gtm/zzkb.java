/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqv;
import java.util.Collections;

public final class zzkb
extends zzjo {
    public final zzqo zza(zzhx zzhx2, zzqo ... zzqoArray) {
        Preconditions.checkNotNull(zzqoArray);
        boolean bl2 = zzqoArray.length;
        boolean bl3 = true;
        if (bl2 != bl3) {
            bl3 = false;
        }
        Preconditions.checkArgument(bl3);
        Preconditions.checkArgument(zzqoArray[0] instanceof zzqv);
        Collections.reverse(((zzqv)zzqoArray[0]).zzk());
        return zzqoArray[0];
    }
}

