/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class H20$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ H20 b;
    public final /* synthetic */ Runnable c;

    public H20$b(H20 h20, Runnable runnable2, f80_0 f80_02) {
        this.b = h20;
        this.c = runnable2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        H20 h20 = this.b;
        Runnable runnable2 = this.c;
        object = new H20$b(h20, runnable2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (H20$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((H20$b)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        H20 h20 = this.b;
        int n4 = 1;
        float f5 = Float.MIN_VALUE;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = h20.e;
            this.a = n4;
            float f6 = ((eI2)object).c;
            n4 = 0;
            f5 = 0.0f - f6;
            object = ((eI2)object).a(f5, this);
            if (object != j90_02) {
                object = Unit.a;
            }
            if (object == j90_02) {
                return j90_02;
            }
        }
        h20.c.b();
        this.c.run();
        return Unit.a;
    }
}

