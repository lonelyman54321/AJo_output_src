/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgnj;
import com.google.android.gms.internal.ads.zzgyd;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

abstract class zzgnn {
    int[] zza;
    private final int zzb;

    public zzgnn(byte[] object, int n3) {
        int n4 = ((byte[])object).length;
        int n7 = 32;
        if (n4 == n7) {
            object = zzgnj.zze(object);
            this.zza = object;
            this.zzb = n3;
            return;
        }
        object = new InvalidKeyException;
        super("The key length in bytes must be 32.");
        throw object;
    }

    public abstract int zza();

    public abstract int[] zzb(int[] var1, int var2);

    public final ByteBuffer zzc(byte[] objectArray, int n3) {
        int n4;
        objectArray = zzgnj.zze(objectArray);
        objectArray = this.zzb((int[])objectArray, n3);
        Object object = (int[])objectArray.clone();
        zzgnj.zzc((int[])object);
        ByteOrder byteOrder = null;
        for (int i3 = 0; i3 < (n4 = 16); ++i3) {
            n4 = objectArray[i3];
            int n7 = object[i3];
            objectArray[i3] = n4 += n7;
        }
        object = ByteBuffer.allocate(64);
        byteOrder = ByteOrder.LITTLE_ENDIAN;
        object = ((ByteBuffer)object).order(byteOrder);
        ((ByteBuffer)object).asIntBuffer().put((int[])objectArray, 0, n4);
        return object;
    }

    public final byte[] zzd(byte[] object, ByteBuffer object2) {
        int n3 = ((Buffer)object2).remaining();
        ByteBuffer byteBuffer = ByteBuffer.allocate(n3);
        int n4 = ((byte[])object).length;
        int n7 = this.zza();
        if (n4 == n7) {
            int n8;
            n4 = ((Buffer)object2).remaining();
            n7 = n4 / 64;
            for (int i3 = 0; i3 < (n8 = n7 + 1); ++i3) {
                n8 = this.zzb + i3;
                ByteBuffer byteBuffer2 = this.zzc((byte[])object, n8);
                int n10 = 64;
                if (i3 == n7) {
                    n10 = n4 % 64;
                    zzgyd.zza(byteBuffer, (ByteBuffer)object2, byteBuffer2, n10);
                    continue;
                }
                zzgyd.zza(byteBuffer, (ByteBuffer)object2, byteBuffer2, n10);
            }
            return byteBuffer.array();
        }
        int n14 = this.zza();
        object = hj0_0.a(n14, "The nonce length (in bytes) must be ");
        object2 = new GeneralSecurityException((String)object);
        throw object2;
    }
}

