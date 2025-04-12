/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzghx;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgon;
import com.google.android.gms.internal.ads.zzgor;
import com.google.android.gms.internal.ads.zzgpq;
import com.google.android.gms.internal.ads.zzgpu;
import com.google.android.gms.internal.ads.zzgqq;
import com.google.android.gms.internal.ads.zzgqr;
import com.google.android.gms.internal.ads.zzgqt;
import com.google.android.gms.internal.ads.zzgqv;
import com.google.android.gms.internal.ads.zzgqw;
import com.google.android.gms.internal.ads.zzgze;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzgqx {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgqx(zzgqr object, zzgqw hashMap) {
        Map map2 = zzgqr.zzf((zzgqr)object);
        this.zza = hashMap = new HashMap(map2);
        map2 = zzgqr.zze((zzgqr)object);
        this.zzb = hashMap = new HashMap(map2);
        map2 = zzgqr.zzh((zzgqr)object);
        this.zzc = hashMap = new HashMap(map2);
        object = zzgqr.zzg((zzgqr)object);
        this.zzd = hashMap = new HashMap(object);
    }

    public static /* bridge */ /* synthetic */ Map zze(zzgqx zzgqx2) {
        return zzgqx2.zzb;
    }

    public static /* bridge */ /* synthetic */ Map zzf(zzgqx zzgqx2) {
        return zzgqx2.zza;
    }

    public static /* bridge */ /* synthetic */ Map zzg(zzgqx zzgqx2) {
        return zzgqx2.zzd;
    }

    public static /* bridge */ /* synthetic */ Map zzh(zzgqx zzgqx2) {
        return zzgqx2.zzc;
    }

    public final zzghi zza(zzgqq object, zzgic object2) {
        Object object3 = object.getClass();
        object3 = this.zzb;
        zzgze zzgze2 = object.zzd();
        zzgqt zzgqt2 = new zzgqt((Class)object3, zzgze2, null);
        boolean bl2 = object3.containsKey(zzgqt2);
        if (bl2) {
            return ((zzgon)this.zzb.get(zzgqt2)).zza((zzgqq)object, (zzgic)object2);
        }
        object2 = zzgqt2.toString();
        object2 = cP.a("No Key Parser for requested key type ", (String)object2, " available");
        object = new GeneralSecurityException((String)object2);
        throw object;
    }

    public final zzghx zzb(zzgqq object) {
        Object object2 = object.getClass();
        object2 = this.zzd;
        zzgze zzgze2 = object.zzd();
        Object object3 = new zzgqt((Class)object2, zzgze2, null);
        boolean bl2 = object2.containsKey(object3);
        if (bl2) {
            return ((zzgpq)this.zzd.get(object3)).zza((zzgqq)object);
        }
        object3 = ((zzgqt)object3).toString();
        object3 = cP.a("No Parameters Parser for requested key type ", (String)object3, " available");
        object = new GeneralSecurityException((String)object3);
        throw object;
    }

    public final zzgqq zzc(zzghi object, Class object2, zzgic zzgic2) {
        object2 = this.zza;
        Class<?> clazz = object.getClass();
        zzgqv zzgqv2 = new zzgqv(clazz, (Class)object2, null);
        boolean bl2 = object2.containsKey(zzgqv2);
        if (bl2) {
            return ((zzgor)this.zza.get(zzgqv2)).zza((zzghi)object, zzgic2);
        }
        object2 = zzgqv2.toString();
        object2 = cP.a("No Key serializer for ", (String)object2, " available");
        object = new GeneralSecurityException((String)object2);
        throw object;
    }

    public final zzgqq zzd(zzghx object, Class object2) {
        object2 = this.zzc;
        Class<?> clazz = object.getClass();
        zzgqv zzgqv2 = new zzgqv(clazz, (Class)object2, null);
        boolean bl2 = object2.containsKey(zzgqv2);
        if (bl2) {
            return ((zzgpu)this.zzc.get(zzgqv2)).zza((zzghx)object);
        }
        object2 = zzgqv2.toString();
        object2 = cP.a("No Key Format serializer for ", (String)object2, " available");
        object = new GeneralSecurityException((String)object2);
        throw object;
    }

    public final boolean zzi(zzgqq object) {
        Class<?> clazz = object.getClass();
        object = object.zzd();
        zzgqt zzgqt2 = new zzgqt(clazz, (zzgze)object, null);
        return this.zzb.containsKey(zzgqt2);
    }

    public final boolean zzj(zzgqq object) {
        Class<?> clazz = object.getClass();
        object = object.zzd();
        zzgqt zzgqt2 = new zzgqt(clazz, (zzgze)object, null);
        return this.zzd.containsKey(zzgqt2);
    }
}

