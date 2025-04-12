/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.ads.query.zza;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbvx;

public class QueryInfo {
    private final zzem zza;

    public QueryInfo(zzem zzem2) {
        this.zza = zzem2;
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        QueryInfo.zza(context, adFormat, adRequest, null, queryInfoGenerationCallback);
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, String string2, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        Preconditions.checkNotNull(string2, "AdUnitId cannot be null.");
        QueryInfo.zza(context, adFormat, adRequest, string2, queryInfoGenerationCallback);
    }

    private static void zza(Context context, AdFormat adFormat, AdRequest object, String string2, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzbep.zza(context);
        Object object2 = (Boolean)zzbgi.zzk.zze();
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = zzbep.zzlg;
            Object object3 = zzba.zzc();
            object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
            bl2 = (Boolean)object2;
            if (bl2) {
                zza zza2;
                object2 = zzb.zzb;
                object3 = zza2;
                zza2 = new zza(context, adFormat, (AdRequest)object, string2, queryInfoGenerationCallback);
                object2.execute(zza2);
                return;
            }
        }
        object = object == null ? null : ((AdRequest)object).zza();
        object2 = new zzbvx(context, adFormat, (zzdx)object, string2);
        ((zzbvx)object2).zzb(queryInfoGenerationCallback);
    }

    public String getQuery() {
        return this.zza.zzb();
    }

    public Bundle getQueryBundle() {
        return this.zza.zza();
    }

    public String getRequestId() {
        return this.zza.zzc();
    }
}

