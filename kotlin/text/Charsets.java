/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

public final class Charsets {
    public static final Charset UTF_8;
    public static final Charsets a;
    public static final Charset b;
    public static final Charset c;
    public static volatile Charset d;
    public static volatile Charset e;

    static {
        Object object = new Charsets();
        a = object;
        object = Charset.forName("UTF-8");
        String string2 = "forName(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        UTF_8 = object;
        Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-16"), string2);
        Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-16BE"), string2);
        Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-16LE"), string2);
        object = Charset.forName("US-ASCII");
        Intrinsics.checkNotNullExpressionValue(object, string2);
        b = object;
        object = Charset.forName("ISO-8859-1");
        Intrinsics.checkNotNullExpressionValue(object, string2);
        c = object;
    }
}

