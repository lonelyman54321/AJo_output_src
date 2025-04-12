/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqz;

public final class zzod
implements zzjm {
    public final zzqo zzd(zzhx object, zzqo ... zzqoArray) {
        boolean bl2 = false;
        object = null;
        boolean bl3 = zzqoArray != null;
        Preconditions.checkArgument(bl3);
        int n3 = zzqoArray.length;
        if (n3 == 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2);
        object = new zzqz("Android");
        return object;
    }
}

