/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fe
 */
public final class fe_2
implements Function0 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ SelectedOrderItem b;

    public /* synthetic */ fe_2(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem) {
        this.a = qz1_22;
        this.b = selectedOrderItem;
    }

    public final Object invoke() {
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        qz1_22.getClass();
        LinkedHashMap<Boolean, SelectedOrderItem> linkedHashMap = new LinkedHashMap<Boolean, SelectedOrderItem>();
        Boolean bl2 = Boolean.TRUE;
        SelectedOrderItem selectedOrderItem = this.b;
        linkedHashMap.put(bl2, selectedOrderItem);
        qz1_22.j.setValue(linkedHashMap);
        return Unit.a;
    }
}

