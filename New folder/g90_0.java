/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlinx.coroutines.DispatchException;

/*
 * Renamed from G90
 */
public final class g90_0 {
    public static final void a(CoroutineContext coroutineContext, Throwable throwable) {
        Throwable throwable22;
        block8: {
            block7: {
                Object object;
                boolean bl2 = throwable instanceof DispatchException;
                if (bl2) {
                    throwable = ((DispatchException)throwable).a;
                }
                try {
                    object = C90$a.a;
                }
                catch (Throwable throwable22) {}
                object = coroutineContext.get((CoroutineContext$a)object);
                object = (c90_0)object;
                if (object == null) break block7;
                object.handleException(coroutineContext, throwable);
                return;
                break block8;
            }
            f90_0.a(coroutineContext, throwable);
            return;
        }
        if (throwable != throwable22) {
            String string2 = "Exception while trying to handle coroutine exception";
            RuntimeException runtimeException = new RuntimeException(string2, throwable22);
            yc0_2.a(runtimeException, throwable);
            throwable = runtimeException;
        }
        f90_0.a(coroutineContext, throwable);
    }
}

