/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzajn;
import com.google.android.gms.internal.ads.zzajo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class zzajm
extends zzajo {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzajm(int n3, long l2) {
        super(n3);
        ArrayList arrayList;
        this.zza = l2;
        this.zzb = arrayList = new ArrayList();
        this.zzc = arrayList = new ArrayList();
    }

    public final String toString() {
        Object object = this.zzb;
        String string2 = zzajo.zzf(this.zzd);
        object = Arrays.toString(object.toArray());
        String string3 = Arrays.toString(this.zzc.toArray());
        return KW.a(string2, " leaves: ", (String)object, " containers: ", string3);
    }

    public final zzajm zza(int n3) {
        List list = this.zzc;
        int n4 = list.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            zzajm zzajm2 = (zzajm)this.zzc.get(i3);
            int n7 = zzajm2.zzd;
            if (n7 != n3) continue;
            return zzajm2;
        }
        return null;
    }

    public final zzajn zzb(int n3) {
        List list = this.zzb;
        int n4 = list.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            zzajn zzajn2 = (zzajn)this.zzb.get(i3);
            int n7 = zzajn2.zzd;
            if (n7 != n3) continue;
            return zzajn2;
        }
        return null;
    }

    public final void zzc(zzajm zzajm2) {
        this.zzc.add(zzajm2);
    }

    public final void zzd(zzajn zzajn2) {
        this.zzb.add(zzajn2);
    }
}

