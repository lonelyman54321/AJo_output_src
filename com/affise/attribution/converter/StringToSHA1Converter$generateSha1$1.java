/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.converter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

final class StringToSHA1Converter$generateSha1$1
extends Lambda
implements Function1 {
    public static final StringToSHA1Converter$generateSha1$1 INSTANCE;

    static {
        StringToSHA1Converter$generateSha1$1 stringToSHA1Converter$generateSha1$1;
        INSTANCE = stringToSHA1Converter$generateSha1$1 = new StringToSHA1Converter$generateSha1$1();
    }

    public StringToSHA1Converter$generateSha1$1() {
        super(1);
    }

    public final CharSequence invoke(byte by2) {
        Byte by4 = by2;
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = by4;
        return xh2_0.a(objectArray, n3, "%02x", "format(this, *args)");
    }
}

