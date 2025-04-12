/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzfq;
import java.util.AbstractMap;

final class zzfr {
    public static final Object zza(Object object, Object object2) {
        object = (zzfq)object;
        boolean bl2 = ((AbstractMap)(object2 = (zzfq)object2)).isEmpty();
        if (!bl2) {
            bl2 = ((zzfq)object).zze();
            if (!bl2) {
                object = ((zzfq)object).zzb();
            }
            ((zzfq)object).zzd((zzfq)object2);
        }
        return object;
    }
}

