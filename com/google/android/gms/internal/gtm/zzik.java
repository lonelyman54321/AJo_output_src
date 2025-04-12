/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import com.google.android.gms.internal.gtm.zzij;
import com.google.android.gms.internal.gtm.zzix;
import com.google.android.gms.tagmanager.zzcg;
import java.util.concurrent.ExecutorService;

final class zzik
extends zzcg {
    final /* synthetic */ zzix zza;

    public zzik(zzix zzix2) {
        this.zza = zzix2;
    }

    public final void zze(String string2, String string3, Bundle bundle, long l2) {
        String string4 = String.valueOf(string2);
        ExecutorService executorService = zzix.zzj(this.zza);
        String string5 = string4.concat("+gtm");
        zzij zzij2 = new zzij(this, string3, bundle, string5, l2, string2);
        executorService.execute(zzij2);
    }
}

