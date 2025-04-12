/*
 * Decompiled with CFR 0.152.
 */
import io.ktor.utils.io.ClosedByteChannelException;
import io.ktor.utils.io.ClosedReadChannelException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class iF$e
extends FunctionReferenceImpl
implements Function1 {
    public static final iF$e a;

    static {
        iF$e iF$e;
        a = iF$e = new FunctionReferenceImpl(1, ClosedReadChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        ClosedReadChannelException closedReadChannelException = new ClosedByteChannelException((Throwable)object);
        return closedReadChannelException;
    }
}

