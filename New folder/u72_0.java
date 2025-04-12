/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from u72
 */
public final class u72_0 {
    public static final u72_0 a;

    static {
        u72_0 u72_02;
        a = u72_02 = new Object();
    }

    public final e72_0 a(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "block");
        b72_0 b72_02 = new b72_0();
        function1.invoke(b72_02);
        e72_0 e72_02 = new e72_0(b72_02);
        return e72_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof u72_0;
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return -1133440277;
    }

    public final String toString() {
        return "OkHttp";
    }
}

