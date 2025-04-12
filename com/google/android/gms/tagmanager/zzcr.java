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

final class zzcr
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzM.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzV.toString();
    private final Context zzc;

    public zzcr(Context context) {
        String string2 = zza;
        String[] stringArray = new String[]{};
        super(string2, stringArray);
        this.zzc = context;
    }

    public final zzap zza(Map object) {
        String string2 = zzb;
        zzap zzap2 = (zzap)object.get(string2);
        object = zzap2 != null ? zzfp.zzm(zzfp.zzk((zzap)object.get(string2))) : null;
        string2 = this.zzc;
        object = zzcs.zzb((Context)string2, (String)object);
        object = object != null ? zzfp.zzb(object) : zzfp.zza();
        return object;
    }

    public final boolean zzb() {
        return true;
    }
}

