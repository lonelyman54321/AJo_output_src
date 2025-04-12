/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.DatabaseCreator;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from CW2
 */
public final class cw2_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ yw2_0 b;

    public cw2_1(yw2_0 yw2_02, f80_0 f80_02) {
        this.b = yw2_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yw2_0 yw2_02 = this.b;
        object = new cw2_1(yw2_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (cw2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((cw2_1)object).invokeSuspend(object2);
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
            ((yw2_0)object).b.getClass();
            Object object2 = DatabaseCreator.INSTANCE.getDBInstance();
            int n7 = 3;
            Object object3 = new qg3_2(n7, null);
            object2 = ms0_1.n((es0_2)object2, (gx0_2)object3);
            object3 = ir0_2.a;
            object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
            object3 = new qg3_2(n7, null);
            at0_1 at0_12 = new at0_1((es0_2)object2, (gx0_2)object3);
            object2 = new CW2$b((yw2_0)object);
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

