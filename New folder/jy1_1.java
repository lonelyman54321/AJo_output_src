/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jY1
 */
public final class jy1_1
implements Function2 {
    public final /* synthetic */ Product a;

    public /* synthetic */ jy1_1(Product product) {
        this.a = product;
    }

    public final Object invoke(Object object, Object object2) {
        double d2 = (Double)object;
        object2 = (String)object2;
        Product product = this.a;
        Intrinsics.checkNotNullParameter(product, "$product");
        Intrinsics.checkNotNullParameter(object2, "userCount");
        object = new StringBuilder();
        ((StringBuilder)object).append(d2);
        ((StringBuilder)object).append("|");
        ((StringBuilder)object).append((String)object2);
        object = ((StringBuilder)object).toString();
        product.setAggregateRating((String)object);
        return Unit.a;
    }
}

