/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class E72$b
extends FunctionReferenceImpl
implements Function1 {
    public final Object invoke(Object object) {
        object = (wb1_2)object;
        Object object2 = ((e72_0)this.receiver).e;
        Object object3 = ((b72_0)object2).b;
        if (object3 == null) {
            object3 = (x72_0)e72_0.j.getValue();
        }
        object3 = ((x72_0)object3).d();
        fr0_2 fr0_22 = new fr0_2();
        String string2 = "dispatcher";
        Intrinsics.checkNotNullParameter(fr0_22, string2);
        ((x72$a)object3).a = fr0_22;
        object2 = ((b72_0)object2).a;
        ((a72_0)object2).invoke(object3);
        if (object != null) {
            long l2;
            object2 = ((wb1_2)object).b;
            long l3 = Long.MAX_VALUE;
            long l4 = 0L;
            if (object2 != null) {
                l2 = ((Number)object2).longValue();
                object2 = yb1_2.a;
                Object object4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (object4 == false) {
                    l2 = l4;
                }
                object2 = TimeUnit.MILLISECONDS;
                ((x72$a)object3).b(l2, (TimeUnit)((Object)object2));
            }
            if ((object = ((wb1_2)object).c) != null) {
                l2 = ((Number)object).longValue();
                object = yb1_2.a;
                Object object5 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                l3 = object5 == false ? l4 : l2;
                object2 = TimeUnit.MILLISECONDS;
                ((x72$a)object3).c(l3, (TimeUnit)((Object)object2));
                if (object5 != false) {
                    l4 = l2;
                }
                ((x72$a)object3).e(l4, (TimeUnit)((Object)object2));
            }
        }
        object = new x72_0((x72$a)object3);
        return object;
    }
}

