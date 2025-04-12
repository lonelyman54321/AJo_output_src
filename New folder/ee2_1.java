/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.CartEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ee2
 */
public final class ee2_1
implements Function2 {
    public final /* synthetic */ CartEntry a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ee2_1(CartEntry cartEntry, qz1_2 qz1_22, int n3) {
        this.a = cartEntry;
        this.b = qz1_22;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        qz1_2 qz1_22 = this.b;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        int n3 = Me3.b(this.c | 1);
        de2_0.i(this.a, qz1_22, (b30_0)object, n3);
        return Unit.a;
    }
}

