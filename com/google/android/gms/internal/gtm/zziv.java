/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzhc;
import com.google.android.gms.internal.gtm.zziu;
import com.google.android.gms.internal.gtm.zziw;
import com.google.android.gms.internal.gtm.zzix;
import java.util.concurrent.ExecutorService;

final class zziv
extends zzhc {
    final /* synthetic */ zzix zza;

    public /* synthetic */ zziv(zzix zzix2, zziw zziw2) {
        this.zza = zzix2;
    }

    public final void zze(boolean bl2, String string2) {
        ExecutorService executorService = zzix.zzj(this.zza);
        zziu zziu2 = new zziu(this, bl2, string2);
        executorService.execute(zziu2);
    }
}

