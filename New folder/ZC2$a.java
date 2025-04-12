/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.dbhelper.RecentlyViewedDaoHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class ZC2$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ZC2 b;

    public ZC2$a(ZC2 zC2, f80_0 f80_02) {
        this.b = zC2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ZC2 zC2 = this.b;
        object = new ZC2$a(zC2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ZC2$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ZC2$a)object).invokeSuspend(object2);
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
            object = RecentlyViewedDaoHelper.INSTANCE;
            Object object2 = this.b;
            Object object3 = ((ZC2)object2).e;
            object2 = ((ZC2)object2).f;
            object = ((RecentlyViewedDaoHelper)object).getRecentlyViewed((zr1_1)object3, (zr1_1)object2);
            int n7 = 3;
            object2 = new qg3_2(n7, null);
            object3 = new at0_1((es0_2)object, (gx0_2)object2);
            object = ZC2$a$b.a;
            this.a = n4;
            object = ((at0_1)object3).collect((fs0_2)object, this);
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

