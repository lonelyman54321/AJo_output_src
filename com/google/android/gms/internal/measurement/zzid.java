/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzif;

final class zzid
extends zzhx {
    public zzid(zzif zzif2, String string2, Double d2, boolean bl2) {
        super(zzif2, string2, d2, true, null);
    }

    private final Double zzb(Object object) {
        boolean bl2 = object instanceof Double;
        if (bl2) {
            return (Double)object;
        }
        bl2 = object instanceof Float;
        if (bl2) {
            return ((Float)object).doubleValue();
        }
        bl2 = object instanceof String;
        if (bl2) {
            Object object2 = object;
            try {
                object2 = (String)object;
            }
            catch (NumberFormatException numberFormatException) {}
            double d2 = Double.parseDouble((String)object2);
            return d2;
        }
        this.zzb();
        String.valueOf(object);
        return null;
    }

    public final /* synthetic */ Object zza(Object object) {
        return this.zzb(object);
    }
}

