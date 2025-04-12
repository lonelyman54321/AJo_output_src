/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqz;

public final class zzng
implements zzjm {
    private final Context zza;

    public zzng(Context context) {
        this.zza = context;
    }

    public final zzqo zzd(zzhx object, zzqo ... object2) {
        boolean bl2 = true;
        zzqz zzqz2 = null;
        boolean bl3 = object2 != null;
        Preconditions.checkArgument(bl3);
        int n3 = ((zzqo[])object2).length;
        if (n3 != 0) {
            bl2 = false;
            object = null;
        }
        Preconditions.checkArgument(bl2);
        try {
            object = this.zza;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object = new zzqz("");
            return object;
        }
        object = object.getPackageManager();
        object2 = this.zza;
        object2 = object2.getPackageName();
        object2 = object.getApplicationInfo((String)object2, 0);
        object = object.getApplicationLabel((ApplicationInfo)object2);
        object = object.toString();
        zzqz2 = new zzqz((String)object);
        return zzqz2;
    }
}

