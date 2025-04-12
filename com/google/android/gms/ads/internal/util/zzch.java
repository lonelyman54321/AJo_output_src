/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.os.StrictMode$ThreadPolicy$Builder
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbwj;
import java.util.concurrent.Callable;

public final class zzch {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object zza(Context context, Callable callable) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            threadPolicy = StrictMode.getThreadPolicy();
        }
        catch (Throwable throwable) {}
        try {
            StrictMode.ThreadPolicy.Builder builder = new StrictMode.ThreadPolicy.Builder(threadPolicy);
            builder = builder.permitDiskReads();
            builder = builder.permitDiskWrites();
            builder = builder.build();
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)builder);
            callable = callable.call();
        }
        catch (Throwable throwable) {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            throw throwable;
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        return callable;
        zzm.zzh("Unexpected exception.", throwable);
        zzbwj.zza(context).zzh(throwable, "StrictModeUtil.runWithLaxStrictMode");
        return null;
    }
}

