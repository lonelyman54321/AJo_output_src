/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.dbhelper.CartDaoHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class KY1$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public KY1$a(String string2, String string3, f80_0 f80_02) {
        this.b = string2;
        this.c = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.b;
        String string3 = this.c;
        object = new KY1$a(string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (KY1$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((KY1$a)object).invokeSuspend(object2);
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
            object = CartDaoHelper.INSTANCE;
            Object object2 = this.c;
            String string2 = this.b;
            object = ((CartDaoHelper)object).addItemToCartDao(string2, (String)object2, false);
            int n7 = 3;
            string2 = null;
            object2 = new qg3_2(n7, null);
            at0_1 at0_12 = new at0_1((es0_2)object, (gx0_2)object2);
            object = KY1$a$b.a;
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

