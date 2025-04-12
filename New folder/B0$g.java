/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class B0$g
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ B0 c;

    public B0$g(B0 b02, f80_0 f80_02) {
        this.c = b02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        B0 b02 = this.c;
        B0$g b0$g = new B0$g(b02, f80_02);
        b0$g.b = object;
        return b0$g;
    }

    public final Object invoke(Object object, Object object2) {
        object = (hw2_0)object;
        object2 = (f80_0)object2;
        object = (B0$g)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((B0$g)object).invokeSuspend(object2);
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
            object = (hw2_0)this.b;
            this.a = n4;
            B0 b02 = this.c;
            object = b02.v1((hw2_0)object, this);
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

