/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public final class PJ2$a {
    public static mj2_2 a(jn1_0 jn1_02, File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        mj2_2 mj2_22 = new mj2_2(jn1_02, file);
        return mj2_22;
    }

    public static oj2_2 b(jn1_0 object, byte[] byArray, int n3, int n4) {
        long l2;
        long l3;
        long l4;
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(byArray, (String)object2);
        int n7 = byArray.length;
        long l7 = n7;
        long l8 = n3;
        long l12 = n4;
        long l14 = l8 | l12;
        long l15 = 0L;
        long l16 = l14 == l15 ? 0 : (l14 < l15 ? -1 : 1);
        if (l16 >= 0 && (l4 = l8 == l7 ? 0 : (l8 < l7 ? -1 : 1)) <= 0 && (l3 = (l2 = (l7 -= l8) - l12) == 0L ? 0 : (l2 < 0L ? -1 : 1)) >= 0) {
            object2 = new oj2_2((jn1_0)object, byArray, n4, n3);
            return object2;
        }
        object = new ArrayIndexOutOfBoundsException();
        throw object;
    }

    public static oj2_2 c(String object, jn1_0 jn1_02) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Object object2 = Charsets.UTF_8;
        if (jn1_02 != null) {
            Object object3 = jn1_0.d;
            object3 = jn1_02.a(null);
            if (object3 == null) {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append(jn1_02);
                ((StringBuilder)object3).append("; charset=utf-8");
                jn1_02 = JN1$a.b(((StringBuilder)object3).toString());
            } else {
                object2 = object3;
            }
        }
        object = ((String)object).getBytes((Charset)object2);
        Intrinsics.checkNotNullExpressionValue(object, "this as java.lang.String).getBytes(charset)");
        int n3 = ((Object)object).length;
        return PJ2$a.b(jn1_02, (byte[])object, 0, n3);
    }

    public static /* synthetic */ oj2_2 d(PJ2$a pJ2$a, byte[] byArray, jn1_0 jn1_02, int n3, int n4) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            jn1_02 = null;
        }
        if ((n4 &= 2) != 0) {
            n3 = 0;
        }
        n4 = byArray.length;
        pJ2$a.getClass();
        return PJ2$a.b(jn1_02, byArray, n3, n4);
    }
}

