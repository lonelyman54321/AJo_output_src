/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghh;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgkd;
import com.google.android.gms.internal.ads.zzgoa;
import com.google.android.gms.internal.ads.zzgra;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.android.gms.internal.ads.zzgzc;
import com.google.android.gms.internal.ads.zzgzf;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzgob
implements zzggy {
    private static final byte[] zza = zzgyw.zza("7a806c");
    private static final byte[] zzb = zzgyw.zza("46bb91c3c5");
    private static final byte[] zzc = zzgyw.zza("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] zzd = zzgyw.zza("bae8e37fc83441b16034566b");
    private static final byte[] zze = zzgyw.zza("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    private static final ThreadLocal zzf;
    private final SecretKey zzg;
    private final byte[] zzh;

    static {
        zzgoa zzgoa2 = new zzgoa();
        zzf = zzgoa2;
    }

    private zzgob(byte[] byArray, byte[] object) {
        this.zzh = object;
        zzgzc.zza(byArray.length);
        object = new SecretKeySpec;
        super(byArray, "AES");
        this.zzg = object;
    }

    public static zzggy zzb(zzgkd object) {
        Object object2 = ((zzgkd)object).zzd();
        zzgic zzgic2 = zzghh.zza();
        object2 = ((zzgzf)object2).zzd(zzgic2);
        object = ((zzgkd)object).zzc().zzc();
        zzgob zzgob2 = new zzgob((byte[])object2, (byte[])object);
        return zzgob2;
    }

    public static /* bridge */ /* synthetic */ boolean zzc(Cipher cipher) {
        return zzgob.zze(cipher);
    }

    private static AlgorithmParameterSpec zzd(byte[] byArray, int n3, int n4) {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, byArray, 0, n4);
        return gCMParameterSpec;
    }

    private static boolean zze(Cipher object) {
        Object object2;
        try {
            object2 = zzd;
        }
        catch (GeneralSecurityException generalSecurityException) {
            return false;
        }
        int n3 = ((byte[])object2).length;
        object2 = zzgob.zzd(object2, 0, n3);
        byte[] byArray = zzc;
        String string2 = "AES";
        SecretKeySpec secretKeySpec = new SecretKeySpec(byArray, string2);
        int n4 = 2;
        ((Cipher)object).init(n4, (Key)secretKeySpec, (AlgorithmParameterSpec)object2);
        object2 = zzb;
        ((Cipher)object).updateAAD((byte[])object2);
        object2 = zze;
        n3 = ((byte[])object2).length;
        object = ((Cipher)object).doFinal((byte[])object2, 0, n3);
        object2 = zza;
        return MessageDigest.isEqual((byte[])object, object2);
    }

    private final byte[] zzf(byte[] object, byte[] byArray) {
        Cipher cipher = (Cipher)zzf.get();
        if (cipher != null) {
            int n3 = ((byte[])object).length;
            int n4 = 28;
            if (n3 >= n4) {
                n4 = 0;
                int n7 = 12;
                AlgorithmParameterSpec algorithmParameterSpec = zzgob.zzd(object, 0, n7);
                int n8 = 2;
                SecretKey secretKey = this.zzg;
                cipher.init(n8, (Key)secretKey, algorithmParameterSpec);
                if (byArray != null && (n4 = byArray.length) != 0) {
                    cipher.updateAAD(byArray);
                }
                return cipher.doFinal((byte[])object, n7, n3 += -12);
            }
            object = new GeneralSecurityException;
            object("ciphertext too short");
            throw object;
        }
        object = new GeneralSecurityException;
        object("AES GCM SIV cipher is not available or is invalid.");
        throw object;
    }

    public final byte[] zza(byte[] object, byte[] byArray) {
        byte[] byArray2 = this.zzh;
        int n3 = byArray2.length;
        if (n3 == 0) {
            return this.zzf((byte[])object, byArray);
        }
        int n4 = zzgra.zzc(byArray2, object);
        if (n4 != 0) {
            byArray2 = this.zzh;
            n3 = ((byte[])object).length;
            n4 = byArray2.length;
            object = Arrays.copyOfRange(object, n4, n3);
            return this.zzf((byte[])object, byArray);
        }
        object = new GeneralSecurityException;
        object("Decryption failed (OutputPrefix mismatch).");
        throw object;
    }
}

