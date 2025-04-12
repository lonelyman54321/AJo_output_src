/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.i;

/*
 * Renamed from Lj1
 */
public final class lj1_2
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Function0 b;

    public lj1_2(Function0 function0, f80_0 f80_02) {
        this.b = function0;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function0 function0 = this.b;
        lj1_2 lj1_22 = new lj1_2(function0, f80_02);
        lj1_22.a = object;
        return lj1_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (lj1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((lj1_2)object).invokeSuspend(object2);
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        int n3;
        int n4;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = ((i90_0)this.a).getCoroutineContext();
        object2 = this.b;
        jn3_0 jn3_02 = new jn3_0();
        object = mm0.e((CoroutineContext)object);
        jn3_02.f = object = mm0.f((i)object, jn3_02);
        do {
            if ((n3 = ((AtomicIntegerFieldUpdater)(object = jn3_0.g)).get(jn3_02)) == 0) continue;
            n4 = 2;
            if (n3 == n4 || n3 == (n4 = 3)) break;
            jn3_0.l(n3);
            n4 = 0;
            object = null;
            throw null;
        } while ((n4 = (int)(((AtomicIntegerFieldUpdater)object).compareAndSet(jn3_02, n3, 0) ? 1 : 0)) == 0);
        object = object2.invoke();
        {
            catch (Throwable throwable) {
                jn3_02.k();
                throw throwable;
            }
        }
        jn3_02.k();
        return object;
        catch (InterruptedException interruptedException) {}
        {
        }
        object2 = new CancellationException("Blocking call was interrupted due to parent cancellation");
        throw ((Throwable)object2).initCause(interruptedException);
    }
}

