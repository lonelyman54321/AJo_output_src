/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from Me2
 */
public final class me2_0
implements Function1 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ i90_0 b;
    public final /* synthetic */ qz1_2 c;
    public final /* synthetic */ CartOrder d;
    public final /* synthetic */ ft1_2 e;

    public /* synthetic */ me2_0(p83_0 p83_02, c80 c802, qz1_2 qz1_22, CartOrder cartOrder, ft1_2 ft1_22) {
        this.a = p83_02;
        this.b = c802;
        this.c = qz1_22;
        this.d = cartOrder;
        this.e = ft1_22;
    }

    public final Object invoke(Object object) {
        te2_1 te2_12;
        object = (dt1_0)object;
        p83_0 p83_02 = this.a;
        Intrinsics.checkNotNullParameter(p83_02, "$orderEntries");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$coroutineScope");
        qz1_2 qz1_22 = this.c;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        ft1_2 ft1_22 = this.e;
        Intrinsics.checkNotNullParameter(ft1_22, "$parentLazyListState");
        Intrinsics.checkNotNullParameter(object, "$this$LazyRow");
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        int n3 = p83_02.size();
        Object object3 = re2_2.c;
        se2_2 se2_22 = new se2_2(p83_02, (Function1)object3);
        CartOrder cartOrder = this.d;
        object3 = object2;
        object3 = (c80)object2;
        object2 = te2_12;
        te2_12 = new te2_1(p83_02, (c80)object3, qz1_22, cartOrder, ft1_22, ref$IntRef);
        object2 = new u10(-632812321, te2_12, true);
        object.a(n3, null, se2_22, (u10)object2);
        return Unit.a;
    }
}

