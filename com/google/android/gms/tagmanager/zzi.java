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
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;

final class zzi
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzc.toString();
    private final Context zzb;

    public zzi(Context context) {
        String string2 = zza;
        String[] stringArray = new String[]{};
        super(string2, stringArray);
        this.zzb = context;
    }

    public final zzap zza(Map map2) {
        return zzfp.zzb(this.zzb.getPackageName());
    }

    public final boolean zzb() {
        return true;
    }
}

