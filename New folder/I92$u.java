/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class I92$u
extends I92 {
    public static final I92$u c;

    static {
        I92$u i92$u;
        int n3 = 1;
        c = i92$u = new I92(n3, n3);
    }

    public final void a(R92$a r92$a, mp mp2, q73 object, F30$a f30$a) {
        Ae ae2 = (Ae)r92$a.b(0);
        int n3 = r92$a.a(0);
        mp2.h();
        Intrinsics.checkNotNull(mp2, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        ae2.getClass();
        int n4 = ((q73)object).c(ae2);
        object = ((q73)object).z(n4);
        mp2.f(n3, object);
    }

    public final String b(int n3) {
        boolean bl2 = I92$q.a(n3, 0);
        String string2 = bl2 ? "insertIndex" : super.b(n3);
        return string2;
    }

    public final String c(int n3) {
        boolean bl2 = I92$t.a(n3, 0);
        String string2 = bl2 ? "groupAnchor" : super.c(n3);
        return string2;
    }
}

