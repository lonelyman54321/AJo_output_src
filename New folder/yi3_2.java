/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.impl.WorkerStoppedException;
import androidx.work.impl.a;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YI3
 */
public final class yi3_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ WI3 b;

    public yi3_2(WI3 wI3, f80_0 f80_02) {
        this.b = wI3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        WI3 wI3 = this.b;
        object = new yi3_2(wI3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (yi3_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((yi3_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        WI3 wI3;
        Object object3;
        block9: {
            block8: {
                object3 = j90_0.COROUTINE_SUSPENDED;
                int n3 = this.a;
                wI3 = this.b;
                int n4 = 1;
                if (n3 != 0) {
                    if (n3 != n4) {
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    break block8;
                }
                vl2_2.b(object);
                object = wI3.n;
                object2 = new YI3$a(wI3, null);
                this.a = n4;
                object = Ae3.g(this, (CoroutineContext)object, (Function2)object2);
                if (object != object3) break block8;
                return object3;
            }
            try {
                object = (WI3$b)object;
                break block9;
            }
            catch (WorkerStoppedException workerStoppedException) {
            }
            catch (Throwable throwable) {
                int n7 = androidx.work.impl.a.a;
                qx1.a().getClass();
                object = new WI3$b$a(0);
                break block9;
            }
            catch (CancellationException cancellationException) {
                object = new WI3$b$a(0);
                break block9;
            }
            int n8 = workerStoppedException.a;
            object = object3 = new WI3$b$c(n8);
        }
        object3 = wI3.i;
        object2 = new XI3((WI3$b)object, wI3);
        object = ((FP2)object3).runInTransaction((Callable)object2);
        Intrinsics.checkNotNullExpressionValue(object, "workDatabase.runInTransa\u2026          }\n            )");
        return object;
    }
}

