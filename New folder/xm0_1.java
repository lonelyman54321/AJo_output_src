/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XM0
 */
public final class xm0_1
implements Function2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ xm0_1(ob0_1 ob0_12, yT1 yT12, int n3) {
        this.a = ob0_12;
        this.b = yT12;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        ob0_1 ob0_12 = this.a;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        yT1 yT12 = this.b;
        Intrinsics.checkNotNullParameter(yT12, "$navController");
        int n3 = Me3.b(this.c | 1);
        gn0_2.e(ob0_12, yT12, (b30_0)object, n3);
        return Unit.a;
    }
}

