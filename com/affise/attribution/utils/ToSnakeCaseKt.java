/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.utils;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

public final class ToSnakeCaseKt {
    private static final Regex camelPattern;

    static {
        Regex regex;
        camelPattern = regex = new Regex("(?<=.)([A-Z]|\\d+)");
    }

    public static final String toSnakeCase(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        string2 = camelPattern.replace(string2, "_$0");
        Locale locale = Locale.ROOT;
        string2 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return string2;
    }
}

