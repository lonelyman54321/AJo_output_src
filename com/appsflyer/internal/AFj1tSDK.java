/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProviderClient
 *  android.content.Context
 *  android.content.pm.ProviderInfo
 *  android.net.Uri
 */
package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFj1sSDK;
import com.appsflyer.internal.AFj1tSDK$4;

public final class AFj1tSDK
extends AFj1sSDK {
    final ProviderInfo getCurrencyIso4217Code;
    private final AFd1kSDK getRevenue;

    public AFj1tSDK(ProviderInfo providerInfo, Runnable runnable2, AFd1kSDK aFd1kSDK) {
        String string2 = providerInfo.authority;
        super("af_referrer", string2, runnable2);
        this.getRevenue = aFd1kSDK;
        this.getCurrencyIso4217Code = providerInfo;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ContentProviderClient D_(Context context, Uri uri) {
        try {
            context = context.getContentResolver();
            context = context.acquireUnstableContentProviderClient(uri);
            return context;
        }
        catch (SecurityException securityException) {}
        finally {
            return context;
        }
    }

    public final void getMediationNetwork(Context context) {
        AFj1tSDK$4 aFj1tSDK$4 = new AFj1tSDK$4(this, context);
        this.getRevenue.getMonetizationNetwork().execute(aFj1tSDK$4);
    }
}

