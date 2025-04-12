/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfxw;
import com.google.android.gms.internal.ads.zzfxx;
import java.util.Arrays;

public final class zzfxy {
    private final String zza;
    private final zzfxw zzb;
    private zzfxw zzc;

    public /* synthetic */ zzfxy(String string2, zzfxx object) {
        this.zzb = object = new zzfxw();
        this.zzc = object;
        string2.getClass();
        this.zza = string2;
    }

    public final String toString() {
        int n3 = 1;
        StringBuilder stringBuilder = new StringBuilder(32);
        Object object = this.zza;
        stringBuilder.append((String)object);
        char c2 = '{';
        stringBuilder.append(c2);
        object = this.zzb.zzb;
        Object object2 = "";
        while (object != null) {
            boolean bl2;
            Object object3 = ((zzfxw)object).zza;
            stringBuilder.append((String)object2);
            if (object3 != null && (bl2 = ((Class)(object2 = object3.getClass())).isArray())) {
                object2 = new Object[n3];
                object2[0] = object3;
                object2 = Arrays.deepToString((Object[])object2);
                int n4 = ((String)object2).length() + -1;
                stringBuilder.append((CharSequence)object2, n3, n4);
            } else {
                stringBuilder.append(object3);
            }
            object = ((zzfxw)object).zzb;
            object2 = ", ";
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final zzfxy zza(Object object) {
        zzfxw zzfxw2;
        this.zzc.zzb = zzfxw2 = new zzfxw();
        this.zzc = zzfxw2;
        zzfxw2.zza = object;
        return this;
    }
}

