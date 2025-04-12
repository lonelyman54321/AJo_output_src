/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzra;

public final class zzkl
implements zzjm {
    public final zzqo zzd(zzhx zzhx2, zzqo ... object) {
        Object zzqo2 = null;
        int n3 = 1;
        boolean bl2 = object != null;
        Preconditions.checkArgument(bl2);
        bl2 = ((Object)object).length;
        boolean bl3 = 2 != 0;
        bl2 = bl2 == bl3;
        Preconditions.checkArgument(bl2);
        zzqo2 = object[0];
        zzqo2 = zzra.zzc(zzhx2, (zzqo)zzqo2);
        bl2 = zzjn.zzg((zzqo)zzqo2);
        if (!bl2) {
            return zzqo2;
        }
        object = object[n3];
        return zzra.zzc(zzhx2, (zzqo)object);
    }
}

