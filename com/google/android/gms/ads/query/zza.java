/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.query;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbvx;

public final class zza
implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ AdFormat zzb;
    public final /* synthetic */ AdRequest zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ QueryInfoGenerationCallback zze;

    public /* synthetic */ zza(Context context, AdFormat adFormat, AdRequest adRequest, String string2, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.zza = context;
        this.zzb = adFormat;
        this.zzc = adRequest;
        this.zzd = string2;
        this.zze = queryInfoGenerationCallback;
    }

    public final void run() {
        Object object = this.zzc;
        object = object == null ? null : ((AdRequest)object).zza();
        QueryInfoGenerationCallback queryInfoGenerationCallback = this.zze;
        String string2 = this.zzd;
        AdFormat adFormat = this.zzb;
        Context context = this.zza;
        zzbvx zzbvx2 = new zzbvx(context, adFormat, (zzdx)object, string2);
        zzbvx2.zzb(queryInfoGenerationCallback);
    }
}

