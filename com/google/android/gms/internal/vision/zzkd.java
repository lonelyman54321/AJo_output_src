/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzki;
import com.google.android.gms.internal.vision.zzkl;

final class zzkd
implements zzkl {
    private zzkl[] zza;

    public zzkd(zzkl ... zzklArray) {
        this.zza = zzklArray;
    }

    public final boolean zza(Class clazz) {
        for (zzkl zzkl2 : this.zza) {
            boolean bl2 = zzkl2.zza(clazz);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public final zzki zzb(Class object) {
        Object object2 = this.zza;
        int n3 = ((zzkl[])object2).length;
        String string2 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            zzkl zzkl2 = object2[i3];
            boolean bl2 = zzkl2.zza((Class)object);
            if (!bl2) continue;
            return zzkl2.zzb((Class)object);
        }
        object = ((Class)object).getName();
        n3 = ((String)object).length();
        string2 = "No factory is available for message type: ";
        object = n3 != 0 ? string2.concat((String)object) : new String(string2);
        object2 = new UnsupportedOperationException((String)object);
        throw object2;
    }
}

