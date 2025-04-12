/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqz;

public final class zzni
implements zzjm {
    private final Context zza;

    public zzni(Context context) {
        this.zza = context = (Context)Preconditions.checkNotNull(context);
    }

    public final zzqo zzd(zzhx object, zzqo ... object2) {
        boolean bl2 = true;
        StringBuilder stringBuilder = null;
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
            object2 = this.zza.getPackageName();
            String string2 = ((Object)((Object)nameNotFoundException)).toString();
            stringBuilder = new StringBuilder("Package name ");
            stringBuilder.append((String)object2);
            stringBuilder.append(" not found. ");
            stringBuilder.append(string2);
            zzhi.zza(stringBuilder.toString());
            return zzqs.zze;
        }
        object = object.getPackageManager();
        object2 = this.zza;
        object2 = object2.getPackageName();
        object = object.getPackageInfo((String)object2, 0);
        object = ((PackageInfo)object).versionName;
        object2 = new zzqz((String)object);
        return object2;
    }
}

