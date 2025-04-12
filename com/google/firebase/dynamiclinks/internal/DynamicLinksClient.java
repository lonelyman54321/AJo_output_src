/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  android.os.RemoteException
 */
package com.google.firebase.dynamiclinks.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks$Stub;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksService;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksService$Stub;

public class DynamicLinksClient
extends GmsClient {
    public static final String ACTION_START_SERVICE = "com.google.firebase.dynamiclinks.service.START";
    private static final int DYNAMIC_LINKS_API_VALUE = 131;
    public static final String SERVICE_DESCRIPTOR = "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    private static final int V17 = 12451000;

    public DynamicLinksClient(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        super(context, looper, 131, clientSettings, googleApiClient$ConnectionCallbacks, googleApiClient$OnConnectionFailedListener);
    }

    public IDynamicLinksService createServiceInterface(IBinder iBinder) {
        return IDynamicLinksService$Stub.asInterface(iBinder);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void createShortDynamicLink(IDynamicLinksCallbacks$Stub iDynamicLinksCallbacks$Stub, Bundle bundle) {
        IInterface iInterface;
        try {
            iInterface = this.getService();
        }
        catch (RemoteException remoteException) {
            return;
        }
        iInterface = (IDynamicLinksService)iInterface;
        iInterface.createShortDynamicLink(iDynamicLinksCallbacks$Stub, bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void getDynamicLink(IDynamicLinksCallbacks$Stub iDynamicLinksCallbacks$Stub, String string2) {
        IInterface iInterface;
        try {
            iInterface = this.getService();
        }
        catch (RemoteException remoteException) {
            return;
        }
        iInterface = (IDynamicLinksService)iInterface;
        iInterface.getDynamicLink(iDynamicLinksCallbacks$Stub, string2);
    }

    public int getMinApkVersion() {
        return 12451000;
    }

    public String getServiceDescriptor() {
        return SERVICE_DESCRIPTOR;
    }

    public String getStartServiceAction() {
        return ACTION_START_SERVICE;
    }

    public boolean usesClientTelemetry() {
        return true;
    }
}

