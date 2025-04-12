/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzasq;
import com.google.android.gms.internal.ads.zzasr;
import com.google.android.gms.internal.ads.zzhjw;
import java.nio.ByteBuffer;

public abstract class zzhjy
extends zzhjw
implements zzasr {
    private int zza;

    public zzhjy(String string2) {
        super("mvhd");
    }

    public final int zzh() {
        boolean bl2 = this.zzc;
        if (!bl2) {
            this.zzg();
        }
        return this.zza;
    }

    public final long zzi(ByteBuffer byteBuffer) {
        int n3;
        this.zza = n3 = zzasq.zzc(byteBuffer.get());
        zzasq.zzd(byteBuffer);
        byteBuffer.get();
        return 4;
    }
}

