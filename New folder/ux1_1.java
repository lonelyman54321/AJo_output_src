/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.services.data.Cart.Cart;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from uX1
 */
public final class ux1_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ wx1_1 b;
    public final /* synthetic */ HashSet c;
    public final /* synthetic */ Cart d;

    public ux1_1(wx1_1 wx1_12, HashSet hashSet, Cart cart, f80_0 f80_02) {
        this.b = wx1_12;
        this.c = hashSet;
        this.d = cart;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        HashSet hashSet = this.c;
        Cart cart = this.d;
        wx1_1 wx1_12 = this.b;
        object = new ux1_1(wx1_12, hashSet, cart, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ux1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ux1_1)object).invokeSuspend(object2);
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
            object = this.b;
            Object object2 = ((wx1_1)object).c;
            HashSet hashSet = this.c;
            Object object3 = this.d;
            object2 = ((CartApiRepo)object2).getInternalWalletOnCart(hashSet, (Cart)object3);
            uX1$a uX1$a = new uX1$a((wx1_1)object, null);
            object3 = new at0_1((es0_2)object2, uX1$a);
            object2 = new uX1$b((wx1_1)object);
            this.a = n4;
            object = ((at0_1)object3).collect((fs0_2)object2, this);
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

