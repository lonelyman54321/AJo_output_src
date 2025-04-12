/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfap;
import com.google.android.gms.internal.ads.zzfaq;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzfao
implements Callable {
    public final /* synthetic */ zzfap zza;

    public /* synthetic */ zzfao(zzfap zzfap2) {
        this.zza = zzfap2;
    }

    public final Object call() {
        List list = this.zza.zzb;
        zzfaq zzfaq2 = new zzfaq(list);
        return zzfaq2;
    }
}

