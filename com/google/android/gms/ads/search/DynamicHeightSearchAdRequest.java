/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.ads.search;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.search.DynamicHeightSearchAdRequest$Builder;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.ads.search.zza;
import com.google.android.gms.ads.search.zzb;

public final class DynamicHeightSearchAdRequest {
    private final SearchAdRequest zza;

    public /* synthetic */ DynamicHeightSearchAdRequest(DynamicHeightSearchAdRequest$Builder object, zza object2) {
        object = DynamicHeightSearchAdRequest$Builder.zza((DynamicHeightSearchAdRequest$Builder)object);
        this.zza = object2 = new SearchAdRequest((zzb)object, null);
    }

    public Bundle getCustomEventExtrasBundle(Class clazz) {
        return this.zza.getCustomEventExtrasBundle(clazz);
    }

    public Bundle getNetworkExtrasBundle(Class clazz) {
        return this.zza.getNetworkExtrasBundle(clazz);
    }

    public String getQuery() {
        return this.zza.getQuery();
    }

    public boolean isTestDevice(Context context) {
        return this.zza.isTestDevice(context);
    }

    public final zzdx zza() {
        return this.zza.zza();
    }
}

