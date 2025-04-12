/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public abstract class ha3 {
    public static String b(Object object, String string2) {
        Intrinsics.checkNotNullParameter(object, "value");
        Intrinsics.checkNotNullParameter(string2, "message");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" value: ");
        stringBuilder.append(object);
        return stringBuilder.toString();
    }

    public abstract Object a();

    public abstract ha3 c(String var1, Function1 var2);
}

