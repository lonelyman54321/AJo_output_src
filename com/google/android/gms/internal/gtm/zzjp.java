/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqv;
import java.util.ArrayList;

public final class zzjp
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... zzqoArray) {
        zzqo zzqo2;
        boolean bl2;
        Preconditions.checkNotNull(zzqoArray);
        int n3 = zzqoArray.length;
        ArrayList<Object> arrayList = null;
        int n4 = 1;
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        Preconditions.checkArgument(n3 != 0);
        n3 = zzqoArray[0] instanceof zzqv;
        Preconditions.checkArgument(n3 != 0);
        object = (zzqv)zzqoArray[0];
        arrayList = new ArrayList<Object>();
        object = ((zzqv)object).zzk().iterator();
        while (bl2 = object.hasNext()) {
            zzqo2 = (zzqo)object.next();
            arrayList.add(zzqo2);
        }
        while (n4 < (n3 = zzqoArray.length)) {
            object = zzqoArray[n4];
            bl2 = object instanceof zzqv;
            if (bl2) {
                object = ((zzqv)object).zzk().iterator();
                while (bl2 = object.hasNext()) {
                    zzqo2 = (zzqo)object.next();
                    arrayList.add(zzqo2);
                }
            } else {
                arrayList.add(object);
            }
            ++n4;
        }
        object = new Object(arrayList);
        return object;
    }
}

