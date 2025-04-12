/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.dbhelper.CartDaoHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from ab2
 */
public final class ab2_2
extends qg3_2
implements Function2 {
    public int a;

    public ab2_2() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        object = new qg3_2(2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ab2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ab2_2)object).invokeSuspend(object2);
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
            object = CartDaoHelper.INSTANCE.deleteAllProducts();
            int n7 = 3;
            ab2$a ab2$a = new qg3_2(n7, null);
            at0_1 at0_12 = new at0_1((es0_2)object, ab2$a);
            object = ab2$b.a;
            this.a = n4;
            object = at0_12.collect((fs0_2)object, this);
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

