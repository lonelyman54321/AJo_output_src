/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzrl;
import java.util.Collections;
import java.util.List;

public final class zzri {
    private final List zza;
    private final List zzb;
    private final List zzc;
    private final List zzd;
    private final List zze;
    private final List zzf;
    private final List zzg;
    private final List zzh;

    public /* synthetic */ zzri(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, zzrl zzrl2) {
        this.zza = list = Collections.unmodifiableList(list);
        this.zzb = list = Collections.unmodifiableList(list2);
        this.zzc = list = Collections.unmodifiableList(list3);
        this.zzd = list = Collections.unmodifiableList(list4);
        this.zze = list = Collections.unmodifiableList(list5);
        this.zzf = list = Collections.unmodifiableList(list6);
        Collections.unmodifiableList(list7);
        Collections.unmodifiableList(list8);
        this.zzg = list = Collections.unmodifiableList(list9);
        this.zzh = list = Collections.unmodifiableList(list10);
    }

    public final String toString() {
        Object object = this.zzf;
        Object object2 = this.zze;
        Object object3 = this.zzd;
        Object object4 = this.zzc;
        Object object5 = this.zzb;
        String string2 = String.valueOf(this.zza);
        object5 = String.valueOf(object5);
        object4 = String.valueOf(object4);
        object3 = String.valueOf(object3);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        object5 = og_1.a("Positive predicates: ", string2, "  Negative predicates: ", (String)object5, "  Add tags: ");
        X50.a((StringBuilder)object5, (String)object4, "  Remove tags: ", (String)object3, "  Add macros: ");
        return BW0.b((StringBuilder)object5, (String)object2, "  Remove macros: ", (String)object);
    }

    public final List zza() {
        return this.zze;
    }

    public final List zzb() {
        return this.zzg;
    }

    public final List zzc() {
        return this.zzc;
    }

    public final List zzd() {
        return this.zzb;
    }

    public final List zze() {
        return this.zza;
    }

    public final List zzf() {
        return this.zzf;
    }

    public final List zzg() {
        return this.zzh;
    }

    public final List zzh() {
        return this.zzd;
    }
}

