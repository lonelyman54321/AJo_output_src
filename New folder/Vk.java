/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class Vk
implements t20 {
    public final Wk a;
    public final String b;

    public Vk(Wk object) {
        this.a = object;
        object = (Boolean)((Wk)object).a.a.a();
        boolean bl2 = (Boolean)object;
        object = bl2 ? "Exit" : "Enter";
        this.b = object;
    }

    public final long a() {
        Object object = this.a.a.j;
        boolean bl2 = (object = CollectionsKt.N(0, (List)object)) instanceof gr3;
        if ((object = bl2 ? (gr3)object : null) != null) {
            long l2 = ((gr3)object).g();
            long l3 = 999999;
            l2 += l3;
            l3 = 1000000;
            return l2 / l3;
        }
        return 0L;
    }

    public final void b() {
        Pair pair;
        gr3 gr32 = this.a.a;
        Object object = this.b;
        Object object2 = "Enter";
        boolean bl2 = Intrinsics.areEqual(object, object2);
        if (bl2) {
            object2 = Boolean.FALSE;
            object = Boolean.TRUE;
            pair = new Pair(object2, object);
        } else {
            object2 = Boolean.TRUE;
            object = Boolean.FALSE;
            pair = new Pair(object2, object);
        }
        object2 = (Boolean)pair.a;
        object2.getClass();
        object = (Boolean)pair.b;
        object.getClass();
        gr32.m(object2, 0L, object);
    }
}

