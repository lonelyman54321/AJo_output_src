/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhkb;
import java.nio.ByteBuffer;

final class zzcez
implements zzhkb {
    private final ByteBuffer zza;

    public zzcez(ByteBuffer byteBuffer) {
        this.zza = byteBuffer = byteBuffer.duplicate();
    }

    public final void close() {
    }

    public final int zza(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.zza;
        int n3 = byteBuffer2.remaining();
        if (n3 == 0 && (n3 = byteBuffer.remaining()) > 0) {
            return -1;
        }
        n3 = byteBuffer.remaining();
        int n4 = this.zza.remaining();
        n3 = Math.min(n3, n4);
        byte[] byArray = new byte[n3];
        this.zza.get(byArray);
        byteBuffer.put(byArray);
        return n3;
    }

    public final long zzb() {
        return this.zza.position();
    }

    public final long zzc() {
        return this.zza.limit();
    }

    public final ByteBuffer zzd(long l2, long l3) {
        ByteBuffer byteBuffer = this.zza;
        int n3 = (int)l2;
        int n4 = byteBuffer.position();
        byteBuffer.position(n3);
        ByteBuffer byteBuffer2 = this.zza.slice();
        int n7 = (int)l3;
        byteBuffer2.limit(n7);
        this.zza.position(n4);
        return byteBuffer2;
    }

    public final void zze(long l2) {
        ByteBuffer byteBuffer = this.zza;
        int n3 = (int)l2;
        byteBuffer.position(n3);
    }
}

