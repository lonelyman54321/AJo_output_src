/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Set;
import kotlin.Unit;

public final class e70$b
extends qg3_2
implements ix0_2 {
    public int a;
    public /* synthetic */ db1_2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ List d;
    public final /* synthetic */ Set e;
    public final /* synthetic */ mv_2 f;

    public e70$b(mv_2 mv_22, f80_0 f80_02, List list, Set set) {
        this.d = list;
        this.e = set;
        this.f = mv_22;
        super(5, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4, Object object5) {
        object = (qq3_0)object;
        object2 = (db1_2)object2;
        object4 = (at3_0)object4;
        object5 = (f80_0)object5;
        object4 = this.d;
        Set set = this.e;
        mv_2 mv_22 = this.f;
        object = new e70$b(mv_22, (f80_0)object5, (List)object4, set);
        ((e70$b)object).b = object2;
        ((e70$b)object).c = object3;
        object2 = Unit.a;
        return ((e70$b)object).invokeSuspend(object2);
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
            db1_2 db1_22 = this.b;
            Object object2 = this.c;
            this.b = null;
            this.a = n4;
            Set set = this.e;
            mv_2 mv_22 = this.f;
            List list = this.d;
            object = e70_0.a(list, set, mv_22, db1_22, object2, this);
            if (object != j90_02) return object;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return object;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

