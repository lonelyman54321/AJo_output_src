/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgyn;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class zzgxz
extends ThreadLocal {
    public static final Cipher zza() {
        Object object;
        Object object2;
        try {
            object2 = zzgyn.zza;
            object = "AES/ECB/NOPADDING";
        }
        catch (GeneralSecurityException generalSecurityException) {
            object = new IllegalStateException(generalSecurityException);
            throw object;
        }
        object2 = ((zzgyn)object2).zza((String)object);
        return (Cipher)object2;
    }
}

