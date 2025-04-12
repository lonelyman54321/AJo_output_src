/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ResolveInfo
 *  android.content.pm.ServiceInfo
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerClientImpl$a;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

public final class InstallReferrerClientImpl
extends InstallReferrerClient {
    public int a = 0;
    public final Context b;
    public IGetInstallReferrerService c;
    public InstallReferrerClientImpl$a d;

    public InstallReferrerClientImpl(Context context) {
        this.b = context = context.getApplicationContext();
    }

    public final void endConnection() {
        int n3;
        this.a = n3 = 3;
        InstallReferrerClientImpl$a installReferrerClientImpl$a = this.d;
        if (installReferrerClientImpl$a != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            installReferrerClientImpl$a = this.b;
            InstallReferrerClientImpl$a installReferrerClientImpl$a2 = this.d;
            installReferrerClientImpl$a.unbindService(installReferrerClientImpl$a2);
            this.d = null;
        }
        this.c = null;
    }

    public final ReferrerDetails getInstallReferrer() {
        boolean bl2 = this.isReady();
        if (bl2) {
            Bundle bundle = new Bundle();
            Object object = this.b.getPackageName();
            Object object2 = "package_name";
            bundle.putString((String)object2, (String)object);
            try {
                object2 = this.c;
            }
            catch (RemoteException remoteException) {
                InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
                this.a = 0;
                throw remoteException;
            }
            bundle = object2.c(bundle);
            object = new ReferrerDetails(bundle);
            return object;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Service not connected. Please start a connection before using the service.");
        throw illegalStateException;
    }

    public final boolean isReady() {
        Object object;
        int n3 = this.a;
        int n4 = 2;
        return n3 == n4 && (object = this.c) != null && (object = this.d) != null;
    }

    public final void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        int n3;
        int n4 = this.isReady();
        String string2 = "InstallReferrerClient";
        if (n4 != 0) {
            InstallReferrerCommons.logVerbose(string2, "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        n4 = this.a;
        int n7 = 3;
        int n8 = 1;
        if (n4 == n8) {
            InstallReferrerCommons.logWarn(string2, "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(n7);
            return;
        }
        if (n4 == n7) {
            InstallReferrerCommons.logWarn(string2, "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(n7);
            return;
        }
        InstallReferrerCommons.logVerbose(string2, "Starting install referrer service setup.");
        Object object = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        String string3 = "com.android.vending";
        ComponentName componentName = new ComponentName(string3, "com.google.android.finsky.externalreferrer.GetInstallReferrerService");
        object.setComponent(componentName);
        componentName = this.b;
        Object object2 = componentName.getPackageManager().queryIntentServices(object, 0);
        int n10 = 2;
        if (object2 != null && (n3 = object2.isEmpty()) == 0 && (object2 = ((ResolveInfo)object2.get((int)0)).serviceInfo) != null) {
            block10: {
                String string4 = ((ServiceInfo)object2).packageName;
                object2 = ((ServiceInfo)object2).name;
                n3 = string3.equals(string4);
                if (n3 != 0 && object2 != null) {
                    block11: {
                        object2 = componentName.getPackageManager();
                        n3 = 128;
                        try {
                            string3 = object2.getPackageInfo(string3, n3);
                        }
                        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
                        int n14 = ((PackageInfo)string3).versionCode;
                        int n15 = 80837300;
                        if (n14 < n15) break block10;
                        string3 = new Intent(object);
                        object = new InstallReferrerClientImpl$a(this, installReferrerStateListener);
                        this.d = object;
                        try {
                            n4 = (int)(componentName.bindService((Intent)string3, (ServiceConnection)object, n8) ? 1 : 0);
                            if (n4 == 0) break block11;
                        }
                        catch (SecurityException securityException) {
                            InstallReferrerCommons.logWarn(string2, "No permission to connect to service.");
                            this.a = 0;
                            installReferrerStateListener.onInstallReferrerSetupFinished(4);
                            return;
                        }
                        InstallReferrerCommons.logVerbose(string2, "Service was bonded successfully.");
                        return;
                    }
                    InstallReferrerCommons.logWarn(string2, "Connection to service is blocked.");
                    this.a = 0;
                    installReferrerStateListener.onInstallReferrerSetupFinished(n8);
                    return;
                }
            }
            InstallReferrerCommons.logWarn(string2, "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(n10);
            return;
        }
        this.a = 0;
        InstallReferrerCommons.logVerbose(string2, "Install Referrer service unavailable on device.");
        installReferrerStateListener.onInstallReferrerSetupFinished(n10);
    }
}

