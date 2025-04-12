/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.client.zzdx;
import java.util.List;
import java.util.Set;

public class AdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_AD_STRING = 11;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    protected final zzdx zza;

    public AdRequest(AbstractAdRequestBuilder object) {
        zzdx zzdx2;
        object = ((AbstractAdRequestBuilder)object).zza;
        this.zza = zzdx2 = new zzdx((zzdw)object, null);
    }

    public String getAdString() {
        return this.zza.zzj();
    }

    public String getContentUrl() {
        return this.zza.zzk();
    }

    public Bundle getCustomEventExtrasBundle(Class clazz) {
        return this.zza.zzd(clazz);
    }

    public Bundle getCustomTargeting() {
        return this.zza.zze();
    }

    public Set getKeywords() {
        return this.zza.zzp();
    }

    public List getNeighboringContentUrls() {
        return this.zza.zzn();
    }

    public Bundle getNetworkExtrasBundle(Class clazz) {
        return this.zza.zzf(clazz);
    }

    public String getRequestAgent() {
        return this.zza.zzm();
    }

    public boolean isTestDevice(Context context) {
        return this.zza.zzr(context);
    }

    public final zzdx zza() {
        return this.zza;
    }
}

