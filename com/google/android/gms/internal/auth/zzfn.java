/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzft;
import com.google.android.gms.internal.auth.zzfu;

final class zzfn
implements zzfu {
    private final zzfu[] zza;

    public zzfn(zzfu ... zzfuArray) {
        this.zza = zzfuArray;
    }

    public final zzft zzb(Class object) {
        int n3;
        Object object2 = this.zza;
        for (int i3 = 0; i3 < (n3 = 2); ++i3) {
            zzfu zzfu2 = object2[i3];
            boolean bl2 = zzfu2.zzc((Class)object);
            if (!bl2) continue;
            return zzfu2.zzb((Class)object);
        }
        object = ((Class)object).getName();
        object = "No factory is available for message type: ".concat((String)object);
        object2 = new UnsupportedOperationException((String)object);
        throw object2;
    }

    public final boolean zzc(Class clazz) {
        int n3;
        zzfu[] zzfuArray = this.zza;
        for (int i3 = 0; i3 < (n3 = 2); ++i3) {
            zzfu zzfu2 = zzfuArray[i3];
            n3 = (int)(zzfu2.zzc(clazz) ? 1 : 0);
            if (n3 == 0) continue;
            return true;
        }
        return false;
    }
}

