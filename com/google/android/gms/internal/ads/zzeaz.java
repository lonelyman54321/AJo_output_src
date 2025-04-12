/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzeay;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzeaz
implements zzhkp {
    private final zzhlg zza;

    public zzeaz(zzhlg zzhlg2) {
        this.zza = zzhlg2;
    }

    public final zzeay zza() {
        Context context = ((zzcjj)this.zza).zza();
        zzeay zzeay2 = new zzeay(context);
        return zzeay2;
    }
}

