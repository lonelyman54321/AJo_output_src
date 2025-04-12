/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghh;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgje;
import com.google.android.gms.internal.ads.zzgoc;
import com.google.android.gms.internal.ads.zzgra;
import com.google.android.gms.internal.ads.zzgxz;
import com.google.android.gms.internal.ads.zzgya;
import com.google.android.gms.internal.ads.zzgzc;
import com.google.android.gms.internal.ads.zzgzf;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class zzgyb
implements zzggy {
    private static final ThreadLocal zza;
    private static final ThreadLocal zzb;
    private final byte[] zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final SecretKeySpec zzf;
    private final int zzg;

    static {
        ThreadLocal threadLocal = new zzgxz();
        zza = threadLocal;
        threadLocal = new zzgya();
        zzb = threadLocal;
    }

    private zzgyb(byte[] object, int n3, byte[] byArray) {
        int n4 = 1;
        int n7 = zzgoc.zza(n4);
        if (n7 != 0) {
            n7 = 12;
            int n8 = 16;
            if (n3 != n7 && n3 != n8) {
                object = new IllegalArgumentException;
                super("IV size should be either 12 or 16 bytes");
                throw object;
            }
            this.zzg = n3;
            zzgzc.zza(((byte[])object).length);
            Object object2 = new SecretKeySpec((byte[])object, "AES");
            this.zzf = object2;
            object = (Cipher)zza.get();
            object.init(n4, (Key)object2);
            object2 = new byte[n8];
            object = zzgyb.zzc(object.doFinal((byte[])object2));
            this.zzc = object;
            object = zzgyb.zzc(object);
            this.zzd = object;
            this.zze = byArray;
            return;
        }
        object = new GeneralSecurityException;
        super("Can not use AES-EAX in FIPS-mode.");
        throw object;
    }

    public static zzggy zzb(zzgje object) {
        boolean bl2 = zzgoc.zza(1);
        if (bl2) {
            Object object2 = ((zzgje)object).zzd();
            zzgic zzgic2 = zzghh.zza();
            object2 = ((zzgzf)object2).zzd(zzgic2);
            int n3 = ((zzgje)object).zzb().zzb();
            object = ((zzgje)object).zzc().zzc();
            zzgyb zzgyb2 = new zzgyb((byte[])object2, n3, (byte[])object);
            return zzgyb2;
        }
        object = new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        throw object;
    }

    private static byte[] zzc(byte[] byArray) {
        byte by2;
        int n3;
        int n4 = 16;
        byte[] byArray2 = new byte[n4];
        int n7 = 0;
        while (n7 < (n3 = 15)) {
            n3 = byArray[n7];
            n3 += n3;
            int n8 = n7 + 1;
            int n10 = (byArray[n8] & 0xFF) >>> 7;
            byArray2[n7] = n3 = (int)((byte)((n3 ^ n10) & 0xFF));
            n7 = n8;
        }
        n7 = byArray[n3];
        n7 += n7;
        byArray2[n3] = by2 = (byte)(byArray[0] >> 7 & 0x87 ^ n7);
        return byArray2;
    }

    private final byte[] zzd(Cipher cipher, int n3, byte[] byArray, int n4, int n7) {
        int n8;
        int n10 = 16;
        byte[] byArray2 = new byte[n10];
        int n14 = 15;
        byArray2[n14] = n3 = (int)((byte)n3);
        if (n7 == 0) {
            byte[] byArray3 = this.zzc;
            byArray3 = zzgyb.zzf(byArray2, byArray3);
            return cipher.doFinal(byArray3);
        }
        byte[] byArray4 = cipher.doFinal(byArray2);
        int n15 = 0;
        byArray2 = null;
        n14 = 0;
        while ((n8 = n7 - n14) > n10) {
            for (n8 = 0; n8 < n10; ++n8) {
                int n16 = n4 + n14;
                byte by2 = byArray4[n8];
                n16 += n8;
                byArray4[n8] = n16 = (int)((byte)(byArray[n16] ^ by2));
            }
            byArray4 = cipher.doFinal(byArray4);
            n14 += 16;
        }
        n14 += n4;
        n4 += n7;
        if ((n4 = (byArray = Arrays.copyOfRange(byArray, n14, n4)).length) == n10) {
            byte[] byArray5 = this.zzc;
            byArray = zzgyb.zzf(byArray, byArray5);
        } else {
            byte by4;
            byte[] byArray6 = Arrays.copyOf(this.zzd, n10);
            while (n15 < (n7 = byArray.length)) {
                n7 = byArray6[n15];
                n10 = byArray[n15];
                byArray6[n15] = n7 = (int)((byte)(n7 ^ n10));
                ++n15;
            }
            byArray6[n7] = by4 = (byte)(byArray6[n7] ^ 0x80);
            byArray = byArray6;
        }
        byArray4 = zzgyb.zzf(byArray4, byArray);
        return cipher.doFinal(byArray4);
    }

    private final byte[] zze(byte[] object, byte[] object2) {
        int n3 = ((byte[])object).length;
        int n4 = this.zzg;
        if ((n4 = n3 - n4 + -16) >= 0) {
            Object object3 = zza.get();
            Object object4 = object3;
            object4 = (Cipher)object3;
            object3 = this.zzf;
            int n7 = 1;
            ((Cipher)object4).init(n7, (Key)object3);
            int n8 = this.zzg;
            Object object5 = 0;
            byte[] byArray = this.zzd((Cipher)object4, 0, (byte[])object, 0, n8);
            int n10 = 0;
            if (object2 == null) {
                object2 = new byte[]{};
            }
            n8 = ((byte[])object2).length;
            object5 = 1;
            object2 = this.zzd((Cipher)object4, (int)object5, (byte[])object2, 0, n8);
            int n14 = 2;
            int n15 = this.zzg;
            object3 = this;
            object3 = this.zzd((Cipher)object4, n14, (byte[])object, n15, n4);
            n3 += -16;
            int n16 = 0;
            while (n10 < (n14 = 16)) {
                n14 = n3 + n10;
                n14 = object[n14];
                object5 = object2[n10];
                n14 ^= object5;
                object5 = byArray[n10];
                n14 ^= object5;
                object5 = object3[n10];
                n16 = (byte)(n16 | (n14 ^= object5));
                ++n10;
            }
            if (n16 == 0) {
                object2 = (Cipher)zzb.get();
                SecretKeySpec secretKeySpec = this.zzf;
                object3 = new Object(byArray);
                object2.init(n7, (Key)secretKeySpec, (AlgorithmParameterSpec)object3);
                n3 = this.zzg;
                return object2.doFinal((byte[])object, n3, n4);
            }
            object = new AEADBadTagException;
            object("tag mismatch");
            throw object;
        }
        object = new GeneralSecurityException;
        object("ciphertext too short");
        throw object;
    }

    private static byte[] zzf(byte[] byArray, byte[] byArray2) {
        int n3 = byArray.length;
        byte[] byArray3 = new byte[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            byte by2 = byArray[i3];
            byte by4 = byArray2[i3];
            byArray3[i3] = by2 = (byte)(by2 ^ by4);
        }
        return byArray3;
    }

    public final byte[] zza(byte[] object, byte[] byArray) {
        byte[] byArray2 = this.zze;
        int n3 = byArray2.length;
        if (n3 == 0) {
            return this.zze((byte[])object, byArray);
        }
        int n4 = zzgra.zzc(byArray2, object);
        if (n4 != 0) {
            byArray2 = this.zze;
            n3 = ((byte[])object).length;
            n4 = byArray2.length;
            object = Arrays.copyOfRange(object, n4, n3);
            return this.zze((byte[])object, byArray);
        }
        object = new GeneralSecurityException;
        object("Decryption failed (OutputPrefix mismatch).");
        throw object;
    }
}

