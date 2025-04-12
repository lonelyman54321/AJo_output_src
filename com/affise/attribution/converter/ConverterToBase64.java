/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.affise.attribution.converter;

import android.util.Base64;
import com.affise.attribution.converter.Converter;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public final class ConverterToBase64
implements Converter {
    public String convert(String object) {
        Intrinsics.checkNotNullParameter(object, "from");
        Charset charset = Charsets.UTF_8;
        object = ((String)object).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(object, "this as java.lang.String).getBytes(charset)");
        object = Base64.encodeToString((byte[])object, (int)2);
        Intrinsics.checkNotNullExpressionValue(object, "encodeToString(from.toByteArray(), Base64.NO_WRAP)");
        return object;
    }
}

