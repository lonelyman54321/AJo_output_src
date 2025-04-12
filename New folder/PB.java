/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class PB
implements Function2 {
    public final /* synthetic */ lQ2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Product d;
    public final /* synthetic */ dr0_0 e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ int g;

    public /* synthetic */ PB(String string2, String string3, Product product, dr0_0 dr0_02, ib_0 ib_02, int n3) {
        mq2_0 mq2_02 = mq2_0.a;
        this.a = mq2_02;
        this.b = string2;
        this.c = string3;
        this.d = product;
        this.e = dr0_02;
        this.f = ib_02;
        this.g = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        Intrinsics.checkNotNullParameter(this.a, "$this_MiniPLPView");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$brandName");
        String string3 = this.c;
        Intrinsics.checkNotNullParameter(string3, "$heading");
        dr0_0 dr0_02 = this.e;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        object = this.f;
        Intrinsics.checkNotNullParameter(object, "$onItemWishlist");
        int n3 = Me3.b(this.g | 1);
        Product product = this.d;
        Object object4 = object;
        object4 = (ib_0)object;
        WB.f(string2, string3, product, dr0_02, (ib_0)object4, (b30_0)object3, n3);
        return Unit.a;
    }
}

