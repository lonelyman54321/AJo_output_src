/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfxk;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzfyl;
import java.io.Serializable;

public abstract class zzfyb
implements Serializable {
    public static zzfyb zzc() {
        return zzfxk.zza;
    }

    public static zzfyb zzd(Object object) {
        if (object == null) {
            object = zzfxk.zza;
        } else {
            zzfyl zzfyl2 = new zzfyl(object);
            object = zzfyl2;
        }
        return object;
    }

    public abstract zzfyb zza(zzfxu var1);

    public abstract Object zzb(Object var1);
}

