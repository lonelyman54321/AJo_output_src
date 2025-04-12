/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.converter;

import com.affise.attribution.converter.Converter;
import com.affise.attribution.converter.StringToSHA256Converter$Companion;
import com.affise.attribution.converter.StringToSHA256Converter$generateSha256$1;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public final class StringToSHA256Converter
implements Converter {
    private static final String ALGORITHM_NAME = "SHA-256";
    public static final StringToSHA256Converter$Companion Companion;

    static {
        StringToSHA256Converter$Companion stringToSHA256Converter$Companion;
        Companion = stringToSHA256Converter$Companion = new StringToSHA256Converter$Companion(null);
    }

    private final String generateSha256(String object) {
        Object object2 = MessageDigest.getInstance(ALGORITHM_NAME);
        Charset charset = Charsets.UTF_8;
        object = ((String)object).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(object, "this as java.lang.String).getBytes(charset)");
        object = ((MessageDigest)object2).digest((byte[])object);
        Intrinsics.checkNotNullExpressionValue(object, "getInstance(ALGORITHM_NA\u2026gest(value.toByteArray())");
        object2 = StringToSHA256Converter$generateSha256$1.INSTANCE;
        return tp_2.H((byte[])object, (Function1)object2);
    }

    public String convert(String string2) {
        Intrinsics.checkNotNullParameter(string2, "from");
        return this.generateSha256(string2);
    }
}

