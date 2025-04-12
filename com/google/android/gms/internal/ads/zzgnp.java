/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgnn;
import com.google.android.gms.internal.ads.zzgnt;
import com.google.android.gms.internal.ads.zzgoc;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

abstract class zzgnp {
    private final zzgnn zza;
    private final zzgnn zzb;

    public zzgnp(byte[] object) {
        int n3 = 1;
        boolean bl2 = zzgoc.zza(n3);
        if (bl2) {
            zzgnn zzgnn2;
            this.zza = zzgnn2 = this.zza((byte[])object, n3);
            object = this.zza((byte[])object, 0);
            this.zzb = object;
            return;
        }
        object = new GeneralSecurityException;
        super("Can not use ChaCha20Poly1305 in FIPS-mode.");
        throw object;
    }

    public abstract zzgnn zza(byte[] var1, int var2);

    public final byte[] zzb(ByteBuffer object, byte[] object2, byte[] byArray) {
        int n3;
        int n4 = ((Buffer)object).remaining();
        if (n4 >= (n3 = 16)) {
            block22: {
                Object object3;
                n4 = ((Buffer)object).position();
                byte[] byArray2 = new byte[n3];
                int n7 = ((Buffer)object).limit() + -16;
                ((ByteBuffer)object).position(n7);
                ((ByteBuffer)object).get(byArray2);
                ((ByteBuffer)object).position(n4);
                n7 = ((Buffer)object).limit() + -16;
                ((ByteBuffer)object).limit(n7);
                n7 = 0;
                ByteBuffer byteBuffer = null;
                if (byArray == null) {
                    byArray = new byte[]{};
                }
                try {
                    object3 = this.zzb;
                }
                catch (GeneralSecurityException generalSecurityException) {
                    object2 = new AEADBadTagException;
                    String string2 = ((Object)generalSecurityException).toString();
                    object2(string2);
                    throw object2;
                }
                byteBuffer = ((zzgnn)object3).zzc((byte[])object2, 0);
                int n8 = 32;
                object3 = new byte[n8];
                byteBuffer.get((byte[])object3);
                n7 = byArray.length;
                int n10 = n7 & 0xF;
                int n14 = n10 == 0 ? n7 : n7 + 16 - n10;
                n10 = ((Buffer)object).remaining();
                int n15 = n10 % 16;
                int n16 = n15 == 0 ? n10 : n10 + 16 - n15;
                n15 = (n16 += n14) + 16;
                ByteBuffer byteBuffer2 = ByteBuffer.allocate(n15);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBuffer2 = byteBuffer2.order(byteOrder);
                byteBuffer2.put(byArray);
                byteBuffer2.position(n14);
                byteBuffer2.put((ByteBuffer)object);
                byteBuffer2.position(n16);
                long l2 = n7;
                byteBuffer2.putLong(l2);
                long l3 = n10;
                byteBuffer2.putLong(l3);
                byArray = byteBuffer2.array();
                byArray = zzgnt.zza((byte[])object3, byArray);
                boolean bl2 = MessageDigest.isEqual(byArray, byArray2);
                if (!bl2) break block22;
                ((ByteBuffer)object).position(n4);
                return this.zza.zzd((byte[])object2, (ByteBuffer)object);
            }
            object2 = "invalid MAC";
            object = new GeneralSecurityException((String)object2);
            throw object;
        }
        object = new GeneralSecurityException("ciphertext too short");
        throw object;
    }
}

