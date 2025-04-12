/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbn$zza;
import java.nio.ByteBuffer;

final class zzbn$zzb
extends zzbn$zza {
    private final ByteBuffer zzga;
    private int zzgb;

    public zzbn$zzb(ByteBuffer byteBuffer) {
        int n3;
        byte[] byArray = byteBuffer.array();
        int n4 = byteBuffer.arrayOffset();
        int n7 = byteBuffer.position() + n4;
        n4 = byteBuffer.remaining();
        super(byArray, n7, n4);
        this.zzga = byteBuffer;
        this.zzgb = n3 = byteBuffer.position();
    }

    public final void flush() {
        ByteBuffer byteBuffer = this.zzga;
        int n3 = this.zzgb;
        int n4 = this.zzai();
        byteBuffer.position(n3 += n4);
    }
}

