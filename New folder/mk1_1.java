/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Mk1
 */
public class mk1_1
extends et2_2 {
    public final void a(Throwable throwable, Throwable throwable2) {
        int n3;
        int n4;
        Intrinsics.checkNotNullParameter(throwable, "cause");
        Intrinsics.checkNotNullParameter(throwable2, "exception");
        Integer n7 = Mk1$a.b;
        if (n7 != null && (n4 = n7.intValue()) < (n3 = 19)) {
            super.a(throwable, throwable2);
        } else {
            throwable.addSuppressed(throwable2);
        }
    }
}

