/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.telephony.TelephonyManager
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqz;

public final class zznj
implements zzjm {
    private final Context zza;

    public zznj(Context context) {
        this.zza = context = (Context)Preconditions.checkNotNull(context);
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
        object = (TelephonyManager)this.zza.getSystemService("phone");
        object2 = zzqs.zze;
        if (object != null && (object = object.getNetworkOperatorName()) != null) {
            object2 = new zzqz((String)object);
        }
        return object2;
    }
}

