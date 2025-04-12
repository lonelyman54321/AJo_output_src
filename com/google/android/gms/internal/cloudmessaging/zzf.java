/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 */
package com.google.android.gms.internal.cloudmessaging;

import android.os.Handler;
import android.os.Looper;

public class zzf
extends Handler {
    private final Looper zza;

    public zzf() {
        Looper looper;
        this.zza = looper = Looper.getMainLooper();
    }

    public zzf(Looper looper) {
        super(looper);
        this.zza = looper = Looper.getMainLooper();
    }

    public zzf(Looper looper, Handler.Callback callback2) {
        super(looper, callback2);
        this.zza = looper = Looper.getMainLooper();
    }
}

