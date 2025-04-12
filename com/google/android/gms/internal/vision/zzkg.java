/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzkc;
import com.google.android.gms.internal.vision.zzke;
import com.google.android.gms.internal.vision.zzkf;
import com.google.android.gms.internal.vision.zzkh;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

final class zzkg
implements zzkh {
    public final int zza(int n3, Object object, Object object2) {
        object = (zzke)object;
        object2 = (zzkc)object2;
        n3 = (int)(((AbstractMap)object).isEmpty() ? 1 : 0);
        object2 = null;
        if (n3 != 0) {
            return 0;
        }
        Iterator iterator = ((zzke)object).entrySet().iterator();
        boolean bl2 = iterator.hasNext();
        if (!bl2) {
            return 0;
        }
        iterator = (Map.Entry)iterator.next();
        iterator.getKey();
        iterator.getValue();
        iterator = new NoSuchMethodError();
        throw iterator;
    }

    public final Object zza(Object object, Object object2) {
        object = (zzke)object;
        boolean bl2 = ((AbstractMap)(object2 = (zzke)object2)).isEmpty();
        if (!bl2) {
            bl2 = ((zzke)object).zzd();
            if (!bl2) {
                object = ((zzke)object).zzb();
            }
            ((zzke)object).zza((zzke)object2);
        }
        return object;
    }

    public final Map zza(Object object) {
        return (zzke)object;
    }

    public final zzkf zzb(Object object) {
        object = (zzkc)object;
        object = new NoSuchMethodError();
        throw object;
    }

    public final Map zzc(Object object) {
        return (zzke)object;
    }

    public final boolean zzd(Object object) {
        boolean bl2 = ((zzke)(object = (zzke)object)).zzd();
        return !bl2;
    }

    public final Object zze(Object object) {
        ((zzke)object).zzc();
        return object;
    }

    public final Object zzf(Object object) {
        return zzke.zza().zzb();
    }
}

