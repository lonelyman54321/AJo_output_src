/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Tb2
 */
public final class tb2_1
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ tb2_1(qz1_2 qz1_22, yT1 yT12, int n3) {
        this.a = qz1_22;
        this.b = yT12;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        yT1 yT12 = this.b;
        Intrinsics.checkNotNullParameter(yT12, "$navController");
        int n3 = Me3.b(this.c | 1);
        ub2_1.a(qz1_22, yT12, (b30_0)object, n3);
        return Unit.a;
    }
}

