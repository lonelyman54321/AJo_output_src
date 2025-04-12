/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzesw;
import com.google.android.gms.internal.ads.zzesx;
import java.util.concurrent.Callable;

public final class zzesv
implements Callable {
    public final /* synthetic */ zzesw zza;

    public /* synthetic */ zzesv(zzesw zzesw2) {
        this.zza = zzesw2;
    }

    public final Object call() {
        long l2 = zzu.zzB().currentTimeMillis();
        long l3 = zzu.zzo().zzi().zzh().zza();
        zzesx zzesx2 = new zzesx(l2 -= l3);
        return zzesx2;
    }
}

