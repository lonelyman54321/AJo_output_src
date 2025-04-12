/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzmf;
import com.google.android.gms.internal.measurement.zzmu;
import com.google.android.gms.internal.measurement.zzmx;
import com.google.android.gms.internal.measurement.zznl;

final class zzmw
extends zzmu {
    private static void zza(Object object, zzmx zzmx2) {
        ((zzkg)object).zzb = zzmx2;
    }

    public final /* synthetic */ int zza(Object object) {
        return ((zzmx)object).zza();
    }

    public final /* synthetic */ Object zza() {
        return zzmx.zzd();
    }

    public final /* synthetic */ Object zza(Object object, Object object2) {
        object = (zzmx)object;
        object2 = (zzmx)object2;
        zzmx zzmx2 = zzmx.zzc();
        boolean bl2 = zzmx2.equals(object2);
        if (bl2) {
            return object;
        }
        zzmx2 = zzmx.zzc();
        bl2 = zzmx2.equals(object);
        if (bl2) {
            return zzmx.zza((zzmx)object, (zzmx)object2);
        }
        return ((zzmx)object).zza((zzmx)object2);
    }

    public final /* synthetic */ void zza(Object object, int n3, int n4) {
        object = (zzmx)object;
        n3 = n3 << 3 | 5;
        Integer n7 = n4;
        ((zzmx)object).zza(n3, n7);
    }

    public final /* synthetic */ void zza(Object object, int n3, long l2) {
        object = (zzmx)object;
        n3 = n3 << 3 | 1;
        Long l3 = l2;
        ((zzmx)object).zza(n3, l3);
    }

    public final /* synthetic */ void zza(Object object, int n3, zziy zziy2) {
        object = (zzmx)object;
        n3 = n3 << 3 | 2;
        ((zzmx)object).zza(n3, zziy2);
    }

    public final /* synthetic */ void zza(Object object, int n3, Object object2) {
        object = (zzmx)object;
        object2 = (zzmx)object2;
        n3 = n3 << 3 | 3;
        ((zzmx)object).zza(n3, object2);
    }

    public final /* synthetic */ void zza(Object object, zznl zznl2) {
        ((zzmx)object).zza(zznl2);
    }

    public final boolean zza(zzmf zzmf2) {
        return false;
    }

    public final /* synthetic */ int zzb(Object object) {
        return ((zzmx)object).zzb();
    }

    public final /* synthetic */ void zzb(Object object, int n3, long l2) {
        object = (zzmx)object;
        Long l3 = l2;
        ((zzmx)object).zza(n3 <<= 3, l3);
    }

    public final /* synthetic */ void zzb(Object object, zznl zznl2) {
        ((zzmx)object).zzb(zznl2);
    }

    public final /* synthetic */ void zzb(Object object, Object object2) {
        object2 = (zzmx)object2;
        zzmw.zza(object, (zzmx)object2);
    }

    public final /* synthetic */ Object zzc(Object object) {
        Object object2 = object;
        object2 = ((zzkg)object).zzb;
        zzmx zzmx2 = zzmx.zzc();
        if (object2 == zzmx2) {
            object2 = zzmx.zzd();
            zzmw.zza(object, (zzmx)object2);
        }
        return object2;
    }

    public final /* synthetic */ void zzc(Object object, Object object2) {
        object2 = (zzmx)object2;
        zzmw.zza(object, (zzmx)object2);
    }

    public final /* synthetic */ Object zzd(Object object) {
        return ((zzkg)object).zzb;
    }

    public final /* synthetic */ Object zze(Object object) {
        object = (zzmx)object;
        ((zzmx)object).zze();
        return object;
    }

    public final void zzf(Object object) {
        ((zzkg)object).zzb.zze();
    }
}

