/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class cR1$c$a {
    public static cr1$c_0 a(String object, String object2, pj2_2 pj2_22) {
        Intrinsics.checkNotNullParameter(object, "name");
        String string2 = "body";
        Intrinsics.checkNotNullParameter(pj2_22, string2);
        CharSequence charSequence = new StringBuilder();
        charSequence.append("form-data; name=");
        cr1$b_0.a((String)object, charSequence);
        if (object2 != null) {
            object = "; filename=";
            charSequence.append((String)object);
            cr1$b_0.a((String)object2, charSequence);
        }
        object = charSequence.toString();
        Intrinsics.checkNotNullExpressionValue(object, "StringBuilder().apply(builderAction).toString()");
        object2 = new m41$a_0();
        charSequence = "Content-Disposition";
        ((m41$a_0)object2).d((String)charSequence, (String)object);
        object = ((m41$a_0)object2).e();
        Intrinsics.checkNotNullParameter(pj2_22, string2);
        object2 = ((m41_0)object).a("Content-Type");
        if (object2 == null) {
            object2 = ((m41_0)object).a("Content-Length");
            if (object2 == null) {
                object2 = new cr1$c_0((m41_0)object, pj2_22);
                return object2;
            }
            object2 = "Unexpected header: Content-Length".toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = "Unexpected header: Content-Type".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

