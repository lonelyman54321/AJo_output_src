/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class Rl2$d
extends Rl2 {
    public final List a;
    public final int b;
    public final int c;

    public Rl2$d(ArrayList arrayList, int n3, int n4) {
        Intrinsics.checkNotNullParameter(arrayList, "inserted");
        this.a = arrayList;
        this.b = n3;
        this.c = n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        int n3 = object instanceof Rl2$d;
        if (n3 == 0) return 0 != 0;
        object = (Rl2$d)object;
        List list = this.a;
        List list2 = ((Rl2$d)object).a;
        n3 = Intrinsics.areEqual(list, list2);
        if (n3 == 0) return 0 != 0;
        n3 = this.b;
        int n4 = ((Rl2$d)object).b;
        if (n3 != n4) return 0 != 0;
        n3 = this.c;
        int n7 = ((Rl2$d)object).c;
        if (n3 != n7) return 0 != 0;
        return 1 != 0;
    }

    public final int hashCode() {
        int n3 = ((Object)this.a).hashCode();
        int n4 = this.b;
        n3 += n4;
        n4 = this.c;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PagingDataEvent.Prepend loaded ");
        Object object = this.a;
        int n3 = object.size();
        stringBuilder.append(n3);
        stringBuilder.append(" items (\n                    |   first item: ");
        Object object2 = CollectionsKt.firstOrNull((List)object);
        stringBuilder.append(object2);
        stringBuilder.append("\n                    |   last item: ");
        object = CollectionsKt.T((List)object);
        stringBuilder.append(object);
        stringBuilder.append("\n                    |   newPlaceholdersBefore: ");
        int n4 = this.b;
        stringBuilder.append(n4);
        stringBuilder.append("\n                    |   oldPlaceholdersBefore: ");
        n4 = this.c;
        stringBuilder.append(n4);
        stringBuilder.append("\n                    |)\n                    |");
        return ee3_2.c(stringBuilder.toString());
    }
}

