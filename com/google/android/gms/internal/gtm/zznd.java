/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzgc;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqp;

public final class zznd
implements zzjm {
    private final zzgc zza;

    public zznd(Context object) {
        object = zzgc.zzb(object);
        this.zza = object;
    }

    public final zzqo zzd(zzhx object, zzqo ... object2) {
        boolean bl2 = false;
        object = null;
        boolean bl3 = true;
        boolean bl4 = object2 != null;
        Preconditions.checkArgument(bl4);
        int n3 = ((zzqo[])object2).length;
        if (n3 == 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2);
        object = this.zza;
        object = ((zzgc)object).zzf() ^ bl3;
        object2 = new zzqp((Boolean)object);
        return object2;
    }
}

