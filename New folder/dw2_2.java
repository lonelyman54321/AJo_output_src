/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.dbhelper.SearchRvDaoHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from DW2
 */
public final class dw2_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ yw2_0 b;

    public dw2_2(yw2_0 yw2_02, f80_0 f80_02) {
        this.b = yw2_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yw2_0 yw2_02 = this.b;
        object = new dw2_2(yw2_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (dw2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((dw2_2)object).invokeSuspend(object2);
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
            object = SearchRvDaoHelper.INSTANCE.loadSearchRvEntries();
            int n7 = 3;
            Object object2 = new qg3_2(n7, null);
            at0_1 at0_12 = new at0_1((es0_2)object, (gx0_2)object2);
            object2 = this.b;
            object = new DW2$b((yw2_0)object2);
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

