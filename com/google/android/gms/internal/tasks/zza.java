/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.internal.tasks;

import android.os.Handler;
import android.os.Looper;

public final class zza
extends Handler {
    private final Looper zza;

    public zza() {
        Looper looper;
        this.zza = looper = Looper.getMainLooper();
    }

    public zza(Looper looper) {
        super(looper);
        this.zza = looper = Looper.getMainLooper();
    }
}

