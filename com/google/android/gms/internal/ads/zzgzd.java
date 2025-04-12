/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghh;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgmb;
import com.google.android.gms.internal.ads.zzgnr;
import com.google.android.gms.internal.ads.zzgra;
import com.google.android.gms.internal.ads.zzgzf;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzgzd
implements zzggy {
    private final zzgnr zza;
    private final byte[] zzb;

    private zzgzd(byte[] byArray, byte[] byArray2) {
        zzgnr zzgnr2;
        this.zza = zzgnr2 = new zzgnr(byArray);
        this.zzb = byArray2;
    }

    public static zzggy zzb(zzgmb object) {
        Object object2 = ((zzgmb)object).zzd();
        zzgic zzgic2 = zzghh.zza();
        object2 = ((zzgzf)object2).zzd(zzgic2);
        object = ((zzgmb)object).zzc().zzc();
        zzgzd zzgzd2 = new zzgzd((byte[])object2, (byte[])object);
        return zzgzd2;
    }

    private final byte[] zzc(byte[] object, byte[] byArray) {
        int n3 = ((byte[])object).length;
        int n4 = 40;
        if (n3 >= n4) {
            n4 = 24;
            byte[] byArray2 = Arrays.copyOf(object, n4);
            object = ByteBuffer.wrap(object, n4, n3 += -24);
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

