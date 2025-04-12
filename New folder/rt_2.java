/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rt
 */
public final class rt_2
implements Function2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ int d;

    public /* synthetic */ rt_2(ob0_1 ob0_12, int n3, Integer n4, int n7) {
        this.a = ob0_12;
        this.b = n3;
        this.c = n4;
        this.d = n7;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        ob0_1 ob0_12 = this.a;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        int n3 = Me3.b(this.d | 1);
        int n4 = this.b;
        Integer n7 = this.c;
        qt_0.c(ob0_12, n4, n7, (b30_0)object, n3);
        return Unit.a;
    }
}

