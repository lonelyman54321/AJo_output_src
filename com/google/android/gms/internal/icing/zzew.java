/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzez;
import java.util.Map;

final class zzew
implements Map.Entry,
Comparable {
    final /* synthetic */ zzez zza;
    private final Comparable zzb;
    private Object zzc;

    public zzew(zzez zzez2, Comparable comparable, Object object) {
        this.zza = zzez2;
        this.zzb = comparable;
        this.zzc = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final boolean zzb(Object object, Object object2) {
        if (object != null) return object.equals(object2);
        if (object2 == null) return true;
        return false;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        boolean bl4 = object instanceof Map.Entry;
        if (!bl4) {
            return false;
        }
        Object object2 = this.zzb;
        Object k2 = (object = (Map.Entry)object).getKey();
        bl4 = zzew.zzb(object2, k2);
        if (bl4 && (bl2 = zzew.zzb(object2 = this.zzc, object = object.getValue()))) {
            return bl3;
        }
        return false;
    }

    public final Object getValue() {
        return this.zzc;
    }

    public final int hashCode() {
        int n3;
        Comparable comparable = this.zzb;
        int n4 = 0;
        if (comparable == null) {
            n3 = 0;
            comparable = null;
        } else {
            n3 = comparable.hashCode();
        }
        Object object = this.zzc;
        if (object != null) {
            n4 = object.hashCode();
        }
        return n3 ^ n4;
    }

    public final Object setValue(Object object) {
        zzez.zzg(this.zza);
        Object object2 = this.zzc;
        this.zzc = object;
        return object2;
    }

    public final String toString() {
        String string2 = String.valueOf(this.zzb);
        String string3 = String.valueOf(this.zzc);
        int n3 = string2.length();
        int n4 = string3.length();
        n3 = n3 + 1 + n4;
        StringBuilder stringBuilder = new StringBuilder(n3);
        return BW0.b(stringBuilder, string2, "=", string3);
    }

    public final Comparable zza() {
        return this.zzb;
    }
}

