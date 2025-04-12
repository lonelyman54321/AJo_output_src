/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.services.query.QueryCart;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class D4$a$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ g4_0 b;
    public final /* synthetic */ QueryCart c;

    public D4$a$a(g4_0 g4_02, QueryCart queryCart, f80_0 f80_02) {
        this.b = g4_02;
        this.c = queryCart;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        g4_0 g4_02 = this.b;
        QueryCart queryCart = this.c;
        object = new D4$a$a(g4_02, queryCart, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (D4$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((D4$a$a)object).invokeSuspend(object2);
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
            object = this.b.a;
            String string2 = od3_2.a();
            this.a = n4;
            QueryCart queryCart = this.c;
            object = ((CartApiRepo)object).suspendAddToCart(queryCart, string2, this);
            if (object != j90_02) return object;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return object;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

