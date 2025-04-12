/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bN0
 */
public final class bn0_2
implements Function2 {
    public final /* synthetic */ yT1 a;
    public final /* synthetic */ i90_0 b;
    public final /* synthetic */ ob0_1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ bn0_2(int n3, c80 c802, ob0_1 ob0_12, yT1 yT12) {
        this.a = yT12;
        this.b = c802;
        this.c = ob0_12;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$navController");
        i90_0 i90_02 = this.b;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        ob0_1 ob0_12 = this.c;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        int n3 = Me3.b(this.d | 1);
        i90_02 = (c80)i90_02;
        gn0_2.b(n3, (b30_0)object, (c80)i90_02, ob0_12, (yT1)object2);
        return Unit.a;
    }
}

