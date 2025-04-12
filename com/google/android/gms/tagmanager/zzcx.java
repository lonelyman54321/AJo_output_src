/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Locale;
import java.util.Map;

public final class zzcx
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzv.toString();

    public zzcx() {
        String string2 = zza;
        String[] stringArray = new String[]{};
        super(string2, stringArray);
    }

    public final zzap zza(Map object) {
        object = Locale.getDefault();
        if (object == null) {
            return zzfp.zza();
        }
        if ((object = ((Locale)object).getLanguage()) == null) {
            return zzfp.zza();
        }
        return zzfp.zzb(((String)object).toLowerCase());
    }

    public final boolean zzb() {
        return false;
    }
}

