/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Gr1$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Gr1 b;

    public Gr1$a(Gr1 gr1, f80_0 f80_02) {
        this.b = gr1;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Gr1 gr1 = this.b;
        object = new Gr1$a(gr1, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Gr1$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Gr1$a)object).invokeSuspend(object2);
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
            float f5 = 1.0f;
            Float f6 = new Float(f5);
            this.a = n4;
            object = ((Lj)object).e(this, f6);
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

