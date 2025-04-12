/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VB
 */
public final class vb_0
implements Function2 {
    public final /* synthetic */ Product a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ vb_0(Product product, Function2 function2, int n3) {
        this.a = product;
        this.b = function2;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        Product product = this.a;
        Intrinsics.checkNotNullParameter(product, "$product");
        Function2 function2 = this.b;
        Intrinsics.checkNotNullParameter(function2, "$onItemWishlist");
        int n3 = Me3.b(this.c | 1);
        WB.d(product, function2, (b30_0)object, n3);
        return Unit.a;
    }
}

