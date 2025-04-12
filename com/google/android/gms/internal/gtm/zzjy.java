/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqq;
import com.google.android.gms.internal.gtm.zzqv;
import java.util.List;

public final class zzjy
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... zzqoArray) {
        List list;
        int n3;
        Preconditions.checkNotNull(zzqoArray);
        int n4 = zzqoArray.length;
        zzqo zzqo2 = null;
        int n7 = 1;
        if (n4 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            list = null;
        }
        Preconditions.checkArgument(n3 != 0);
        Preconditions.checkArgument(zzqoArray[0] instanceof zzqv);
        zzqo2 = (zzqv)zzqoArray[0];
        list = zzqo2.zzk();
        n3 = list.size();
        n4 = n4 + n3 + -1;
        zzqo2.zzm(n4);
        while (n7 < (n4 = zzqoArray.length)) {
            object = zzqoArray[n7];
            zzqo2.zzl(n3, (zzqo)object);
            ++n3;
            ++n7;
        }
        double d2 = n3;
        object = d2;
        zzqo2 = new zzqq((Double)object);
        return zzqo2;
    }
}

