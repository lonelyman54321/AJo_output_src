/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class I92$n
extends I92 {
    public static final I92$n c;

    static {
        I92$n i92$n;
        c = i92$n = new I92(1, 2);
    }

    public final void a(R92$a r92$a, mp mp2, q73 q732, F30$a f30$a) {
        Object object = ((Function0)r92$a.b(0)).invoke();
        Ae ae2 = (Ae)r92$a.b(1);
        int n3 = r92$a.a(0);
        Intrinsics.checkNotNull(mp2, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        ae2.getClass();
        int n4 = q732.c(ae2);
        q732.R(n4, object);
        mp2.d(n3, object);
        mp2.g(object);
    }

    public final String b(int n3) {
        boolean bl2 = I92$q.a(n3, 0);
        String string2 = bl2 ? "insertIndex" : super.b(n3);
        return string2;
    }

    public final String c(int n3) {
        boolean bl2 = I92$t.a(n3, 0);
        String string2 = bl2 ? "factory" : ((bl2 = I92$t.a(n3, 1)) ? "groupAnchor" : super.c(n3));
        return string2;
    }
}

