/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobSupport;

/*
 * Renamed from rF
 */
public final class rf_1 {
    public static final void a(uf_1 object, if_1 if_12, if_1 if_13) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(if_12, "first");
        Intrinsics.checkNotNullParameter(if_13, "second");
        Object object2 = e01_0.a;
        wm0_2 wm0_22 = ir0_2.a;
        qf_1 qf_12 = new qf_1((uf_1)object, if_12, if_13, null);
        object = Ae3.d((i90_0)object2, wm0_22, null, qf_12, 2);
        object2 = new of_2(if_12, if_13);
        ((JobSupport)object).G((Function1)object2);
    }

    public static final Pair b(uf_1 object, i90_0 object2) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object2, "coroutineScope");
        boolean bl2 = true;
        if_1 if_12 = new if_1(bl2);
        if_1 if_13 = new if_1(bl2);
        rF$a rF$a = new rF$a((uf_1)object, if_12, if_13, null);
        object = Ae3.d((i90_0)object2, null, null, rF$a, 3);
        object2 = new pf_2(if_12, if_13);
        ((JobSupport)object).G((Function1)object2);
        object = new Pair(if_12, if_13);
        return object;
    }
}

