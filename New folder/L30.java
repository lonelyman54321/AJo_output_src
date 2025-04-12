/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class L30 {
    public static final void a(MB2 mB2, Function2 function2, b30_0 object, int n3) {
        object = object.g(-1350970552);
        ((j30_0)object).u0(mB2);
        int n4 = n3 >> 3 & 0xE;
        Serializable serializable = n4;
        function2.invoke(object, serializable);
        ((j30_0)object).V();
        object = ((j30_0)object).X();
        if (object != null) {
            serializable = new L30$b(mB2, function2, n3);
            ((CF2)object).d = serializable;
        }
    }

    public static final void b(MB2[] mB2Array, Function2 function2, b30_0 object, int n3) {
        object = object.g(-1390796515);
        ((j30_0)object).v0(mB2Array);
        int n4 = n3 >> 3 & 0xE;
        Serializable serializable = n4;
        function2.invoke(object, serializable);
        ((j30_0)object).W();
        object = ((j30_0)object).X();
        if (object != null) {
            serializable = new L30$a(mB2Array, function2, n3);
            ((CF2)object).d = serializable;
        }
    }

    public static nw0_1 c(Function0 function0) {
        J83.l();
        qi_2 qi_22 = qi_2.b;
        nw0_1 nw0_12 = new nw0_1(qi_22, function0);
        return nw0_12;
    }
}

