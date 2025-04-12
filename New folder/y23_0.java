/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.dbhelper.ShareProductExperienceDaoHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Y23
 */
public final class y23_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ w23_0 b;

    public y23_0(w23_0 w23_02, f80_0 f80_02) {
        this.b = w23_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        w23_0 w23_02 = this.b;
        object = new y23_0(w23_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (y23_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((y23_0)object).invokeSuspend(object2);
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
            ((w23_0)object).a.getClass();
            Object object2 = ShareProductExperienceDaoHelper.Companion.getInstance().fetchAllSharedWithMeCloset();
            Y23$c y23$c = new Y23$c((es0_2)object2, (w23_0)object);
            object2 = new Y23$a((w23_0)object, null);
            at0_1 at0_12 = new at0_1(y23$c, (gx0_2)object2);
            object2 = new Y23$b((w23_0)object);
            this.a = n4;
            object = at0_12.collect((fs0_2)object2, this);
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

