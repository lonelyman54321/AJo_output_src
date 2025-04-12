/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class pb1$d
implements za1_2 {
    public final void a(Object object, da1_2 da1_22) {
        object = (pb1_2)object;
        Intrinsics.checkNotNullParameter(object, "plugin");
        Intrinsics.checkNotNullParameter(da1_22, "scope");
        ib1_2 ib1_22 = da1_22.f;
        ks2_2 ks2_22 = ib1_2.j;
        qb1_2 qb1_22 = new qb1_2((pb1_2)object, da1_22, null);
        ib1_22.g(ks2_22, qb1_22);
    }

    public final Object b(Function1 object) {
        Intrinsics.checkNotNullParameter(object, "block");
        pb1$a pb1$a = new Object();
        object.invoke(pb1$a);
        object = new pb1_2();
        return object;
    }

    public final xq_2 getKey() {
        return pb1_2.d;
    }
}

