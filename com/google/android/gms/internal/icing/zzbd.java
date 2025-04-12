/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.icing;

import android.content.Context;
import com.google.android.gms.internal.icing.zzbh;
import com.google.android.gms.internal.icing.zzbm;

final class zzbd
extends zzbh {
    private final Context zza;
    private final zzbm zzb;

    public zzbd(Context object, zzbm zzbm2) {
        if (object != null) {
            this.zza = object;
            this.zzb = zzbm2;
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
        boolean bl4 = object instanceof zzbh;
        if (bl4 && (bl4 = (object2 = this.zza).equals(context = ((zzbh)(object = (zzbh)object)).zza())) && (bl2 = (object2 = this.zzb).equals(object = ((zzbh)object).zzb()))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zza.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        n4 = this.zzb.hashCode();
        return n3 ^ n4;
    }

    public final String toString() {
        String string2 = String.valueOf(this.zza);
        String string3 = String.valueOf(this.zzb);
        int n3 = string2.length();
        int n4 = string3.length();
        n3 = n3 + 46 + n4;
        StringBuilder stringBuilder = new StringBuilder(n3);
        X50.a(stringBuilder, "FlagsContext{context=", string2, ", hermeticFileOverrides=", string3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final Context zza() {
        return this.zza;
    }

    public final zzbm zzb() {
        return this.zzb;
    }
}

