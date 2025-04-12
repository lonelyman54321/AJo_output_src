/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public final class iL2$b {
    public static jl2_2 a(String object, jn1_0 jn1_02) {
        Object object2;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        Object object3 = Charsets.UTF_8;
        if (jn1_02 != null) {
            object2 = jn1_0.d;
            object2 = jn1_02.a(null);
            if (object2 == null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(jn1_02);
                ((StringBuilder)object2).append("; charset=utf-8");
                jn1_02 = JN1$a.b(((StringBuilder)object2).toString());
            } else {
                object3 = object2;
            }
        }
        object2 = new ce_2();
        Intrinsics.checkNotNullParameter(object, "string");
        Intrinsics.checkNotNullParameter(object3, "charset");
        int n3 = ((String)object).length();
        ((ce_2)object2).F0((String)object, 0, n3, (Charset)object3);
        long l2 = ((ce_2)object2).b;
        Intrinsics.checkNotNullParameter(object2, string2);
        object = new jl2_2(jn1_02, l2, (se_1)object2);
        return object;
    }
}

