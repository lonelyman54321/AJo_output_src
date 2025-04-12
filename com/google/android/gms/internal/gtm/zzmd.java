/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqz;

public final class zzmd
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        StringBuilder stringBuilder;
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        boolean bl2 = ((zzqo[])object2).length;
        int n4 = 0;
        String string2 = null;
        if (bl2 > false) {
            bl2 = true;
        } else {
            bl2 = false;
            stringBuilder = null;
        }
        Preconditions.checkArgument(bl2);
        bl2 = object2[0] instanceof zzqz;
        Preconditions.checkArgument(bl2);
        string2 = ((zzqz)object2[0]).zzk();
        stringBuilder = new StringBuilder(string2);
        while (n3 < (n4 = ((zzqo[])object2).length)) {
            string2 = zzjn.zzd(object2[n3]);
            stringBuilder.append(string2);
            ++n3;
        }
        object = stringBuilder.toString();
        object2 = new zzqz((String)object);
        return object2;
    }
}

