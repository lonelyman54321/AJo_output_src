/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghh;
import com.google.android.gms.internal.ads.zzghw;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgiq;
import com.google.android.gms.internal.ads.zzgra;
import com.google.android.gms.internal.ads.zzgts;
import com.google.android.gms.internal.ads.zzgxy;
import com.google.android.gms.internal.ads.zzgyd;
import com.google.android.gms.internal.ads.zzgyx;
import com.google.android.gms.internal.ads.zzgza;
import com.google.android.gms.internal.ads.zzgzb;
import com.google.android.gms.internal.ads.zzgzf;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

public final class zzgyf
implements zzggy {
    private final zzgyx zza;
    private final zzghw zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzgyf(zzgyx zzgyx2, zzghw zzghw2, int n3, byte[] byArray) {
        this.zza = zzgyx2;
        this.zzb = zzghw2;
        this.zzc = n3;
        this.zzd = byArray;
    }

    public static zzggy zzb(zzgiq object) {
        Object object2 = ((zzgiq)object).zzd();
        Object object3 = zzghh.zza();
        object2 = ((zzgzf)object2).zzd((zzgic)object3);
        int n3 = ((zzgiq)object).zzb().zzd();
        zzgxy zzgxy2 = new zzgxy((byte[])object2, n3);
        String string2 = String.valueOf(((zzgiq)object).zzb().zzg());
        Object object4 = ((zzgiq)object).zze();
        Object object5 = zzghh.zza();
        object4 = ((zzgzf)object4).zzd((zzgic)object5);
        object5 = "HMAC";
        SecretKeySpec secretKeySpec = new SecretKeySpec((byte[])object4, (String)object5);
        string2 = ((String)object5).concat(string2);
        object3 = new zzgza(string2, secretKeySpec);
        int n4 = ((zzgiq)object).zzb().zze();
        object2 = new zzgzb((zzgts)object3, n4);
        n3 = ((zzgiq)object).zzb().zze();
        object = ((zzgiq)object).zzc().zzc();
        zzgyf zzgyf2 = new zzgyf(zzgxy2, (zzghw)object2, n3, (byte[])object);
        return zzgyf2;
    }

    public final byte[] zza(byte[] object, byte[] byArray) {
        byte[] byArray2 = this.zzd;
        int n3 = this.zzc;
        int n4 = ((byte[])object).length;
        int n7 = byArray2.length;
        if (n4 >= (n3 += n7)) {
            int n8 = zzgra.zzc(byArray2, object);
            if (n8 != 0) {
                byArray2 = this.zzd;
                n3 = this.zzc;
                n3 = n4 - n3;
                n8 = byArray2.length;
                byArray2 = Arrays.copyOfRange(object, n8, n3);
                n3 = this.zzc;
                n3 = n4 - n3;
                object = Arrays.copyOfRange(object, n3, n4);
                if (byArray == null) {
                    byArray = new byte[]{};
                }
                n3 = 8;
                Object object2 = ByteBuffer.allocate(n3);
                long l2 = byArray.length;
                long l3 = 8;
                byte[] byArray3 = Arrays.copyOf(((ByteBuffer)object2).putLong(l2 *= l3).array(), n3);
                object2 = this.zzb;
                n4 = 3;
                byte[][] byArrayArray = new byte[n4][];
                byArrayArray[0] = byArray;
                byArrayArray[1] = byArray2;
                int n10 = 2;
                byArrayArray[n10] = byArray3;
                byArray = zzgyd.zzb(byArrayArray);
                boolean bl2 = MessageDigest.isEqual(byArray = ((zzgzb)(object2 = (zzgzb)object2)).zzc(byArray), object);
                if (bl2) {
                    return this.zza.zza(byArray2);
                }
                object = new GeneralSecurityException;
                object("invalid MAC");
                throw object;
            }
            object = new GeneralSecurityException;
            object("Decryption failed (OutputPrefix mismatch).");
            throw object;
        }
        object = new GeneralSecurityException;
        object("Decryption failed (ciphertext too short).");
        throw object;
    }
}

