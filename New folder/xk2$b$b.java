/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class xk2$b$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ x53_0 b;
    public final /* synthetic */ es0_2 c;
    public final /* synthetic */ AtomicInteger d;
    public final /* synthetic */ Jv3 e;
    public final /* synthetic */ int f;

    public xk2$b$b(es0_2 es0_22, AtomicInteger atomicInteger, x53_0 x53_02, Jv3 jv3, int n3, f80_0 f80_02) {
        this.c = es0_22;
        this.d = atomicInteger;
        this.e = jv3;
        this.f = n3;
        this.b = x53_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Jv3 jv3 = this.e;
        int n3 = this.f;
        es0_2 es0_22 = this.c;
        AtomicInteger atomicInteger = this.d;
        x53_0 x53_02 = this.b;
        object = new xk2$b$b(es0_22, atomicInteger, x53_02, jv3, n3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (xk2$b$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xk2$b$b)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Throwable throwable2;
        AtomicInteger atomicInteger;
        x53_0 x53_02;
        block8: {
            block7: {
                j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
                int n3 = this.a;
                x53_02 = this.b;
                atomicInteger = this.d;
                int n4 = 1;
                if (n3 != 0) {
                    if (n3 != n4) {
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    try {
                        vl2_2.b(object);
                        break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                vl2_2.b(object);
                {
                    object = this.c;
                    Jv3 jv3 = this.e;
                    int n7 = this.f;
                    xk2$b$b$a xk2$b$b$a = new xk2$b$b$a(jv3, n7);
                    this.a = n4;
                    object = object.collect(xk2$b$b$a, this);
                    if (object != j90_02) break block7;
                    return j90_02;
                }
            }
            int n8 = atomicInteger.decrementAndGet();
            if (n8 == 0) {
                x53_02.q(null);
            }
            return Unit.a;
        }
        int n10 = atomicInteger.decrementAndGet();
        if (n10 == 0) {
            x53_02.q(null);
        }
        throw throwable2;
    }
}

