/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgon;
import com.google.android.gms.internal.ads.zzgor;
import com.google.android.gms.internal.ads.zzgpq;
import com.google.android.gms.internal.ads.zzgpu;
import com.google.android.gms.internal.ads.zzgqt;
import com.google.android.gms.internal.ads.zzgqv;
import com.google.android.gms.internal.ads.zzgqx;
import com.google.android.gms.internal.ads.zzgze;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzgqr {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzgqr() {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
        this.zzb = hashMap = new HashMap();
        this.zzc = hashMap = new HashMap();
        this.zzd = hashMap = new HashMap();
    }

    public zzgqr(zzgqx object) {
        HashMap hashMap;
        Map map2 = zzgqx.zzf((zzgqx)object);
        this.zza = hashMap = new HashMap(map2);
        map2 = zzgqx.zze((zzgqx)object);
        this.zzb = hashMap = new HashMap(map2);
        map2 = zzgqx.zzh((zzgqx)object);
        this.zzc = hashMap = new HashMap(map2);
        object = zzgqx.zzg((zzgqx)object);
        this.zzd = hashMap = new HashMap(object);
    }

    public static /* bridge */ /* synthetic */ Map zze(zzgqr zzgqr2) {
        return zzgqr2.zzb;
    }

    public static /* bridge */ /* synthetic */ Map zzf(zzgqr zzgqr2) {
        return zzgqr2.zza;
    }

    public static /* bridge */ /* synthetic */ Map zzg(zzgqr zzgqr2) {
        return zzgqr2.zzd;
    }

    public static /* bridge */ /* synthetic */ Map zzh(zzgqr zzgqr2) {
        return zzgqr2.zzc;
    }

    public final zzgqr zza(zzgon object) {
        Object object2 = ((zzgon)object).zzd();
        object2 = this.zzb;
        zzgze zzgze2 = ((zzgon)object).zzc();
        Object object3 = new zzgqt((Class)object2, zzgze2, null);
        boolean bl2 = object2.containsKey(object3);
        if (bl2) {
            boolean bl3;
            object2 = (zzgon)this.zzb.get(object3);
            boolean bl4 = object2.equals(object);
            if (!bl4 || !(bl3 = object.equals(object2))) {
                object3 = ((zzgqt)object3).toString();
                object3 = "Attempt to register non-equal parser for already existing object of type: ".concat((String)object3);
                object = new GeneralSecurityException((String)object3);
                throw object;
            }
        } else {
            object2 = this.zzb;
            object2.put(object3, object);
        }
        return this;
    }

    public final zzgqr zzb(zzgor object) {
        Object object2 = ((zzgor)object).zzc();
        object2 = this.zza;
        Class clazz = ((zzgor)object).zzd();
        Object object3 = new zzgqv((Class)object2, clazz, null);
        boolean bl2 = object2.containsKey(object3);
        if (bl2) {
            boolean bl3;
            object2 = (zzgor)this.zza.get(object3);
            boolean bl4 = object2.equals(object);
            if (!bl4 || !(bl3 = object.equals(object2))) {
                object3 = ((zzgqv)object3).toString();
                object3 = "Attempt to register non-equal serializer for already existing object of type: ".concat((String)object3);
                object = new GeneralSecurityException((String)object3);
                throw object;
            }
        } else {
            object2 = this.zza;
            object2.put(object3, object);
        }
        return this;
    }

    public final zzgqr zzc(zzgpq object) {
        Object object2 = ((zzgpq)object).zzd();
        object2 = this.zzd;
        zzgze zzgze2 = ((zzgpq)object).zzc();
        Object object3 = new zzgqt((Class)object2, zzgze2, null);
        boolean bl2 = object2.containsKey(object3);
        if (bl2) {
            boolean bl3;
            object2 = (zzgpq)this.zzd.get(object3);
            boolean bl4 = object2.equals(object);
            if (!bl4 || !(bl3 = object.equals(object2))) {
                object3 = ((zzgqt)object3).toString();
                object3 = "Attempt to register non-equal parser for already existing object of type: ".concat((String)object3);
                object = new GeneralSecurityException((String)object3);
                throw object;
            }
        } else {
            object2 = this.zzd;
            object2.put(object3, object);
        }
        return this;
    }

    public final zzgqr zzd(zzgpu object) {
        Object object2 = ((zzgpu)object).zzc();
        object2 = this.zzc;
        Class clazz = ((zzgpu)object).zzd();
        Object object3 = new zzgqv((Class)object2, clazz, null);
        boolean bl2 = object2.containsKey(object3);
        if (bl2) {
            boolean bl3;
            object2 = (zzgpu)this.zzc.get(object3);
            boolean bl4 = object2.equals(object);
            if (!bl4 || !(bl3 = object.equals(object2))) {
                object3 = ((zzgqv)object3).toString();
                object3 = "Attempt to register non-equal serializer for already existing object of type: ".concat((String)object3);
                object = new GeneralSecurityException((String)object3);
                throw object;
            }
        } else {
            object2 = this.zzc;
            object2.put(object3, object);
        }
        return this;
    }
}

