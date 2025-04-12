/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 */
package com.google.android.gms.internal.gtm;

import android.os.Handler;
import android.os.Looper;

public class zzfy
extends Handler {
    public zzfy() {
        Looper.getMainLooper();
    }

    public zzfy(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }

    public zzfy(Looper looper, Handler.Callback callback2) {
        super(looper, callback2);
        Looper.getMainLooper();
    }
}

