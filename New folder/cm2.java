/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class cm2 {
    public final List a;
    public final Integer b;
    public final Kl2 c;
    public final int d;

    public cm2(List list, Integer n3, Kl2 kl2, int n4) {
        Intrinsics.checkNotNullParameter(list, "pages");
        Intrinsics.checkNotNullParameter(kl2, "config");
        this.a = list;
        this.b = n3;
        this.c = kl2;
        this.d = n4;
    }

    public final am2$b$b a(int n3) {
        block5: {
            Iterable iterable;
            int n4;
            Object object;
            List list;
            block4: {
                list = this.a;
                object = list;
                object = list;
                n4 = object instanceof Collection;
                if (n4 == 0) break block4;
                iterable = object;
                iterable = (Collection)object;
                n4 = iterable.isEmpty();
                if (n4 != 0) break block5;
            }
            object = ((Iterable)object).iterator();
            while ((n4 = object.hasNext()) != 0) {
                iterable = ((am2$b$b)object.next()).a;
                n4 = iterable.isEmpty();
                if (n4 != 0) continue;
                int n7 = this.d;
                n3 -= n7;
                object = null;
                for (n7 = 0; n7 < (n4 = xx_2.h(list)) && n3 > (n4 = xx_2.h(iterable = ((am2$b$b)list.get((int)n7)).a)); n3 -= n4, ++n7) {
                    iterable = ((am2$b$b)list.get((int)n7)).a;
                    n4 = iterable.size();
                }
                am2$b$b am2$b$b = n3 < 0 ? (am2$b$b)CollectionsKt.L(list) : (am2$b$b)list.get(n7);
                return am2$b$b;
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        int n3 = object instanceof cm2;
        if (n3 == 0) return 0 != 0;
        object = (cm2)object;
        Object object2 = this.a;
        Object object3 = ((cm2)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) return 0 != 0;
        object3 = this.b;
        object2 = ((cm2)object).b;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) return 0 != 0;
        object3 = this.c;
        object2 = ((cm2)object).c;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) return 0 != 0;
        n3 = this.d;
        int n4 = ((cm2)object).d;
        if (n3 != n4) return 0 != 0;
        return 1 != 0;
    }

    public final int hashCode() {
        int n3;
        List list = this.a;
        int n4 = ((Object)list).hashCode();
        Integer n7 = this.b;
        if (n7 != null) {
            n3 = ((Object)n7).hashCode();
        } else {
            n3 = 0;
            n7 = null;
        }
        n4 += n3;
        n3 = this.c.hashCode() + n4;
        n4 = this.d;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PagingState(pages=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", anchorPosition=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", config=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", leadingPlaceholderCount=");
        int n3 = this.d;
        return tu.a(stringBuilder, n3, ')');
    }
}

