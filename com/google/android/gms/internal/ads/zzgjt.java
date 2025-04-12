/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzghx;
import com.google.android.gms.internal.ads.zzgjo;
import com.google.android.gms.internal.ads.zzgju;
import com.google.android.gms.internal.ads.zzgjz;
import com.google.android.gms.internal.ads.zzgpa;
import com.google.android.gms.internal.ads.zzgzf;
import java.security.GeneralSecurityException;

public final class zzgjt
implements zzgpa {
    public final zzghi zza(zzghx object, Integer n3) {
        int n4;
        object = (zzgjz)object;
        int n7 = zzgju.zza;
        n7 = ((zzgjz)object).zzb();
        if (n7 != (n4 = 24)) {
            zzgjo zzgjo2 = new zzgjo(null);
            zzgjo2.zzc((zzgjz)object);
            zzgjo2.zza(n3);
            object = zzgzf.zzc(((zzgjz)object).zzb());
            zzgjo2.zzb((zzgzf)object);
            return zzgjo2.zzd();
        }
        object = new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        throw object;
    }
}

