/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzghx;
import com.google.android.gms.internal.ads.zzgio;
import com.google.android.gms.internal.ads.zzgiu;
import com.google.android.gms.internal.ads.zzgja;
import com.google.android.gms.internal.ads.zzgpa;
import com.google.android.gms.internal.ads.zzgzf;
import java.security.GeneralSecurityException;

public final class zzgit
implements zzgpa {
    public final zzghi zza(zzghx object, Integer object2) {
        int n3;
        object = (zzgja)object;
        int n4 = zzgiu.zza;
        n4 = ((zzgja)object).zzb();
        if (n4 != (n3 = 16) && (n4 = ((zzgja)object).zzb()) != (n3 = 32)) {
            object = new GeneralSecurityException("AES key size must be 16 or 32 bytes");
            throw object;
        }
        zzgio zzgio2 = new zzgio(null);
        zzgio2.zzd((zzgja)object);
        zzgio2.zzc((Integer)object2);
        object2 = zzgzf.zzc(((zzgja)object).zzb());
        zzgio2.zza((zzgzf)object2);
        object = zzgzf.zzc(((zzgja)object).zzc());
        zzgio2.zzb((zzgzf)object);
        return zzgio2.zze();
    }
}

