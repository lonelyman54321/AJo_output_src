/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgoc;
import com.google.android.gms.internal.ads.zzgxx;
import com.google.android.gms.internal.ads.zzgyx;
import com.google.android.gms.internal.ads.zzgzc;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzgxy
implements zzgyx {
    private static final ThreadLocal zza;
    private final SecretKeySpec zzb;
    private final int zzc;
    private final int zzd;

    static {
        zzgxx zzgxx2 = new zzgxx();
        zza = zzgxx2;
    }

    public zzgxy(byte[] object, int n3) {
        int n4 = zzgoc.zza(2);
        if (n4 != 0) {
            int n7;
            SecretKeySpec secretKeySpec;
            n4 = ((byte[])object).length;
            zzgzc.zza(n4);
            String string2 = "AES";
            this.zzb = secretKeySpec = new SecretKeySpec((byte[])object, string2);
            object = (Cipher)zza.get();
            this.zzd = n7 = ((Cipher)object).getBlockSize();
            if (n3 <= n7) {
                this.zzc = n3;
                return;
            }
            object = new GeneralSecurityException("invalid IV size");
            throw object;
        }
        object = new GeneralSecurityException;
        super("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        throw object;
    }

    public final byte[] zza(byte[] object) {
        int n3 = ((byte[])object).length;
        int n4 = this.zzc;
        if (n3 >= n4) {
            Object object2 = new byte[n4];
            System.arraycopy(object, 0, object2, 0, n4);
            int n7 = this.zzc;
            byte[] byArray = new byte[n3 -= n7];
            Cipher cipher = (Cipher)zza.get();
            int n8 = this.zzd;
            int n10 = this.zzc;
            Object object3 = new byte[n8];
            System.arraycopy(object2, 0, object3, 0, n10);
            object2 = new IvParameterSpec;
            object2((byte[])object3);
            int n14 = 2;
            object3 = this.zzb;
            cipher.init(n14, (Key)object3, (AlgorithmParameterSpec)object2);
            object3 = object;
            n10 = n3;
            int n15 = cipher.doFinal((byte[])object, n7, n3, byArray, 0);
            if (n15 == n3) {
                return byArray;
            }
            object = new GeneralSecurityException;
            object("stored output's length does not match input's length");
            throw object;
        }
        object = new GeneralSecurityException;
        object("ciphertext too short");
        throw object;
    }
}

