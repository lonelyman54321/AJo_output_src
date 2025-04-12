/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

public final class Tk3$b
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Sj3 c;

    public Tk3$b(Sj3 sj3, f80_0 f80_02) {
        this.c = sj3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Sj3 sj3 = this.c;
        Tk3$b tk3$b = new Tk3$b(sj3, f80_02);
        tk3$b.b = object;
        return tk3$b;
    }

    public final Object invoke(Object object, Object object2) {
        object = (hw2_0)object;
        object2 = (f80_0)object2;
        object = (Tk3$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Tk3$b)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = (hw2_0)this.b;
        this.a = n4;
        n4 = 0;
        Sj3 sj3 = this.c;
        fb1_1 fb1_12 = new fb1_1((hw2_0)object, sj3, null);
        object = d.c(fb1_12, this);
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

