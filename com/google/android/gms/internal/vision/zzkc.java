/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzii;
import com.google.android.gms.internal.vision.zziu;
import com.google.android.gms.internal.vision.zzkf;
import com.google.android.gms.internal.vision.zzml;

public final class zzkc {
    public static int zza(zzkf zzkf2, Object object, Object object2) {
        int n3 = zziu.zza(zzkf2.zza, 1, object);
        int n4 = zziu.zza(zzkf2.zzc, 2, object2);
        return n3 + n4;
    }

    public static void zza(zzii zzii2, zzkf object, Object object2, Object object3) {
        zzml zzml2 = object.zza;
        zziu.zza(zzii2, zzml2, 1, object2);
        object = object.zzc;
        zziu.zza(zzii2, (zzml)((Object)object), 2, object3);
    }
}

