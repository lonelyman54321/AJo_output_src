/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Vp3
 */
public final class vp3_0
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ SelectedOrderItem b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ vp3_0(int n3, qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, String string2) {
        this.a = qz1_22;
        this.b = selectedOrderItem;
        this.c = string2;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        int n3 = Me3.b(this.d | 1);
        SelectedOrderItem selectedOrderItem = this.b;
        String string2 = this.c;
        wp3_0.a(qz1_22, selectedOrderItem, string2, (b30_0)object, n3);
        return Unit.a;
    }
}

