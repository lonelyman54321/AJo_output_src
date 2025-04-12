/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.Scheduler;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.Callable;

/*
 * Renamed from dR2
 */
public final class dr2_2 {
    public static volatile o60_0 a;

    public static Scheduler a(Callable callable) {
        String string2;
        try {
            callable = callable.call();
            string2 = "Scheduler Callable result can't be null";
        }
        catch (Throwable throwable) {
            throw uc0_2.a(throwable);
        }
        x03_0.b(callable, string2);
        return (Scheduler)((Object)callable);
    }

    public static void b(Throwable object) {
        Object object2;
        Object object3;
        Object object4 = a;
        if (object == null) {
            object3 = "onError called with null. Null values are generally not allowed in 2.x operators and sources.";
            object = new NullPointerException((String)object3);
        } else {
            boolean bl2 = object instanceof OnErrorNotImplementedException;
            if (!(bl2 || (bl2 = object instanceof MissingBackpressureException) || (bl2 = object instanceof IllegalStateException) || (bl2 = object instanceof NullPointerException) || (bl2 = object instanceof IllegalArgumentException) || (bl2 = object instanceof CompositeException))) {
                String string2 = "The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | ";
                object2 = new StringBuilder(string2);
                ((StringBuilder)object2).append(object);
                object2 = ((StringBuilder)object2).toString();
                object = object3 = new IllegalStateException((String)object2, (Throwable)object);
            }
        }
        if (object4 != null) {
            try {
                object4.accept(object);
                return;
            }
            catch (Throwable throwable) {
                object3 = Thread.currentThread();
                object2 = ((Thread)object3).getUncaughtExceptionHandler();
                object2.uncaughtException((Thread)object3, throwable);
            }
        }
        object4 = Thread.currentThread();
        ((Thread)object4).getUncaughtExceptionHandler().uncaughtException((Thread)object4, (Throwable)object);
    }
}

