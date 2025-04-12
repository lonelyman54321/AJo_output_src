/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.exceptions.UndeliverableException;
import java.io.IOException;
import java.net.SocketException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZQ2
 */
public final class zq2_2
implements Function1 {
    public final Object invoke(Object object) {
        object = (Throwable)object;
        Object[] objectArray = "e";
        Intrinsics.checkNotNullParameter(object, (String)objectArray);
        boolean bl2 = object instanceof UndeliverableException;
        if (bl2) {
            object = ((Throwable)object).getCause();
        }
        if (!(bl2 = object instanceof IOException) && !(bl2 = object instanceof SocketException)) {
            bl2 = object instanceof InterruptedException;
            if (bl2) {
                object = Unit.a;
            } else {
                bl2 = object instanceof NullPointerException;
                if (!bl2 && !(bl2 = object instanceof IllegalArgumentException)) {
                    bl2 = object instanceof IllegalStateException;
                    if (bl2) {
                        objectArray = Thread.currentThread().getUncaughtExceptionHandler();
                        Thread thread2 = Thread.currentThread();
                        objectArray.uncaughtException(thread2, (Throwable)object);
                        object = Unit.a;
                    } else {
                        object = yn3_0.a;
                        bl2 = false;
                        objectArray = new Object[]{};
                        String string2 = "Undeliverable exception received, not sure what to do";
                        ((yn3$a)object).k(string2, objectArray);
                        object = Unit.a;
                    }
                } else {
                    objectArray = Thread.currentThread().getUncaughtExceptionHandler();
                    Thread thread3 = Thread.currentThread();
                    objectArray.uncaughtException(thread3, (Throwable)object);
                    object = Unit.a;
                }
            }
        } else {
            object = Unit.a;
        }
        return object;
    }
}

