/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 */
package com.google.android.gms.internal.appset;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.appset.zze;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.internal.appset.zzg;

public final class zzd
extends GmsClient {
    public zzd(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 300, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
            boolean bl2 = iInterface instanceof zzg;
            if (bl2) {
                object = iInterface;
                object = (zzg)iInterface;
            } else {
                iInterface = new zzg((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }

    public final Feature[] getApiFeatures() {
        return zze.zzb;
    }

    public final int getMinApkVersion() {
        return 212800000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.appset.service.START";
    }

    public final boolean getUseDynamicLookup() {
        return true;
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

