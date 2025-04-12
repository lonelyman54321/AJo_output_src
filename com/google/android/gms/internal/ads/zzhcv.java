/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhdb;
import com.google.android.gms.internal.ads.zzhdc;

final class zzhcv
implements zzhdc {
    private final zzhdc[] zza;

    public zzhcv(zzhdc ... zzhdcArray) {
        this.zza = zzhdcArray;
    }

    public final zzhdb zzb(Class object) {
        int n3;
        UnsupportedOperationException unsupportedOperationException = null;
        for (int i3 = 0; i3 < (n3 = 2); ++i3) {
            zzhdc zzhdc2 = this.zza[i3];
            boolean bl2 = zzhdc2.zzc((Class)object);
            if (!bl2) continue;
            return zzhdc2.zzb((Class)object);
        }
        object = ((Class)object).getName();
        object = "No factory is available for message type: ".concat((String)object);
        unsupportedOperationException = new UnsupportedOperationException((String)object);
        throw unsupportedOperationException;
    }

    public final boolean zzc(Class clazz) {
        int n3;
        for (int i3 = 0; i3 < (n3 = 2); ++i3) {
            zzhdc zzhdc2 = this.zza[i3];
            n3 = (int)(zzhdc2.zzc(clazz) ? 1 : 0);
            if (n3 == 0) continue;
            return true;
        }
        return false;
    }
}

