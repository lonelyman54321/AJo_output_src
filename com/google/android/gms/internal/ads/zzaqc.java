/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaqd;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class zzaqc
implements zzaqd {
    private final ByteBuffer zza;

    public zzaqc(ByteBuffer byteBuffer) {
        this.zza = byteBuffer = byteBuffer.slice();
    }

    public final long zza() {
        return this.zza.capacity();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(MessageDigest[] messageDigestArray, long l2, int n3) {
        ByteBuffer byteBuffer;
        int n4;
        Object object;
        ByteBuffer byteBuffer2 = this.zza;
        synchronized (byteBuffer2) {
            object = this.zza;
            n4 = (int)l2;
            ((ByteBuffer)object).position(n4);
            byteBuffer = this.zza;
            byteBuffer.limit(n4 += n3);
            byteBuffer = this.zza;
            byteBuffer = byteBuffer.slice();
        }
        n4 = messageDigestArray.length;
        n3 = 0;
        int n7 = 0;
        byteBuffer2 = null;
        while (n7 < n4) {
            object = messageDigestArray[n7];
            byteBuffer.position(0);
            ((MessageDigest)object).update(byteBuffer);
            ++n7;
        }
        return;
    }
}

