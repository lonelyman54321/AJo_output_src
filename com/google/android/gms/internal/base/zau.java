/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 */
package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;

public class zau
extends Handler {
    private final Looper zaa;

    public zau() {
        Looper looper;
        this.zaa = looper = Looper.getMainLooper();
    }

    public zau(Looper looper) {
        super(looper);
        this.zaa = looper = Looper.getMainLooper();
    }

    public zau(Looper looper, Handler.Callback callback2) {
        super(looper, callback2);
        this.zaa = looper = Looper.getMainLooper();
    }
}

