/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzu;
import com.google.android.gms.internal.location.zzv;
import com.google.android.gms.location.zzo;

public final class zzg
extends GmsClient {
    public zzg(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            boolean bl2 = iInterface instanceof zzv;
            if (bl2) {
                object = iInterface;
                object = (zzv)iInterface;
            } else {
                iInterface = new zzu((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }

    public final Feature[] getApiFeatures() {
        return zzo.zzp;
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        return E1.a("client_name", "activity_recognition");
    }

    public final int getMinApkVersion() {
        return 11717000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzp(PendingIntent pendingIntent) {
        Preconditions.checkNotNull(pendingIntent);
        ((zzv)this.getService()).zzl(pendingIntent);
    }
}

