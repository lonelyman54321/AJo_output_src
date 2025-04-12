/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgob;
import com.google.android.gms.internal.ads.zzgyn;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class zzgoa
extends ThreadLocal {
    public static final Cipher zza() {
        Object object;
        Object object2;
        try {
            object2 = zzgyn.zza;
            object = "AES/GCM-SIV/NoPadding";
        }
        catch (GeneralSecurityException generalSecurityException) {
            object = new IllegalStateException(generalSecurityException);
            throw object;
        }
        object2 = ((zzgyn)object2).zza((String)object);
        object2 = (Cipher)object2;
        boolean bl2 = zzgob.zzc((Cipher)object2);
        if (!bl2) {
            object2 = null;
        }
        return object2;
    }
}

