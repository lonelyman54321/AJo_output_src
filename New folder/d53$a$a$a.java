/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

public final class d53$a$a$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ dr_2 b;
    public final /* synthetic */ Function2 c;

    public d53$a$a$a(le_2 le_22, Function2 function2, f80_0 f80_02) {
        this.b = le_22;
        this.c = function2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function2 function2 = this.c;
        le_2 le_22 = (le_2)this.b;
        object = new d53$a$a$a(le_22, function2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (d53$a$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((d53$a$a$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Throwable throwable2;
        dr_2 dr_22;
        block6: {
            j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
            int n3 = this.a;
            dr_22 = this.b;
            int n4 = 1;
            if (n3 != 0) {
                if (n3 != n4) {
                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw object;
                }
                vl2_2.b(object);
                break block6;
            }
            vl2_2.b(object);
            try {
                Function2 function2 = this.c;
                dr_2 dr_23 = dr_22;
                dr_23 = (le_2)dr_22;
                object = new d53$a$a$a$a((le_2)dr_23, function2, null);
                this.a = n4;
                object = d.c((Function2)object, this);
                if (object != j90_02) break block6;
                return j90_02;
            }
            catch (Throwable throwable2) {}
        }
        dr_22.q(null);
        return Unit.a;
        dr_22.q(throwable2);
        return Unit.a;
    }
}

