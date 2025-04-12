/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzqj;
import java.util.Collections;
import java.util.List;

public final class zzqk {
    private static final String zza;
    private final int zzb;
    private final Object zzc;
    private final List zzd;

    static {
        String string2;
        zza = string2 = new String("");
    }

    public /* synthetic */ zzqk(Integer object, Object object2, List list, boolean bl2, zzqj zzqj2) {
        int n3;
        this.zzb = n3 = ((Integer)object).intValue();
        this.zzc = object2;
        this.zzd = object = Collections.unmodifiableList(list);
    }

    public final boolean equals(Object object) {
        Object object2;
        boolean bl2;
        boolean bl3 = object instanceof zzqk;
        return bl3 && (bl2 = (object = ((zzqk)object).zzc).equals(object2 = this.zzc));
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        Object object = this.zzc;
        if (object == null) {
            zzhi.zza("Fail to convert a null object to string");
            return zza;
        }
        return object.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final Object zzb() {
        return this.zzc;
    }

    public final List zzc() {
        return this.zzd;
    }
}

