/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class zzfuv
extends Handler {
    private final Looper zza;

    public zzfuv() {
        Looper looper;
        this.zza = looper = Looper.getMainLooper();
    }

    public zzfuv(Looper looper) {
        super(looper);
        this.zza = looper = Looper.getMainLooper();
    }

    public final void dispatchMessage(Message message) {
        this.zza(message);
    }

    public void zza(Message message) {
        super.dispatchMessage(message);
    }
}

