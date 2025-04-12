/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfya;
import com.google.android.gms.internal.ads.zzgad;
import com.google.android.gms.internal.ads.zzgal;
import com.google.android.gms.internal.ads.zzgam;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class zzgaf
extends AbstractSet {
    final /* synthetic */ zzgal zza;

    public zzgaf(zzgal zzgal2) {
        this.zza = zzgal2;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object object) {
        boolean bl2;
        int n3;
        Object object2;
        Object object3 = this.zza.zzl();
        if (object3 != null) {
            return object3.entrySet().contains(object);
        }
        int n4 = object instanceof Map.Entry;
        return n4 != 0 && (n4 = zzgal.zzd((zzgal)(object3 = this.zza), object2 = (object = (Map.Entry)object).getKey())) != (n3 = -1) && (bl2 = zzfya.zza(object3 = zzgal.zzj(object2 = this.zza, n4), object = object.getValue()));
    }

    public final Iterator iterator() {
        Object object = this.zza;
        Object object2 = ((zzgal)object).zzl();
        object = object2 != null ? object2.entrySet().iterator() : (object2 = new zzgad((zzgal)object));
        return object;
    }

    public final boolean remove(Object object) {
        Map map2 = this.zza.zzl();
        if (map2 != null) {
            return map2.entrySet().remove(object);
        }
        int n3 = object instanceof Map.Entry;
        if (n3 != 0) {
            object = (Map.Entry)object;
            map2 = this.zza;
            boolean n4 = ((zzgal)map2).zzr();
            if (!n4) {
                int n7;
                Object[] objectArray;
                Object[] objectArray2;
                int[] nArray;
                Object object2;
                Object v4;
                n3 = zzgal.zzc((zzgal)map2);
                Object k2 = object.getKey();
                int n8 = zzgam.zzb(k2, v4 = object.getValue(), n3, object2 = zzgal.zzi((zzgal)(object = this.zza)), nArray = zzgal.zzs((zzgal)object), objectArray2 = zzgal.zzt((zzgal)object), objectArray = zzgal.zzu((zzgal)object));
                if (n8 != (n7 = -1)) {
                    this.zza.zzq(n8, n3);
                    object = this.zza;
                    n3 = zzgal.zzb((zzgal)object) + n7;
                    zzgal.zzm((zzgal)object, n3);
                    this.zza.zzo();
                    return true;
                }
            }
        }
        return false;
    }

    public final int size() {
        return this.zza.size();
    }
}

