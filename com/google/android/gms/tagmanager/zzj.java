/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;

final class zzj
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzd.toString();
    private final Context zzb;

    public zzj(Context context) {
        String string2 = zza;
        String[] stringArray = new String[]{};
        super(string2, stringArray);
        this.zzb = context;
    }

    public final zzap zza(Map object) {
        try {
            object = this.zzb;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return zzfp.zza();
        }
        object = object.getPackageManager();
        Object object2 = this.zzb;
        object2 = object2.getPackageName();
        object2 = object.getApplicationInfo((String)object2, 0);
        object = object.getApplicationLabel((ApplicationInfo)object2);
        object = object.toString();
        return zzfp.zzb(object);
    }

    public final boolean zzb() {
        return true;
    }
}

