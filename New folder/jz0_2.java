/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from JZ0
 */
public final class jz0_2
implements Function2 {
    public final /* synthetic */ Product a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ jz0_2(Product product, int n3, String string2) {
        this.a = product;
        this.b = string2;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$product");
        int n3 = Me3.b(this.c | 1);
        String string2 = this.b;
        sn0_1.b((Product)object2, string2, (b30_0)object, n3);
        return Unit.a;
    }
}

