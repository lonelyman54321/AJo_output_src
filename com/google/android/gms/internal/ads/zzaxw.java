/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzaxw {
    private List zza;

    public zzaxw() {
        List list;
        this.zza = list = Collections.emptyList();
    }

    public final List zza() {
        List list;
        List list2 = this.zza;
        this.zza = list = Collections.emptyList();
        return list2;
    }

    public final void zzb(List list) {
        ArrayList arrayList;
        this.zza = arrayList = new ArrayList(list);
    }
}

