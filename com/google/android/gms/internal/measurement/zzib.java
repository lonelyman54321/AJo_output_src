/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzif;

final class zzib
extends zzhx {
    public zzib(zzif zzif2, String string2, Long l2, boolean bl2) {
        super(zzif2, string2, l2, true, null);
    }

    private final Long zzb(Object object) {
        boolean bl2 = object instanceof Long;
        if (bl2) {
            return (Long)object;
        }
        bl2 = object instanceof String;
        if (bl2) {
            Object object2 = object;
            try {
                object2 = (String)object;
            }
            catch (NumberFormatException numberFormatException) {}
            long l2 = Long.parseLong((String)object2);
            return l2;
        }
        this.zzb();
        String.valueOf(object);
        return null;
    }

    public final /* synthetic */ Object zza(Object object) {
        return this.zzb(object);
    }
}

