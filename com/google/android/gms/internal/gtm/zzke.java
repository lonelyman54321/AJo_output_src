/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqp;
import com.google.android.gms.internal.gtm.zzqq;
import com.google.android.gms.internal.gtm.zzqr;
import com.google.android.gms.internal.gtm.zzqv;
import java.util.List;

public final class zzke
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        Object object3;
        int n3;
        zzqv zzqv2;
        Preconditions.checkNotNull(object2);
        int n4 = ((zzqo[])object2).length;
        int n7 = 2;
        int n8 = 1;
        if (n4 == n7) {
            n4 = 1;
        } else {
            n4 = 0;
            zzqv2 = null;
        }
        Preconditions.checkArgument(n4 != 0);
        Preconditions.checkArgument(object2[0] instanceof zzqv);
        n4 = object2[n8] instanceof zzqr;
        Preconditions.checkArgument(n4 != 0);
        zzqv2 = (zzqv)object2[0];
        object2 = (zzqr)object2[n8];
        List list = zzqv2.zzk();
        int n10 = list.size();
        boolean bl2 = false;
        Object object4 = null;
        for (int i3 = 0; !bl2 && i3 < n10 && i3 < (n3 = (object3 = zzqv2.zzk()).size()); i3 += n8) {
            n3 = (int)(zzqv2.zzn(i3) ? 1 : 0);
            if (n3 == 0) continue;
            object4 = ((zzqr)object2).zzi();
            object3 = (zzqo)list.get(i3);
            double d2 = i3;
            zzqo[] zzqoArray = Double.valueOf(d2);
            zzqq zzqq2 = new zzqq((Double)zzqoArray);
            int n14 = 3;
            zzqoArray = new zzqo[n14];
            zzqoArray[0] = object3;
            zzqoArray[n8] = zzqq2;
            zzqoArray[n7] = zzqv2;
            object4 = object4.zzd((zzhx)object, zzqoArray);
            bl2 = zzjn.zzg((zzqo)object4);
        }
        object2 = bl2;
        object = new zzqp((Boolean)object2);
        return object;
    }
}

