/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Surface
 */
package com.google.android.gms.internal.ads;

import android.view.Surface;
import com.google.android.gms.internal.ads.zzfk;

final class zzabr {
    public static void zza(Surface surface, float f5) {
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        object = object == false ? (Object)false : (Object)true;
        try {
            NB3.a(surface, f5, (int)object);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            zzfk.zzd("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", illegalStateException);
            return;
        }
    }
}

