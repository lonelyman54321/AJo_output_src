/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CartRepo;
import com.ril.ajio.services.data.Cart.Cart;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class zX1$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wx1_1 c;
    public final /* synthetic */ boolean d;

    public zX1$a(f80_0 f80_02, wx1_1 wx1_12, boolean bl2) {
        this.c = wx1_12;
        this.d = bl2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        wx1_1 wx1_12 = this.c;
        boolean bl2 = this.d;
        zX1$a zX1$a = new zX1$a(f80_02, wx1_12, bl2);
        zX1$a.b = object;
        return zX1$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (zX1$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((zX1$a)object).invokeSuspend(object2);
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
            Object object3 = this.c;
            Cart cart = ((wx1_1)object3).S0;
            ArrayList arrayList = ((wx1_1)object3).T0;
            object3 = ((wx1_1)object3).U0;
            boolean bl2 = this.d;
            object2 = ((CartRepo)object2).filterCart(cart, arrayList, (ArrayList)object3, bl2);
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

