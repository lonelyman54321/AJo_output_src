/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QL2
 */
public final class ql2_1
implements Function0 {
    public final /* synthetic */ pl2_1 a;

    public /* synthetic */ ql2_1(pl2_1 pl2_12) {
        this.a = pl2_12;
    }

    public final Object invoke() {
        pl2_1 pl2_12 = this.a;
        Intrinsics.checkNotNullParameter(pl2_12, "this$0");
        ov0_0 ov0_02 = pl2_1.Pa(pl2_12);
        ov0_02.getClass();
        aW aW2 = md3_0.c(ov0_02);
        lv0_2 lv0_22 = new lv0_2(ov0_02, null);
        Ae3.d(aW2, null, null, lv0_22, 3);
        pl2_12.dismissAllowingStateLoss();
        return Unit.a;
    }
}

