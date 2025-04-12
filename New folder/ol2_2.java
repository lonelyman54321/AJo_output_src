/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oL2
 */
public final class ol2_2
implements Function1 {
    public final Object invoke(Object object) {
        object = (mv_2)object;
        Intrinsics.checkNotNullParameter(object, "$this$createClientPlugin");
        Function2 function2 = ((nl2_2)((mv_2)object).b).a;
        w5_0 w5_02 = w5_0.a;
        pl2$b_0 pl2$b_0 = new pl2$b_0((mv_2)object, function2, null);
        ((mv_2)object).a(w5_02, pl2$b_0);
        return Unit.a;
    }
}

