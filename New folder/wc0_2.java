/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wC0
 */
public final class wc0_2 {
    public static final Throwable a(Throwable throwable) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(throwable, "<this>");
        Throwable throwable2 = throwable;
        while (bl2 = throwable2 instanceof CancellationException) {
            Throwable throwable3 = throwable2;
            throwable3 = (CancellationException)throwable2;
            Throwable throwable4 = throwable3.getCause();
            boolean bl3 = Intrinsics.areEqual(throwable2, throwable4);
            if (bl3) {
                return throwable;
            }
            throwable2 = throwable3.getCause();
        }
        if (throwable2 != null) {
            throwable = throwable2;
        }
        return throwable;
    }
}

