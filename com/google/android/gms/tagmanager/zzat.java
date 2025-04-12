/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.tagmanager.DataLayer;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;

final class zzat
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzi.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzca.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.zzaE.toString();
    private final DataLayer zzd;

    public zzat(DataLayer dataLayer) {
        String string2 = zza;
        String[] stringArray = zzb;
        stringArray = new String[]{stringArray};
        super(string2, stringArray);
        this.zzd = dataLayer;
    }

    public final zzap zza(Map object) {
        Object object2 = zzb;
        object2 = zzfp.zzm(zzfp.zzk((zzap)object.get(object2)));
        DataLayer dataLayer = this.zzd;
        if ((object2 = dataLayer.get((String)object2)) == null) {
            object2 = zzc;
            if ((object = (zzap)object.get(object2)) != null) {
                return object;
            }
            return zzfp.zza();
        }
        return zzfp.zzb(object2);
    }

    public final boolean zzb() {
        return false;
    }
}

