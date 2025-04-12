/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.services.query.QueryCart;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from U23
 */
public final class u23_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ w23_0 b;
    public final /* synthetic */ QueryCart c;

    public u23_0(w23_0 w23_02, QueryCart queryCart, f80_0 f80_02) {
        this.b = w23_02;
        this.c = queryCart;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        w23_0 w23_02 = this.b;
        QueryCart queryCart = this.c;
        object = new u23_0(w23_02, queryCart, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (u23_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((u23_0)object).invokeSuspend(object2);
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
            Object object2 = ((w23_0)object).b;
            int n7 = 2;
            Object object3 = this.c;
            String string2 = "shared with me screen";
            Object object4 = CartApiRepo.addToCart$default((CartApiRepo)object2, (QueryCart)object3, null, string2, n7, null);
            object2 = new U23$a((w23_0)object, null);
            object3 = new at0_1((es0_2)object4, (gx0_2)object2);
            object4 = new U23$b((w23_0)object);
            this.a = n4;
            object = ((at0_1)object3).collect((fs0_2)object4, this);
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

