/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;

public final class UT0 {
    public static final tr1_0 a(wr1_1 wr1_12, b30_0 b30_02, int n3) {
        b30$a$a b30$a$a;
        Object object = b30_02.v();
        if (object == (b30$a$a = b30$a.a)) {
            object = J83.g(Boolean.FALSE);
            b30_02.o(object);
        }
        object = (tr1_0)object;
        int n4 = n3 & 0xE ^ 6;
        int n7 = 4;
        n3 = n4 > n7 && (n4 = (int)(b30_02.J(wr1_12) ? 1 : 0)) != 0 || (n3 &= 6) == n7 ? 1 : 0;
        Object object2 = b30_02.v();
        if (n3 != 0 || object2 == b30$a$a) {
            n3 = 0;
            object2 = new tt0_0(wr1_12, (tr1_0)object, null);
            b30_02.o(object2);
        }
        object2 = (Function2)object2;
        ly0_0.d(b30_02, wr1_12, (Function2)object2);
        return object;
    }
}

