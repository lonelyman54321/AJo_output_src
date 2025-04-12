/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzie;
import com.google.common.base.Supplier;

final class zzhf
extends zzie {
    private final Context zza;
    private final Supplier zzb;

    public zzhf(Context object, Supplier supplier) {
        if (object != null) {
            this.zza = object;
            this.zzb = supplier;
            return;
        }
        super("Null context");
        throw object;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        Context context;
        Object object2;
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        boolean bl4 = object instanceof zzie;
        if (bl4 && (bl4 = (object2 = this.zza).equals(context = ((zzie)(object = (zzie)object)).zza())) && ((object2 = this.zzb) == null ? (object = ((zzie)object).zzb()) == null : (bl2 = object2.equals(object = ((zzie)object).zzb())))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        Context context = this.zza;
        int n3 = context.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        Supplier supplier = this.zzb;
        if (supplier == null) {
            n4 = 0;
            supplier = null;
        } else {
            n4 = supplier.hashCode();
        }
        return n3 ^ n4;
    }

    public final String toString() {
        String string2 = String.valueOf(this.zza);
        String string3 = String.valueOf(this.zzb);
        return uc0_0.a("FlagsContext{context=", string2, ", hermeticFileOverrides=", string3, "}");
    }

    public final Context zza() {
        return this.zza;
    }

    public final Supplier zzb() {
        return this.zzb;
    }
}

