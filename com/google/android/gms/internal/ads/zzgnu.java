/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghh;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgmb;
import com.google.android.gms.internal.ads.zzgnd;
import com.google.android.gms.internal.ads.zzgnj;
import com.google.android.gms.internal.ads.zzgoc;
import com.google.android.gms.internal.ads.zzgra;
import com.google.android.gms.internal.ads.zzgzf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzgnu
implements zzggy {
    private final byte[] zza;
    private final byte[] zzb;

    private zzgnu(byte[] object, byte[] byArray) {
        int n3 = zzgoc.zza(1);
        if (n3 != 0) {
            n3 = zzgnu.zzc();
            if (n3 != 0) {
                n3 = ((byte[])object).length;
                int n4 = 32;
                if (n3 == n4) {
                    this.zza = object;
                    this.zzb = byArray;
                    return;
                }
                object = new InvalidKeyException;
                super("The key length in bytes must be 32.");
                throw object;
            }
            object = new GeneralSecurityException;
            super("JCE does not support algorithm: ChaCha20-Poly1305");
            throw object;
        }
        object = new GeneralSecurityException;
        super("Can not use ChaCha20Poly1305 in FIPS-mode.");
        throw object;
    }

    public static zzggy zzb(zzgmb object) {
        Object object2 = ((zzgmb)object).zzd();
        zzgic zzgic2 = zzghh.zza();
        object2 = ((zzgzf)object2).zzd(zzgic2);
        object = ((zzgmb)object).zzc().zzc();
        zzgnu zzgnu2 = new zzgnu((byte[])object2, (byte[])object);
        return zzgnu2;
    }

    public static boolean zzc() {
        Cipher cipher = zzgnd.zzc();
        return cipher != null;
    }

    public final byte[] zza(byte[] object, byte[] byArray) {
        if (object != null) {
            int n3 = ((byte[])object).length;
            Object object2 = this.zzb;
            int n4 = ((byte[])object2).length + 40;
            if (n3 >= n4) {
                int n7 = zzgra.zzc(object2, object);
                if (n7 != 0) {
                    n7 = this.zzb.length;
                    n4 = 24;
                    Object object3 = new byte[n4];
                    System.arraycopy(object, n7, object3, 0, n4);
                    object2 = zzgnj.zze(this.zza);
                    Object object4 = zzgnj.zze((byte[])object3);
                    object2 = zzgnj.zzd(object2, (int[])object4);
                    n4 = ((byte[])object2).length * 4;
                    object4 = ByteBuffer.allocate(n4);
                    Object object5 = ByteOrder.LITTLE_ENDIAN;
                    object4 = ((ByteBuffer)object4).order((ByteOrder)object5);
                    ((ByteBuffer)object4).asIntBuffer().put((int[])object2);
                    object2 = ((ByteBuffer)object4).array();
                    object4 = new SecretKeySpec((byte[])object2, "ChaCha20");
                    object2 = new IvParameterSpec;
                    int n8 = 12;
                    object5 = new byte[n8];
                    int n10 = 8;
                    int n14 = 16;
                    System.arraycopy(object3, n14, object5, 4, n10);
                    object2((byte[])object5);
                    object3 = zzgnd.zzc();
                    int n15 = 2;
                    ((Cipher)object3).init(n15, (Key)object4, (AlgorithmParameterSpec)object2);
                    if (byArray != null && (n7 = byArray.length) != 0) {
                        ((Cipher)object3).updateAAD(byArray);
                    }
                    int n16 = this.zzb.length;
                    n7 = n16 + 24;
                    n3 = n3 - n16 + -24;
                    return ((Cipher)object3).doFinal((byte[])object, n7, n3);
                }
                object = new GeneralSecurityException;
                object("Decryption failed (OutputPrefix mismatch).");
                throw object;
            }
            object = new GeneralSecurityException;
            object("ciphertext too short");
            throw object;
        }
        object = new NullPointerException;
        object("ciphertext is null");
        throw object;
    }
}

