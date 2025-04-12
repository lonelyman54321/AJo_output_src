/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzcz;
import com.google.android.gms.internal.ads.zzdb;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzvc;
import com.google.android.gms.internal.ads.zzvi;

final class zzvh
extends zzvc {
    public static final Object zzd;
    private final Object zze;
    private final Object zzf;

    static {
        Object object;
        zzd = object = new Object();
    }

    private zzvh(zzdc zzdc2, Object object, Object object2) {
        super(zzdc2);
        this.zze = object;
        this.zzf = object2;
    }

    public static zzvh zzq(zzbu object) {
        zzvi zzvi2 = new zzvi((zzbu)object);
        object = zzdb.zza;
        Object object2 = zzd;
        zzvh zzvh2 = new zzvh(zzvi2, object, object2);
        return zzvh2;
    }

    public static zzvh zzr(zzdc zzdc2, Object object, Object object2) {
        zzvh zzvh2 = new zzvh(zzdc2, object, object2);
        return zzvh2;
    }

    public static /* bridge */ /* synthetic */ Object zzs(zzvh zzvh2) {
        return zzvh2.zzf;
    }

    public final int zza(Object object) {
        Object object2 = zzd;
        boolean bl2 = object2.equals(object);
        if (bl2 && (object2 = this.zzf) != null) {
            object = object2;
        }
        return this.zzc.zza(object);
    }

    public final zzcz zzd(int n3, zzcz zzcz2, boolean bl2) {
        this.zzc.zzd(n3, zzcz2, bl2);
        Object object = zzcz2.zzc;
        Object object2 = this.zzf;
        n3 = (int)(zzgd.zzG(object, object2) ? 1 : 0);
        if (n3 != 0 && bl2) {
            zzcz2.zzc = object = zzd;
        }
        return zzcz2;
    }

    public final zzdb zze(int n3, zzdb zzdb2, long l2) {
        zzdc zzdc2 = this.zzc;
        zzdc2.zze(n3, zzdb2, l2);
        Object object = zzdb2.zzc;
        Object object2 = this.zze;
        n3 = (int)(zzgd.zzG(object, object2) ? 1 : 0);
        if (n3 != 0) {
            zzdb2.zzc = object = zzdb.zza;
        }
        return zzdb2;
    }

    public final Object zzf(int n3) {
        Object object;
        Object object2 = this.zzc.zzf(n3);
        boolean bl2 = zzgd.zzG(object2, object = this.zzf);
        if (bl2) {
            object2 = zzd;
        }
        return object2;
    }

    public final zzvh zzp(zzdc zzdc2) {
        Object object = this.zze;
        Object object2 = this.zzf;
        zzvh zzvh2 = new zzvh(zzdc2, object, object2);
        return zzvh2;
    }
}

