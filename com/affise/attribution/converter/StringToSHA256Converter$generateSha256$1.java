/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.converter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

final class StringToSHA256Converter$generateSha256$1
extends Lambda
implements Function1 {
    public static final StringToSHA256Converter$generateSha256$1 INSTANCE;

    static {
        StringToSHA256Converter$generateSha256$1 stringToSHA256Converter$generateSha256$1;
        INSTANCE = stringToSHA256Converter$generateSha256$1 = new StringToSHA256Converter$generateSha256$1();
    }

    public StringToSHA256Converter$generateSha256$1() {
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

