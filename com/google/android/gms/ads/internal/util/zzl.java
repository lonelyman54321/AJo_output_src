/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzfuv;

public final class zzl
implements zze {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzl(Context context, String string2) {
        this.zza = context;
        this.zzb = string2;
    }

    public final boolean zza(String string2) {
        zzfuv zzfuv2 = zzt.zza;
        zzu.zzp();
        zzfuv2 = this.zza;
        String string3 = this.zzb;
        zzt.zzL((Context)zzfuv2, string3, string2);
        return true;
    }
}

