/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgze;
import java.nio.ByteBuffer;

public final class zzgpm {
    public static final zzgze zza = zzgze.zzb(new byte[0]);

    public static final zzgze zza(int n3) {
        return zzgze.zzb(ByteBuffer.allocate(5).put((byte)0).putInt(n3).array());
    }

    public static final zzgze zzb(int n3) {
        return zzgze.zzb(ByteBuffer.allocate(5).put((byte)1).putInt(n3).array());
    }
}

