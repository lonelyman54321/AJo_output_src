/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjl;
import com.google.android.gms.internal.vision.zzju;
import com.google.android.gms.internal.vision.zzjx;
import com.google.android.gms.internal.vision.zzma;
import java.util.List;

final class zzjz
extends zzju {
    private zzjz() {
        super(null);
    }

    public /* synthetic */ zzjz(zzjx zzjx2) {
        this();
    }

    private static zzjl zzc(Object object, long l2) {
        return (zzjl)zzma.zzf(object, l2);
    }

    public final List zza(Object object, long l2) {
        zzjl zzjl2 = zzjz.zzc(object, l2);
        int n3 = zzjl2.zza();
        if (n3 == 0) {
            n3 = zzjl2.size();
            n3 = n3 == 0 ? 10 : (n3 <<= 1);
            zzjl2 = zzjl2.zza(n3);
            zzma.zza(object, l2, zzjl2);
        }
        return zzjl2;
    }

    public final void zza(Object object, Object object2, long l2) {
        zzjl zzjl2 = zzjz.zzc(object, l2);
        object2 = zzjz.zzc(object2, l2);
        int n3 = zzjl2.size();
        int n4 = object2.size();
        if (n3 > 0 && n4 > 0) {
            boolean bl2 = zzjl2.zza();
            if (!bl2) {
                zzjl2 = zzjl2.zza(n4 += n3);
            }
            zzjl2.addAll(object2);
        }
        if (n3 > 0) {
            object2 = zzjl2;
        }
        zzma.zza(object, l2, object2);
    }

    public final void zzb(Object object, long l2) {
        zzjz.zzc(object, l2).zzb();
    }
}

