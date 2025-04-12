/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.query.QueryCart;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from V23
 */
public final class v23_0
extends qg3_2
implements Function2 {
    public w23_0 a;
    public int b;
    public final /* synthetic */ w23_0 c;

    public v23_0(w23_0 w23_02, f80_0 f80_02) {
        this.c = w23_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        w23_0 w23_02 = this.c;
        object = new v23_0(w23_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (v23_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((v23_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        w23_0 w23_02;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.b;
        int n4 = 2;
        int n7 = 1;
        if (n3 != 0) {
            if (n3 != n7) {
                if (n3 == n4) {
                    vl2_2.b(object);
                    return Unit.a;
                }
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            w23_02 = this.a;
            vl2_2.b(object);
        } else {
            int n8;
            vl2_2.b(object);
            w23_02 = this.c;
            w23_02.s = n8 = w23_02.s + n7;
            int n10 = w23_02.r;
            if (n8 >= n10) return Unit.a;
            QueryCart queryCart = new QueryCart();
            object = w23_02.p;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("saveForLaterProduct");
                n8 = 0;
                object = null;
            }
            n10 = w23_02.s;
            object = ((Product)((ArrayList)object).get(n10)).getCode();
            if (object == null) return Unit.a;
            queryCart.setProductCode((String)object);
            queryCart.setQuantity(n7);
            this.a = w23_02;
            this.b = n7;
            int n14 = 2;
            WishListRepo wishListRepo = w23_02.c;
            object = WishListRepo.addToWishList$default(wishListRepo, queryCart, null, this, n14, null);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = (es0_2)object;
        V23$a v23$a = new V23$a(w23_02, null);
        at0_1 at0_12 = new at0_1((es0_2)object, v23$a);
        object = new V23$b(w23_02);
        this.a = null;
        this.b = n4;
        object = at0_12.collect((fs0_2)object, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

