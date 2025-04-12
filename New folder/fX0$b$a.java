/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class fX0$b$a
extends RuntimeException {
    public final fX0$b$b a;
    public final Throwable b;

    public fX0$b$a(fX0$b$b fX0$b$b, Throwable throwable) {
        Intrinsics.checkNotNullParameter((Object)fX0$b$b, "callbackName");
        Intrinsics.checkNotNullParameter(throwable, "cause");
        super(throwable);
        this.a = fX0$b$b;
        this.b = throwable;
    }

    public final Throwable getCause() {
        return this.b;
    }
}

