/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bd2
 */
public final class bd2_1
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qz1_2 d;
    public final /* synthetic */ SelectedOrderItem e;
    public final /* synthetic */ int f;

    public /* synthetic */ bd2_1(String string2, String string3, String string4, qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, int n3) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = qz1_22;
        this.e = selectedOrderItem;
        this.f = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$address");
        String string3 = this.c;
        Intrinsics.checkNotNullParameter(string3, "$phone");
        qz1_2 qz1_22 = this.d;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        int n3 = Me3.b(this.f | 1);
        String string4 = this.a;
        SelectedOrderItem selectedOrderItem = this.e;
        de2_0.d(string4, string2, string3, qz1_22, selectedOrderItem, (b30_0)object3, n3);
        return Unit.a;
    }
}

