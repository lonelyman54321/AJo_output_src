/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzcz;
import com.google.android.gms.internal.vision.zzdp;
import com.google.android.gms.internal.vision.zzea;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class zzdt
extends AbstractSet {
    private final /* synthetic */ zzdp zza;

    public zzdt(zzdp zzdp2) {
        this.zza = zzdp2;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object object) {
        boolean bl2;
        int n3;
        Object object2;
        Map map2 = this.zza.zzb();
        if (map2 != null) {
            return map2.entrySet().contains(object);
        }
        int n4 = object instanceof Map.Entry;
        return n4 != 0 && (n4 = zzdp.zzb((zzdp)(map2 = this.zza), object2 = (object = (Map.Entry)object).getKey())) != (n3 = -1) && (bl2 = zzcz.zza(map2 = (object2 = this.zza.zzc)[n4], object = object.getValue()));
    }

    public final Iterator iterator() {
        return this.zza.zzf();
    }

    public final boolean remove(Object object) {
        Map map2 = this.zza.zzb();
        if (map2 != null) {
            return map2.entrySet().remove(object);
        }
        boolean n3 = object instanceof Map.Entry;
        if (n3) {
            int n4;
            object = (Map.Entry)object;
            map2 = this.zza;
            boolean bl2 = ((zzdp)map2).zza();
            if (bl2) {
                return false;
            }
            map2 = this.zza;
            int n7 = zzdp.zzb((zzdp)map2);
            Object k2 = object.getKey();
            Object v4 = object.getValue();
            Object object2 = zzdp.zzc(this.zza);
            object = this.zza;
            int[] nArray = ((zzdp)object).zza;
            Object[] objectArray = ((zzdp)object).zzb;
            Object[] objectArray2 = ((zzdp)object).zzc;
            int n8 = zzea.zza(k2, v4, n7, object2, nArray, objectArray, objectArray2);
            if (n8 == (n4 = -1)) {
                return false;
            }
            this.zza.zza(n8, n7);
            zzdp.zzd(this.zza);
            this.zza.zzc();
            return true;
        }
        return false;
    }

    public final int size() {
        return this.zza.size();
    }
}

