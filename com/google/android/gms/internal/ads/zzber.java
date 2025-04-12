/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.os.StrictMode$ThreadPolicy$Builder
 */
package com.google.android.gms.internal.ads;

import android.os.StrictMode;
import com.google.android.gms.internal.ads.zzfyw;

public final class zzber {
    public static Object zza(zzfyw object) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.ThreadPolicy.Builder builder = new StrictMode.ThreadPolicy.Builder(threadPolicy);
            builder = builder.permitDiskReads();
            builder = builder.permitDiskWrites();
            builder = builder.build();
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)builder);
            object = object.zza();
            return object;
        }
        finally {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        }
    }
}

