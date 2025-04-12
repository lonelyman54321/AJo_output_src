/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.nonagon.signalgeneration.zzaj;
import com.google.android.gms.internal.ads.zzfxu;
import java.util.List;

public final class zzt
implements zzfxu {
    public final /* synthetic */ zzaj zza;
    public final /* synthetic */ List zzb;

    public /* synthetic */ zzt(zzaj zzaj2, List list) {
        this.zza = zzaj2;
        this.zzb = list;
    }

    public final Object apply(Object object) {
        zzaj zzaj2 = this.zza;
        List list = this.zzb;
        object = (String)object;
        return zzaj2.zzB(list, (String)object);
    }
}

