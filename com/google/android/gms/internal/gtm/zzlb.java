/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqr;
import com.google.android.gms.internal.gtm.zzqv;
import com.google.android.gms.internal.gtm.zzqz;

public final class zzlb
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        Object object3;
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        int n4 = ((zzqo[])object2).length;
        int n7 = 3;
        if (n4 == n7) {
            n4 = 1;
        } else {
            n4 = 0;
            object3 = null;
        }
        Preconditions.checkArgument(n4 != 0);
        object3 = object2[n3];
        Preconditions.checkArgument(object3 instanceof zzqz);
        n4 = 2;
        n7 = object2[n4] instanceof zzqv;
        Preconditions.checkArgument(n7 != 0);
        zzqo zzqo2 = object2[0];
        Object object4 = ((zzqz)object2[n3]).zzk();
        object2 = ((zzqv)object2[n4]).zzk();
        n4 = (int)(zzqo2.zzh((String)object4) ? 1 : 0);
        if (n4 != 0) {
            object3 = zzqo2.zzb((String)object4);
            n7 = object3 instanceof zzqr;
            if (n7 != 0) {
                object4 = ((zzqr)object3).zzi();
                object3 = new zzqo[object2.size()];
                object2 = object2.toArray((T[])object3);
                return object4.zzd((zzhx)object, (zzqo[])object2);
            }
            object2 = cP.a("Apply TypeError: ", (String)object4, " is not a function");
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        n4 = (int)(zzqo2.zzg((String)object4) ? 1 : 0);
        if (n4 != 0) {
            object4 = zzqo2.zza((String)object4);
            object2.add(0, zzqo2);
            object3 = new zzqo[object2.size()];
            object2 = object2.toArray((T[])object3);
            return object4.zzd((zzhx)object, (zzqo[])object2);
        }
        object2 = cP.a("Apply TypeError: object has no ", (String)object4, " property");
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

