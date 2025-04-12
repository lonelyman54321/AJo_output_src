/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbdo;
import com.google.android.gms.internal.ads.zzdue;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflu;
import java.util.Map;

public final class zzduf
implements zzflu {
    private final Map zza;
    private final zzbdm zzb;

    public zzduf(zzbdm zzbdm2, Map map2) {
        this.zza = map2;
        this.zzb = zzbdm2;
    }

    public final void zzd(zzfln enum_, String object) {
        object = this.zza;
        boolean bl2 = object.containsKey(enum_);
        if (bl2) {
            object = this.zzb;
            Map map2 = this.zza;
            enum_ = ((zzdue)map2.get((Object)enum_)).zzb;
            ((zzbdm)object).zzb((zzbdo)enum_);
        }
    }

    public final void zzdC(zzfln zzfln2, String string2) {
    }

    public final void zzdD(zzfln enum_, String object, Throwable object2) {
        object = this.zza;
        boolean bl2 = object.containsKey(enum_);
        if (bl2) {
            object = this.zzb;
            object2 = this.zza;
            enum_ = ((zzdue)object2.get((Object)enum_)).zzc;
            ((zzbdm)object).zzb((zzbdo)enum_);
        }
    }

    public final void zzdE(zzfln enum_, String object) {
        object = this.zza;
        boolean bl2 = object.containsKey(enum_);
        if (bl2) {
            object = this.zzb;
            Map map2 = this.zza;
            enum_ = ((zzdue)map2.get((Object)enum_)).zza;
            ((zzbdm)object).zzb((zzbdo)enum_);
        }
    }
}

