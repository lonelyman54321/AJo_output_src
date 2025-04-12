/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.zzu;

public final class SplitInstallManagerFactory {
    private SplitInstallManagerFactory() {
    }

    public static SplitInstallManager create(Context context) {
        return zzu.zza(context).zza();
    }
}

