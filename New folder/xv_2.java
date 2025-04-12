/*
 * Decompiled with CFR 0.152.
 */
import io.ktor.utils.io.ClosedByteChannelException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/*
 * Renamed from XV
 */
public final class xv_2
extends FunctionReferenceImpl
implements Function1 {
    public static final xv_2 a;

    static {
        xv_2 xv_22;
        a = xv_22 = new FunctionReferenceImpl(1, ClosedByteChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        ClosedByteChannelException closedByteChannelException = new ClosedByteChannelException((Throwable)object);
        return closedByteChannelException;
    }
}

