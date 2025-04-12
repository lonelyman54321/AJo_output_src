/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class g30 {
    public static String a(int n3, String string2, StringBuilder stringBuilder) {
        stringBuilder.append(n3);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static StringBuilder b(String charSequence, String string2) {
        Intrinsics.checkNotNullExpressionValue(charSequence, string2);
        charSequence = new StringBuilder();
        return charSequence;
    }
}

