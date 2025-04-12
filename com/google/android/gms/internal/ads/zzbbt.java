/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
import com.google.android.gms.internal.ads.zzbbs;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

public final class zzbbt
extends zzbbo {
    private MessageDigest zzb;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte[] zzb(String object) {
        Object object2;
        Object object3 = " ";
        object = object.split((String)object3);
        int n3 = ((String[])object).length;
        int n4 = 4;
        int n7 = 1;
        if (n3 == n7) {
            int n8 = zzbbs.zza(object[0]);
            object3 = ByteBuffer.allocate(n4);
            object2 = ByteOrder.LITTLE_ENDIAN;
            ((ByteBuffer)object3).order((ByteOrder)object2);
            ((ByteBuffer)object3).putInt(n8);
            object = ((ByteBuffer)object3).array();
        } else {
            int n10 = 5;
            if (n3 < n10) {
                int n14;
                n3 += n3;
                object3 = new byte[n3];
                for (n10 = 0; n10 < (n14 = ((String[])object).length); n14 = (int)((byte)(n14 >> 8)), n10 += n7) {
                    String string2 = object[n10];
                    n14 = zzbbs.zza(string2);
                    char c2 = (char)n14;
                    n14 = n14 >> 16 ^ c2;
                    c2 = (char)n14;
                    byte[] byArray = new byte[2];
                    byArray[0] = c2;
                    byArray[n7] = n14;
                    c2 = byArray[0];
                    int n15 = n10 + n10;
                    object3[n15] = c2;
                    object3[n15 += n7] = n14;
                }
            } else {
                int n16;
                object3 = new byte[n3];
                for (n10 = 0; n10 < (n16 = ((String[])object).length); n10 += n7) {
                    String string3 = object[n10];
                    n16 = zzbbs.zza(string3);
                    int n17 = n16 & 0xFF;
                    int n18 = n16 >> 8;
                    int n19 = n16 >> 16;
                    n16 >>= 24;
                    n17 ^= (n18 &= 0xFF);
                    n18 = n19 & 0xFF;
                    n16 = (byte)(n16 ^ (n17 ^= n18));
                    object3[n10] = n16;
                }
            }
            object = object3;
        }
        this.zzb = object3 = this.zza();
        object3 = this.zza;
        synchronized (object3) {
            Throwable throwable2;
            block11: {
                try {
                    object2 = this.zzb;
                    if (object2 == null) {
                        return new byte[0];
                    }
                }
                catch (Throwable throwable2) {
                    break block11;
                }
                ((MessageDigest)object2).reset();
                object2 = this.zzb;
                ((MessageDigest)object2).update((byte[])object);
                object = this.zzb;
                object = object.digest();
                n7 = ((String[])object).length;
                if (n7 <= n4) {
                    n4 = n7;
                }
                object2 = new byte[n4];
                System.arraycopy(object, 0, object2, 0, n4);
                return object2;
            }
            throw throwable2;
        }
    }
}

