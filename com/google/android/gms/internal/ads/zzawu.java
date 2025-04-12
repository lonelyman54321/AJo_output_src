/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaww;
import com.google.android.gms.internal.ads.zzfqx;
import com.google.android.gms.internal.ads.zzftd;
import java.io.File;
import java.security.GeneralSecurityException;

final class zzawu
implements zzftd {
    final /* synthetic */ zzfqx zza;

    public zzawu(zzaww zzaww2, zzfqx zzfqx2) {
        this.zza = zzfqx2;
    }

    public final boolean zza(File file) {
        zzfqx zzfqx2;
        try {
            zzfqx2 = this.zza;
        }
        catch (GeneralSecurityException generalSecurityException) {
            return false;
        }
        return zzfqx2.zza(file);
    }
}

