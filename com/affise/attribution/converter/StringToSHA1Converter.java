/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.converter;

import com.affise.attribution.converter.Converter;
import com.affise.attribution.converter.StringToSHA1Converter$Companion;
import com.affise.attribution.converter.StringToSHA1Converter$generateSha1$1;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public final class StringToSHA1Converter
implements Converter {
    private static final String ALGORITHM_NAME = "SHA-1";
    public static final StringToSHA1Converter$Companion Companion;

    static {
        StringToSHA1Converter$Companion stringToSHA1Converter$Companion;
        Companion = stringToSHA1Converter$Companion = new StringToSHA1Converter$Companion(null);
    }

    private final String generateSha1(String object) {
        Object object2 = MessageDigest.getInstance(ALGORITHM_NAME);
        Charset charset = Charsets.UTF_8;
        object = ((String)object).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(object, "this as java.lang.String).getBytes(charset)");
        object = ((MessageDigest)object2).digest((byte[])object);
        Intrinsics.checkNotNullExpressionValue(object, "getInstance(ALGORITHM_NA\u2026gest(value.toByteArray())");
        object2 = StringToSHA1Converter$generateSha1$1.INSTANCE;
        return tp_2.H((byte[])object, (Function1)object2);
    }

    public String convert(String string2) {
        Intrinsics.checkNotNullParameter(string2, "from");
        return this.generateSha1(string2);
    }
}

