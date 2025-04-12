/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lv0
 */
public final class lv0_1
implements Function0 {
    public final /* synthetic */ i90_0 a;
    public final /* synthetic */ ov0_0 b;
    public final /* synthetic */ Cl2 c;

    public /* synthetic */ lv0_1(c80 c802, ov0_0 ov0_02, hm0_0 hm0_02) {
        this.a = c802;
        this.b = ov0_02;
        this.c = hm0_02;
    }

    public final Object invoke() {
        i90_0 i90_02 = this.a;
        Intrinsics.checkNotNullParameter(i90_02, "$scope");
        ov0_0 ov0_02 = this.b;
        Intrinsics.checkNotNullParameter(ov0_02, "$viewModel");
        Cl2 cl2 = this.c;
        Intrinsics.checkNotNullParameter(cl2, "$pagerState");
        cl2 = (hm0_0)cl2;
        nv0_2 nv0_22 = new nv0_2(ov0_02, (hm0_0)cl2, null);
        Ae3.d(i90_02, null, null, nv0_22, 3);
        return Unit.a;
    }
}

