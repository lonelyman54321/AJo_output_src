/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzasq {
    public static double zza(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[4];
        byteBuffer.get(byArray);
        int n3 = byArray[0] << 24;
        int n4 = byArray[1] << 16;
        int n7 = byArray[2] << 8;
        int n8 = byArray[3] & 0xFF;
        n3 &= 0xFF000000;
        n4 = 0xFF00 & n7;
        return (double)((n3 |= (n4 &= 0xFF0000)) | n4 | n8) / 1.073741824E9;
    }

    public static double zzb(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[4];
        byteBuffer.get(byArray);
        int n3 = byArray[0] << 24;
        int n4 = byArray[1] << 16;
        int n7 = byArray[2] << 8;
        int n8 = byArray[3] & 0xFF;
        n3 &= 0xFF000000;
        n4 = 0xFF00 & n7;
        return (double)((n3 |= (n4 &= 0xFF0000)) | n4 | n8) / 65536.0;
    }

    public static int zzc(byte by2) {
        if (by2 < 0) {
            by2 = (byte)(by2 + 256);
        }
        return by2;
    }

    public static int zzd(ByteBuffer byteBuffer) {
        int n3 = zzasq.zzc(byteBuffer.get());
        int n4 = zzasq.zzc(byteBuffer.get());
        return (n3 << 8) + n4;
    }

    public static long zze(ByteBuffer byteBuffer) {
        long l2;
        long l3 = byteBuffer.getInt();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object < 0) {
            l2 = 0x100000000L;
            l3 += l2;
        }
        return l3;
    }

    public static long zzf(ByteBuffer object) {
        long l2 = zzasq.zze((ByteBuffer)object);
        int n3 = 32;
        long l3 = 0L;
        long l4 = (l2 <<= n3) - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 >= 0) {
            return zzasq.zze((ByteBuffer)object) + l2;
        }
        object = new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        throw object;
    }
}

