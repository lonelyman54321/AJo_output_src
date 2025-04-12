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
package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.fido.zza;
import com.google.android.gms.internal.fido.zzs;

public final class zzp
extends GmsClient {
    public zzp(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        super(context, looper, 148, clientSettings, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
            boolean bl2 = iInterface instanceof zzs;
            if (bl2) {
                object = iInterface;
                object = (zzs)iInterface;
            } else {
                iInterface = new zzs((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }

    public final Feature[] getApiFeatures() {
        Feature feature = zza.zzh;
        feature = zza.zzg;
        Feature[] featureArray = new Feature[]{feature, feature};
        return featureArray;
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        return E1.a("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
    }

    public final int getMinApkVersion() {
        return 13000000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

