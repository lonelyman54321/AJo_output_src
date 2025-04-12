/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class zzgyd {
    public static final void zza(ByteBuffer object, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int n3) {
        int n4;
        if (n3 >= 0 && (n4 = byteBuffer.remaining()) >= n3 && (n4 = byteBuffer2.remaining()) >= n3 && (n4 = ((Buffer)object).remaining()) >= n3) {
            for (n4 = 0; n4 < n3; ++n4) {
                byte by2 = byteBuffer.get();
                byte by4 = byteBuffer2.get();
                by2 = (byte)(by2 ^ by4);
                ((ByteBuffer)object).put(by2);
            }
            return;
        }
        object = new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        throw object;
    }

    public static byte[] zzb(byte[] ... object) {
        int n3;
        int n4;
        byte[] byArray = null;
        int n7 = 0;
        for (int i3 = 0; i3 < (n4 = ((byte[][])object).length); ++i3) {
            byte[] byArray2 = object[i3];
            n4 = byArray2.length;
            n3 = (-1 >>> 1) - n4;
            if (n7 <= n3) {
                n7 += n4;
                continue;
            }
            object = new GeneralSecurityException;
            object("exceeded size limit");
            throw object;
        }
        byArray = new byte[n7];
        n3 = 0;
        for (n7 = 0; n7 < n4; ++n7) {
            byte[] byArray3 = object[n7];
            int n8 = byArray3.length;
            System.arraycopy(byArray3, 0, byArray, n3, n8);
            n3 += n8;
        }
        return byArray;
    }

    public static final byte[] zzc(byte[] object, byte[] byArray) {
        int n3 = ((byte[])object).length;
        int n4 = byArray.length;
        if (n3 == n4) {
            return zzgyd.zzd(object, 0, byArray, 0, n3);
        }
        object = new IllegalArgumentException;
        object("The lengths of x and y should match.");
        throw object;
    }

    public static final byte[] zzd(byte[] object, int n3, byte[] byArray, int n4, int n7) {
        int n8 = ((byte[])object).length - n7;
        if (n8 >= n3 && (n8 = byArray.length - n7) >= n4) {
            byte[] byArray2 = new byte[n7];
            for (int i3 = 0; i3 < n7; ++i3) {
                int n10 = i3 + n3;
                n10 = object[n10];
                int n14 = i3 + n4;
                n14 = byArray[n14];
                byArray2[i3] = n10 = (int)((byte)(n10 ^ n14));
            }
            return byArray2;
        }
        object = new IllegalArgumentException;
        object("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        throw object;
    }
}

