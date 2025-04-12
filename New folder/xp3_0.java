/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xp3
 */
public final class xp3_0
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ SelectedOrderItem b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;

    public /* synthetic */ xp3_0(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, boolean bl2, boolean bl3, int n3) {
        this.a = qz1_22;
        this.b = selectedOrderItem;
        this.c = bl2;
        this.d = bl3;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        int n3 = Me3.b(this.e | 1);
        SelectedOrderItem selectedOrderItem = this.b;
        boolean bl2 = this.c;
        boolean bl3 = this.d;
        ap3_0.a(qz1_22, selectedOrderItem, bl2, bl3, (b30_0)object3, n3);
        return Unit.a;
    }
}

