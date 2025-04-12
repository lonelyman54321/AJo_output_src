/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qO2
 */
public final class qo2_1
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ SelectedOrderItem d;
    public final /* synthetic */ int e;

    public /* synthetic */ qo2_1(String string2, qz1_2 qz1_22, String string3, SelectedOrderItem selectedOrderItem, int n3) {
        this.a = string2;
        this.b = qz1_22;
        this.c = string3;
        this.d = selectedOrderItem;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        qz1_2 qz1_22 = this.b;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        int n3 = Me3.b(this.e | 1);
        String string2 = this.a;
        String string3 = this.c;
        SelectedOrderItem selectedOrderItem = this.d;
        ro2_0.a(string2, qz1_22, string3, selectedOrderItem, (b30_0)object3, n3);
        return Unit.a;
    }
}

