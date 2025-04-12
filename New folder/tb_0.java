/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TB
 */
public final class tb_0
implements Function2 {
    public final /* synthetic */ Product a;
    public final /* synthetic */ int b;

    public /* synthetic */ tb_0(int n3, Product product) {
        this.a = product;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        Product product = this.a;
        Intrinsics.checkNotNullParameter(product, "$product");
        int n3 = Me3.b(this.b | 1);
        WB.g(product, (b30_0)object, n3);
        return Unit.a;
    }
}

