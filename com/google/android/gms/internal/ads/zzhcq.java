/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhcp;
import com.google.android.gms.internal.ads.zzhcs;
import com.google.android.gms.internal.ads.zzhfa;
import java.util.List;

final class zzhcq
extends zzhcs {
    private zzhcq() {
        throw null;
    }

    public /* synthetic */ zzhcq(zzhcp zzhcp2) {
        super(null);
    }

    public final List zza(Object object, long l2) {
        zzhca zzhca2 = (zzhca)zzhfa.zzh(object, l2);
        int n3 = zzhca2.zzc();
        if (n3 == 0) {
            n3 = zzhca2.size();
            n3 = n3 == 0 ? 10 : (n3 += n3);
            zzhca2 = zzhca2.zzf(n3);
            zzhfa.zzv(object, l2, zzhca2);
        }
        return zzhca2;
    }

    public final void zzb(Object object, long l2) {
        ((zzhca)zzhfa.zzh(object, l2)).zzb();
    }

    public final void zzc(Object object, Object object2, long l2) {
        zzhca zzhca2 = (zzhca)zzhfa.zzh(object, l2);
        object2 = (zzhca)zzhfa.zzh(object2, l2);
        int n3 = zzhca2.size();
        int n4 = object2.size();
        if (n3 > 0 && n4 > 0) {
            boolean bl2 = zzhca2.zzc();
            if (!bl2) {
                zzhca2 = zzhca2.zzf(n4 += n3);
            }
            zzhca2.addAll(object2);
        }
        if (n3 > 0) {
            object2 = zzhca2;
        }
        zzhfa.zzv(object, l2, object2);
    }
}

