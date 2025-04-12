/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from u5
 */
public final class u5_0
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ is2_2 b;
    public final /* synthetic */ gx0_2 c;

    public u5_0(gx0_2 gx0_22, f80_0 f80_02) {
        this.c = gx0_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (is2_2)object;
        object2 = (jb1_2)object2;
        object3 = (f80_0)object3;
        gx0_2 gx0_22 = this.c;
        object2 = new u5_0(gx0_22, (f80_0)object3);
        ((u5_0)object2).b = object;
        object = Unit.a;
        return ((u5_0)object2).invokeSuspend(object);
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
            w5$a w5$a = new w5$a((is2_2)object);
            object = ((is2_2)object).b();
            this.a = n4;
            gx0_2 gx0_22 = this.c;
            object = gx0_22.invoke(w5$a, object, this);
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

