/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzld;
import com.google.android.gms.internal.vision.zzlu;
import com.google.android.gms.internal.vision.zzlx;
import com.google.android.gms.internal.vision.zzmr;

final class zzlw
extends zzlu {
    private static void zza(Object object, zzlx zzlx2) {
        ((zzjb)object).zzb = zzlx2;
    }

    public final /* synthetic */ Object zza() {
        return zzlx.zzb();
    }

    public final /* synthetic */ Object zza(Object object) {
        object = (zzlx)object;
        ((zzlx)object).zzc();
        return object;
    }

    public final /* synthetic */ void zza(Object object, int n3, int n4) {
        object = (zzlx)object;
        n3 = n3 << 3 | 5;
        Integer n7 = n4;
        ((zzlx)object).zza(n3, n7);
    }

    public final /* synthetic */ void zza(Object object, int n3, long l2) {
        object = (zzlx)object;
        Long l3 = l2;
        ((zzlx)object).zza(n3 <<= 3, l3);
    }

    public final /* synthetic */ void zza(Object object, int n3, zzht zzht2) {
        object = (zzlx)object;
        n3 = n3 << 3 | 2;
        ((zzlx)object).zza(n3, zzht2);
    }

    public final /* synthetic */ void zza(Object object, int n3, Object object2) {
        object = (zzlx)object;
        object2 = (zzlx)object2;
        n3 = n3 << 3 | 3;
        ((zzlx)object).zza(n3, object2);
    }

    public final /* synthetic */ void zza(Object object, zzmr zzmr2) {
        ((zzlx)object).zzb(zzmr2);
    }

    public final boolean zza(zzld zzld2) {
        return false;
    }

    public final /* synthetic */ Object zzb(Object object) {
        return ((zzjb)object).zzb;
    }

    public final /* synthetic */ void zzb(Object object, int n3, long l2) {
        object = (zzlx)object;
        n3 = n3 << 3 | 1;
        Long l3 = l2;
        ((zzlx)object).zza(n3, l3);
    }

    public final /* synthetic */ void zzb(Object object, zzmr zzmr2) {
        ((zzlx)object).zza(zzmr2);
    }

    public final /* synthetic */ void zzb(Object object, Object object2) {
        object2 = (zzlx)object2;
        zzlw.zza(object, (zzlx)object2);
    }

    public final /* synthetic */ Object zzc(Object object) {
        Object object2 = object;
        object2 = ((zzjb)object).zzb;
        zzlx zzlx2 = zzlx.zza();
        if (object2 == zzlx2) {
            object2 = zzlx.zzb();
            zzlw.zza(object, (zzlx)object2);
        }
        return object2;
    }

    public final /* synthetic */ Object zzc(Object object, Object object2) {
        object = (zzlx)object;
        zzlx zzlx2 = zzlx.zza();
        boolean bl2 = ((zzlx)(object2 = (zzlx)object2)).equals(zzlx2);
        if (bl2) {
            return object;
        }
        return zzlx.zza((zzlx)object, (zzlx)object2);
    }

    public final void zzd(Object object) {
        ((zzjb)object).zzb.zzc();
    }

    public final /* synthetic */ int zze(Object object) {
        return ((zzlx)object).zzd();
    }

    public final /* synthetic */ int zzf(Object object) {
        return ((zzlx)object).zze();
    }
}

