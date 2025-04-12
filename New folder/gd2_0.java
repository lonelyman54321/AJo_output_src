/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gd2
 */
public final class gd2_0
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ SelectedOrderItem c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;

    public /* synthetic */ gd2_0(qz1_2 qz1_22, yT1 yT12, SelectedOrderItem selectedOrderItem, boolean bl2, int n3) {
        this.a = qz1_22;
        this.b = yT12;
        this.c = selectedOrderItem;
        this.d = bl2;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        yT1 yT12 = this.b;
        Intrinsics.checkNotNullParameter(yT12, "$navController");
        int n3 = Me3.b(this.e | 1);
        SelectedOrderItem selectedOrderItem = this.c;
        boolean bl2 = this.d;
        de2_0.j(qz1_22, yT12, selectedOrderItem, bl2, (b30_0)object3, n3);
        return Unit.a;
    }
}

