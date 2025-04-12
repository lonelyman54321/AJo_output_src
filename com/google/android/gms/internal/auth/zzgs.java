/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzgq;
import com.google.android.gms.internal.auth.zzgr;
import com.google.android.gms.internal.auth.zzgu;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class zzgs
extends AbstractSet {
    final /* synthetic */ zzgu zza;

    public /* synthetic */ zzgs(zzgu zzgu2, zzgr zzgr2) {
        this.zza = zzgu2;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object object) {
        object = (Map.Entry)object;
        Object object2 = this.zza;
        Object k2 = object.getKey();
        object2 = ((zzgu)object2).get(k2);
        object = object.getValue();
        boolean bl2 = true;
        if (object2 != object) {
            if (object2 != null) {
                boolean bl3 = object2.equals(object);
                if (!bl3) {
                    return false;
                }
            } else {
                bl2 = false;
                k2 = null;
            }
        }
        return bl2;
    }

    public final Iterator iterator() {
        zzgu zzgu2 = this.zza;
        zzgq zzgq2 = new zzgq(zzgu2, null);
        return zzgq2;
    }

    public final boolean remove(Object object) {
        boolean bl2 = this.contains(object = (Map.Entry)object);
        if (bl2) {
            zzgu zzgu2 = this.zza;
            object = object.getKey();
            zzgu2.remove(object);
            return true;
        }
        return false;
    }

    public final int size() {
        return this.zza.size();
    }
}

