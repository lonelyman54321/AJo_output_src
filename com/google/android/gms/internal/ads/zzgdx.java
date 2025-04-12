/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;

public final class zzgdx {
    public static char zza(long l2) {
        char c2 = (char)l2;
        long l3 = c2;
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object == false;
        zzfyg.zzg(bl2, "Out of range: %s", l2);
        return c2;
    }

    public static char zzb(byte by2, byte by4) {
        by2 = (byte)(by2 << 8);
        by4 = (byte)(by4 & 0xFF);
        return (char)(by2 | by4);
    }
}

