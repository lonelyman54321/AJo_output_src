/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class B0$c
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ B0 b;
    public final /* synthetic */ Ey2$b c;

    public B0$c(B0 b02, Ey2$b ey2$b, f80_0 f80_02) {
        this.b = b02;
        this.c = ey2$b;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        B0 b02 = this.b;
        Ey2$b ey2$b = this.c;
        object = new B0$c(b02, ey2$b, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (B0$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((B0$c)object).invokeSuspend(object2);
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
            object = this.b.p;
            if (object == null) return Unit.a;
            this.a = n4;
            Ey2$b ey2$b = this.c;
            if ((object = object.a(ey2$b, this)) != j90_02) return Unit.a;
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

