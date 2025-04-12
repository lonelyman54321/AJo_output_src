/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.SystemClock
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzfb;
import com.google.android.gms.internal.ads.zzfz;

public final class zzfw
implements zzer {
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }

    public final zzfb zzb(Looper looper, Handler.Callback callback2) {
        Handler handler = new Handler(looper, callback2);
        zzfz zzfz2 = new zzfz(handler);
        return zzfz2;
    }
}

