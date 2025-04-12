/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzfb;
import com.google.android.gms.internal.ads.zzfw;

public interface zzer {
    public static final zzer zza;

    static {
        zzfw zzfw2 = new zzfw();
        zza = zzfw2;
    }

    public long zza();

    public zzfb zzb(Looper var1, Handler.Callback var2);
}

