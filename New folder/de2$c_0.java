/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from De2$c
 */
public final class de2$c_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ CartOrder b;
    public final /* synthetic */ List c;

    public de2$c_0(qz1_2 qz1_22, CartOrder cartOrder, List list, f80_0 f80_02) {
        this.a = qz1_22;
        this.b = cartOrder;
        this.c = list;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CartOrder cartOrder = this.b;
        List list = this.c;
        qz1_2 qz1_22 = this.a;
        object = new de2$c_0(qz1_22, cartOrder, list, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (de2$c_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((de2$c_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        object = (SelectedOrderItem)CollectionsKt.firstOrNull(this.c);
        this.a.getClass();
        object = h40_0.a;
        return Unit.a;
    }
}

