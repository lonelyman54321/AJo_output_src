/*
 * Decompiled with CFR 0.152.
 */
import io.ktor.utils.io.ClosedByteChannelException;
import io.ktor.utils.io.ClosedWriteChannelException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/*
 * Renamed from jF
 */
public final class jf_2
extends FunctionReferenceImpl
implements Function1 {
    public static final jf_2 a;

    static {
        jf_2 jf_22;
        a = jf_22 = new FunctionReferenceImpl(1, ClosedWriteChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        ClosedWriteChannelException closedWriteChannelException = new ClosedByteChannelException((Throwable)object);
        return closedWriteChannelException;
    }
}

