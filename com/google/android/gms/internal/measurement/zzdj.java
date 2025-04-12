/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

public final class zzdj
extends Handler {
    public zzdj() {
        Looper.getMainLooper();
    }

    public zzdj(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}

