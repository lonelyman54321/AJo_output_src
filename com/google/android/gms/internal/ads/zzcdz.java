/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.os.Looper;
import com.google.android.gms.internal.ads.zzceb;

final class zzcdz
implements Runnable {
    public zzcdz(zzceb zzceb2) {
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}

