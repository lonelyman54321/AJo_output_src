/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oj
 */
public final class oj_0 {
    public static Object a(Function1 function1, String string2, Object object, String string3, Object object2) {
        Intrinsics.checkNotNullParameter(function1, string2);
        Intrinsics.checkNotNullParameter(object, string3);
        return function1.invoke(object2);
    }

    public static String b(char c2, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(string3);
        stringBuilder.append(c2);
        return stringBuilder.toString();
    }
}

