/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghy;
import com.google.android.gms.internal.ads.zzgpy;
import com.google.android.gms.internal.ads.zzgpz;
import com.google.android.gms.internal.ads.zzgqc;
import com.google.android.gms.internal.ads.zzgqe;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzgqa {
    private final Map zza;
    private final Map zzb;

    private zzgqa() {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
        this.zzb = hashMap = new HashMap();
    }

    public /* synthetic */ zzgqa(zzgpz hashMap) {
        this.zza = hashMap = new HashMap();
        this.zzb = hashMap = new HashMap();
    }

    public /* synthetic */ zzgqa(zzgqe object, zzgpz hashMap) {
        Map map2 = zzgqe.zzd((zzgqe)object);
        this.zza = hashMap = new HashMap(map2);
        object = zzgqe.zze((zzgqe)object);
        this.zzb = hashMap = new HashMap(object);
    }

    public static /* bridge */ /* synthetic */ Map zzc(zzgqa zzgqa2) {
        return zzgqa2.zza;
    }

    public static /* bridge */ /* synthetic */ Map zzd(zzgqa zzgqa2) {
        return zzgqa2.zzb;
    }

    public final zzgqa zza(zzgpy object) {
        if (object != null) {
            Object object2 = ((zzgpy)object).zzc();
            object2 = this.zza;
            Class clazz = ((zzgpy)object).zzd();
            Object object3 = new zzgqc((Class)object2, clazz, null);
            boolean bl2 = object2.containsKey(object3);
            if (bl2) {
                boolean bl3;
                object2 = (zzgpy)this.zza.get(object3);
                boolean bl4 = object2.equals(object);
                if (!bl4 || !(bl3 = object.equals(object2))) {
                    object3 = ((zzgqc)object3).toString();
                    object3 = "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat((String)object3);
                    object = new GeneralSecurityException((String)object3);
                    throw object;
                }
            } else {
                object2 = this.zza;
                object2.put(object3, object);
            }
            return this;
        }
        object = new NullPointerException("primitive constructor must be non-null");
        throw object;
    }

    public final zzgqa zzb(zzghy object) {
        Object object2 = this.zzb;
        Class clazz = object.zzb();
        boolean bl2 = object2.containsKey(clazz);
        if (bl2) {
            boolean bl3;
            object2 = (zzghy)this.zzb.get(clazz);
            boolean bl4 = object2.equals(object);
            if (!bl4 || !(bl3 = object.equals(object2))) {
                object2 = ((Object)clazz).toString();
                object2 = "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat((String)object2);
                object = new GeneralSecurityException((String)object2);
                throw object;
            }
        } else {
            object2 = this.zzb;
            object2.put(clazz, object);
        }
        return this;
    }
}

