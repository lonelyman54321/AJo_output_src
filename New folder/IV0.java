/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

public final class IV0 {
    public static String a(Object[] object, int n3, Locale locale, String string2, String string3) {
        object = Arrays.copyOf(object, n3);
        object = String.format(locale, string2, object);
        Intrinsics.checkNotNullExpressionValue(object, string3);
        return object;
    }
}

