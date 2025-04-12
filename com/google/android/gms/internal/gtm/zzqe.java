/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzqd;
import java.util.Collections;
import java.util.List;

public final class zzqe {
    private final List zza;
    private final List zzb;
    private final List zzc;
    private final List zzd;

    public /* synthetic */ zzqe(List list, List list2, List list3, List list4, zzqd zzqd2) {
        this.zza = list = Collections.unmodifiableList(list);
        this.zzb = list = Collections.unmodifiableList(list2);
        this.zzc = list = Collections.unmodifiableList(list3);
        this.zzd = list = Collections.unmodifiableList(list4);
    }

    public final String toString() {
        Object object = this.zzd;
        Object object2 = this.zzc;
        Object object3 = this.zzb;
        String string2 = String.valueOf(this.zza);
        object3 = String.valueOf(object3);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        return BW0.b(og_1.a("Positive predicates: ", string2, "  Negative predicates: ", (String)object3, "  Add tags: "), (String)object2, "  Remove tags: ", (String)object);
    }

    public final List zza() {
        return this.zzc;
    }

    public final List zzb() {
        return this.zzb;
    }

    public final List zzc() {
        return this.zza;
    }

    public final List zzd() {
        return this.zzd;
    }
}

