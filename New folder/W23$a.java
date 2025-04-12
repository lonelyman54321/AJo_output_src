/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.DatabaseCreator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

public final class W23$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ w23_0 b;
    public final /* synthetic */ List c;

    public W23$a(w23_0 w23_02, List list, f80_0 f80_02) {
        this.b = w23_02;
        this.c = list;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        w23_0 w23_02 = this.b;
        List list = this.c;
        object = new W23$a(w23_02, list, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (W23$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((W23$a)object).invokeSuspend(object2);
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
            Object object2 = DatabaseCreator.INSTANCE.getDBInstance();
            Object object3 = this.c;
            Object object4 = new n23_0((es0_2)object2, (List)object3);
            object2 = ir0_2.a;
            object2 = ms0_1.m((es0_2)object4, (CoroutineContext)object2);
            object4 = new W23$a$a((w23_0)object, null);
            object3 = new at0_1((es0_2)object2, (gx0_2)object4);
            object2 = new W23$a$b((w23_0)object);
            this.a = n4;
            object = ((at0_1)object3).collect((fs0_2)object2, this);
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

