/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Looper
 */
package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.api.internal.zacf;
import com.google.android.gms.common.api.internal.zacg;
import com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$SignOutCallbacks;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

public final class NonGmsServiceBrokerClient
implements Api$Client,
ServiceConnection {
    private static final String zaa = "NonGmsServiceBrokerClient";
    private final String zab;
    private final String zac;
    private final ComponentName zad;
    private final Context zae;
    private final ConnectionCallbacks zaf;
    private final Handler zag;
    private final OnConnectionFailedListener zah;
    private IBinder zai;
    private boolean zaj;
    private String zak;
    private String zal;

    public NonGmsServiceBrokerClient(Context context, Looper looper, ComponentName componentName, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, null, null, componentName, connectionCallbacks, onConnectionFailedListener);
    }

    private NonGmsServiceBrokerClient(Context object, Looper looper, String string2, String string3, ComponentName componentName, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        block3: {
            block4: {
                block2: {
                    this.zaj = false;
                    this.zak = null;
                    this.zae = object;
                    super(looper);
                    this.zag = object;
                    this.zaf = connectionCallbacks;
                    this.zah = onConnectionFailedListener;
                    if (string2 == null || string3 == null) break block2;
                    if (componentName != null) break block3;
                    componentName = null;
                    break block4;
                }
                if (componentName == null) break block3;
            }
            this.zab = string2;
            this.zac = string3;
            this.zad = componentName;
            return;
        }
        super((Object)"Must specify either package or component, but not both");
        throw object;
    }

    public NonGmsServiceBrokerClient(Context context, Looper looper, String string2, String string3, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, string2, string3, null, connectionCallbacks, onConnectionFailedListener);
    }

    private final void zad() {
        Object object = this.zag;
        Thread thread2 = Thread.currentThread();
        if (thread2 == (object = object.getLooper().getThread())) {
            return;
        }
        object = new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void connect(BaseGmsClient$ConnectionProgressReportCallbacks object) {
        SecurityException securityException2;
        block8: {
            boolean bl2;
            Object object2;
            Object object3;
            block7: {
                block6: {
                    this.zad();
                    object = this.zai;
                    String.valueOf(object);
                    boolean bl3 = this.isConnected();
                    if (bl3) {
                        object = "connect() called when already connected";
                        try {
                            this.disconnect((String)object);
                        }
                        catch (Exception exception) {}
                    }
                    bl3 = false;
                    object = null;
                    try {
                        object3 = new Intent();
                        object2 = this.zad;
                        if (object2 == null) break block6;
                        object3.setComponent(object2);
                        break block7;
                    }
                    catch (SecurityException securityException2) {
                        break block8;
                    }
                }
                object2 = this.zab;
                object2 = object3.setPackage((String)object2);
                String string2 = this.zac;
                object2.setAction(string2);
            }
            object2 = this.zae;
            int n3 = GmsClientSupervisor.getDefaultBindFlags();
            this.zaj = bl2 = object2.bindService(object3, (ServiceConnection)this, n3);
            if (!bl2) {
                this.zai = null;
                object = this.zah;
                int n4 = 16;
                object3 = new ConnectionResult(n4);
                object.onConnectionFailed((ConnectionResult)object3);
            }
            String.valueOf(this.zai);
            return;
        }
        this.zaj = false;
        this.zai = null;
        throw securityException2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void disconnect() {
        this.zad();
        IBinder iBinder = this.zai;
        String.valueOf(iBinder);
        try {
            iBinder = this.zae;
            iBinder.unbindService((ServiceConnection)this);
        }
        catch (IllegalArgumentException illegalArgumentException) {}
        this.zaj = false;
        this.zai = null;
    }

    public final void disconnect(String string2) {
        this.zad();
        this.zak = string2;
        this.disconnect();
    }

    public final void dump(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
    }

    public final Feature[] getAvailableFeatures() {
        return new Feature[0];
    }

    public IBinder getBinder() {
        this.zad();
        return this.zai;
    }

    public final String getEndpointPackageName() {
        String string2 = this.zab;
        if (string2 != null) {
            return string2;
        }
        Preconditions.checkNotNull(this.zad);
        return this.zad.getPackageName();
    }

    public final String getLastDisconnectMessage() {
        return this.zak;
    }

    public final int getMinApkVersion() {
        return 0;
    }

    public final void getRemoteService(IAccountAccessor iAccountAccessor, Set set) {
    }

    public final Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    public final Set getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    public final IBinder getServiceBrokerBinder() {
        return null;
    }

    public final Intent getSignInIntent() {
        Intent intent = new Intent();
        return intent;
    }

    public final boolean isConnected() {
        this.zad();
        IBinder iBinder = this.zai;
        return iBinder != null;
    }

    public final boolean isConnecting() {
        this.zad();
        return this.zaj;
    }

    public final void onServiceConnected(ComponentName object, IBinder iBinder) {
        object = new zacg(this, iBinder);
        this.zag.post((Runnable)object);
    }

    public final void onServiceDisconnected(ComponentName object) {
        object = new zacf(this);
        this.zag.post((Runnable)object);
    }

    public final void onUserSignOut(BaseGmsClient$SignOutCallbacks baseGmsClient$SignOutCallbacks) {
    }

    public final boolean providesSignIn() {
        return false;
    }

    public final boolean requiresAccount() {
        return false;
    }

    public final boolean requiresGooglePlayServices() {
        return false;
    }

    public final boolean requiresSignIn() {
        return false;
    }

    public final /* synthetic */ void zaa(IBinder iBinder) {
        this.zaj = false;
        this.zai = iBinder;
        String.valueOf(iBinder);
        iBinder = new Bundle();
        this.zaf.onConnected((Bundle)iBinder);
    }

    public final /* synthetic */ void zab() {
        this.zaj = false;
        this.zai = null;
        this.zaf.onConnectionSuspended(1);
    }

    public final void zac(String string2) {
        this.zal = string2;
    }
}

