/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from dF2
 */
public final class df2_2
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ is2_2 b;
    public final /* synthetic */ gx0_2 c;

    public df2_2(gx0_2 gx0_22, f80_0 f80_02) {
        this.c = gx0_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (is2_2)object;
        object2 = (kb1_2)object2;
        object3 = (f80_0)object3;
        gx0_2 gx0_22 = this.c;
        object2 = new df2_2(gx0_22, (f80_0)object3);
        ((df2_2)object2).b = object;
        object = Unit.a;
        return ((df2_2)object2).invokeSuspend(object);
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
            cf2$a_0 cf2$a_0 = new cf2$a_0((is2_2)object);
            this.a = n4;
            gx0_2 gx0_22 = this.c;
            object = ((is2_2)object).a;
            object = gx0_22.invoke(cf2$a_0, object, this);
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

