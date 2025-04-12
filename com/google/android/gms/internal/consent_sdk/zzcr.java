/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.consent_sdk.zzcq;
import java.util.concurrent.Executor;

public final class zzcr {
    public static final Handler zza;
    public static final Executor zzb;

    static {
        Object object;
        Looper looper = Looper.getMainLooper();
        zza = object = new Handler(looper);
        object = new zzcq("Google consent worker");
        zzb = object;
    }

    public static void zza() {
        Looper looper;
        Object object = Looper.myLooper();
        if (object == (looper = Looper.getMainLooper())) {
            return;
        }
        object = new IllegalStateException("Method must be call on main thread.");
        throw object;
    }
}

