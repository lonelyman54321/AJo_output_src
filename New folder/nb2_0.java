/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Nb2
 */
public final class nb2_0
implements Function1 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ nb2_0(qz1_2 qz1_22, yT1 yT12, boolean bl2) {
        this.a = qz1_22;
        this.b = yT12;
        this.c = bl2;
    }

    public final Object invoke(Object object) {
        object = (wT1)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$viewModel");
        Object object3 = this.b;
        Intrinsics.checkNotNullParameter(object3, "$navController");
        Intrinsics.checkNotNullParameter(object, "$this$NavHost");
        ob2_0 ob2_02 = new ob2_0((qz1_2)object2, (yT1)object3);
        boolean bl2 = true;
        object2 = new u10(217313292, ob2_02, bl2);
        int n3 = 254;
        xT1.a((wT1)object, "home_route", null, (u10)object2, n3);
        boolean bl3 = this.c;
        object2 = new pb2_1(bl3);
        object3 = new u10(1138954179, object2, bl2);
        xT1.a((wT1)object, "finish_route", null, (u10)object3, n3);
        return Unit.a;
    }
}

