/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public final class eg1$d
implements InvocationHandler {
    public final Object invoke(Object object, Method method, Object[] object2) {
        boolean bl2 = td0.b(this);
        if (bl2) {
            return null;
        }
        object2 = "proxy";
        try {
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object = "m";
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return null;
        }
        Intrinsics.checkNotNullParameter(method, (String)object);
        return null;
    }
}

