/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Q6
implements Function2 {
    public final /* synthetic */ j7_0 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ oa1_1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ Q6(j7_0 j7_02, yT1 yT12, oa1_1 oa1_12, int n3) {
        this.a = j7_02;
        this.b = yT12;
        this.c = oa1_12;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        j7_0 j7_02 = this.a;
        Intrinsics.checkNotNullParameter(j7_02, "$viewModel");
        yT1 yT12 = this.b;
        Intrinsics.checkNotNullParameter(yT12, "$navController");
        oa1_1 oa1_12 = this.c;
        Intrinsics.checkNotNullParameter(oa1_12, "$loginViewModel");
        int n3 = Me3.b(this.d | 1);
        Z6.a(j7_02, yT12, oa1_12, (b30_0)object, n3);
        return Unit.a;
    }
}

