/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Lk3$a
extends Lambda
implements gx0_2 {
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ wr1_1 d;

    public Lk3$a(Function1 function1, wr1_1 wr1_12) {
        this.c = function1;
        this.d = wr1_12;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        Object object4;
        object = (LP1)object;
        object2 = (b30_0)object2;
        ((Number)object3).intValue();
        int n3 = -102778667;
        object2.K(n3);
        object = object2.v();
        object3 = b30$a.a;
        if (object == object3) {
            object = ly0_0.f(f.a, (b30_0)object2);
            object4 = new Q30((c80)object);
            object2.o(object4);
            object = object4;
        }
        object = ((Q30)object).a;
        object4 = object2.v();
        if (object4 == object3) {
            object4 = J83.g(null);
            object2.o(object4);
        }
        Object object5 = object4;
        object5 = (tr1_0)object4;
        tr1_0 tr1_02 = J83.j(this.c, (b30_0)object2);
        object4 = this.d;
        boolean bl2 = object2.J(object4);
        Object object6 = object2.v();
        if (bl2 || object6 == object3) {
            object6 = new jk3_0((tr1_0)object5, (wr1_1)object4);
            object2.o(object6);
        }
        object6 = (Function1)object6;
        ly0_0.b(object4, (Function1)object6, (b30_0)object2);
        bl2 = object2.x(object);
        boolean bl3 = object2.J(object4);
        bl2 |= bl3;
        bl3 = object2.J(tr1_02);
        object6 = object2.v();
        if ((bl2 |= bl3) || object6 == object3) {
            wr1_1 wr1_12 = this.d;
            object6 = object;
            object6 = (c80)object;
            object3 = new kk3_0((c80)object6, (tr1_0)object5, wr1_12, tr1_02, null);
            object2.o(object3);
            object6 = object3;
        }
        object6 = (Function2)object6;
        object = new SuspendPointerInputElement(object4, null, (Function2)object6, 6);
        object2.E();
        return object;
    }
}

