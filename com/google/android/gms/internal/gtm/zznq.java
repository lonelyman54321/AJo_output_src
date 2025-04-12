/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 */
package com.google.android.gms.internal.gtm;

import android.os.Build;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqz;

public final class zznq
implements zzjm {
    private final String zza;
    private final String zzb;

    public zznq() {
        String string2;
        this.zza = string2 = Build.MANUFACTURER;
        this.zzb = string2 = Build.MODEL;
    }

    public final zzqo zzd(zzhx object, zzqo ... object2) {
        String string2;
        boolean bl2 = false;
        object = null;
        boolean bl3 = true;
        boolean bl4 = object2 != null;
        Preconditions.checkArgument(bl4);
        int n3 = ((zzqo[])object2).length;
        if (n3 == 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2);
        object = this.zza;
        object2 = this.zzb;
        bl3 = ((String)object2).startsWith((String)object);
        if (!bl3 && !(bl3 = ((String)object).equals(string2 = "unknown"))) {
            string2 = " ";
            object2 = n1.a((String)object, string2, (String)object2);
        }
        object = new zzqz((String)object2);
        return object;
    }
}

