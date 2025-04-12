/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzfo;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;

final class zzdw
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzz.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzbY.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.zzbV.toString();

    public zzdw() {
        String string2 = zza;
        String[] stringArray = new String[]{};
        super(string2, stringArray);
    }

    public final zzap zza(Map object) {
        double d2;
        Object object2;
        Object object3 = zzb;
        object3 = (zzap)object.get(object3);
        String string2 = zzc;
        object = (zzap)object.get(string2);
        double d5 = 0.0;
        double d7 = 2.147483647E9;
        if (object3 != null && object3 != (object2 = zzfp.zza()) && object != null && object != (object2 = zzfp.zza())) {
            double d9;
            double d12;
            double d13;
            object3 = zzfp.zzd(zzfp.zzk((zzap)object3));
            object = zzfp.zzd(zzfp.zzk((zzap)object));
            object2 = zzfp.zzc();
            if (object3 != object2 && object != (object2 = zzfp.zzc()) && (d13 = (d12 = (d2 = ((zzfo)object3).doubleValue()) - (d9 = ((zzfo)object).doubleValue())) == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1)) <= 0) {
                d5 = d2;
                d7 = d9;
            }
        }
        d2 = Math.random();
        return zzfp.zzb(Math.round((d7 - d5) * d2 + d5));
    }

    public final boolean zzb() {
        return false;
    }
}

