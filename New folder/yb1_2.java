/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yb1
 */
public final class yb1_2 {
    public static final ux1_2 a = Q93.a("io.ktor.client.plugins.HttpTimeout");

    static {
        yb1$a yb1$a = yb1$a.a;
        xb1_2 xb1_22 = new Object();
        td0_2.a("HttpTimeout", yb1$a, xb1_22);
    }

    public static final SocketTimeoutException a(eb1_2 object, Throwable throwable) {
        Intrinsics.checkNotNullParameter(object, "request");
        Serializable serializable = new StringBuilder("Socket timeout has expired [url=");
        Object object2 = ((eb1_2)object).a;
        ((StringBuilder)serializable).append(object2);
        ((StringBuilder)serializable).append(", socket_timeout=");
        object2 = vb1_2.a;
        object = (wb1_2)((eb1_2)object).a((ua1_0)object2);
        if (object == null || (object = ((wb1_2)object).c) == null) {
            object = "unknown";
        }
        ((StringBuilder)serializable).append(object);
        ((StringBuilder)serializable).append("] ms");
        object = ((StringBuilder)serializable).toString();
        Intrinsics.checkNotNullParameter(object, "message");
        serializable = new SocketTimeoutException((String)object);
        ((Throwable)serializable).initCause(throwable);
        return serializable;
    }
}

