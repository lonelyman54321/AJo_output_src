/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class DR0$e
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ dr0_0 b;

    public DR0$e(f80_0 f80_02, dr0_0 dr0_02) {
        this.b = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.b;
        object = new DR0$e(f80_02, dr0_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (DR0$e)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((DR0$e)object).invokeSuspend(object2);
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
            es0_2 es0_22 = ms0_1.h(((dr0_0)object).N0);
            Object object2 = new DR0$e$b(null, (dr0_0)object);
            es0_22 = ms0_1.n(es0_22, (gx0_2)object2);
            object2 = new DR0$e$a((dr0_0)object);
            this.a = n4;
            object = ((or_2)es0_22).collect((fs0_2)object2, this);
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

