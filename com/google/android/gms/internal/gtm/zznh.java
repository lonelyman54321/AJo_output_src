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
import com.google.android.gms.internal.gtm.zzqq;
import com.google.android.gms.internal.gtm.zzqs;

public final class zznh
implements zzjm {
    private final Context zza;

    public zznh(Context context) {
        this.zza = context = (Context)Preconditions.checkNotNull(context);
    }

    public final zzqo zzd(zzhx object, zzqo ... object2) {
        int n3 = 1;
        StringBuilder stringBuilder = null;
        boolean bl2 = object2 != null;
        Preconditions.checkArgument(bl2);
        int n4 = ((zzqo[])object2).length;
        if (n4 != 0) {
            n3 = 0;
            object = null;
        }
        Preconditions.checkArgument(n3 != 0);
        try {
            object = this.zza;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object2 = this.zza.getPackageName();
            String string2 = nameNotFoundException.getMessage();
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
        n3 = ((PackageInfo)object).versionCode;
        double d2 = n3;
        object = d2;
        object2 = new zzqq((Double)object);
        return object2;
    }
}

