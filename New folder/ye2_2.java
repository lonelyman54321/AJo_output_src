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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ye2
 */
public final class ye2_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ CartEntry a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ Product d;

    public ye2_2(CartEntry cartEntry, qz1_2 qz1_22, Activity activity, Product product, f80_0 f80_02) {
        this.a = cartEntry;
        this.b = qz1_22;
        this.c = activity;
        this.d = product;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Activity activity = this.c;
        Product product = this.d;
        CartEntry cartEntry = this.a;
        qz1_2 qz1_22 = this.b;
        object = new ye2_2(cartEntry, qz1_22, activity, product, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ye2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ye2_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        if (object == null || (object = ((CartEntry)object).getSourceStoreId()) == null) {
            object = ld3_2.STORE_AJIO.getStoreId();
        }
        Object object3 = object;
        this.b.getClass();
        object = this.c;
        Intrinsics.checkNotNullParameter(object, "activity");
        object2 = new zj0_0((Activity)object);
        object = this.d;
        object = object != null ? ((Product)object).getCode() : null;
        ((di2_2)object2).b((String)object, (String)object3, "", null, null);
        return Unit.a;
    }
}

