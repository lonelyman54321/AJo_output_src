/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class nP2$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ lP2 b;

    public nP2$a(lP2 lP22, f80_0 f80_02) {
        this.b = lP22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        lP2 lP22 = this.b;
        object = new nP2$a(lP22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (nP2$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((nP2$a)object).invokeSuspend(object2);
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
            Lj lj = this.b.f;
            Float f5 = new Float(0.0f);
            object = ex0_0.c;
            n3 = 150;
            Qs3 qs3 = Hl.c(n3, 0, (cx0_0)object, 2);
            this.a = n4;
            int n7 = 12;
            object = Lj.c(lj, f5, qs3, null, this, n7);
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

