/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhei;
import com.google.android.gms.internal.ads.zzhej;
import com.google.android.gms.internal.ads.zzhem;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class zzhek
extends AbstractSet {
    final /* synthetic */ zzhem zza;

    public /* synthetic */ zzhek(zzhem zzhem2, zzhej zzhej2) {
        this.zza = zzhem2;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object object) {
        object = (Map.Entry)object;
        Object object2 = object.getKey();
        zzhem zzhem2 = this.zza;
        object2 = zzhem2.get(object2);
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
                zzhem2 = null;
            }
        }
        return bl2;
    }

    public final Iterator iterator() {
        zzhem zzhem2 = this.zza;
        zzhei zzhei2 = new zzhei(zzhem2, null);
        return zzhei2;
    }

    public final boolean remove(Object object) {
        boolean bl2 = this.contains(object = (Map.Entry)object);
        if (bl2) {
            zzhem zzhem2 = this.zza;
            object = object.getKey();
            zzhem2.remove(object);
            return true;
        }
        return false;
    }

    public final int size() {
        return this.zza.size();
    }
}

