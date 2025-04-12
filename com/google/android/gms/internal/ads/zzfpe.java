/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfon;
import com.google.android.gms.internal.ads.zzfpm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class zzfpe {
    private static final zzfpe zza;
    private final ArrayList zzb;
    private final ArrayList zzc;

    static {
        zzfpe zzfpe2;
        zza = zzfpe2 = new zzfpe();
    }

    private zzfpe() {
        ArrayList arrayList;
        this.zzb = arrayList = new ArrayList();
        this.zzc = arrayList = new ArrayList();
    }

    public static zzfpe zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfon zzfon2) {
        this.zzb.add(zzfon2);
    }

    public final void zze(zzfon object) {
        boolean bl2;
        ArrayList arrayList = this.zzb;
        boolean bl3 = this.zzg();
        arrayList.remove(object);
        arrayList = this.zzc;
        arrayList.remove(object);
        if (bl3 && !(bl2 = this.zzg())) {
            object = zzfpm.zzb();
            ((zzfpm)object).zzg();
        }
    }

    public final void zzf(zzfon object) {
        ArrayList arrayList = this.zzc;
        boolean bl2 = this.zzg();
        arrayList.add(object);
        if (!bl2) {
            object = zzfpm.zzb();
            ((zzfpm)object).zzf();
        }
    }

    public final boolean zzg() {
        ArrayList arrayList = this.zzc;
        int n3 = arrayList.size();
        return n3 > 0;
    }
}

