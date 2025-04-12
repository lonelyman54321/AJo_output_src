/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgae;
import com.google.android.gms.internal.ads.zzgal;
import java.util.AbstractCollection;
import java.util.Iterator;

final class zzgak
extends AbstractCollection {
    final /* synthetic */ zzgal zza;

    public zzgak(zzgal zzgal2) {
        this.zza = zzgal2;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final Iterator iterator() {
        Object object = this.zza;
        Object object2 = ((zzgal)object).zzl();
        object = object2 != null ? object2.values().iterator() : (object2 = new zzgae((zzgal)object));
        return object;
    }

    public final int size() {
        return this.zza.size();
    }
}

