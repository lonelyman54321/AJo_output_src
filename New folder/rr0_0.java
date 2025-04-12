/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rr0
 */
public final class rr0_0
implements Function1 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ SelectedOrderItem b;

    public /* synthetic */ rr0_0(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem) {
        this.a = qz1_22;
        this.b = selectedOrderItem;
    }

    public final Object invoke(Object object) {
        ((Integer)object).getClass();
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$viewModel");
        ((qz1_2)object).S = true;
        LinkedHashMap<Boolean, SelectedOrderItem> linkedHashMap = new LinkedHashMap<Boolean, SelectedOrderItem>();
        Boolean bl2 = Boolean.TRUE;
        SelectedOrderItem selectedOrderItem = this.b;
        linkedHashMap.put(bl2, selectedOrderItem);
        ((qz1_2)object).w.setValue(linkedHashMap);
        return Unit.a;
    }
}

