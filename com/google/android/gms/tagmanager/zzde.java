/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.provider.Settings$Secure
 */
package com.google.android.gms.tagmanager;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;

final class zzde
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzO.toString();
    private final Context zzb;

    public zzde(Context context) {
        String string2 = zza;
        String[] stringArray = new String[]{};
        super(string2, stringArray);
        this.zzb = context;
    }

    public final zzap zza(Map object) {
        object = this.zzb.getContentResolver();
        String string2 = "android_id";
        object = (object = Settings.Secure.getString((ContentResolver)object, (String)string2)) == null ? zzfp.zza() : zzfp.zzb(object);
        return object;
    }

    public final boolean zzb() {
        return true;
    }
}

