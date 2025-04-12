/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzcs;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;

final class zzh
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzH.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzV.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.zzZ.toString();
    private final Context zzd;

    public zzh(Context context) {
        String string2 = zza;
        String[] stringArray = zzc;
        stringArray = new String[]{stringArray};
        super(string2, stringArray);
        this.zzd = context;
    }

    public final zzap zza(Map object) {
        Object object2 = zzc;
        if ((object2 = (zzap)object.get(object2)) == null) {
            return zzfp.zza();
        }
        object2 = zzfp.zzm(zzfp.zzk((zzap)object2));
        String string2 = zzb;
        object = (object = (zzap)object.get(string2)) != null ? zzfp.zzm(zzfp.zzk((zzap)object)) : null;
        string2 = this.zzd;
        Map map2 = zzcs.zza;
        String string3 = (String)map2.get(object2);
        if (string3 == null) {
            string2 = string2.getSharedPreferences("gtm_click_referrers", 0);
            string3 = "";
            if (string2 != null) {
                string3 = string2 = string2.getString((String)object2, string3);
            }
            map2.put(object2, string3);
        }
        object = (object = zzcs.zza(string3, (String)object)) != null ? zzfp.zzb(object) : zzfp.zza();
        return object;
    }

    public final boolean zzb() {
        return true;
    }
}

