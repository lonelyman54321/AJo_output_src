/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;

/*
 * Renamed from xC0
 */
public final class xc0_2 {
    public static final CancellationException a(String string2, Throwable throwable) {
        CancellationException cancellationException = new CancellationException(string2);
        cancellationException.initCause(throwable);
        return cancellationException;
    }
}

