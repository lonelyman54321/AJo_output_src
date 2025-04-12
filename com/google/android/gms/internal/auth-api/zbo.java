/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 */
package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.Auth$AuthCredentialsOptions;
import com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.internal.auth-api.zbbj;
import com.google.android.gms.internal.auth-api.zbt;

public final class zbo
extends GmsClient {
    private final Auth$AuthCredentialsOptions zba;

    public zbo(Context object, Looper object2, ClientSettings clientSettings, Auth$AuthCredentialsOptions auth$AuthCredentialsOptions, GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        int n3 = 68;
        super((Context)object, (Looper)object2, n3, clientSettings, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener);
        if (auth$AuthCredentialsOptions == null) {
            auth$AuthCredentialsOptions = Auth$AuthCredentialsOptions.zba;
        }
        super(auth$AuthCredentialsOptions);
        object2 = zbbj.zba();
        ((Auth$AuthCredentialsOptions$Builder)object).zba((String)object2);
        super((Auth$AuthCredentialsOptions$Builder)object);
        this.zba = object2;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            boolean bl2 = iInterface instanceof zbt;
            if (bl2) {
                object = iInterface;
                object = (zbt)iInterface;
            } else {
                iInterface = new zbt((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba.zba();
    }

    public final int getMinApkVersion() {
        return 12800000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    public final Auth$AuthCredentialsOptions zba() {
        return this.zba;
    }
}

