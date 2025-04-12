/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xb2
 */
public final class xb2_1
implements Function2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ qz1_2 c;
    public final /* synthetic */ SelectedOrderItem d;
    public final /* synthetic */ int e;

    public /* synthetic */ xb2_1(md2_2 md2_22, nb_1 nb_12, qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, int n3) {
        this.a = md2_22;
        this.b = nb_12;
        this.c = qz1_22;
        this.d = selectedOrderItem;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$onCloseSheetButtonClicked");
        object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$onCloseButtonClicked");
        qz1_2 qz1_22 = this.c;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        int n3 = Me3.b(this.e | 1);
        Object object4 = object;
        object4 = (md2_2)object;
        Object object5 = object2;
        object5 = (nb_1)object2;
        SelectedOrderItem selectedOrderItem = this.d;
        jd2_1.g((md2_2)object4, (nb_1)object5, qz1_22, selectedOrderItem, (b30_0)object3, n3);
        return Unit.a;
    }
}

