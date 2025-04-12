/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.tagmanager.DataLayer;
import com.google.android.gms.tagmanager.zzfn;
import com.google.android.gms.tagmanager.zzfp;
import java.util.List;
import java.util.Map;

final class zzba
extends zzfn {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzQ.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzec.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.zzP.toString();
    private final DataLayer zzd;

    public zzba(DataLayer dataLayer) {
        String string2 = zza;
        String[] stringArray = zzb;
        stringArray = new String[]{stringArray};
        super(string2, stringArray);
        this.zzd = dataLayer;
    }

    public final void zzc(Map object) {
        boolean bl2;
        Object object2 = zzb;
        if ((object2 = (zzap)object.get(object2)) != null && (bl2 = (object2 = zzfp.zzk((zzap)object2)) instanceof List)) {
            object2 = ((List)object2).iterator();
            while (bl2 = object2.hasNext()) {
                Object object3 = object2.next();
                boolean bl3 = object3 instanceof Map;
                if (!bl3) continue;
                object3 = (Map)object3;
                DataLayer dataLayer = this.zzd;
                dataLayer.push((Map)object3);
            }
        }
        if ((object = (zzap)object.get(object2 = zzc)) != null && (object = zzfp.zzm(zzfp.zzk((zzap)object))) != (object2 = zzfp.zzl())) {
            object2 = this.zzd;
            ((DataLayer)object2).zzd((String)object);
        }
    }
}

