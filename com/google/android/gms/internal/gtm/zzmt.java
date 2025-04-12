/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzms;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqz;
import java.io.UnsupportedEncodingException;

public final class zzmt
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        Preconditions.checkArgument(true);
        int n3 = ((zzqo[])object2).length;
        if (n3 > 0) {
            n3 = 0;
            object = (zzqo)Preconditions.checkNotNull(object2[0]);
        } else {
            object = zzqs.zze;
        }
        object = zzjn.zzd((zzqo)object);
        String string2 = "";
        try {
            object = zzms.zzb((String)object, string2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return zzqs.zze;
        }
        object2 = new zzqz((String)object);
        return object2;
    }
}

