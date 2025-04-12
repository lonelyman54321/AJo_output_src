/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/*
 * Renamed from xh
 */
public final class xh_2
extends a
implements c90_0 {
    private volatile Object _preHandler;

    public xh_2() {
        C90$a c90$a = C90$a.a;
        super(c90$a);
        this._preHandler = this;
    }

    public void handleException(CoroutineContext object, Throwable throwable) {
        int n3 = 26;
        int n4 = Build.VERSION.SDK_INT;
        if (n3 <= n4 && n4 < (n3 = 28)) {
            int n7;
            object = this._preHandler;
            n3 = 0;
            Object object2 = null;
            if (object != this) {
                object = (Method)object;
            } else {
                block14: {
                    block13: {
                        object = Thread.class;
                        String string2 = "getUncaughtExceptionPreHandler";
                        try {
                            object = ((Class)object).getDeclaredMethod(string2, null);
                        }
                        catch (Throwable throwable2) {}
                        n7 = ((Method)object).getModifiers();
                        n7 = (int)(Modifier.isPublic(n7) ? 1 : 0);
                        if (n7 == 0) break block13;
                        n7 = ((Method)object).getModifiers();
                        n7 = (int)(Modifier.isStatic(n7) ? 1 : 0);
                        if (n7 == 0) break block13;
                        break block14;
                    }
                    n4 = 0;
                    object = null;
                }
                this._preHandler = object;
            }
            if (object != null) {
                object = ((Method)object).invoke(null, null);
            } else {
                n4 = 0;
                object = null;
            }
            n7 = object instanceof Thread.UncaughtExceptionHandler;
            if (n7 != 0) {
                object2 = object;
                object2 = (Thread.UncaughtExceptionHandler)object;
            }
            if (object2 != null) {
                object = Thread.currentThread();
                object2.uncaughtException((Thread)object, throwable);
            }
        }
    }
}

