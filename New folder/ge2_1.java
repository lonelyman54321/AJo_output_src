/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ge2
 */
public final class ge2_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ SelectedOrderItem b;

    public ge2_1(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, f80_0 f80_02) {
        this.a = qz1_22;
        this.b = selectedOrderItem;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        qz1_2 qz1_22 = this.a;
        SelectedOrderItem selectedOrderItem = this.b;
        object = new ge2_1(qz1_22, selectedOrderItem, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ge2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ge2_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.b.getForwardPacketNumber();
        Intrinsics.checkNotNull(object);
        object2 = this.a;
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, "packageCode");
        aW aW2 = md3_0.c((jD3)object2);
        yz1_2 yz1_22 = new yz1_2(null, (qz1_2)object2, (String)object);
        Ae3.d(aW2, null, null, yz1_22, 3);
        return Unit.a;
    }
}

