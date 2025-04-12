/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.splitinstall.zzu;

public final class InternalFrameworkListenerExtensions {
    private InternalFrameworkListenerExtensions() {
    }

    public static void registerFrameworkListener(Context context, SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        zzu.zza(context).zza().zza(splitInstallStateUpdatedListener);
    }

    public static void unregisterFrameworkListener(Context context, SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        zzu.zza(context).zza().zzb(splitInstallStateUpdatedListener);
    }
}

