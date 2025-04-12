/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqz;

public final class zzlv
implements zzjm {
    public final zzqo zzd(zzhx zzhx2, zzqo ... zzqoArray) {
        Object object;
        int n3 = 0;
        boolean bl2 = true;
        int n4 = zzqoArray != null ? 1 : 0;
        Preconditions.checkArgument(n4 != 0);
        n4 = zzqoArray.length;
        if (n4 <= 0) {
            bl2 = false;
            object = null;
        }
        Preconditions.checkArgument(bl2);
        while (n3 < n4) {
            object = zzqoArray[n3];
            Preconditions.checkNotNull(object);
            boolean bl3 = object instanceof zzqz;
            Preconditions.checkArgument(bl3);
            object = ((zzqz)object).zzk();
            zzqs zzqs2 = zzqs.zze;
            zzhx2.zzc((String)object, zzqs2);
            ++n3;
        }
        return zzqs.zze;
    }
}

