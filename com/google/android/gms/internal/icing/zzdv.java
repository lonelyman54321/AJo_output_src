/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzeb;
import com.google.android.gms.internal.icing.zzec;

final class zzdv
implements zzec {
    private final zzec[] zza;

    public zzdv(zzec ... zzecArray) {
        this.zza = zzecArray;
    }

    public final boolean zzb(Class clazz) {
        int n3;
        zzec[] zzecArray = this.zza;
        for (int i3 = 0; i3 < (n3 = 2); ++i3) {
            zzec zzec2 = zzecArray[i3];
            n3 = (int)(zzec2.zzb(clazz) ? 1 : 0);
            if (n3 == 0) continue;
            return true;
        }
        return false;
    }

    public final zzeb zzc(Class object) {
        Object object2;
        int n3;
        int n4;
        Object object3 = this.zza;
        for (n4 = 0; n4 < (n3 = 2); ++n4) {
            object2 = object3[n4];
            boolean bl2 = object2.zzb((Class)object);
            if (!bl2) continue;
            return object2.zzc((Class)object);
        }
        object = ((Class)object).getName();
        n4 = ((String)object).length();
        object2 = "No factory is available for message type: ";
        object = n4 != 0 ? ((String)object2).concat((String)object) : new String((String)object2);
        object3 = new UnsupportedOperationException((String)object);
        throw object3;
    }
}

