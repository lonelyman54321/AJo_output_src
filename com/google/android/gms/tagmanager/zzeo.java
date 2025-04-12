/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzre;
import com.google.android.gms.internal.gtm.zzri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzeo {
    private final Set zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;
    private zzre zzf;

    public zzeo() {
        Cloneable cloneable;
        this.zza = cloneable = new Cloneable();
        this.zzb = cloneable;
        super();
        this.zzd = cloneable;
        super();
        this.zzc = cloneable;
        super();
        this.zze = cloneable;
    }

    public final zzre zza() {
        return this.zzf;
    }

    public final Map zzb() {
        return this.zzd;
    }

    public final Map zzc() {
        return this.zzb;
    }

    public final Map zzd() {
        return this.zze;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final Set zzf() {
        return this.zza;
    }

    public final void zzg(zzri zzri2, zzre zzre2) {
        ArrayList<zzre> arrayList = (ArrayList<zzre>)this.zzb.get(zzri2);
        if (arrayList == null) {
            arrayList = new ArrayList<zzre>();
            Map map2 = this.zzb;
            map2.put(zzri2, arrayList);
        }
        arrayList.add(zzre2);
    }

    public final void zzh(zzri zzri2, String list) {
        list = (List)this.zzd.get(zzri2);
        if (list == null) {
            list = new List<String>();
            Map map2 = this.zzd;
            map2.put(zzri2, list);
        }
        list.add("Unknown");
    }

    public final void zzi(zzri zzri2, zzre zzre2) {
        ArrayList<zzre> arrayList = (ArrayList<zzre>)this.zzc.get(zzri2);
        if (arrayList == null) {
            arrayList = new ArrayList<zzre>();
            Map map2 = this.zzc;
            map2.put(zzri2, arrayList);
        }
        arrayList.add(zzre2);
    }

    public final void zzj(zzri zzri2, String list) {
        list = (List)this.zze.get(zzri2);
        if (list == null) {
            list = new List<String>();
            Map map2 = this.zze;
            map2.put(zzri2, list);
        }
        list.add("Unknown");
    }

    public final void zzk(zzri zzri2) {
        this.zza.add(zzri2);
    }

    public final void zzl(zzre zzre2) {
        this.zzf = zzre2;
    }
}

