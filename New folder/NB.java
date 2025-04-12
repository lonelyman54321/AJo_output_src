/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class NB
implements Function2 {
    public final /* synthetic */ Function2 a;

    public /* synthetic */ NB(ib_0 ib_02) {
        this.a = ib_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Product)object;
        object2 = (Boolean)object2;
        ((Boolean)object2).booleanValue();
        Function2 function2 = this.a;
        Intrinsics.checkNotNullParameter(function2, "$onItemWishlist");
        function2.invoke(object, object2);
        return Unit.a;
    }
}

