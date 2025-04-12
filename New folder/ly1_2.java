/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.services.query.QueryCart;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from LY1
 */
public final class ly1_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ky1_0 b;
    public final /* synthetic */ QueryCart c;

    public ly1_2(ky1_0 ky1_02, QueryCart queryCart, f80_0 f80_02) {
        this.b = ky1_02;
        this.c = queryCart;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ky1_0 ky1_02 = this.b;
        QueryCart queryCart = this.c;
        object = new ly1_2(ky1_02, queryCart, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ly1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ly1_2)object).invokeSuspend(object2);
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
        object = this.b;
        Object object2 = ((ky1_0)object).b;
        Object object3 = ((ky1_0)object).r.getSourceStoreId();
        if (object3 == null) {
            object3 = "ajio";
        }
        QueryCart queryCart = this.c;
        object2 = ((CartApiRepo)object2).addToCart(queryCart, (String)object3, "closet screen");
        object3 = new LY1$a((ky1_0)object, null);
        at0_1 at0_12 = new at0_1((es0_2)object2, (gx0_2)object3);
        object2 = new LY1$b((ky1_0)object);
        this.a = n4;
        object = at0_12.collect((fs0_2)object2, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

