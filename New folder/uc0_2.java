/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from uC0
 */
public final class uc0_2 {
    public static final /* synthetic */ int a;

    static {
        new Throwable("No further exceptions");
    }

    public static RuntimeException a(Throwable throwable) {
        boolean bl2 = throwable instanceof Error;
        if (!bl2) {
            bl2 = throwable instanceof RuntimeException;
            if (bl2) {
                return (RuntimeException)throwable;
            }
            RuntimeException runtimeException = new RuntimeException(throwable);
            return runtimeException;
        }
        throw (Error)throwable;
    }
}

