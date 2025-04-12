/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from I92$d
 */
public final class i92$d_0
extends I92 {
    public static final i92$d_0 c;

    static {
        i92$d_0 i92$d_0;
        c = i92$d_0 = new I92(0, 2, 1);
    }

    public final void a(R92$a object, mp mp2, q73 q732, F30$a object2) {
        object2 = (Xi1)((R92$a)object).b(0);
        int n3 = ((Xi1)object2).a;
        object = (List)((R92$a)object).b(1);
        int n4 = object.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            Object e2 = object.get(i3);
            String string2 = "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>";
            Intrinsics.checkNotNull(mp2, string2);
            int n7 = n3 + i3;
            mp2.f(n7, e2);
            mp2.d(n7, e2);
        }
    }

    public final String c(int n3) {
        boolean bl2 = I92$t.a(n3, 0);
        String string2 = bl2 ? "effectiveNodeIndex" : ((bl2 = I92$t.a(n3, 1)) ? "nodes" : super.c(n3));
        return string2;
    }
}

