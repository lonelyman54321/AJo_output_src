/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhjw;
import java.nio.ByteBuffer;

public final class zzasv
extends zzhjw {
    ByteBuffer zza;

    public zzasv(String string2) {
        super(string2);
    }

    public final void zzf(ByteBuffer byteBuffer) {
        this.zza = byteBuffer;
        int n3 = byteBuffer.position();
        int n4 = byteBuffer.remaining() + n3;
        byteBuffer.position(n4);
    }
}

