/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from OY1
 */
public final class oy1_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ky1_0 b;

    public oy1_2(ky1_0 ky1_02, f80_0 f80_02) {
        this.b = ky1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ky1_0 ky1_02 = this.b;
        object = new oy1_2(ky1_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (oy1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((oy1_2)object).invokeSuspend(object2);
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
            iw_1.a.getClass();
            object = iw_1.d();
            int n7 = 3;
            Object object2 = new qg3_2(n7, null);
            at0_1 at0_12 = new at0_1((es0_2)object, (gx0_2)object2);
            object2 = this.b;
            object = new OY1$b((ky1_0)object2);
            this.a = n4;
            object = at0_12.collect((fs0_2)object, this);
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

