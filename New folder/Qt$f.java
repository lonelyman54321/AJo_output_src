/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Qt$f
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ft1_2 b;
    public final /* synthetic */ ob0_1 c;

    public Qt$f(ft1_2 ft1_22, ob0_1 ob0_12, f80_0 f80_02) {
        this.b = ft1_22;
        this.c = ob0_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ft1_2 ft1_22 = this.b;
        ob0_1 ob0_12 = this.c;
        object = new Qt$f(ft1_22, ob0_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Qt$f)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Qt$f)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            this.a = n4;
            object = ft1_2.f(this.b, n4, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = Boolean.FALSE;
        this.c.l.setValue(object);
        return Unit.a;
    }
}

