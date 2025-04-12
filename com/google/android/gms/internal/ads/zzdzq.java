/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzdzq
implements zzhkp {
    private final zzhlg zza;

    public zzdzq(zzhlg zzhlg2) {
        this.zza = zzhlg2;
    }

    public final ApplicationInfo zza() {
        ApplicationInfo applicationInfo = ((Context)this.zza.zzb()).getApplicationInfo();
        zzhkx.zzb(applicationInfo);
        return applicationInfo;
    }
}

