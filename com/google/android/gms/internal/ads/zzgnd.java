/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghh;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgkn;
import com.google.android.gms.internal.ads.zzgnc;
import com.google.android.gms.internal.ads.zzgoc;
import com.google.android.gms.internal.ads.zzgra;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.android.gms.internal.ads.zzgzf;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzgnd
implements zzggy {
    private static final byte[] zza = zzgyw.zza("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    private static final byte[] zzb = zzgyw.zza("070000004041424344454647");
    private static final byte[] zzc = zzgyw.zza("a0784d7a4716f3feb4f64e7f4b39bf04");
    private static final ThreadLocal zzd;
    private final SecretKey zze;
    private final byte[] zzf;

    static {
        zzgnc zzgnc2 = new zzgnc();
        zzd = zzgnc2;
    }

    private zzgnd(byte[] object, byte[] byArray) {
        int n3 = zzgoc.zza(1);
        if (n3 != 0) {
            n3 = zzgnd.zze();
            if (n3 != 0) {
                n3 = ((byte[])object).length;
                int n4 = 32;
                if (n3 == n4) {
                    SecretKeySpec secretKeySpec = new SecretKeySpec((byte[])object, "ChaCha20");
                    this.zze = secretKeySpec;
                    this.zzf = byArray;
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

    public static zzggy zzb(zzgkn object) {
        Object object2 = ((zzgkn)object).zzd();
        zzgic zzgic2 = zzghh.zza();
        object2 = ((zzgzf)object2).zzd(zzgic2);
        object = ((zzgkn)object).zzc().zzc();
        zzgnd zzgnd2 = new zzgnd((byte[])object2, (byte[])object);
        return zzgnd2;
    }

    public static Cipher zzc() {
        return (Cipher)zzd.get();
    }

    public static /* bridge */ /* synthetic */ boolean zzd(Cipher cipher) {
        return zzgnd.zzf(cipher);
    }

    public static boolean zze() {
        Object t3 = zzd.get();
        return t3 != null;
    }

    private static boolean zzf(Cipher object) {
        Object object2;
        int n3;
        byte[] byArray;
        IvParameterSpec ivParameterSpec;
        Object object3;
        String string2;
        block14: {
            string2 = "ChaCha20";
            try {
                object3 = zzb;
            }
            catch (GeneralSecurityException generalSecurityException) {
                return false;
            }
            ivParameterSpec = new IvParameterSpec((byte[])object3);
            object3 = new SecretKeySpec;
            byArray = zza;
            object3(byArray, string2);
            n3 = 2;
            ((Cipher)object).init(n3, (Key)object3, ivParameterSpec);
            object3 = zzc;
            object2 = ((Cipher)object).doFinal((byte[])object3);
            int n4 = ((byte[])object2).length;
            if (n4 == 0) break block14;
            return false;
        }
        object2 = new SecretKeySpec;
        object2(byArray, string2);
        ((Cipher)object).init(n3, (Key)object2, ivParameterSpec);
        object = ((Cipher)object).doFinal((byte[])object3);
        int n7 = ((Object)object).length;
        return n7 == 0;
    }

    public final byte[] zza(byte[] object, byte[] byArray) {
        if (object != null) {
            int n3 = ((byte[])object).length;
            Object object2 = this.zzf;
            int n4 = ((byte[])object2).length + 28;
            if (n3 >= n4) {
                int n7 = zzgra.zzc(object2, object);
                if (n7 != 0) {
                    n7 = this.zzf.length;
                    n4 = 12;
                    byte[] byArray2 = new byte[n4];
                    System.arraycopy(object, n7, byArray2, 0, n4);
                    object2 = new IvParameterSpec;
                    object2(byArray2);
                    Cipher cipher = (Cipher)zzd.get();
                    int n8 = 2;
                    SecretKey secretKey = this.zze;
                    cipher.init(n8, (Key)secretKey, (AlgorithmParameterSpec)object2);
                    if (byArray != null && (n7 = byArray.length) != 0) {
                        cipher.updateAAD(byArray);
                    }
                    int n10 = this.zzf.length;
                    n7 = n10 + 12;
                    n3 = n3 - n10 + -12;
                    return cipher.doFinal((byte[])object, n7, n3);
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

