/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tu1
 */
public final class tu1_2 {
    public static final tu1_2 a;
    public static final Object b;

    static {
        Object object = new Object();
        a = object;
        b = object = new Object();
    }

    public static final void a(int n3) {
        int n4 = 1;
        if (n3 >= n4) {
            return;
        }
        String string2 = hj0_0.a(n3, "Expected positive parallelism level, but got ");
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public void b(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "tag");
        Intrinsics.checkNotNullParameter(string3, "message");
    }
}

