/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class Z40 {
    public final kb3_2 a;
    public final Y40 b;

    public Z40(int n3) {
        Object object = -1 << -1;
        Object object2 = new Pair(object, null);
        this.a = object2 = lb3_2.a(object2);
        this.b = object = new Y40((kb3_2)object2);
    }

    public final void a(Boolean bl2) {
        Intrinsics.checkNotNullParameter(bl2, "data");
        kb3_2 kb3_22 = this.a;
        Integer n3 = ((Number)((Pair)kb3_22.getValue()).a).intValue() + 1;
        Pair pair = new Pair(n3, bl2);
        kb3_22.getClass();
        kb3_22.k(null, pair);
    }
}

