/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbx;
import java.util.AbstractList;
import java.util.List;

public final class zzhby
extends AbstractList {
    private final List zza;
    private final zzhbx zzb;

    public zzhby(List list, zzhbx zzhbx2) {
        this.zza = list;
        this.zzb = zzhbx2;
    }

    public final Object get(int n3) {
        List list = this.zza;
        zzhbx zzhbx2 = this.zzb;
        Object e2 = list.get(n3);
        return zzhbx2.zzb(e2);
    }

    public final int size() {
        return this.zza.size();
    }
}

