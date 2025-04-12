/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.location.zzbb;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzci;
import com.google.android.gms.internal.location.zzcr;
import com.google.android.gms.internal.location.zzct;
import com.google.android.gms.internal.location.zzcz;
import com.google.android.gms.internal.location.zzda;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.FusedOrientationProviderClient;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.SettingsApi;
import com.google.android.gms.location.SettingsClient;

public class LocationServices {
    public static final Api API = zzbi.zzb;
    public static final FusedLocationProviderApi FusedLocationApi;
    public static final GeofencingApi GeofencingApi;
    public static final SettingsApi SettingsApi;

    static {
        Object object = new zzbb();
        FusedLocationApi = object;
        GeofencingApi = object = new zzcr();
        SettingsApi = object = new zzcz();
    }

    private LocationServices() {
    }

    public static FusedLocationProviderClient getFusedLocationProviderClient(Activity activity) {
        zzbi zzbi2 = new zzbi(activity);
        return zzbi2;
    }

    public static FusedLocationProviderClient getFusedLocationProviderClient(Context context) {
        zzbi zzbi2 = new zzbi(context);
        return zzbi2;
    }

    public static FusedOrientationProviderClient getFusedOrientationProviderClient(Activity activity) {
        zzci zzci2 = new zzci(activity);
        return zzci2;
    }

    public static FusedOrientationProviderClient getFusedOrientationProviderClient(Context context) {
        zzci zzci2 = new zzci(context);
        return zzci2;
    }

    public static GeofencingClient getGeofencingClient(Activity activity) {
        zzct zzct2 = new zzct(activity);
        return zzct2;
    }

    public static GeofencingClient getGeofencingClient(Context context) {
        zzct zzct2 = new zzct(context);
        return zzct2;
    }

    public static SettingsClient getSettingsClient(Activity activity) {
        zzda zzda2 = new zzda(activity);
        return zzda2;
    }

    public static SettingsClient getSettingsClient(Context context) {
        zzda zzda2 = new zzda(context);
        return zzda2;
    }
}

