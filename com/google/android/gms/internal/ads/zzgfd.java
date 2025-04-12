/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.ads.zzgbs;
import com.google.android.gms.internal.ads.zzges;
import com.google.android.gms.internal.ads.zzgfc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class zzgfd
extends zzges {
    private List zza;

    public zzgfd(zzgax zzgax2, boolean bl2) {
        int n3;
        ArrayList arrayList;
        int n4 = 1;
        super(zzgax2, bl2, n4 != 0);
        boolean bl3 = zzgax2.isEmpty();
        if (bl3) {
            arrayList = Collections.emptyList();
        } else {
            int n7 = zzgax2.size();
            arrayList = zzgbs.zza(n7);
        }
        for (n4 = 0; n4 < (n3 = zzgax2.size()); ++n4) {
            n3 = 0;
            arrayList.add(null);
        }
        this.zza = arrayList;
    }

    public abstract Object zzG(List var1);

    public final void zzf(int n3, Object object) {
        List list = this.zza;
        if (list != null) {
            zzgfc zzgfc2 = new zzgfc(object);
            list.set(n3, zzgfc2);
        }
    }

    public final void zzu() {
        Object object = this.zza;
        if (object != null) {
            object = this.zzG((List)object);
            this.zzc(object);
        }
    }

    public final void zzy(int n3) {
        super.zzy(n3);
        this.zza = null;
    }
}

