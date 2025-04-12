/*
 * Decompiled with CFR 0.152.
 */
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

public final class mm0 {
    public static xl1_2 a() {
        xl1_2 xl1_22 = new xl1_2(null);
        return xl1_22;
    }

    public static final Object b(i object, f80_0 object2) {
        object.d(null);
        object = object.I0((f80_0)object2);
        object2 = j90_0.COROUTINE_SUSPENDED;
        if (object != object2) {
            object = Unit.a;
        }
        return object;
    }

    public static final void c(CoroutineContext coroutineContext) {
        boolean bl2;
        i$a i$a = i$a.a;
        if ((coroutineContext = (i)coroutineContext.get(i$a)) != null && !(bl2 = coroutineContext.isActive())) {
            throw coroutineContext.w();
        }
    }

    public static lm0_0 d(String object) {
        Object object2 = new URL((String)object);
        object = (HttpURLConnection)((URL)object2).openConnection();
        ((HttpURLConnection)object).setRequestMethod("GET");
        ((URLConnection)object).connect();
        object2 = new lm0_0((HttpURLConnection)object);
        return object2;
    }

    public static final i e(CoroutineContext object) {
        Object object2 = i$a.a;
        if ((object2 = (i)object.get((CoroutineContext$a)object2)) != null) {
            return object2;
        }
        StringBuilder stringBuilder = new StringBuilder("Current context doesn't contain Job in it: ");
        stringBuilder.append(object);
        object = stringBuilder.toString().toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public static fr0_1 f(i object, cl1_2 cl1_22) {
        boolean bl2 = object instanceof JobSupport;
        boolean bl3 = true;
        if (bl2) {
            object = ((JobSupport)object).i0(bl3, cl1_22);
        } else {
            bl2 = cl1_22.i();
            bl1_2 bl1_22 = new bl1_2(cl1_22);
            object = object.u(bl2, bl3, bl1_22);
        }
        return object;
    }

    public static final boolean g(CoroutineContext coroutineContext) {
        i$a i$a = i$a.a;
        boolean bl2 = (coroutineContext = (i)coroutineContext.get(i$a)) != null ? coroutineContext.isActive() : true;
        return bl2;
    }

    public static void h(Throwable throwable) {
        boolean bl2 = throwable instanceof VirtualMachineError;
        if (!bl2) {
            bl2 = throwable instanceof ThreadDeath;
            if (!bl2) {
                bl2 = throwable instanceof LinkageError;
                if (!bl2) {
                    return;
                }
                throw (LinkageError)throwable;
            }
            throw (ThreadDeath)throwable;
        }
        throw (VirtualMachineError)throwable;
    }
}

