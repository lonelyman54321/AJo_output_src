/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VL2
 */
public final class vl2_2 {
    public static final tL2$b a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "exception");
        tL2$b tL2$b = new tL2$b(throwable);
        return tL2$b;
    }

    public static final void b(Object object) {
        boolean bl2 = object instanceof tL2$b;
        if (!bl2) {
            return;
        }
        throw ((tL2$b)object).a;
    }
}

