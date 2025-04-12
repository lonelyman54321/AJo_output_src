/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from t
 */
public final class t_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ s_0 b;

    public t_0(s_0 s_02, f80_0 f80_02) {
        this.b = s_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        s_0 s_02 = this.b;
        object = new t_0(s_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (t_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((t_0)object).invokeSuspend(object2);
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
            es0_2 es0_22 = ((y_0)((s_0)object).c.getValue()).b;
            if (es0_22 == null) return Unit.a;
            t$a t$a = new t$a((s_0)object, null);
            this.a = n4;
            object = ms0_1.f(es0_22, t$a, this);
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

