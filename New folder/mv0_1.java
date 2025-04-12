/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.dresstool.DressToolModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mv0
 */
public final class mv0_1
implements Function0 {
    public final /* synthetic */ i90_0 a;
    public final /* synthetic */ Cl2 b;
    public final /* synthetic */ ov0_0 c;
    public final /* synthetic */ DressToolModel d;

    public /* synthetic */ mv0_1(c80 c802, hm0_0 hm0_02, ov0_0 ov0_02, DressToolModel dressToolModel) {
        this.a = c802;
        this.b = hm0_02;
        this.c = ov0_02;
        this.d = dressToolModel;
    }

    public final Object invoke() {
        i90_0 i90_02 = this.a;
        Intrinsics.checkNotNullParameter(i90_02, "$scope");
        Cl2 cl2 = this.b;
        Intrinsics.checkNotNullParameter(cl2, "$pagerState");
        ov0_0 ov0_02 = this.c;
        Intrinsics.checkNotNullParameter(ov0_02, "$viewModel");
        DressToolModel dressToolModel = this.d;
        cl2 = (hm0_0)cl2;
        ov0_1 ov0_12 = new ov0_1((hm0_0)cl2, ov0_02, dressToolModel, null);
        Ae3.d(i90_02, null, null, ov0_12, 3);
        return Unit.a;
    }
}

