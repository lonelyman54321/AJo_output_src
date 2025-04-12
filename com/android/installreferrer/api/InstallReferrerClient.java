/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.android.installreferrer.api;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient$Builder;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

public abstract class InstallReferrerClient {
    public static InstallReferrerClient$Builder newBuilder(Context context) {
        InstallReferrerClient$Builder installReferrerClient$Builder = new InstallReferrerClient$Builder(context, null);
        return installReferrerClient$Builder;
    }

    public abstract void endConnection();

    public abstract ReferrerDetails getInstallReferrer();

    public abstract boolean isReady();

    public abstract void startConnection(InstallReferrerStateListener var1);
}

