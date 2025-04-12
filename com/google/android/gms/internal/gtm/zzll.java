/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhv;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqz;

public final class zzll
implements zzjm {
    private static zzhv zza;

    public zzll(zzhv zzhv2) {
        zza = zzhv2;
    }

    public final zzqo zzd(zzhx object, zzqo ... object2) {
        boolean bl2 = true;
        boolean bl3 = object2 != null;
        Preconditions.checkArgument(bl3);
        bl3 = ((zzqo[])object2).length;
        if (bl3 != bl2) {
            bl2 = false;
            object = null;
        }
        Preconditions.checkArgument(bl2);
        Preconditions.checkArgument(object2[0] instanceof zzqz);
        object = zza;
        object2 = ((zzqz)object2[0]).zzk();
        return ((zzhv)object).zzc((String)object2);
    }
}

