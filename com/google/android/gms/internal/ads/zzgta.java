/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgoc;
import com.google.android.gms.internal.ads.zzgre;
import com.google.android.gms.internal.ads.zzgro;
import java.security.GeneralSecurityException;

public final class zzgta
implements zzgro {
    private final zzgre zza;

    public zzgta(zzgre object) {
        boolean bl2 = zzgoc.zza(1);
        if (bl2) {
            this.zza = object;
            return;
        }
        object = new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        throw object;
    }
}

