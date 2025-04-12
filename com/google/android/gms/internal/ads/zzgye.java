/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghh;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgkn;
import com.google.android.gms.internal.ads.zzgno;
import com.google.android.gms.internal.ads.zzgra;
import com.google.android.gms.internal.ads.zzgzf;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzgye
implements zzggy {
    private final zzgno zza;
    private final byte[] zzb;

    private zzgye(byte[] byArray, byte[] byArray2) {
        zzgno zzgno2;
        this.zza = zzgno2 = new zzgno(byArray);
        this.zzb = byArray2;
    }

    public static zzggy zzb(zzgkn object) {
        Object object2 = ((zzgkn)object).zzd();
        zzgic zzgic2 = zzghh.zza();
        object2 = ((zzgzf)object2).zzd(zzgic2);
        object = ((zzgkn)object).zzc().zzc();
        zzgye zzgye2 = new zzgye((byte[])object2, (byte[])object);
        return zzgye2;
    }

    private final byte[] zzc(byte[] object, byte[] byArray) {
        int n3 = ((byte[])object).length;
        int n4 = 28;
        if (n3 >= n4) {
            n4 = 12;
            byte[] byArray2 = Arrays.copyOf(object, n4);
            object = ByteBuffer.wrap(object, n4, n3 += -12);
            return this.zza.zzb((ByteBuffer)object, byArray2, byArray);
        }
        object = new GeneralSecurityException;
        object("ciphertext too short");
        throw object;
    }

    public final byte[] zza(byte[] object, byte[] byArray) {
        byte[] byArray2 = this.zzb;
        int n3 = byArray2.length;
        if (n3 == 0) {
            return this.zzc((byte[])object, byArray);
        }
        int n4 = zzgra.zzc(byArray2, object);
        if (n4 != 0) {
            byArray2 = this.zzb;
            n3 = ((byte[])object).length;
            n4 = byArray2.length;
            object = Arrays.copyOfRange(object, n4, n3);
            return this.zzc((byte[])object, byArray);
        }
        object = new GeneralSecurityException;
        object("Decryption failed (OutputPrefix mismatch).");
        throw object;
    }
}

