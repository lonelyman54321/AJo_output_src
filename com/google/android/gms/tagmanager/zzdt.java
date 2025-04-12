/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;

public abstract class zzdt
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zzb.zzr.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzs.toString();

    public zzdt(String string2) {
        String[] stringArray = zza;
        String string3 = zzb;
        stringArray = new String[]{stringArray, string3};
        super(string2, stringArray);
    }

    public final zzap zza(Map map2) {
        zzap zzap2;
        Object object;
        boolean bl2;
        Object object2 = map2.values().iterator();
        while (bl2 = object2.hasNext()) {
            object = (zzap)object2.next();
            if (object != (zzap2 = zzfp.zza())) continue;
            return zzfp.zzb(Boolean.FALSE);
        }
        object2 = zza;
        object2 = (zzap)map2.get(object2);
        object = zzb;
        object = (zzap)map2.get(object);
        boolean bl3 = false;
        zzap2 = null;
        if (object2 != null && object != null) {
            bl3 = this.zzd((zzap)object2, (zzap)object, map2);
        }
        return zzfp.zzb(bl3);
    }

    public final boolean zzb() {
        return true;
    }

    public abstract boolean zzd(zzap var1, zzap var2, Map var3);
}

