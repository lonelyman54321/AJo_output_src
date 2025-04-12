/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzdm;
import com.google.android.gms.internal.clearcut.zzdn;

final class zzdf
implements zzdn {
    private zzdn[] zzma;

    public zzdf(zzdn ... zzdnArray) {
        this.zzma = zzdnArray;
    }

    public final boolean zza(Class clazz) {
        for (zzdn zzdn2 : this.zzma) {
            boolean bl2 = zzdn2.zza(clazz);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public final zzdm zzb(Class object) {
        Object object2 = this.zzma;
        int n3 = ((zzdn[])object2).length;
        String string2 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            zzdn zzdn2 = object2[i3];
            boolean bl2 = zzdn2.zza((Class)object);
            if (!bl2) continue;
            return zzdn2.zzb((Class)object);
        }
        object = ((Class)object).getName();
        n3 = ((String)object).length();
        string2 = "No factory is available for message type: ";
        object = n3 != 0 ? string2.concat((String)object) : new String(string2);
        object2 = new UnsupportedOperationException((String)object);
        throw object2;
    }
}

