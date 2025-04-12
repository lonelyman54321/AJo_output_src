/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaec;
import com.google.android.gms.internal.gtm.zzaee;
import com.google.android.gms.internal.gtm.zzaef;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class zzaed
extends AbstractSet {
    final /* synthetic */ zzaef zza;

    public /* synthetic */ zzaed(zzaef zzaef2, zzaee zzaee2) {
        this.zza = zzaef2;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object object) {
        object = (Map.Entry)object;
        Object object2 = object.getKey();
        zzaef zzaef2 = this.zza;
        object2 = zzaef2.get(object2);
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
                zzaef2 = null;
            }
        }
        return bl2;
    }

    public final Iterator iterator() {
        zzaef zzaef2 = this.zza;
        zzaec zzaec2 = new zzaec(zzaef2, null);
        return zzaec2;
    }

    public final boolean remove(Object object) {
        boolean bl2 = this.contains(object = (Map.Entry)object);
        if (bl2) {
            zzaef zzaef2 = this.zza;
            object = object.getKey();
            zzaef2.remove(object);
            return true;
        }
        return false;
    }

    public final int size() {
        return this.zza.size();
    }
}

