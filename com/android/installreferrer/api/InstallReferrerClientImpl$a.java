/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 */
package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.android.installreferrer.api.InstallReferrerClientImpl;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService$Stub;

public final class InstallReferrerClientImpl$a
implements ServiceConnection {
    public final InstallReferrerStateListener a;
    public final /* synthetic */ InstallReferrerClientImpl b;

    public InstallReferrerClientImpl$a(InstallReferrerClientImpl object, InstallReferrerStateListener installReferrerStateListener) {
        this.b = object;
        if (installReferrerStateListener != null) {
            this.a = installReferrerStateListener;
            return;
        }
        object = new RuntimeException("Please specify a listener to know when setup is done.");
        throw object;
    }

    public final void onServiceConnected(ComponentName object, IBinder object2) {
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        object = IGetInstallReferrerService$Stub.b(object2);
        object2 = this.b;
        object2.c = object;
        object2.a = 2;
        this.a.onInstallReferrerSetupFinished(0);
    }

    public final void onServiceDisconnected(ComponentName object) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        object = this.b;
        object.c = null;
        object.a = 0;
        this.a.onInstallReferrerServiceDisconnected();
    }
}

