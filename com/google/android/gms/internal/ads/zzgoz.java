/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghh;
import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzghx;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgoj;
import com.google.android.gms.internal.ads.zzgou;
import com.google.android.gms.internal.ads.zzgov;
import com.google.android.gms.internal.ads.zzgpa;
import com.google.android.gms.internal.ads.zzgql;
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzgwh;
import com.google.android.gms.internal.ads.zzgwm;
import com.google.android.gms.internal.ads.zzgxn;
import com.google.android.gms.internal.ads.zzhac;
import java.security.GeneralSecurityException;

public final class zzgoz
implements zzgpa {
    public final zzghi zza(zzghx object, Integer object2) {
        Object object3;
        object = (zzgov)object;
        object = ((zzgov)object).zzb().zzc();
        Object object4 = zzgoj.zzc();
        Object object5 = ((zzgwm)object).zzi();
        object4 = ((zzgoj)object4).zzb((String)object5);
        object5 = zzgoj.zzc();
        boolean bl2 = ((zzgoj)object5).zze((String)(object3 = ((zzgwm)object).zzi()));
        if (bl2) {
            object5 = ((zzgwm)object).zzh();
            object4 = object4.zza((zzhac)object5);
            object5 = ((zzgwh)object4).zzg();
            object3 = ((zzgwh)object4).zzf();
            object4 = ((zzgwh)object4).zzc();
            object = ((zzgwm)object).zzg();
            object = zzgql.zza((String)object5, (zzhac)object3, (zzgwg)object4, (zzgxn)object, (Integer)object2);
            object4 = zzghh.zza();
            object2 = new zzgou((zzgql)object, (zzgic)object4);
            return object2;
        }
        object = new GeneralSecurityException("Creating new keys is not allowed.");
        throw object;
    }
}

