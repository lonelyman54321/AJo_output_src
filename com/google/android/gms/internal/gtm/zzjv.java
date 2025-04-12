/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqq;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqv;
import java.util.List;

public final class zzjv
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... zzqoArray) {
        double d2;
        int n3;
        zzqo zzqo2;
        block7: {
            zzqo zzqo3;
            int n4;
            Preconditions.checkNotNull(zzqoArray);
            int n7 = zzqoArray.length;
            int n8 = 1;
            int n10 = 3;
            zzqv zzqv2 = null;
            if (n7 > 0 && n7 <= n10) {
                n4 = 1;
            } else {
                n4 = 0;
                zzqo3 = null;
            }
            Preconditions.checkArgument(n4 != 0);
            zzqo3 = zzqoArray[0];
            Preconditions.checkArgument(zzqo3 instanceof zzqv);
            zzqv2 = (zzqv)zzqoArray[0];
            n4 = 2;
            zzqo2 = n7 < n4 ? zzqs.zze : zzqoArray[n8];
            List list = zzqv2.zzk();
            int n14 = list.size();
            n3 = n14 + -1;
            if (n7 == n10) {
                object = zzqoArray[n4];
                d2 = zzjn.zza((zzqo)object);
                n7 = (int)d2;
                if (n7 < 0) {
                    n7 = Math.abs(n7);
                    n3 = n14 - n7;
                } else {
                    n3 = Math.min(n7, n3);
                }
            }
            while (n3 >= 0) {
                n7 = (int)(zzqv2.zzn(n3) ? 1 : 0);
                if (n7 == 0 || (n7 = (int)(zzjn.zzh(zzqo2, (zzqo)(object = (zzqo)list.get(n3))) ? 1 : 0)) == 0) {
                    n3 += -1;
                    continue;
                }
                break block7;
            }
            n3 = -1;
        }
        d2 = n3;
        object = d2;
        zzqo2 = new zzqq((Double)object);
        return zzqo2;
    }
}

