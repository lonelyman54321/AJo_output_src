/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghx;
import com.google.android.gms.internal.ads.zzgov;
import com.google.android.gms.internal.ads.zzgpl;
import com.google.android.gms.internal.ads.zzgqm;
import com.google.android.gms.internal.ads.zzgqq;
import com.google.android.gms.internal.ads.zzgwm;
import com.google.android.gms.internal.ads.zzhay;
import java.io.IOException;
import java.security.GeneralSecurityException;

public final class zzgie {
    public static zzghx zza(byte[] object) {
        Object object2;
        try {
            object2 = zzhay.zza();
        }
        catch (IOException iOException) {
            object2 = new GeneralSecurityException("Failed to parse proto", iOException);
            throw object2;
        }
        object = zzgwm.zzf(object, (zzhay)object2);
        object2 = zzgpl.zzc();
        object = zzgqm.zza((zzgwm)object);
        boolean bl2 = ((zzgpl)object2).zzk((zzgqq)object);
        object2 = !bl2 ? new zzgov((zzgqm)object) : ((zzgpl)object2).zzb((zzgqq)object);
        return object2;
    }

    public static byte[] zzb(zzghx zzghx2) {
        return ((zzgqm)zzgpl.zzc().zze(zzghx2, zzgqm.class)).zzc().zzaV();
    }
}

