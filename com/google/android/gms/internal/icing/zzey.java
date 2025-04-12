/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzes;
import com.google.android.gms.internal.icing.zzex;
import com.google.android.gms.internal.icing.zzez;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class zzey
extends AbstractSet {
    final /* synthetic */ zzez zza;

    public /* synthetic */ zzey(zzez zzez2, zzes zzes2) {
        this.zza = zzez2;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object object) {
        object = (Map.Entry)object;
        Object object2 = this.zza;
        Object k2 = object.getKey();
        object2 = ((zzez)object2).get(k2);
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
        zzez zzez2 = this.zza;
        zzex zzex2 = new zzex(zzez2, null);
        return zzex2;
    }

    public final boolean remove(Object object) {
        boolean bl2 = this.contains(object = (Map.Entry)object);
        if (bl2) {
            zzez zzez2 = this.zza;
            object = object.getKey();
            zzez2.remove(object);
            return true;
        }
        return false;
    }

    public final int size() {
        return this.zza.size();
    }
}

