/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgoc;
import com.google.android.gms.internal.ads.zzgsz;
import com.google.android.gms.internal.ads.zzgts;
import com.google.android.gms.internal.ads.zzgyd;
import com.google.android.gms.internal.ads.zzgyn;
import com.google.android.gms.internal.ads.zzgzc;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class zzgyy
implements zzgts {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzgyy(byte[] object) {
        zzgzc.zza(((byte[])object).length);
        Object object2 = new SecretKeySpec((byte[])object, "AES");
        this.zza = object2;
        object = zzgyy.zzb();
        object.init(1, (Key)object2);
        object2 = new byte[16];
        object = zzgsz.zza(object.doFinal((byte[])object2));
        this.zzb = object;
        object = zzgsz.zza(object);
        this.zzc = object;
    }

    private static Cipher zzb() {
        boolean bl2 = zzgoc.zza(1);
        if (bl2) {
            return (Cipher)zzgyn.zza.zza("AES/ECB/NoPadding");
        }
        GeneralSecurityException generalSecurityException = new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        throw generalSecurityException;
    }

    public final byte[] zza(byte[] object, int n3) {
        block3: {
            block6: {
                byte[] byArray;
                int n4;
                int n7;
                Cipher cipher;
                Object object2;
                int n8;
                block5: {
                    int n10;
                    int n14;
                    block4: {
                        n8 = 16;
                        if (n3 > n8) break block3;
                        object2 = this.zza;
                        cipher = zzgyy.zzb();
                        n14 = 1;
                        cipher.init(n14, (Key)object2);
                        n10 = ((byte[])object).length;
                        double d2 = n10;
                        double d5 = 16.0;
                        d2 = Math.ceil(d2 / d5);
                        n7 = (int)d2;
                        n14 = Math.max(n14, n7);
                        n7 = n14 + -1;
                        n4 = n7 * 16;
                        if ((n14 *= 16) != n10) break block4;
                        object2 = this.zzb;
                        object2 = zzgyd.zzd(object, n4, (byte[])object2, 0, n8);
                        break block5;
                    }
                    object2 = Arrays.copyOfRange(object, n4, n10);
                    n14 = ((Object)object2).length;
                    if (n14 >= n8) break block6;
                    object2 = Arrays.copyOf((byte[])object2, n8);
                    n4 = -128;
                    object2[n14] = n4;
                    byArray = this.zzc;
                    object2 = zzgyd.zzc((byte[])object2, byArray);
                }
                byArray = new byte[n8];
                for (n4 = 0; n4 < n7; ++n4) {
                    int n15 = n4 * 16;
                    byArray = zzgyd.zzd(byArray, 0, object, n15, n8);
                    byArray = cipher.doFinal(byArray);
                }
                object = zzgyd.zzc((byte[])object2, byArray);
                return Arrays.copyOf(cipher.doFinal((byte[])object), n3);
            }
            object = new IllegalArgumentException;
            object("x must be smaller than a block.");
            throw object;
        }
        object = new InvalidAlgorithmParameterException;
        object("outputLength too large, max is 16 bytes");
        throw object;
    }
}

