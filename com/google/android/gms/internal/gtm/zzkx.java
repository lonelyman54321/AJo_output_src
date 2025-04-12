/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;

public final class zzkx
extends zzjo {
    public final zzqo zza(zzhx zzhx2, zzqo ... zzqoArray) {
        boolean bl2 = true;
        Preconditions.checkArgument(bl2);
        int n3 = zzqoArray.length;
        int n4 = 2;
        if (n3 != n4) {
            bl2 = false;
        }
        Preconditions.checkArgument(bl2);
        return zzqoArray[0];
    }
}

