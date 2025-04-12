/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ud2
 */
public final class ud2_1
implements Function2 {
    public final /* synthetic */ CartOrder a;
    public final /* synthetic */ p83_0 b;
    public final /* synthetic */ qz1_2 c;
    public final /* synthetic */ ft1_2 d;
    public final /* synthetic */ int e;

    public /* synthetic */ ud2_1(CartOrder cartOrder, p83_0 p83_02, qz1_2 qz1_22, ft1_2 ft1_22, int n3) {
        this.a = cartOrder;
        this.b = p83_02;
        this.c = qz1_22;
        this.d = ft1_22;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        p83_0 p83_02 = this.b;
        Intrinsics.checkNotNullParameter(p83_02, "$orderEntries");
        qz1_2 qz1_22 = this.c;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        ft1_2 ft1_22 = this.d;
        Intrinsics.checkNotNullParameter(ft1_22, "$parentLazyListState");
        int n3 = Me3.b(this.e | 1);
        de2_0.s(this.a, p83_02, qz1_22, ft1_22, (b30_0)object3, n3);
        return Unit.a;
    }
}

