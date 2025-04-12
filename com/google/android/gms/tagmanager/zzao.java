/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.DataLayer;
import com.google.android.gms.tagmanager.zzap;
import com.google.android.gms.tagmanager.zzar;
import java.util.List;
import java.util.Map;

final class zzao
implements zzar {
    final /* synthetic */ DataLayer zza;

    public zzao(DataLayer dataLayer) {
        this.zza = dataLayer;
    }

    public final void zza(List object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (zzap)object.next();
            DataLayer dataLayer = this.zza;
            String string2 = ((zzap)object2).zza;
            object2 = ((zzap)object2).zzb;
            object2 = dataLayer.zza(string2, object2);
            DataLayer.zzc(dataLayer, (Map)object2);
        }
        DataLayer.zzb(this.zza).countDown();
    }
}

