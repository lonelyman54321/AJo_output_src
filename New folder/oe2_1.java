/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oe2
 */
public final class oe2_1
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ SelectedOrderItem c;
    public final /* synthetic */ int d;

    public /* synthetic */ oe2_1(qz1_2 qz1_22, yT1 yT12, SelectedOrderItem selectedOrderItem, int n3) {
        this.a = qz1_22;
        this.b = yT12;
        this.c = selectedOrderItem;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        yT1 yT12 = this.b;
        Intrinsics.checkNotNullParameter(yT12, "$navController");
        int n3 = Me3.b(this.d | 1);
        SelectedOrderItem selectedOrderItem = this.c;
        de2_0.R(qz1_22, yT12, selectedOrderItem, (b30_0)object, n3);
        return Unit.a;
    }
}

