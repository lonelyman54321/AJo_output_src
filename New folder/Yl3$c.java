/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Yl3$c
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Ju1 b;
    public final /* synthetic */ wr1_1 c;

    public Yl3$c(Ju1 ju1, wr1_1 wr1_12, f80_0 f80_02) {
        this.b = ju1;
        this.c = wr1_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ju1 ju1 = this.b;
        wr1_1 wr1_12 = this.c;
        object = new Yl3$c(ju1, wr1_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Yl3$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Yl3$c)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        void var1_6;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw illegalStateException;
        }
        vl2_2.b(object);
        this.a = n4;
        Ju1 ju1 = this.b;
        ju1.getClass();
        n4 = 0;
        hr1_0 hr1_02 = new hr1_0(null);
        i23_0 i23_02 = this.c.b();
        Iu1 iu1 = new Iu1(hr1_02, ju1);
        i23_02.getClass();
        j90_0 j90_03 = i23_0.l(i23_02, iu1, this);
        if (j90_03 != j90_02) {
            Unit unit = Unit.a;
        }
        if (var1_6 != j90_02) return Unit.a;
        return j90_02;
    }
}

