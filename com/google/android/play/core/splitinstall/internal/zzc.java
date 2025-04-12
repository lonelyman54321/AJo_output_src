/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.splitinstall.internal.zzb;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

final class zzc
implements zzb {
    private final FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzc(FileChannel fileChannel, long l2, long l3) {
        this.zza = fileChannel;
        this.zzb = l2;
        this.zzc = l3;
    }

    public final long zza() {
        return this.zzc;
    }

    public final void zzb(MessageDigest[] messageDigestArray, long l2, int n3) {
        int n4;
        long l3 = this.zzb;
        long l4 = l3 + l2;
        long l7 = n3;
        FileChannel fileChannel = this.zza;
        FileChannel.MapMode mapMode = FileChannel.MapMode.READ_ONLY;
        MappedByteBuffer mappedByteBuffer = fileChannel.map(mapMode, l4, l7);
        mappedByteBuffer.load();
        for (n3 = 0; n3 < (n4 = messageDigestArray.length); ++n3) {
            MessageDigest messageDigest = messageDigestArray[n3];
            mappedByteBuffer.position(0);
            messageDigest.update(mappedByteBuffer);
        }
    }
}

