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
import java.util.ArrayList;

public final class zzkk
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        int n3;
        Preconditions.checkNotNull(object2);
        boolean bl2 = ((zzqo[])object2).length;
        int n4 = 1;
        if (bl2 > false) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Preconditions.checkArgument(bl2);
        bl2 = object2[0] instanceof zzqv;
        Preconditions.checkArgument(bl2);
        object = (zzqv)object2[0];
        ArrayList<zzqo> arrayList = new ArrayList<zzqo>();
        while (n4 < (n3 = ((zzqo[])object2).length)) {
            zzqo zzqo2 = object2[n4];
            arrayList.add(zzqo2);
            ++n4;
        }
        ((zzqv)object).zzk().addAll(0, arrayList);
        object = (double)((zzqv)object).zzk().size();
        object2 = new zzqq((Double)object);
        return object2;
    }
}

