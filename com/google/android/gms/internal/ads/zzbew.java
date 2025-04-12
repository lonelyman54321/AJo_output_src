/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbfe;

public final class zzbew {
    public static boolean zza(zzbfe zzbfe2, zzbfb zzbfb2, String ... stringArray) {
        if (zzbfb2 == null) {
            return false;
        }
        long l2 = zzu.zzB().elapsedRealtime();
        zzbfe2.zze(zzbfb2, l2, stringArray);
        return true;
    }
}

