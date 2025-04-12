/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.common.moduleinstall;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.common.moduleinstall.internal.zay;

public final class ModuleInstall {
    private ModuleInstall() {
    }

    public static ModuleInstallClient getClient(Activity activity) {
        zay zay2 = new zay(activity);
        return zay2;
    }

    public static ModuleInstallClient getClient(Context context) {
        zay zay2 = new zay(context);
        return zay2;
    }
}

