/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;

public final class zzky
extends zzjo {
    public final zzqo zza(zzhx zzhx2, zzqo ... zzqoArray) {
        boolean bl2 = true;
        Preconditions.checkArgument(bl2);
        boolean bl3 = zzqoArray.length;
        if (bl3 != bl2) {
            bl2 = false;
        }
        Preconditions.checkArgument(bl2);
        return zzqoArray[0];
    }
}

