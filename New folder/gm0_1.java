/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GM0
 */
public final class gm0_1
implements Function2 {
    public final /* synthetic */ yh0_0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ gm0_1(yh0_0 yh0_02, int n3) {
        this.a = yh0_02;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        yh0_0 yh0_02 = this.a;
        Intrinsics.checkNotNullParameter(yh0_02, "$viewModel");
        int n3 = Me3.b(this.b | 1);
        tm0_1.c(yh0_02, (b30_0)object, n3);
        return Unit.a;
    }
}

