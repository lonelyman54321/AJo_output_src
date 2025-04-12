/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.Uri
 *  android.os.Bundle
 */
package com.google.firebase.dynamiclinks;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.google.firebase.dynamiclinks.internal.DynamicLinkUTMParams;

public class PendingDynamicLinkData {
    private final DynamicLinkData dynamicLinkData;
    private final DynamicLinkUTMParams dynamicLinkUTMParams;

    public PendingDynamicLinkData(DynamicLinkData dynamicLinkData) {
        Object object;
        long l2;
        if (dynamicLinkData == null) {
            this.dynamicLinkData = null;
            this.dynamicLinkUTMParams = null;
            return;
        }
        long l3 = dynamicLinkData.getClickTimestamp();
        long l4 = l3 - (l2 = 0L);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 == false) {
            object = DefaultClock.getInstance();
            l3 = object.currentTimeMillis();
            dynamicLinkData.setClickTimestamp(l3);
        }
        this.dynamicLinkData = dynamicLinkData;
        this.dynamicLinkUTMParams = object = new DynamicLinkUTMParams(dynamicLinkData);
    }

    public PendingDynamicLinkData(String object, int n3, long l2, Uri uri) {
        DynamicLinkData dynamicLinkData;
        this.dynamicLinkData = dynamicLinkData = new DynamicLinkData(null, (String)object, n3, l2, null, uri);
        this.dynamicLinkUTMParams = object = new DynamicLinkUTMParams(dynamicLinkData);
    }

    public long getClickTimestamp() {
        DynamicLinkData dynamicLinkData = this.dynamicLinkData;
        if (dynamicLinkData == null) {
            return 0L;
        }
        return dynamicLinkData.getClickTimestamp();
    }

    public Bundle getExtensions() {
        DynamicLinkData dynamicLinkData = this.dynamicLinkData;
        if (dynamicLinkData == null) {
            dynamicLinkData = new Bundle();
            return dynamicLinkData;
        }
        return dynamicLinkData.getExtensionBundle();
    }

    public Uri getLink() {
        Object object = this.dynamicLinkData;
        if (object == null) {
            return null;
        }
        if ((object = ((DynamicLinkData)object).getDeepLink()) != null) {
            return Uri.parse((String)object);
        }
        return null;
    }

    public int getMinimumAppVersion() {
        DynamicLinkData dynamicLinkData = this.dynamicLinkData;
        if (dynamicLinkData == null) {
            return 0;
        }
        return dynamicLinkData.getMinVersion();
    }

    public Uri getRedirectUrl() {
        DynamicLinkData dynamicLinkData = this.dynamicLinkData;
        if (dynamicLinkData == null) {
            return null;
        }
        return dynamicLinkData.getRedirectUrl();
    }

    /*
     * WARNING - bad return control flow
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Intent getUpdateAppIntent(Context object) {
        Uri uri;
        PackageManager packageManager;
        int n3 = this.getMinimumAppVersion();
        if (n3 == 0) {
            return null;
        }
        try {
            packageManager = object.getPackageManager();
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        Context context = object.getApplicationContext();
        String string2 = context.getPackageName();
        PackageInfo packageInfo = packageManager.getPackageInfo(string2, 0);
        int n4 = packageInfo.versionCode;
        n3 = this.getMinimumAppVersion();
        if (n4 >= n3 || (uri = this.getRedirectUrl()) == null) return null;
        Intent intent = new Intent("android.intent.action.VIEW");
        packageManager = this.getRedirectUrl();
        return intent.setData((Uri)packageManager).setPackage("com.android.vending");
        return null;
    }

    public Bundle getUtmParameters() {
        DynamicLinkUTMParams dynamicLinkUTMParams = this.dynamicLinkUTMParams;
        if (dynamicLinkUTMParams == null) {
            dynamicLinkUTMParams = new Bundle();
            return dynamicLinkUTMParams;
        }
        return dynamicLinkUTMParams.asBundle();
    }
}

