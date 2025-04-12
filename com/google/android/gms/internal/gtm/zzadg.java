/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzadf;
import java.util.AbstractMap;

final class zzadg {
    public static final boolean zza(Object object) {
        boolean bl2 = ((zzadf)(object = (zzadf)object)).zze();
        return !bl2;
    }

    public static final Object zzb(Object object, Object object2) {
        object = (zzadf)object;
        boolean bl2 = ((AbstractMap)(object2 = (zzadf)object2)).isEmpty();
        if (!bl2) {
            bl2 = ((zzadf)object).zze();
            if (!bl2) {
                object = ((zzadf)object).zzb();
            }
            ((zzadf)object).zzd((zzadf)object2);
        }
        return object;
    }
}

