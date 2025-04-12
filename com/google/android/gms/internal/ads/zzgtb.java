/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgoc;
import com.google.android.gms.internal.ads.zzgro;
import com.google.android.gms.internal.ads.zzgrv;
import java.security.GeneralSecurityException;

public final class zzgtb
implements zzgro {
    private final zzgrv zza;

    public zzgtb(zzgrv object) {
        boolean bl2 = zzgoc.zza(2);
        if (bl2) {
            this.zza = object;
            return;
        }
        object = new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        throw object;
    }
}

