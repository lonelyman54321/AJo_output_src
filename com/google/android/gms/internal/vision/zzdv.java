/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzdp;
import java.util.AbstractSet;
import java.util.Iterator;

final class zzdv
extends AbstractSet {
    private final /* synthetic */ zzdp zza;

    public zzdv(zzdp zzdp2) {
        this.zza = zzdp2;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object object) {
        return this.zza.containsKey(object);
    }

    public final Iterator iterator() {
        return this.zza.zze();
    }

    public final boolean remove(Object object) {
        Object object2 = this.zza.zzb();
        if (object2 != null) {
            return object2.keySet().remove(object);
        }
        return (object = zzdp.zza(this.zza, object)) != (object2 = zzdp.zzh());
    }

    public final int size() {
        return this.zza.size();
    }
}

