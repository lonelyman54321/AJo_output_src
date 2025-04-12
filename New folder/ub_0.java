/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from UB
 */
public final class ub_0
implements Function0 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ Product b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ub_0(Function2 function2, Product product, boolean bl2) {
        this.a = function2;
        this.b = product;
        this.c = bl2;
    }

    public final Object invoke() {
        Function2 function2 = this.a;
        Intrinsics.checkNotNullParameter(function2, "$onItemWishlist");
        Product product = this.b;
        Intrinsics.checkNotNullParameter(product, "$product");
        Boolean bl2 = this.c;
        function2.invoke(product, bl2);
        return Unit.a;
    }
}

