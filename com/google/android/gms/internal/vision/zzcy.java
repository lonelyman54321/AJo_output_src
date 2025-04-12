/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzcv;
import com.google.android.gms.internal.vision.zzdd;
import com.google.android.gms.internal.vision.zzde;
import java.io.Serializable;

public abstract class zzcy
implements Serializable {
    public static zzcy zza(Object object) {
        object = zzde.zza(object);
        zzdd zzdd2 = new zzdd(object);
        return zzdd2;
    }

    public static zzcy zzc() {
        return zzcv.zza;
    }

    public abstract boolean zza();

    public abstract Object zzb();
}

