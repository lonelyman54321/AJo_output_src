/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import com.google.android.gms.internal.gtm.zzil;
import com.google.android.gms.internal.gtm.zzix;
import com.google.android.gms.tagmanager.zzcd;
import java.util.concurrent.ExecutorService;

final class zzim
extends zzcd {
    final /* synthetic */ zzix zza;

    public zzim(zzix zzix2) {
        this.zza = zzix2;
    }

    public final void zze(String string2, String string3, Bundle bundle, long l2) {
        Object object = "+gtm";
        boolean bl2 = string2.endsWith((String)object);
        if (!bl2) {
            zzil zzil2;
            ExecutorService executorService = zzix.zzj(this.zza);
            String string4 = string2.concat((String)object);
            object = zzil2;
            zzil2 = new zzil(this, string3, bundle, string4, l2, string2);
            executorService.execute(zzil2);
            return;
        }
    }
}

