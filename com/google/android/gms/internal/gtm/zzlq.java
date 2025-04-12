/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqv;
import java.util.ArrayList;

public final class zzlq
implements zzjm {
    public final zzqo zzd(zzhx object, zzqo ... zzqoArray) {
        ArrayList<zzqo> arrayList;
        boolean bl2;
        int n3 = 0;
        object = null;
        if (zzqoArray != null) {
            bl2 = true;
        } else {
            bl2 = false;
            arrayList = null;
        }
        Preconditions.checkArgument(bl2);
        int n4 = zzqoArray.length;
        arrayList = new ArrayList<zzqo>(n4);
        while (n3 < n4) {
            zzqo zzqo2 = zzqoArray[n3];
            arrayList.add(zzqo2);
            ++n3;
        }
        object = new zzqv(arrayList);
        return object;
    }
}

