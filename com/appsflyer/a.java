/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.security.keystore.KeyGenParameterSpec$Builder
 */
package com.appsflyer;

import android.security.keystore.KeyGenParameterSpec;
import java.math.BigInteger;

public final class a {
    public static /* bridge */ /* synthetic */ KeyGenParameterSpec.Builder a(KeyGenParameterSpec.Builder builder, BigInteger bigInteger) {
        return builder.setCertificateSerialNumber(bigInteger);
    }
}

