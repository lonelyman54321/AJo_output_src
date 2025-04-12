/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzghv;
import com.google.android.gms.internal.ads.zzghx;
import com.google.android.gms.internal.ads.zzgie;
import com.google.android.gms.internal.ads.zzgkw;
import com.google.android.gms.internal.ads.zzgli;
import com.google.android.gms.internal.ads.zzgns;
import com.google.android.gms.internal.ads.zzgpw;
import com.google.android.gms.internal.ads.zzgwm;
import com.google.android.gms.internal.ads.zzgze;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhcd;
import java.security.GeneralSecurityException;

public final class zzgky
implements zzgpw {
    public final Object zza(zzghi object) {
        object = (zzgli)object;
        Object object2 = ((zzgli)object).zzb().zzd();
        Object object3 = ((zzgli)object).zzb().zzb();
        object2 = zzghv.zza((String)object2).zzb();
        try {
            object3 = zzgie.zzb((zzghx)object3);
        }
        catch (zzhcd zzhcd2) {
            object2 = new GeneralSecurityException(zzhcd2);
            throw object2;
        }
        Object object4 = zzhay.zza();
        object3 = zzgwm.zzf((byte[])object3, (zzhay)object4);
        object4 = new zzgkw((zzgwm)object3, (zzggy)object2);
        object = ((zzgli)object).zzc();
        return zzgns.zzc((zzggy)object4, (zzgze)object);
    }
}

