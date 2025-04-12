/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzerv;
import com.google.android.gms.internal.ads.zzerw;
import com.google.android.gms.internal.ads.zzfxu;

public final class zzeru
implements zzfxu {
    public final /* synthetic */ zzerv zza;

    public /* synthetic */ zzeru(zzerv zzerv2) {
        this.zza = zzerv2;
    }

    public final Object apply(Object object) {
        zzcby zzcby2 = this.zza.zza;
        object = (Exception)object;
        zzcby2.zzw((Throwable)object, "AppSetIdInfoSignal");
        object = new zzerw(null, -1);
        return object;
    }
}

