/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.myaccount.ajiocash.datasource.OrderCancellationRefundConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pd2
 */
public final class pd2_1
implements Function2 {
    public final /* synthetic */ OrderCancellationRefundConfig a;
    public final /* synthetic */ int b;

    public /* synthetic */ pd2_1(OrderCancellationRefundConfig orderCancellationRefundConfig, int n3) {
        this.a = orderCancellationRefundConfig;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        OrderCancellationRefundConfig orderCancellationRefundConfig = this.a;
        Intrinsics.checkNotNullParameter(orderCancellationRefundConfig, "$refundConfig");
        int n3 = Me3.b(this.b | 1);
        de2_0.M(orderCancellationRefundConfig, (b30_0)object, n3);
        return Unit.a;
    }
}

