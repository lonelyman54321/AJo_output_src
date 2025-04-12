/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.dbhelper.RecentlyViewedDaoHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Jy3
 */
public final class jy3_0
extends qg3_2
implements Function2 {
    public int a;

    public jy3_0() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        object = new qg3_2(2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (jy3_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((jy3_0)object).invokeSuspend(object2);
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
            object = RecentlyViewedDaoHelper.INSTANCE.deleteAllEntries();
            int n7 = 3;
            Jy3$a jy3$a = new qg3_2(n7, null);
            at0_1 at0_12 = new at0_1((es0_2)object, jy3$a);
            object = Jy3$b.a;
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

