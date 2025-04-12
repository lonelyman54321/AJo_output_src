/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.DisplayMetrics
 *  android.view.WindowManager
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqz;

public final class zzoh
implements zzjm {
    private final Context zza;
    private final DisplayMetrics zzb;

    public zzoh(Context context) {
        this.zza = context;
        this.zzb = context;
    }

    public final zzqo zzd(zzhx object, zzqo ... object2) {
        boolean bl2 = false;
        object = null;
        boolean bl3 = object2 != null;
        Preconditions.checkArgument(bl3);
        int n3 = ((zzqo[])object2).length;
        if (n3 == 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2);
        object = ((WindowManager)this.zza.getSystemService("window")).getDefaultDisplay();
        object2 = this.zzb;
        object.getMetrics(object2);
        object = new StringBuilder();
        n3 = this.zzb.widthPixels;
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append("x");
        n3 = this.zzb.heightPixels;
        ((StringBuilder)object).append(n3);
        object = ((StringBuilder)object).toString();
        object2 = new zzqz((String)object);
        return object2;
    }
}

