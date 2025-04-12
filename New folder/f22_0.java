/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from f22
 */
public final class f22_0
implements Function2 {
    public final /* synthetic */ NewProductDetailsFragment a;

    public /* synthetic */ f22_0(NewProductDetailsFragment newProductDetailsFragment) {
        this.a = newProductDetailsFragment;
    }

    public final Object invoke(Object object, Object object2) {
        double d2 = (Double)object;
        object2 = (String)object2;
        NewProductDetailsFragment newProductDetailsFragment = this.a;
        Intrinsics.checkNotNullParameter(newProductDetailsFragment, "this$0");
        Intrinsics.checkNotNullParameter(object2, "userCount");
        object = new StringBuilder();
        ((StringBuilder)object).append(d2);
        ((StringBuilder)object).append("|");
        ((StringBuilder)object).append((String)object2);
        object = ((StringBuilder)object).toString();
        object2 = newProductDetailsFragment.cb().q;
        Intrinsics.checkNotNull(object2);
        ((Product)object2).setAggregateRating((String)object);
        return Unit.a;
    }
}

