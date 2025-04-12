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
package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.accounttransfer.zzr;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.internal.auth.zzau;

public final class zzap
extends GmsClient {
    private final Bundle zze;

    public zzap(Context context, Looper looper, ClientSettings clientSettings, zzr zzr2, GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        int n3 = 128;
        super(context, looper, n3, clientSettings, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener);
        if (zzr2 == null) {
            super();
        } else {
            context = zzr2.zza();
        }
        this.zze = context;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
            boolean bl2 = iInterface instanceof zzau;
            if (bl2) {
                object = iInterface;
                object = (zzau)iInterface;
            } else {
                iInterface = new zzau((IBinder)object);
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
        return "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.accounttransfer.service.START";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

