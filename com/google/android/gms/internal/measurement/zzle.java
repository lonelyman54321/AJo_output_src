/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjn;
import com.google.android.gms.internal.measurement.zzjw;
import com.google.android.gms.internal.measurement.zzlh;
import com.google.android.gms.internal.measurement.zzng;

public final class zzle {
    public static int zza(zzlh zzlh2, Object object, Object object2) {
        int n3 = zzjw.zza(zzlh2.zza, 1, object);
        int n4 = zzjw.zza(zzlh2.zzc, 2, object2);
        return n3 + n4;
    }

    public static void zza(zzjn zzjn2, zzlh object, Object object2, Object object3) {
        zzng zzng2 = object.zza;
        zzjw.zza(zzjn2, zzng2, 1, object2);
        object = object.zzc;
        zzjw.zza(zzjn2, (zzng)((Object)object), 2, object3);
    }
}

