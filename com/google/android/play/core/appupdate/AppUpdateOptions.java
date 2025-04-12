/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.AppUpdateOptions$Builder;
import com.google.android.play.core.appupdate.zzv;

public abstract class AppUpdateOptions {
    public static AppUpdateOptions defaultOptions(int n3) {
        return AppUpdateOptions.newBuilder(n3).build();
    }

    public static AppUpdateOptions$Builder newBuilder(int n3) {
        zzv zzv2 = new zzv();
        zzv2.setAppUpdateType(n3);
        zzv2.setAllowAssetPackDeletion(false);
        return zzv2;
    }

    public abstract boolean allowAssetPackDeletion();

    public abstract int appUpdateType();
}

