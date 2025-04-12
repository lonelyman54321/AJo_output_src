/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pO2
 */
public final class po2_2
implements Function1 {
    public final /* synthetic */ Sl a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ SelectedOrderItem c;

    public /* synthetic */ po2_2(Sl sl, qz1_2 qz1_22, SelectedOrderItem selectedOrderItem) {
        this.a = sl;
        this.b = qz1_22;
        this.c = selectedOrderItem;
    }

    public final Object invoke(Object object) {
        int n3 = (Integer)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$annotatedText");
        qz1_2 qz1_22 = this.b;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        Object object3 = "URL";
        object = (Sl$b)CollectionsKt.firstOrNull(((Sl)object2).c(n3, n3, (String)object3));
        if (object != null) {
            object = (CartOrder)qz1_22.l.getValue();
            int n4 = 9;
            object3 = this.c;
            qz1_22.h((CartOrder)object, n4, (SelectedOrderItem)object3);
            object = Boolean.TRUE;
            object2 = qz1_22.v;
            ((h83_0)object2).setValue(object);
        }
        return Unit.a;
    }
}

