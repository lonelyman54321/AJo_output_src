/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.AuthProxyOptions;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.internal.auth.zzbh;

public final class zzbe
extends GmsClient {
    private final Bundle zze;

    public zzbe(Context context, Looper looper, ClientSettings clientSettings, AuthProxyOptions authProxyOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        int n3 = 16;
        super(context, looper, n3, clientSettings, connectionCallbacks, onConnectionFailedListener);
        if (authProxyOptions == null) {
            super();
        } else {
            context = authProxyOptions.zza();
        }
        this.zze = context;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
            boolean bl2 = iInterface instanceof zzbh;
            if (bl2) {
                object = iInterface;
                object = (zzbh)iInterface;
            } else {
                iInterface = new zzbh((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zze;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    public final boolean requiresSignIn() {
        boolean bl2;
        Object object = this.getClientSettings();
        Object object2 = ((ClientSettings)object).getAccountName();
        boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
        return !bl3 && !(bl2 = (object = ((ClientSettings)object).getApplicableScopes((Api)(object2 = AuthProxy.API))).isEmpty());
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

