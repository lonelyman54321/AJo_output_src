/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;

final class zzl
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzbl.toString();
    private final Context zzb;

    public zzl(Context context) {
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
            this.zzb.getPackageName();
            nameNotFoundException.getMessage();
            return zzfp.zza();
        }
        object = object.getPackageManager();
        Object object2 = this.zzb;
        object2 = object2.getPackageName();
        object = object.getPackageInfo((String)object2, 0);
        object = ((PackageInfo)object).versionName;
        return zzfp.zzb(object);
    }

    public final boolean zzb() {
        return true;
    }
}

