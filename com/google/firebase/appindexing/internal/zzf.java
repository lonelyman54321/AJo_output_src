/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 */
package com.google.firebase.appindexing.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.firebase.appindexing.internal.zze;

public final class zzf
extends GmsClient {
    static final Api zze;
    private static final Api$ClientKey zzf;
    private static final Api$AbstractClientBuilder zzg;

    static {
        Api api;
        Api$ClientKey api$ClientKey;
        zzf = api$ClientKey = new Api$ClientKey();
        zze zze2 = new zze();
        zzg = zze2;
        zze = api = new Api("AppIndexing.API", zze2, api$ClientKey);
    }

    public zzf(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        super(context, looper, 113, clientSettings, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener);
    }

    public final int getMinApkVersion() {
        return 12600000;
    }

    public final String getServiceDescriptor() {
        return "com.google.firebase.appindexing.internal.IAppIndexingService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.icing.APP_INDEXING_SERVICE";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

