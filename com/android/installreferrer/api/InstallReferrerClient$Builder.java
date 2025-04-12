/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.android.installreferrer.api;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerClient$a;
import com.android.installreferrer.api.InstallReferrerClientImpl;

public final class InstallReferrerClient$Builder {
    private final Context mContext;

    private InstallReferrerClient$Builder(Context context) {
        this.mContext = context;
    }

    public /* synthetic */ InstallReferrerClient$Builder(Context context, InstallReferrerClient.a a2) {
        this(context);
    }

    public InstallReferrerClient build() {
        Object object = this.mContext;
        if (object != null) {
            InstallReferrerClientImpl installReferrerClientImpl = new InstallReferrerClientImpl((Context)object);
            return installReferrerClientImpl;
        }
        object = new IllegalArgumentException("Please provide a valid Context.");
        throw object;
    }
}

