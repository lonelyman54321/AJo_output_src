/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class tZ$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ es0_2[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ AtomicInteger d;
    public final /* synthetic */ dr_2 e;

    public tZ$a(es0_2[] es0_2Array, int n3, AtomicInteger atomicInteger, le_2 le_22, f80_0 f80_02) {
        this.b = es0_2Array;
        this.c = n3;
        this.d = atomicInteger;
        this.e = le_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        int n3 = this.c;
        Object object2 = this.e;
        dr_2 dr_22 = object2;
        dr_22 = (le_2)object2;
        es0_2[] es0_2Array = this.b;
        AtomicInteger atomicInteger = this.d;
        object2 = object;
        object = new tZ$a(es0_2Array, n3, atomicInteger, (le_2)dr_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (tZ$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((tZ$a)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Throwable throwable2;
        dr_2 dr_22;
        AtomicInteger atomicInteger;
        block8: {
            block7: {
                j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
                int n3 = this.a;
                atomicInteger = this.d;
                dr_22 = this.e;
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
                    object = this.b;
                    n3 = this.c;
                    object = object[n3];
                    dr_2 dr_23 = dr_22;
                    dr_23 = (le_2)dr_22;
                    tZ$a$a tZ$a$a = new tZ$a$a((le_2)dr_23, n3);
                    this.a = n4;
                    object = object.collect(tZ$a$a, this);
                    if (object != j90_02) break block7;
                    return j90_02;
                }
            }
            int n7 = atomicInteger.decrementAndGet();
            if (n7 == 0) {
                dr_22.q(null);
            }
            return Unit.a;
        }
        int n8 = atomicInteger.decrementAndGet();
        if (n8 == 0) {
            dr_22.q(null);
        }
        throw throwable2;
    }
}

