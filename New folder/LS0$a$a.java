/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class LS0$a$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gx0_2 c;
    public final /* synthetic */ kr_1 d;

    public LS0$a$a(gx0_2 gx0_22, kr_1 kr_12, f80_0 f80_02) {
        this.c = gx0_22;
        this.d = kr_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        gx0_2 gx0_22 = this.c;
        kr_1 kr_12 = this.d;
        LS0$a$a lS0$a$a = new LS0$a$a(gx0_22, kr_12, f80_02);
        lS0$a$a.b = object;
        return lS0$a$a;
    }

    public final Object invoke(Object object, Object object2) {
        object2 = (f80_0)object2;
        object = (LS0$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((LS0$a$a)object).invokeSuspend(object2);
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
            this.a = n4;
            gx0_2 gx0_22 = this.c;
            kr_1 kr_12 = this.d;
            object = gx0_22.invoke(kr_12, object, this);
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

