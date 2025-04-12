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

public final class zzjt
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        int n3;
        block7: {
            zzqv zzqv2;
            boolean bl2;
            Preconditions.checkNotNull(object2);
            int n4 = ((zzqo[])object2).length;
            int n7 = 3;
            int n8 = 1;
            n3 = 0;
            if (n4 > 0 && n4 <= n7) {
                bl2 = true;
            } else {
                bl2 = false;
                zzqv2 = null;
            }
            Preconditions.checkArgument(bl2);
            bl2 = object2[0] instanceof zzqv;
            Preconditions.checkArgument(bl2);
            zzqv2 = (zzqv)object2[0];
            int n10 = 2;
            zzqo zzqo2 = n4 < n10 ? zzqs.zze : object2[n8];
            object = n4 < n7 ? zzqs.zze : object2[n10];
            object2 = zzqv2.zzk();
            n7 = object2.size();
            zzqs zzqs2 = zzqs.zze;
            if (object != zzqs2) {
                double d2 = zzjn.zza((zzqo)object);
                n4 = (int)d2;
                if (n4 < 0) {
                    n4 = Math.abs(n4);
                    n4 = n7 - n4;
                    n3 = Math.max(n4, 0);
                } else {
                    n3 = n4;
                }
            }
            while (n3 < n7) {
                n4 = (int)(zzqv2.zzn(n3) ? 1 : 0);
                if (n4 == 0 || (n4 = (int)(zzjn.zzh(zzqo2, (zzqo)(object = (zzqo)object2.get(n3))) ? 1 : 0)) == 0) {
                    ++n3;
                    continue;
                }
                break block7;
            }
            n3 = -1;
        }
        double d5 = n3;
        object = d5;
        zzqq zzqq2 = new zzqq((Double)object);
        return zzqq2;
    }
}

