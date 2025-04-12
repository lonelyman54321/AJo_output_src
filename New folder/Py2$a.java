/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Py2$a
extends Lambda
implements Function0 {
    public final /* synthetic */ Sy2 c;

    public Py2$a(Sy2 sy2) {
        this.c = sy2;
        super(0);
    }

    public final Object invoke() {
        long l2;
        Object object = this.c;
        Object object2 = ((Sy2)object).b.values();
        object2 = CollectionsKt.W(((Sy2)object).c.values(), object2);
        object2 = CollectionsKt.W(((Sy2)object).d.values(), (Collection)object2);
        Object object3 = ((Sy2)object).f.values();
        object2 = CollectionsKt.W((Iterable)object3, (Collection)object2).iterator();
        boolean bl2 = object2.hasNext();
        Long l3 = null;
        if (!bl2) {
            bl2 = false;
            object3 = null;
        } else {
            boolean bl3;
            l2 = ((t20)object2.next()).a();
            object3 = l2;
            while (bl3 = object2.hasNext()) {
                l2 = ((t20)object2.next()).a();
                Long l4 = l2;
                int n3 = ((Long)object3).compareTo((Object)l4);
                if (n3 >= 0) continue;
                object3 = l4;
            }
        }
        l2 = 0L;
        long l7 = object3 != null ? (Long)object3 : l2;
        object = ((Iterable)((Sy2)object).e.values()).iterator();
        boolean bl4 = object.hasNext();
        if (bl4) {
            long l8 = ((wg1_0)object.next()).c();
            l3 = l8;
            while (bl4 = object.hasNext()) {
                l8 = ((wg1_0)object.next()).c();
                Long l12 = l8;
                int n4 = l3.compareTo((Object)l12);
                if (n4 >= 0) continue;
                l3 = l12;
            }
        }
        if (l3 != null) {
            l2 = l3;
        }
        return Math.max(l7, l2);
    }
}

