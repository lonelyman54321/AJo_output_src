/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzey;
import com.google.android.gms.internal.auth.zzfh;
import com.google.android.gms.internal.auth.zzfk;
import com.google.android.gms.internal.auth.zzhi;

final class zzfi
extends zzfk {
    private zzfi() {
        super(null);
    }

    public /* synthetic */ zzfi(zzfh zzfh2) {
        super(null);
    }

    public final void zza(Object object, long l2) {
        ((zzey)zzhi.zzf(object, l2)).zzb();
    }

    public final void zzb(Object object, Object object2, long l2) {
        zzey zzey2 = (zzey)zzhi.zzf(object, l2);
        object2 = (zzey)zzhi.zzf(object2, l2);
        int n3 = zzey2.size();
        int n4 = object2.size();
        if (n3 > 0 && n4 > 0) {
            boolean bl2 = zzey2.zzc();
            if (!bl2) {
                zzey2 = zzey2.zzd(n4 += n3);
            }
            zzey2.addAll(object2);
        }
        if (n3 > 0) {
            object2 = zzey2;
        }
        zzhi.zzp(object, l2, object2);
    }
}

