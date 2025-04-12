/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqv;
import java.util.ArrayList;

public final class zzkj
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... zzqoArray) {
        int n3;
        int n4;
        ArrayList arrayList;
        Preconditions.checkNotNull(zzqoArray);
        int n7 = zzqoArray.length;
        int n8 = 1;
        int n10 = 0;
        ArrayList<Object> arrayList2 = null;
        int n14 = 3;
        if (n7 >= n14) {
            n7 = 1;
        } else {
            n7 = 0;
            object = null;
        }
        Preconditions.checkArgument(n7 != 0);
        n7 = zzqoArray[0] instanceof zzqv;
        Preconditions.checkArgument(n7 != 0);
        object = (zzqv)zzqoArray[0];
        zzqo zzqo2 = zzqoArray[n8];
        double d2 = zzjn.zza(zzqo2);
        n8 = (int)d2;
        if (n8 < 0) {
            arrayList = ((zzqv)object).zzk();
            n4 = arrayList.size() + n8;
            n8 = Math.max(n4, 0);
        } else {
            arrayList = ((zzqv)object).zzk();
            n4 = arrayList.size();
            n8 = Math.min(n8, n4);
        }
        d2 = zzjn.zza(zzqoArray[2]);
        n10 = Math.max((int)d2, 0);
        n4 = ((zzqv)object).zzk().size() - n8;
        n10 = Math.min(n10, n4) + n8;
        Object object2 = ((zzqv)object).zzk().subList(n8, n10);
        arrayList = new ArrayList(object2);
        object2 = ((zzqv)object).zzk();
        object2.subList(n8, n10).clear();
        arrayList2 = new ArrayList<Object>();
        while (n14 < (n3 = zzqoArray.length)) {
            object2 = zzqoArray[n14];
            arrayList2.add(object2);
            ++n14;
        }
        ((zzqv)object).zzk().addAll(n8, arrayList2);
        object = new zzqv(arrayList);
        return object;
    }
}

