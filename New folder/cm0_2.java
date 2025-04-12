/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CM0
 */
public final class cm0_2
implements Function1 {
    public final /* synthetic */ yh0_0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ cm0_2(yh0_0 yh0_02, w93_0 w93_02, u02_0 u02_02) {
        this.a = yh0_02;
        this.b = w93_02;
        this.c = u02_02;
    }

    public final Object invoke(Object object) {
        object = (dt1_0)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$viewModel");
        fx0_2 fx0_22 = this.b;
        Intrinsics.checkNotNullParameter(fx0_22, "$onResetFilter");
        Function0 function0 = this.c;
        Intrinsics.checkNotNullParameter(function0, "$onApplyFilter");
        Intrinsics.checkNotNullParameter(object, "$this$LazyColumn");
        nm0_1 nm0_12 = new nm0_1((yh0_0)object2);
        boolean bl2 = true;
        gx0_2 gx0_22 = new u10(-1021618474, nm0_12, bl2);
        int n3 = 3;
        bt1.a((dt1_0)object, null, gx0_22, n3);
        gx0_22 = new om0_1((yh0_0)object2);
        u10 u102 = new u10(-1545854209, gx0_22, bl2);
        bt1.a((dt1_0)object, null, u102, n3);
        gx0_22 = new pm0_0((yh0_0)object2);
        object2 = new u10(-251435362, gx0_22, bl2);
        bt1.a((dt1_0)object, null, (gx0_2)object2, n3);
        fx0_22 = (w93_0)fx0_22;
        function0 = (u02_0)function0;
        object2 = new sm0_2((w93_0)fx0_22, (u02_0)function0);
        fx0_22 = new u10(1042983485, object2, bl2);
        bt1.a((dt1_0)object, null, (gx0_2)fx0_22, n3);
        return Unit.a;
    }
}

