/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from jP
 */
public final class jp_0
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ jp_0(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Throwable)object;
                yn3_0.a.e((Throwable)object);
                return Unit.a;
            }
            case 0: 
        }
        object = ((CartEntry)object).getProduct();
        object = object != null ? ((Product)object).getCode() : null;
        return String.valueOf(object);
    }
}

