/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Dt
 */
public final class dt_1
implements Function2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ i90_0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ dt_1(int n3, c80 c802, ob0_1 ob0_12, yT1 yT12) {
        this.a = ob0_12;
        this.b = yT12;
        this.c = c802;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$viewModel");
        yT1 yT12 = this.b;
        Intrinsics.checkNotNullParameter(yT12, "$navController");
        i90_0 i90_02 = this.c;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        int n3 = Me3.b(this.d | 1);
        i90_02 = (c80)i90_02;
        qt_0.m(n3, (b30_0)object, (c80)i90_02, (ob0_1)object2, yT12);
        return Unit.a;
    }
}

