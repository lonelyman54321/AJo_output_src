/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhh;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqz;
import com.google.android.gms.internal.gtm.zzra;

public final class zznw
implements zzjm {
    private final Context zza;

    public zznw(Context context) {
        this.zza = context = (Context)Preconditions.checkNotNull(context);
    }

    public final zzqo zzd(zzhx object, zzqo ... object2) {
        zzqs zzqs2 = null;
        int n3 = object2 != null ? 1 : 0;
        Preconditions.checkArgument(n3 != 0);
        n3 = ((zzqo[])object2).length;
        String string2 = null;
        if (n3 > 0 && (object2 = object2[0]) != (zzqs2 = zzqs.zze)) {
            object = zzra.zzc((zzhx)object, (zzqo)object2);
            string2 = zzjn.zzd((zzqo)object);
        }
        object2 = (object = zzhh.zzb(this.zza, string2)) != null ? new zzqz((String)object) : zzqs.zze;
        return object2;
    }
}

