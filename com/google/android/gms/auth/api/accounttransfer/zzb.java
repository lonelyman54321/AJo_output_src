/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 */
package com.google.android.gms.auth.api.accounttransfer;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.accounttransfer.zzr;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.auth.zzap;

final class zzb
extends Api$AbstractClientBuilder {
    public final /* synthetic */ Api$Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object object, GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        Object object2 = object;
        object2 = (zzr)object;
        object = new zzap(context, looper, clientSettings, (zzr)object2, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener);
        return object;
    }
}

