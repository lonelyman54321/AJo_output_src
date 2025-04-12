/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.myaccount.ajiocash.datasource.OrderCancellationRefundConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from xd2
 */
public final class xd2_2
implements Function2 {
    public final /* synthetic */ OrderCancellationRefundConfig a;
    public final /* synthetic */ int b;

    public /* synthetic */ xd2_2(OrderCancellationRefundConfig orderCancellationRefundConfig, int n3) {
        this.a = orderCancellationRefundConfig;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        int n3 = Me3.b(this.b | 1);
        de2_0.I(this.a, (b30_0)object, n3);
        return Unit.a;
    }
}

