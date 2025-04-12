/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Order.CartOrder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zS
 */
public final class zs_1
implements Function1 {
    public final /* synthetic */ ps_0 a;
    public final /* synthetic */ CartOrder b;

    public /* synthetic */ zs_1(ps_0 ps_02, CartOrder cartOrder) {
        this.a = ps_02;
        this.b = cartOrder;
    }

    public final Object invoke(Object object) {
        object = (Unit)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = ((ps_0)object2).f;
        object2 = DataCallback.Companion;
        CartOrder cartOrder = this.b;
        object2 = ((DataCallback$Companion)object2).onSuccess(cartOrder);
        ((LiveData)object).k(object2);
        return Unit.a;
    }
}

