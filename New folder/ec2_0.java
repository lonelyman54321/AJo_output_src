/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ec2
 */
public final class ec2_0
implements Function2 {
    public final /* synthetic */ CartOrder a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ec2_0(CartOrder cartOrder, rd1_1 rd1_12, int n3) {
        this.a = cartOrder;
        this.b = rd1_12;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$cartOrder");
        Function0 function0 = this.b;
        Intrinsics.checkNotNullParameter(function0, "$onCloseButtonClicked");
        int n3 = Me3.b(this.c | 1);
        function0 = (rd1_1)function0;
        jd2_1.c((CartOrder)object2, (rd1_1)function0, (b30_0)object, n3);
        return Unit.a;
    }
}

