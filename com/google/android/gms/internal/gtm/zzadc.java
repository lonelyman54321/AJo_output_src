/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzadi;
import com.google.android.gms.internal.gtm.zzadj;

final class zzadc
implements zzadj {
    private final zzadj[] zza;

    public zzadc(zzadj ... zzadjArray) {
        this.zza = zzadjArray;
    }

    public final zzadi zzb(Class object) {
        int n3;
        UnsupportedOperationException unsupportedOperationException = null;
        for (int i3 = 0; i3 < (n3 = 2); ++i3) {
            zzadj zzadj2 = this.zza[i3];
            boolean bl2 = zzadj2.zzc((Class)object);
            if (!bl2) continue;
            return zzadj2.zzb((Class)object);
        }
        object = ((Class)object).getName();
        object = "No factory is available for message type: ".concat((String)object);
        unsupportedOperationException = new UnsupportedOperationException((String)object);
        throw unsupportedOperationException;
    }

    public final boolean zzc(Class clazz) {
        int n3;
        for (int i3 = 0; i3 < (n3 = 2); ++i3) {
            zzadj zzadj2 = this.zza[i3];
            n3 = (int)(zzadj2.zzc(clazz) ? 1 : 0);
            if (n3 == 0) continue;
            return true;
        }
        return false;
    }
}

