/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzmj;
import java.util.Map;

final class zzmn
implements Comparable,
Map.Entry {
    private final Comparable zza;
    private Object zzb;
    private final /* synthetic */ zzmj zzc;

    public zzmn(zzmj zzmj2, Comparable comparable, Object object) {
        this.zzc = zzmj2;
        this.zza = comparable;
        this.zzb = object;
    }

    public zzmn(zzmj zzmj2, Map.Entry entry) {
        Comparable comparable = (Comparable)entry.getKey();
        entry = entry.getValue();
        this(zzmj2, comparable, entry);
    }

    private static boolean zza(Object object, Object object2) {
        if (object == null) {
            return object2 == null;
        }
        return object.equals(object2);
    }

    public final /* synthetic */ int compareTo(Object object) {
        object = (zzmn)object;
        Comparable comparable = (Comparable)this.getKey();
        object = (Comparable)((zzmn)object).getKey();
        return comparable.compareTo(object);
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
        Object object2 = this.zza;
        Object k2 = (object = (Map.Entry)object).getKey();
        bl4 = zzmn.zza(object2, k2);
        if (bl4 && (bl2 = zzmn.zza(object2 = this.zzb, object = object.getValue()))) {
            return bl3;
        }
        return false;
    }

    public final /* synthetic */ Object getKey() {
        return this.zza;
    }

    public final Object getValue() {
        return this.zzb;
    }

    public final int hashCode() {
        int n3;
        Comparable comparable = this.zza;
        int n4 = 0;
        if (comparable == null) {
            n3 = 0;
            comparable = null;
        } else {
            n3 = comparable.hashCode();
        }
        Object object = this.zzb;
        if (object != null) {
            n4 = object.hashCode();
        }
        return n3 ^ n4;
    }

    public final Object setValue(Object object) {
        zzmj.zzd(this.zzc);
        Object object2 = this.zzb;
        this.zzb = object;
        return object2;
    }

    public final String toString() {
        String string2 = String.valueOf(this.zza);
        String string3 = String.valueOf(this.zzb);
        return n1.a(string2, "=", string3);
    }
}

