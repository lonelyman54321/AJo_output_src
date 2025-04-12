/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rb0
 */
public final class rb0_0 {
    public static final void a(ob0_1 ob0_12, yT1 yT12, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        Intrinsics.checkNotNullParameter(yT12, "navController");
        object = object.g(1001381562);
        pb0_0 pb0_02 = new pb0_0(yT12, 0);
        Function2 function2 = new rb0$a_0(ob0_12, yT12);
        u10 u102 = v10.c(-2143987797, function2, (b30_0)object);
        int n4 = 1572928;
        int n7 = 29;
        ro3_0.c(false, ob0_12, null, null, null, pb0_02, u102, (b30_0)object, n4, n7);
        object = ((j30_0)object).X();
        if (object != null) {
            function2 = new qb0_1(ob0_12, yT12, n3);
            ((CF2)object).d = function2;
        }
    }
}

