/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Oe2
 */
public final class oe2_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ CartOrder c;
    public final /* synthetic */ CartEntry d;
    public final /* synthetic */ ft1_2 e;

    public oe2_2(qz1_2 qz1_22, CartOrder cartOrder, CartEntry cartEntry, ft1_2 ft1_22, f80_0 f80_02) {
        this.b = qz1_22;
        this.c = cartOrder;
        this.d = cartEntry;
        this.e = ft1_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CartEntry cartEntry = this.d;
        ft1_2 ft1_22 = this.e;
        qz1_2 qz1_22 = this.b;
        CartOrder cartOrder = this.c;
        object = new oe2_2(qz1_22, cartOrder, cartEntry, ft1_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (oe2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((oe2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block8: {
            j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
            int n3 = this.a;
            int n4 = 1;
            if (n3 != 0) {
                if (n3 == n4) {
                    vl2_2.b(object);
                    break block8;
                }
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
            object = this.d;
            Object object2 = ((CartEntry)object).getProduct().getCode();
            object = ((CartEntry)object).getExchangeId();
            CartOrder cartOrder = this.c;
            qz1_2 qz1_22 = this.b;
            qz1_22.c(cartOrder, (String)object2, (String)object);
            object = md3_0.c(qz1_22);
            cartOrder = null;
            object2 = new d02_0(qz1_22, null);
            int n7 = 3;
            Ae3.d((i90_0)object, null, null, (Function2)object2, n7);
            try {
                object = this.e;
            }
            catch (Exception exception) {}
            this.a = n4;
            n3 = 0;
            object2 = null;
            object = ft1_2.f((ft1_2)object, 0, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

