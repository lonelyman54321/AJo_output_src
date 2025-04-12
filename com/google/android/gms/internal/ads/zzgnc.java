/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgnd;
import com.google.android.gms.internal.ads.zzgyn;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class zzgnc
extends ThreadLocal {
    public static final Cipher zza() {
        String string2;
        Object object;
        try {
            object = zzgyn.zza;
            string2 = "ChaCha20-Poly1305";
        }
        catch (GeneralSecurityException generalSecurityException) {
            return null;
        }
        object = ((zzgyn)object).zza(string2);
        object = (Cipher)object;
        boolean bl2 = zzgnd.zzd((Cipher)object);
        if (!bl2) {
            return null;
        }
        return object;
    }
}

