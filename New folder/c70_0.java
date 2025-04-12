/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from c70
 */
public final class c70_0
implements Function1 {
    public final Object invoke(Object object) {
        object = (mv_2)object;
        Intrinsics.checkNotNullParameter(object, "$this$createClientPlugin");
        Object object2 = (a70_0)((mv_2)object).b;
        ArrayList arrayList = ((a70_0)object2).b;
        object2 = ((a70_0)object2).a;
        qg3_2 qg3_22 = new e70$b((mv_2)object, null, arrayList, (Set)object2);
        String string2 = "block";
        Intrinsics.checkNotNullParameter(qg3_22, string2);
        sq3_0 sq3_02 = sq3_0.a;
        ((mv_2)object).a(sq3_02, qg3_22);
        qg3_22 = new e70$c((mv_2)object, null, arrayList, (Set)object2);
        Intrinsics.checkNotNullParameter(qg3_22, string2);
        object2 = vq3_0.a;
        ((mv_2)object).a((lv_2)object2, qg3_22);
        return Unit.a;
    }
}

