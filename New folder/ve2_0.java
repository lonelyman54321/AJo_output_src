/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ve2
 */
public final class ve2_0
implements Function0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Product b;
    public final /* synthetic */ i90_0 c;
    public final /* synthetic */ CartEntry d;
    public final /* synthetic */ qz1_2 e;

    public /* synthetic */ ve2_0(Activity activity, Product product, c80 c802, CartEntry cartEntry, qz1_2 qz1_22) {
        this.a = activity;
        this.b = product;
        this.c = c802;
        this.d = cartEntry;
        this.e = qz1_22;
    }

    public final Object invoke() {
        Product product;
        i90_0 i90_02 = this.c;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        qz1_2 qz1_22 = this.e;
        Object object = "$viewModel";
        Intrinsics.checkNotNullParameter(qz1_22, (String)object);
        Activity activity = this.a;
        if (activity != null && (product = this.b) != null && (object = product.getUrl()) != null) {
            CartEntry cartEntry = this.d;
            object = new ye2_2(cartEntry, qz1_22, activity, product, null);
            int n3 = 3;
            cartEntry = null;
            Ae3.d(i90_02, null, null, (Function2)object, n3);
        }
        return Unit.a;
    }
}

