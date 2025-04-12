/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzghx;
import com.google.android.gms.internal.ads.zzgjc;
import com.google.android.gms.internal.ads.zzgjh;
import com.google.android.gms.internal.ads.zzgjm;
import com.google.android.gms.internal.ads.zzgpa;
import com.google.android.gms.internal.ads.zzgzf;
import java.security.GeneralSecurityException;

public final class zzgjg
implements zzgpa {
    public final zzghi zza(zzghx object, Integer n3) {
        int n4;
        object = (zzgjm)object;
        int n7 = zzgjh.zza;
        n7 = ((zzgjm)object).zzc();
        if (n7 != (n4 = 24)) {
            zzgjc zzgjc2 = new zzgjc(null);
            zzgjc2.zzc((zzgjm)object);
            zzgjc2.zza(n3);
            object = zzgzf.zzc(((zzgjm)object).zzc());
            zzgjc2.zzb((zzgzf)object);
            return zzgjc2.zzd();
        }
        object = new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        throw object;
    }
}

