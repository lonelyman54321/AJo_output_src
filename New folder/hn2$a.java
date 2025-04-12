/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public final class hn2$a {
    public static hn2_2 a(String string2, boolean bl2) {
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        Intrinsics.checkNotNullParameter(string2, (String)object);
        object = new ce_2();
        ((ce_2)object).I0(string2);
        return i_0.d((ce_2)object, bl2);
    }

    public static hn2_2 b(File object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = ((File)object).toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return hn2$a.a((String)object, false);
    }
}

