/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 */
package com.google.firebase.dynamiclinks.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ApiOptions$NoOptions;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.firebase.dynamiclinks.internal.DynamicLinksClient;

class DynamicLinksApi$1
extends Api$AbstractClientBuilder {
    public DynamicLinksClient buildClient(Context context, Looper looper, ClientSettings clientSettings, Api$ApiOptions$NoOptions object, GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        object = new DynamicLinksClient(context, looper, clientSettings, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener);
        return object;
    }
}

