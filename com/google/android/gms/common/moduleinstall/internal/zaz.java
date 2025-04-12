/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 */
package com.google.android.gms.common.moduleinstall.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.moduleinstall.internal.zaf;
import com.google.android.gms.internal.base.zav;

public final class zaz
extends GmsClient {
    public zaz(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 308, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
            boolean bl2 = iInterface instanceof zaf;
            if (bl2) {
                object = iInterface;
                object = (zaf)iInterface;
            } else {
                iInterface = new zaf((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }

    public final Feature[] getApiFeatures() {
        return zav.zab;
    }

    public final int getMinApkVersion() {
        return 17895000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    public final boolean getUseDynamicLookup() {
        return true;
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

