/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfya;
import com.google.android.gms.internal.ads.zzfzw;
import com.google.android.gms.internal.ads.zzgal;
import java.util.Map;

final class zzgaj
extends zzfzw {
    final /* synthetic */ zzgal zza;
    private final Object zzb;
    private int zzc;

    public zzgaj(zzgal object, int n3) {
        this.zza = object;
        this.zzb = object = zzgal.zzg((zzgal)object, n3);
        this.zzc = n3;
    }

    private final void zza() {
        Object object;
        Object object2;
        int n3 = this.zzc;
        int n4 = -1;
        if (n3 != n4 && n3 < (n4 = ((zzgal)(object2 = this.zza)).size())) {
            object = this.zzb;
            object2 = this.zza;
            int n7 = this.zzc;
            n3 = (int)(zzfya.zza(object, object2 = zzgal.zzg((zzgal)object2, n7)) ? 1 : 0);
            if (n3 != 0) {
                return;
            }
        }
        object = this.zza;
        object2 = this.zzb;
        this.zzc = n3 = zzgal.zzd((zzgal)object, object2);
    }

    public final Object getKey() {
        return this.zzb;
    }

    public final Object getValue() {
        Map map2 = this.zza.zzl();
        if (map2 != null) {
            Object object = this.zzb;
            return map2.get(object);
        }
        this.zza();
        int n3 = this.zzc;
        int n4 = -1;
        if (n3 == n4) {
            return null;
        }
        return zzgal.zzj(this.zza, n3);
    }

    public final Object setValue(Object object) {
        Object object2 = this.zza.zzl();
        if (object2 != null) {
            Object object3 = this.zzb;
            return object2.put(object3, object);
        }
        this.zza();
        int n3 = this.zzc;
        int n4 = -1;
        if (n3 == n4) {
            object2 = this.zza;
            Object object4 = this.zzb;
            ((zzgal)object2).put(object4, object);
            return null;
        }
        zzgal zzgal2 = this.zza;
        object2 = zzgal.zzj(zzgal2, n3);
        int n7 = this.zzc;
        zzgal.zzn(zzgal2, n7, object);
        return object2;
    }
}

