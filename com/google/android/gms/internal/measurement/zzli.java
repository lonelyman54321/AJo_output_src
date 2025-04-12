/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzle;
import com.google.android.gms.internal.measurement.zzlg;
import com.google.android.gms.internal.measurement.zzlh;
import com.google.android.gms.internal.measurement.zzlj;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

final class zzli
implements zzlj {
    public final int zza(int n3, Object object, Object object2) {
        object = (zzlg)object;
        object2 = (zzle)object2;
        n3 = (int)(((AbstractMap)object).isEmpty() ? 1 : 0);
        object2 = null;
        if (n3 != 0) {
            return 0;
        }
        Iterator iterator = ((zzlg)object).entrySet().iterator();
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

    public final zzlh zza(Object object) {
        object = (zzle)object;
        object = new NoSuchMethodError();
        throw object;
    }

    public final Object zza(Object object, Object object2) {
        object = (zzlg)object;
        boolean bl2 = ((AbstractMap)(object2 = (zzlg)object2)).isEmpty();
        if (!bl2) {
            bl2 = ((zzlg)object).zzd();
            if (!bl2) {
                object = ((zzlg)object).zzb();
            }
            ((zzlg)object).zza((zzlg)object2);
        }
        return object;
    }

    public final Object zzb(Object object) {
        return zzlg.zza().zzb();
    }

    public final Object zzc(Object object) {
        ((zzlg)object).zzc();
        return object;
    }

    public final Map zzd(Object object) {
        return (zzlg)object;
    }

    public final Map zze(Object object) {
        return (zzlg)object;
    }

    public final boolean zzf(Object object) {
        boolean bl2 = ((zzlg)(object = (zzlg)object)).zzd();
        return !bl2;
    }
}

