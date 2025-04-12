/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  android.os.Bundle
 */
package com.google.android.gms.ads.search;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.search.zzb;
import com.google.android.gms.ads.search.zzc;

public final class SearchAdRequest {
    public static final int BORDER_TYPE_DASHED = 1;
    public static final int BORDER_TYPE_DOTTED = 2;
    public static final int BORDER_TYPE_NONE = 0;
    public static final int BORDER_TYPE_SOLID = 3;
    public static final int CALL_BUTTON_COLOR_DARK = 2;
    public static final int CALL_BUTTON_COLOR_LIGHT = 0;
    public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    private final zzdx zza;
    private final String zzb;

    public /* synthetic */ SearchAdRequest(zzb object, zzc object2) {
        this.zzb = object2 = com.google.android.gms.ads.search.zzb.zzf((zzb)object);
        object = com.google.android.gms.ads.search.zzb.zza((zzb)object);
        this.zza = object2 = new zzdx((zzdw)object, this);
    }

    public int getAnchorTextColor() {
        return 0;
    }

    public int getBackgroundColor() {
        return 0;
    }

    public int getBackgroundGradientBottom() {
        return 0;
    }

    public int getBackgroundGradientTop() {
        return 0;
    }

    public int getBorderColor() {
        return 0;
    }

    public int getBorderThickness() {
        return 0;
    }

    public int getBorderType() {
        return 0;
    }

    public int getCallButtonColor() {
        return 0;
    }

    public String getCustomChannels() {
        return null;
    }

    public Bundle getCustomEventExtrasBundle(Class clazz) {
        return this.zza.zzd(clazz);
    }

    public int getDescriptionTextColor() {
        return 0;
    }

    public String getFontFace() {
        return null;
    }

    public int getHeaderTextColor() {
        return 0;
    }

    public int getHeaderTextSize() {
        return 0;
    }

    public Location getLocation() {
        return null;
    }

    public NetworkExtras getNetworkExtras(Class clazz) {
        return this.zza.zzh(clazz);
    }

    public Bundle getNetworkExtrasBundle(Class clazz) {
        return this.zza.zzf(clazz);
    }

    public String getQuery() {
        return this.zzb;
    }

    public boolean isTestDevice(Context context) {
        return this.zza.zzr(context);
    }

    public final zzdx zza() {
        return this.zza;
    }
}

