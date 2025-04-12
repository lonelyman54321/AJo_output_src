/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzcz;
import com.google.android.gms.internal.vision.zzdl;
import com.google.android.gms.internal.vision.zzdp;
import java.util.Map;

final class zzdy
extends zzdl {
    private final Object zza;
    private int zzb;
    private final /* synthetic */ zzdp zzc;

    public zzdy(zzdp object, int n3) {
        this.zzc = object;
        this.zza = object = ((zzdp)object).zzb[n3];
        this.zzb = n3;
    }

    private final void zza() {
        block3: {
            Object object;
            Object object2;
            int n3;
            block2: {
                n3 = this.zzb;
                int n4 = -1;
                if (n3 == n4 || n3 >= (n4 = (object2 = this.zzc).size())) break block2;
                object = this.zza;
                object2 = this.zzc.zzb;
                int n7 = this.zzb;
                n3 = (int)(zzcz.zza(object, object2 = object2[n7]) ? 1 : 0);
                if (n3 != 0) break block3;
            }
            object = this.zzc;
            object2 = this.zza;
            this.zzb = n3 = zzdp.zzb((zzdp)object, object2);
        }
    }

    public final Object getKey() {
        return this.zza;
    }

    public final Object getValue() {
        Map map2 = this.zzc.zzb();
        if (map2 != null) {
            Object object = this.zza;
            return map2.get(object);
        }
        this.zza();
        int n3 = this.zzb;
        int n4 = -1;
        if (n3 == n4) {
            return null;
        }
        return this.zzc.zzc[n3];
    }

    public final Object setValue(Object object) {
        Map map2 = this.zzc.zzb();
        if (map2 != null) {
            Object object2 = this.zza;
            return map2.put(object2, object);
        }
        this.zza();
        int n3 = this.zzb;
        int n4 = -1;
        if (n3 == n4) {
            map2 = this.zzc;
            Object object3 = this.zza;
            ((zzdp)map2).put(object3, object);
            return null;
        }
        Object[] objectArray = this.zzc.zzc;
        Object object4 = objectArray[n3];
        objectArray[n3] = object;
        return object4;
    }
}

