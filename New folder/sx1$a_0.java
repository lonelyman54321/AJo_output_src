/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CartRepo;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.UpdateCartEntry;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SX1$a
 */
public final class sx1$a_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wx1_1 c;
    public final /* synthetic */ UpdateCartEntry d;

    public sx1$a_0(wx1_1 wx1_12, UpdateCartEntry updateCartEntry, f80_0 f80_02) {
        this.c = wx1_12;
        this.d = updateCartEntry;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        wx1_1 wx1_12 = this.c;
        UpdateCartEntry updateCartEntry = this.d;
        sx1$a_0 sx1$a_0 = new sx1$a_0(wx1_12, updateCartEntry, f80_02);
        sx1$a_0.b = object;
        return sx1$a_0;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (sx1$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((sx1$a_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = (fs0_2)this.b;
        Object object2 = this.c;
        ArrayList arrayList = ((wx1_1)object2).R0;
        if (arrayList == null) {
            arrayList = new ArrayList();
            ((wx1_1)object2).R0 = arrayList;
        }
        if ((arrayList = ((wx1_1)object2).Q0) == null) {
            ((wx1_1)object2).Q0 = arrayList = new ArrayList();
        }
        arrayList = CartRepo.INSTANCE;
        Cart cart = ((wx1_1)object2).S0;
        ArrayList arrayList2 = ((wx1_1)object2).R0;
        Intrinsics.checkNotNull(arrayList2);
        object2 = ((wx1_1)object2).Q0;
        Intrinsics.checkNotNull(object2);
        UpdateCartEntry updateCartEntry = this.d;
        n3 = (int)(((CartRepo)((Object)arrayList)).updateCartData(cart, updateCartEntry, arrayList2, (ArrayList)object2) ? 1 : 0);
        object2 = n3 != 0;
        this.a = n4;
        object = object.emit(object2, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

