/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vL2
 */
public final class vl2_1
implements Function2 {
    public final /* synthetic */ am2$a_0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ vl2_1(am2$a_0 am2$a_0, bX1 bX12, int n3) {
        this.a = am2$a_0;
        this.b = bX12;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$state");
        Function0 function0 = this.b;
        Intrinsics.checkNotNullParameter(function0, "$onContinueClick");
        int n3 = Me3.b(this.c | 1);
        function0 = (bX1)function0;
        el2_2.a((am2$a_0)object2, (bX1)function0, (b30_0)object, n3);
        return Unit.a;
    }
}

