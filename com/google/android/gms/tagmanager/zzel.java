/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzri;
import com.google.android.gms.tagmanager.zzdj;
import com.google.android.gms.tagmanager.zzem;
import com.google.android.gms.tagmanager.zzep;
import java.util.Set;

final class zzel
implements zzem {
    public zzel(zzep zzep2) {
    }

    public final void zza(zzri zzri2, Set collection, Set set, zzdj object) {
        object = zzri2.zzc();
        collection.addAll(object);
        collection = zzri2.zzh();
        set.addAll(collection);
        zzri2.zzc();
        zzri2.zzb();
        zzri2.zzh();
        zzri2.zzg();
    }
}

