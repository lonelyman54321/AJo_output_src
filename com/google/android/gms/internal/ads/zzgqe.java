/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzghy;
import com.google.android.gms.internal.ads.zzgpy;
import com.google.android.gms.internal.ads.zzgqa;
import com.google.android.gms.internal.ads.zzgqc;
import com.google.android.gms.internal.ads.zzgqd;
import com.google.android.gms.internal.ads.zzgqk;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzgqe {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgqe(zzgqa object, zzgqd hashMap) {
        Map map2 = zzgqa.zzc((zzgqa)object);
        this.zza = hashMap = new HashMap(map2);
        object = zzgqa.zzd((zzgqa)object);
        this.zzb = hashMap = new HashMap(object);
    }

    public static /* bridge */ /* synthetic */ Map zzd(zzgqe zzgqe2) {
        return zzgqe2.zza;
    }

    public static /* bridge */ /* synthetic */ Map zze(zzgqe zzgqe2) {
        return zzgqe2.zzb;
    }

    public final Class zza(Class object) {
        Object object2 = this.zzb;
        boolean bl2 = object2.containsKey(object);
        if (bl2) {
            return ((zzghy)this.zzb.get(object)).zza();
        }
        object = object.toString();
        object = cP.a("No input primitive class for ", (String)object, " available");
        object2 = new GeneralSecurityException((String)object);
        throw object2;
    }

    public final Object zzb(zzghi object, Class object2) {
        object2 = this.zza;
        Class<?> clazz = object.getClass();
        zzgqc zzgqc2 = new zzgqc(clazz, (Class)object2, null);
        boolean bl2 = object2.containsKey(zzgqc2);
        if (bl2) {
            return ((zzgpy)this.zza.get(zzgqc2)).zza((zzghi)object);
        }
        object2 = zzgqc2.toString();
        object2 = cP.a("No PrimitiveConstructor for ", (String)object2, " available");
        object = new GeneralSecurityException((String)object2);
        throw object;
    }

    public final Object zzc(zzgqk object, Class object2) {
        Object object3 = this.zzb;
        boolean bl2 = object3.containsKey(object2);
        if (bl2) {
            Class clazz;
            object2 = (zzghy)this.zzb.get(object2);
            object3 = ((zzgqk)object).zzd();
            bl2 = object3.equals(clazz = object2.zza());
            if (bl2 && (bl2 = (object3 = object2.zza()).equals(clazz = ((zzgqk)object).zzd()))) {
                return object2.zzc((zzgqk)object);
            }
            object = new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
            throw object;
        }
        object2 = object2.toString();
        object2 = "No wrapper found for ".concat((String)object2);
        object = new GeneralSecurityException((String)object2);
        throw object;
    }
}

