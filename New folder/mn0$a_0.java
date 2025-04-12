/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

/*
 * Renamed from Mn0$a
 */
public final class mn0$a_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ jb1_2 d;

    public mn0$a_0(Object object, jb1_2 jb1_22, f80_0 f80_02) {
        this.c = object;
        this.d = jb1_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Object object2 = this.c;
        jb1_2 jb1_22 = this.d;
        mn0$a_0 mn0$a_0 = new mn0$a_0(object2, jb1_22, f80_02);
        mn0$a_0.b = object;
        return mn0$a_0;
    }

    public final Object invoke(Object object, Object object2) {
        object = (sj3_2)object;
        object2 = (f80_0)object2;
        object = (mn0$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((mn0$a_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Throwable throwable2;
        jb1_2 jb1_22;
        Object object2;
        block10: {
            block9: {
                object2 = j90_0.COROUTINE_SUSPENDED;
                int n3 = this.a;
                jb1_22 = this.d;
                int n4 = 1;
                if (n3 != 0) {
                    if (n3 != n4) {
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    break block9;
                }
                vl2_2.b(object);
                object = (sj3_2)this.b;
                try {
                    Object object3 = this.c;
                    object3 = (uf_1)object3;
                    object = ((sj3_2)object).a;
                    this.a = n4;
                    long l2 = Long.MAX_VALUE;
                    object = wf_1.a((uf_1)object3, (gf_2)object, l2, this);
                    if (object == object2) {
                        return object2;
                    }
                }
                catch (Throwable throwable2) {}
                catch (CancellationException cancellationException) {}
                finally {
                    break block10;
                }
            }
            object = (Number)object;
            ((Number)object).longValue();
            return Unit.a;
        }
        object2 = xc0_2.a("Receive failed", throwable2);
        kotlinx.coroutines.d.b(jb1_22, (CancellationException)object2);
        throw throwable2;
    }
}

