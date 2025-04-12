/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from tD
 */
public final class td_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ yp0_0 a;
    public final /* synthetic */ Product b;

    public td_2(yp0_0 yp0_02, Product product, f80_0 f80_02) {
        this.a = yp0_02;
        this.b = product;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yp0_0 yp0_02 = this.a;
        Product product = this.b;
        object = new td_2(yp0_02, product, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (td_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((td_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = this.b;
        this.a.f((Product)object2, "add_to_wishlist");
        return Unit.a;
    }
}

