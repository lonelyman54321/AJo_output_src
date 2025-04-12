/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.DatabaseCreator;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from E52
 */
public final class e52_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ b52_0 b;

    public e52_0(b52_0 b52_02, f80_0 f80_02) {
        this.b = b52_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        b52_0 b52_02 = this.b;
        object = new e52_0(b52_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (e52_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((e52_0)object).invokeSuspend(object2);
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
            ((b52_0)object).a.getClass();
            Object object2 = DatabaseCreator.INSTANCE.getDBInstance();
            Object object3 = new d52((es0_2)object2);
            object2 = ir0_2.a;
            object2 = ms0_1.m((es0_2)object3, (CoroutineContext)object2);
            int n7 = 3;
            object3 = new qg3_2(n7, null);
            at0_1 at0_12 = new at0_1((es0_2)object2, (gx0_2)object3);
            object2 = new E52$b((b52_0)object);
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

