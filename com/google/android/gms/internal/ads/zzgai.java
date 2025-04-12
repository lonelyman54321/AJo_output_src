/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgac;
import com.google.android.gms.internal.ads.zzgal;
import java.util.AbstractSet;
import java.util.Iterator;

final class zzgai
extends AbstractSet {
    final /* synthetic */ zzgal zza;

    public zzgai(zzgal zzgal2) {
        this.zza = zzgal2;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object object) {
        return this.zza.containsKey(object);
    }

    public final Iterator iterator() {
        Object object = this.zza;
        Object object2 = ((zzgal)object).zzl();
        object = object2 != null ? object2.keySet().iterator() : (object2 = new zzgac((zzgal)object));
        return object;
    }

    public final boolean remove(Object object) {
        block4: {
            boolean bl2;
            block3: {
                Object object2;
                block2: {
                    object2 = this.zza.zzl();
                    if (object2 == null) break block2;
                    object2 = object2.keySet();
                    bl2 = object2.remove(object);
                    break block3;
                }
                if ((object = zzgal.zzh(this.zza, object)) != (object2 = zzgal.zzk())) break block4;
                bl2 = false;
                object = null;
            }
            return bl2;
        }
        return true;
    }

    public final int size() {
        return this.zza.size();
    }
}

