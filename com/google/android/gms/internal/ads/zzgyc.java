/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghh;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgjq;
import com.google.android.gms.internal.ads.zzgnl;
import com.google.android.gms.internal.ads.zzgoc;
import com.google.android.gms.internal.ads.zzgra;
import com.google.android.gms.internal.ads.zzgzc;
import com.google.android.gms.internal.ads.zzgze;
import com.google.android.gms.internal.ads.zzgzf;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzgyc
implements zzggy {
    private final SecretKey zza;
    private final byte[] zzb;

    private zzgyc(byte[] object, zzgze zzgze2) {
        boolean bl2 = zzgoc.zza(2);
        if (bl2) {
            zzgzc.zza(((byte[])object).length);
            SecretKeySpec secretKeySpec = new SecretKeySpec((byte[])object, "AES");
            this.zza = secretKeySpec;
            object = zzgze2.zzc();
            this.zzb = object;
            return;
        }
        object = new GeneralSecurityException;
        super("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        throw object;
    }

    public static zzggy zzb(zzgjq object) {
        Object object2 = ((zzgjq)object).zzd();
        zzgic zzgic2 = zzghh.zza();
        object2 = ((zzgzf)object2).zzd(zzgic2);
        object = ((zzgjq)object).zzc();
        zzgyc zzgyc2 = new zzgyc((byte[])object2, (zzgze)object);
        return zzgyc2;
    }

    public final byte[] zza(byte[] object, byte[] byArray) {
        int n3 = 12;
        if (object != null) {
            int n4 = ((byte[])object).length;
            Object object2 = this.zzb;
            int n7 = ((byte[])object2).length + 28;
            if (n4 >= n7) {
                int n8 = zzgra.zzc(object2, object);
                if (n8 != 0) {
                    n8 = this.zzb.length;
                    Object object3 = new byte[n3];
                    System.arraycopy(object, n8, object3, 0, n3);
                    n8 = zzgnl.zza;
                    object2 = System.getProperty("java.vendor");
                    String string2 = "The Android Project";
                    Objects.equals(object2, string2);
                    object2 = new GCMParameterSpec;
                    object2(128, (byte[])object3, 0, n3);
                    object3 = this.zza;
                    Cipher cipher = zzgnl.zza();
                    int n10 = 2;
                    cipher.init(n10, (Key)object3, (AlgorithmParameterSpec)object2);
                    if (byArray != null && (n8 = byArray.length) != 0) {
                        cipher.updateAAD(byArray);
                    }
                    int n14 = this.zzb.length;
                    n4 = n4 - n14 + -12;
                    return cipher.doFinal((byte[])object, n3 += n14, n4);
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

