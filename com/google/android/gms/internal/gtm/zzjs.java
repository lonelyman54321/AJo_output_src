/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqq;
import com.google.android.gms.internal.gtm.zzqr;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqv;
import java.util.List;

public final class zzjs
extends zzjo {
    public final zzqo zza(zzhx zzhx2, zzqo ... object) {
        Object object2;
        int n3;
        zzqv zzqv2;
        Preconditions.checkNotNull(object);
        int n4 = ((zzqo[])object).length;
        int n7 = 2;
        int n8 = 1;
        if (n4 == n7) {
            n4 = 1;
        } else {
            n4 = 0;
            zzqv2 = null;
        }
        Preconditions.checkArgument(n4 != 0);
        Preconditions.checkArgument(object[0] instanceof zzqv);
        n4 = object[n8] instanceof zzqr;
        Preconditions.checkArgument(n4 != 0);
        zzqv2 = (zzqv)object[0];
        object = (zzqr)object[n8];
        List list = zzqv2.zzk();
        int n10 = list.size();
        for (int i3 = 0; i3 < n10 && i3 < (n3 = (object2 = zzqv2.zzk()).size()); i3 += n8) {
            n3 = (int)(zzqv2.zzn(i3) ? 1 : 0);
            if (n3 == 0) continue;
            object2 = ((zzqr)object).zzi();
            zzqo zzqo2 = (zzqo)list.get(i3);
            double d2 = i3;
            zzqo[] zzqoArray = Double.valueOf(d2);
            zzqq zzqq2 = new zzqq((Double)zzqoArray);
            int n14 = 3;
            zzqoArray = new zzqo[n14];
            zzqoArray[0] = zzqo2;
            zzqoArray[n8] = zzqq2;
            zzqoArray[n7] = zzqv2;
            object2.zzd(zzhx2, zzqoArray);
        }
        return zzqs.zze;
    }
}

