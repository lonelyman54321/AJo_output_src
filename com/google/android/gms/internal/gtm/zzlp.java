/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;

public final class zzlp
implements zzjm {
    public final zzqo zzd(zzhx zzhx2, zzqo ... zzqoArray) {
        boolean bl2 = false;
        boolean bl3 = zzqoArray != null;
        Preconditions.checkArgument(bl3);
        int n3 = zzqoArray.length;
        if (n3 == 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2);
        return zzqs.zzd;
    }
}

