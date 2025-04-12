/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghx;
import com.google.android.gms.internal.ads.zzgie;
import com.google.android.gms.internal.ads.zzgpl;
import com.google.android.gms.internal.ads.zzgqm;
import com.google.android.gms.internal.ads.zzgqz;
import com.google.android.gms.internal.ads.zzgwm;
import java.security.GeneralSecurityException;

public final class zzghl {
    public static final zzghx zza(zzghx zzghx2) {
        if (zzghx2 != null) {
            return zzghx2;
        }
        return zzgie.zza(zzghl.zzb(null).zzaV());
    }

    public static final zzgwm zzb(zzghx object) {
        String string2;
        Object object2;
        try {
            object = zzgpl.zzc();
            object2 = zzgqm.class;
            string2 = null;
        }
        catch (GeneralSecurityException generalSecurityException) {
            string2 = "Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null");
            object2 = new zzgqz(string2, generalSecurityException);
            throw object2;
        }
        object = ((zzgpl)object).zze(null, (Class)object2);
        object = (zzgqm)object;
        return ((zzgqm)object).zzc();
    }
}

