/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzegz;
import com.google.android.gms.internal.ads.zzfoh;

public final class zzegt
implements zzegz {
    public final /* synthetic */ Context zza;

    public /* synthetic */ zzegt(Context context) {
        this.zza = context;
    }

    public final Object zza() {
        Boolean bl2;
        boolean bl3 = zzfoh.zzb();
        if (bl3) {
            bl2 = Boolean.TRUE;
        } else {
            zzfoh.zza(this.zza);
            bl3 = zzfoh.zzb();
            bl2 = bl3;
        }
        return bl2;
    }
}

