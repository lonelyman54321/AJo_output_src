/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/*
 * Renamed from F90
 */
public final class f90_0 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(CoroutineContext object, Throwable throwable) {
        boolean bl2;
        Object object2 = e90_0.a.iterator();
        while (bl2 = object2.hasNext()) {
            Object object3 = (c90_0)object2.next();
            try {
                object3.handleException((CoroutineContext)object, throwable);
            }
            catch (Throwable throwable2) {
                Object object4;
                Throwable throwable3;
                if (throwable == throwable2) {
                    throwable3 = throwable;
                } else {
                    object4 = "Exception while trying to handle coroutine exception";
                    throwable3 = new RuntimeException((String)object4, throwable2);
                    yc0_2.a(throwable3, throwable);
                }
                object3 = Thread.currentThread();
                object4 = ((Thread)object3).getUncaughtExceptionHandler();
                object4.uncaughtException((Thread)object3, throwable3);
            }
            catch (ExceptionSuccessfullyProcessed exceptionSuccessfullyProcessed) {
                return;
            }
        }
        try {
            object2 = new DiagnosticCoroutineContextException((CoroutineContext)object);
            yc0_2.a(throwable, (Throwable)object2);
        }
        catch (Throwable throwable4) {}
        object = Thread.currentThread();
        ((Thread)object).getUncaughtExceptionHandler().uncaughtException((Thread)object, throwable);
    }
}

