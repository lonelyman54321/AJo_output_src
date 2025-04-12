/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from fB1$a
 */
public final class fb1$a_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ hw2_0 b;
    public final /* synthetic */ Sj3 c;

    public fb1$a_0(hw2_0 hw2_02, Sj3 sj3, f80_0 f80_02) {
        this.b = hw2_02;
        this.c = sj3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        hw2_0 hw2_02 = this.b;
        Sj3 sj3 = this.c;
        object = new fb1$a_0(hw2_02, sj3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (fb1$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fb1$a_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        this.a = n4;
        n3 = 0;
        Sj3 sj3 = this.c;
        object = new kb1_1(sj3, null);
        hw2_0 hw2_02 = this.b;
        object = vv0_0.b(hw2_02, (Function2)object, this);
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

