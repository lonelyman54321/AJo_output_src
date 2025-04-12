/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzkw;
import com.google.android.gms.internal.measurement.zzmz;
import java.util.List;

final class zzkz
implements zzkw {
    private static zzkm zzc(Object object, long l2) {
        return (zzkm)zzmz.zze(object, l2);
    }

    public final List zza(Object object, long l2) {
        zzkm zzkm2 = zzkz.zzc(object, l2);
        int n3 = zzkm2.zzc();
        if (n3 == 0) {
            n3 = zzkm2.size();
            n3 = n3 == 0 ? 10 : (n3 <<= 1);
            zzkm2 = zzkm2.zza(n3);
            zzmz.zza(object, l2, zzkm2);
        }
        return zzkm2;
    }

    public final void zza(Object object, Object object2, long l2) {
        zzkm zzkm2 = zzkz.zzc(object, l2);
        object2 = zzkz.zzc(object2, l2);
        int n3 = zzkm2.size();
        int n4 = object2.size();
        if (n3 > 0 && n4 > 0) {
            boolean bl2 = zzkm2.zzc();
            if (!bl2) {
                zzkm2 = zzkm2.zza(n4 += n3);
            }
            zzkm2.addAll(object2);
        }
        if (n3 > 0) {
            object2 = zzkm2;
        }
        zzmz.zza(object, l2, object2);
    }

    public final void zzb(Object object, long l2) {
        zzkz.zzc(object, l2).zzb();
    }
}

