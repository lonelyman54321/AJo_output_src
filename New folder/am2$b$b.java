/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class am2$b$b
extends am2$b
implements Iterable,
KMappedMarker {
    public final List a;
    public final Object b;
    public final Object c;
    public final int d;
    public final int e;

    static {
        mz0_2 mz0_22 = mz0_2.a;
        am2$b$b am2$b$b = new am2$b$b(mz0_22, null, null, 0, 0);
    }

    public am2$b$b(List list, Integer n3, Integer n4) {
        Intrinsics.checkNotNullParameter(list, "data");
        this(list, n3, n4, -1 << -1, -1 << -1);
    }

    public am2$b$b(List object, Integer object2, Integer n3, int n4, int n7) {
        String string2 = "data";
        Intrinsics.checkNotNullParameter(object, string2);
        this.a = object;
        this.b = object2;
        this.c = n3;
        this.d = n4;
        this.e = n7;
        int n8 = -1 << -1;
        if (n4 != n8 && n4 < 0) {
            object2 = "itemsBefore cannot be negative".toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        if (n7 != n8 && n7 < 0) {
            object2 = "itemsAfter cannot be negative".toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof am2$b$b;
        if (n3 == 0) {
            return false;
        }
        object = (am2$b$b)object;
        Object object2 = this.a;
        Object object3 = ((am2$b$b)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object3 = this.b;
        object2 = ((am2$b$b)object).b;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.c;
        object2 = ((am2$b$b)object).c;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        n3 = this.d;
        int n4 = ((am2$b$b)object).d;
        if (n3 != n4) {
            return false;
        }
        n3 = this.e;
        int n7 = ((am2$b$b)object).e;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        List list = this.a;
        int n4 = ((Object)list).hashCode() * 31;
        int n7 = 0;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.c;
        if (object != null) {
            n7 = object.hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = this.d;
        n4 = (n4 + n7) * 31;
        n7 = this.e;
        return n4 + n7;
    }

    public final Iterator iterator() {
        return this.a.listIterator();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
        Object object = this.a;
        int n3 = object.size();
        stringBuilder.append(n3);
        stringBuilder.append("\n                    |   first Item: ");
        Object object2 = CollectionsKt.firstOrNull((List)object);
        stringBuilder.append(object2);
        stringBuilder.append("\n                    |   last Item: ");
        object = CollectionsKt.T((List)object);
        stringBuilder.append(object);
        stringBuilder.append("\n                    |   nextKey: ");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append("\n                    |   prevKey: ");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append("\n                    |   itemsBefore: ");
        int n4 = this.d;
        stringBuilder.append(n4);
        stringBuilder.append("\n                    |   itemsAfter: ");
        n4 = this.e;
        stringBuilder.append(n4);
        stringBuilder.append("\n                    |) ");
        return ee3_2.c(stringBuilder.toString());
    }
}

