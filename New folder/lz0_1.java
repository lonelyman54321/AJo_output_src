/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.Product;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from LZ0
 */
public final class lz0_1
implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Product b;

    public /* synthetic */ lz0_1(Product product, String string2) {
        this.a = string2;
        this.b = product;
    }

    public final Object invoke(Object object) {
        object = (UY2)object;
        Serializable serializable = this.b;
        Intrinsics.checkNotNullParameter(serializable, "$product");
        Intrinsics.checkNotNullParameter(object, "$this$semantics");
        Object object2 = ((Product)serializable).getGwpQuantity();
        serializable = new StringBuilder("Qty at pos ");
        String string2 = this.a;
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append("  ");
        ((StringBuilder)serializable).append(object2);
        ((StringBuilder)serializable).append(" ");
        object2 = ((StringBuilder)serializable).toString();
        RY2.e((UY2)object, (String)object2);
        return Unit.a;
    }
}

