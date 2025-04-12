/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzat
implements zzaq {
    private final String zza;
    private final ArrayList zzb;

    public zzat(String arrayList, List list) {
        this.zza = arrayList;
        this.zzb = arrayList = new ArrayList();
        arrayList.addAll(list);
    }

    public final boolean equals(Object object) {
        String string2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof zzat;
        if (!bl3) {
            return false;
        }
        object = (zzat)object;
        Object object2 = this.zza;
        if (object2 != null ? !(bl3 = ((String)object2).equals(string2 = ((zzat)object).zza)) : (object2 = ((zzat)object).zza) != null) {
            return false;
        }
        object2 = this.zzb;
        object = ((zzat)object).zzb;
        if (object2 != null) {
            return ((ArrayList)object2).equals(object);
        }
        if (object == null) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.zza;
        int n4 = 0;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        n3 *= 31;
        ArrayList arrayList = this.zzb;
        if (arrayList != null) {
            n4 = arrayList.hashCode();
        }
        return n3 + n4;
    }

    public final zzaq zza(String object, zzh zzh2, List list) {
        object = new IllegalStateException("Statement is not an evaluated entity");
        throw object;
    }

    public final String zza() {
        return this.zza;
    }

    public final ArrayList zzb() {
        return this.zzb;
    }

    public final zzaq zzc() {
        return this;
    }

    public final Boolean zzd() {
        IllegalStateException illegalStateException = new IllegalStateException("Statement cannot be cast as Boolean");
        throw illegalStateException;
    }

    public final Double zze() {
        IllegalStateException illegalStateException = new IllegalStateException("Statement cannot be cast as Double");
        throw illegalStateException;
    }

    public final String zzf() {
        IllegalStateException illegalStateException = new IllegalStateException("Statement cannot be cast as String");
        throw illegalStateException;
    }

    public final Iterator zzh() {
        return null;
    }
}

