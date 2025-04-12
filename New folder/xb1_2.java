/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xb1
 */
public final class xb1_2
implements Function1 {
    public final Object invoke(Object object) {
        object = (mv_2)object;
        Intrinsics.checkNotNullParameter(object, "$this$createClientPlugin");
        Object object2 = (wb1_2)((mv_2)object).b;
        Long l2 = ((wb1_2)object2).a;
        Long l3 = ((wb1_2)object2).b;
        object2 = ((wb1_2)object2).c;
        dz2_1 dz2_12 = dz2_1.a;
        yb1$b yb1$b = new yb1$b(l2, l3, (Long)object2, null);
        ((mv_2)object).a(dz2_12, yb1$b);
        return Unit.a;
    }
}

