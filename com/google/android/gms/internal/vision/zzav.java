/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.vision;

import android.content.Context;
import com.google.android.gms.internal.vision.zzbr;
import com.google.android.gms.internal.vision.zzdf;

final class zzav
extends zzbr {
    private final Context zza;
    private final zzdf zzb;

    public zzav(Context object, zzdf zzdf2) {
        if (object != null) {
            this.zza = object;
            this.zzb = zzdf2;
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
        boolean bl4 = object instanceof zzbr;
        if (bl4 && (bl4 = (object2 = this.zza).equals(context = ((zzbr)(object = (zzbr)object)).zza())) && ((object2 = this.zzb) == null ? (object = ((zzbr)object).zzb()) == null : (bl2 = object2.equals(object = ((zzbr)object).zzb())))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        Context context = this.zza;
        int n3 = context.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        zzdf zzdf2 = this.zzb;
        if (zzdf2 == null) {
            n4 = 0;
            zzdf2 = null;
        } else {
            n4 = zzdf2.hashCode();
        }
        return n3 ^ n4;
    }

    public final String toString() {
        String string2 = String.valueOf(this.zza);
        String string3 = String.valueOf(this.zzb);
        int n3 = string2.length() + 46;
        int n4 = string3.length() + n3;
        StringBuilder stringBuilder = new StringBuilder(n4);
        stringBuilder.append("FlagsContext{context=");
        stringBuilder.append(string2);
        stringBuilder.append(", hermeticFileOverrides=");
        stringBuilder.append(string3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final Context zza() {
        return this.zza;
    }

    public final zzdf zzb() {
        return this.zzb;
    }
}

