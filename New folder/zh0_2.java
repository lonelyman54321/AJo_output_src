/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.layout.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZH0
 */
public final class zh0_2
implements gx0_2 {
    public final /* synthetic */ Function1 a;

    public zh0_2(pa_0 pa_02) {
        this.a = pa_02;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (LP1)object;
        object2 = (b30_0)object2;
        ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(object, "$this$composed");
        object2.K(-162097236);
        int n3 = 1048928527;
        object2.K(n3);
        object3 = object2.v();
        b30$a$a b30$a$a = b30$a.a;
        if (object3 == b30$a$a) {
            object3 = new Object();
            object3 = J83.e((Function0)object3);
            object2.o(object3);
        }
        object3 = (ib3_0)object3;
        object2.E();
        Object object4 = ((tr1_0)object3.getValue()).getValue();
        int n4 = 1048931401;
        object2.K(n4);
        Function1 function1 = this.a;
        boolean bl2 = object2.J(function1);
        Object object5 = object2.v();
        if (bl2 || object5 == b30$a$a) {
            bl2 = false;
            function1 = (pa_0)function1;
            object5 = new yh0_2((pa_0)function1, (ib3_0)object3, null);
            object2.o(object5);
        }
        object5 = (Function2)object5;
        object2.E();
        ly0_0.d((b30_0)object2, object4, (Function2)object5);
        int n7 = 1048934135;
        object2.K(n7);
        object4 = object2.v();
        if (object4 == b30$a$a) {
            b30$a$a = null;
            object4 = new xh0_2(object3, 0);
            object2.o(object4);
        }
        object4 = (Function1)object4;
        object2.E();
        object = c.a((LP1)object, (Function1)object4);
        object2.E();
        return object;
    }
}

