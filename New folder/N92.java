/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

public final class N92
implements EF2 {
    public final /* synthetic */ k80 a;
    public final /* synthetic */ vQ1 b;

    public N92(k80 k802, vQ1 vQ12) {
        this.a = k802;
        this.b = vQ12;
    }

    public final void a() {
    }

    public final void b(Object object) {
    }

    public final jk1 h(CF2 object, Object object2) {
        Object object3;
        Object object4 = this.a;
        boolean bl2 = object4 instanceof EF2;
        object4 = bl2 ? (EF2)object4 : null;
        if (object4 == null || (object4 = object4.h((CF2)object, object2)) == null) {
            object4 = jk1.IGNORED;
        }
        if (object4 == (object3 = jk1.IGNORED)) {
            object4 = this.b;
            object3 = ((vQ1)object4).f;
            Pair pair = new Pair(object, object2);
            ((vQ1)object4).f = object = CollectionsKt.X((Collection)object3, pair);
            return jk1.SCHEDULED;
        }
        return object4;
    }
}

