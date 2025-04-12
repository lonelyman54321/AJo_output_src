/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.regex.Pattern;

public final class zzgzc {
    private static final Pattern zza;
    private static final Pattern zzb;

    static {
        int n3 = 2;
        zza = Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+$", n3);
        zzb = Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeyVersions/([0-9a-zA-Z\\-\\.\\_~])+$", n3);
    }

    public static void zza(int n3) {
        int n4 = 16;
        if (n3 != n4 && n3 != (n4 = 32)) {
            Object object = n3 *= 8;
            Object[] objectArray = new Object[]{object};
            object = String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", objectArray);
            InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException((String)object);
            throw invalidAlgorithmParameterException;
        }
    }
}

