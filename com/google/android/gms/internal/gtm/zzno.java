/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.provider.Settings$Secure
 */
package com.google.android.gms.internal.gtm;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqz;

public final class zzno
implements zzjm {
    private final Context zza;

    public zzno(Context context) {
        this.zza = context;
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
        object = this.zza.getContentResolver();
        object2 = "android_id";
        object = Settings.Secure.getString((ContentResolver)object, (String)object2);
        if (object == null) {
            object = "";
        }
        object2 = new zzqz((String)object);
        return object2;
    }
}

