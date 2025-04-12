/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 */
package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api$BaseClientBuilder;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;

public abstract class Api$AbstractClientBuilder
extends Api$BaseClientBuilder {
    public Api$Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object object, GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        return this.buildClient(context, looper, clientSettings, object, (ConnectionCallbacks)googleApiClient$ConnectionCallbacks, (OnConnectionFailedListener)googleApiClient$OnConnectionFailedListener);
    }

    public Api$Client buildClient(Context object, Looper looper, ClientSettings clientSettings, Object object2, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        object = new UnsupportedOperationException("buildClient must be implemented");
        throw object;
    }
}

