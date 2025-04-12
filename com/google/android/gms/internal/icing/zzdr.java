/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzdg;
import com.google.android.gms.internal.icing.zzdp;
import com.google.android.gms.internal.icing.zzds;
import com.google.android.gms.internal.icing.zzfn;

final class zzdr
extends zzds {
    private zzdr() {
        super(null);
    }

    public /* synthetic */ zzdr(zzdp zzdp2) {
        super(null);
    }

    public final void zza(Object object, long l2) {
        ((zzdg)zzfn.zzn(object, l2)).zzb();
    }

    public final void zzb(Object object, Object object2, long l2) {
        zzdg zzdg2 = (zzdg)zzfn.zzn(object, l2);
        object2 = (zzdg)zzfn.zzn(object2, l2);
        int n3 = zzdg2.size();
        int n4 = object2.size();
        if (n3 > 0 && n4 > 0) {
            boolean bl2 = zzdg2.zza();
            if (!bl2) {
                zzdg2 = zzdg2.zze(n4 += n3);
            }
            zzdg2.addAll(object2);
        }
        if (n3 > 0) {
            object2 = zzdg2;
        }
        zzfn.zzo(object, l2, object2);
    }
}

