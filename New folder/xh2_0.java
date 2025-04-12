/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xh2
 */
public final class xh2_0 {
    public static String a(Object[] object, int n3, String string2, String string3) {
        object = Arrays.copyOf(object, n3);
        object = String.format(string2, object);
        Intrinsics.checkNotNullExpressionValue(object, string3);
        return object;
    }

    public static boolean b(String string2, Locale locale, String string3, String string4) {
        string2 = string2.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        return Intrinsics.areEqual(string2, string4);
    }
}

