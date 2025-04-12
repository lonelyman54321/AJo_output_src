/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from I92$h
 */
public final class i92$h_0
extends I92 {
    public static final i92$h_0 c;

    static {
        i92$h_0 i92$h_0;
        int n3 = 1;
        c = i92$h_0 = new I92(0, n3, n3);
    }

    public final void a(R92$a objectArray, mp mp2, q73 q732, F30$a f30$a) {
        Intrinsics.checkNotNull(mp2, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        for (Object object : (Object[])objectArray.b(0)) {
            mp2.g(object);
        }
    }

    public final String c(int n3) {
        boolean bl2 = I92$t.a(n3, 0);
        String string2 = bl2 ? "nodes" : super.c(n3);
        return string2;
    }
}

