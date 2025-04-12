/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 */
package com.google.android.gms.internal.auth-api-phone;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ApiOptions$NoOptions;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.auth-api-phone.zzw;

final class zzt
extends Api$AbstractClientBuilder {
    public final /* synthetic */ Api$Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object object, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        object = (Api$ApiOptions$NoOptions)object;
        object = new zzw(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
        return object;
    }
}

