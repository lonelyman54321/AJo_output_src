/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class LS0$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ es0_2 c;
    public final /* synthetic */ gx0_2 d;

    public LS0$a(es0_2 es0_22, gx0_2 gx0_22, f80_0 f80_02) {
        this.c = es0_22;
        this.d = gx0_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        es0_2 es0_22 = this.c;
        gx0_2 gx0_22 = this.d;
        LS0$a lS0$a = new LS0$a(es0_22, gx0_22, f80_02);
        lS0$a.b = object;
        return lS0$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (x53_0)object;
        object2 = (f80_0)object2;
        object = (LS0$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((LS0$a)object).invokeSuspend(object2);
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
            object = (x53_0)this.b;
            Object object2 = new kr_1((fz2_1)object);
            gx0_2 gx0_22 = this.d;
            object = new LS0$a$a(gx0_22, (kr_1)object2, null);
            this.a = n4;
            object2 = this.c;
            object = ms0_1.f((es0_2)object2, (Function2)object, this);
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

