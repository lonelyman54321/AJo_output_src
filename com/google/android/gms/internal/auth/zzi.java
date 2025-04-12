/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 */
package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.zze;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.internal.auth.zzp;

final class zzi
extends GmsClient {
    public zzi(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 224, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
            boolean bl2 = iInterface instanceof zzp;
            if (bl2) {
                object = iInterface;
                object = (zzp)iInterface;
            } else {
                iInterface = new zzp((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }

    public final void disconnect(String string2) {
        String string3 = String.valueOf(string2);
        "GoogleAuthServiceClientImpl disconnected with reason: ".concat(string3);
        super.disconnect(string2);
    }

    public final Feature[] getApiFeatures() {
        Feature feature = zze.zzj;
        feature = zze.zzi;
        feature = zze.zza;
        Feature[] featureArray = new Feature[]{feature, feature, feature};
        return featureArray;
    }

    public final int getMinApkVersion() {
        return 17895000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    public final boolean getUseDynamicLookup() {
        return true;
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

