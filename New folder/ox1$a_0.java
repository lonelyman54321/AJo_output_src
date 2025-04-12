/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CartRepo;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Product.QuickViewProduct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from OX1$a
 */
public final class ox1$a_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wx1_1 c;
    public final /* synthetic */ QuickViewProduct d;
    public final /* synthetic */ int e;

    public ox1$a_0(wx1_1 wx1_12, QuickViewProduct quickViewProduct, int n3, f80_0 f80_02) {
        this.c = wx1_12;
        this.d = quickViewProduct;
        this.e = n3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        QuickViewProduct quickViewProduct = this.d;
        int n3 = this.e;
        wx1_1 wx1_12 = this.c;
        ox1$a_0 ox1$a_0 = new ox1$a_0(wx1_12, quickViewProduct, n3, f80_02);
        ox1$a_0.b = object;
        return ox1$a_0;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (ox1$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ox1$a_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = (fs0_2)this.b;
            Object object2 = CartRepo.INSTANCE;
            Cart cart = this.c.S0;
            QuickViewProduct quickViewProduct = this.d;
            int n7 = this.e;
            object2 = ((CartRepo)object2).modifyQVInfo(cart, quickViewProduct, n7);
            this.a = n4;
            object = object.emit(object2, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

