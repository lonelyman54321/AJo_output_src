/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class Rl2$a
extends Rl2 {
    public final int a;
    public final List b;
    public final int c;
    public final int d;

    public Rl2$a(int n3, int n4, int n7, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "inserted");
        this.a = n3;
        this.b = arrayList;
        this.c = n4;
        this.d = n7;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        int n3 = object instanceof Rl2$a;
        if (n3 == 0) return 0 != 0;
        object = (Rl2$a)object;
        int n4 = this.a;
        n3 = ((Rl2$a)object).a;
        if (n4 != n3) return 0 != 0;
        List list = this.b;
        List list2 = ((Rl2$a)object).b;
        n3 = (int)(Intrinsics.areEqual(list, list2) ? 1 : 0);
        if (n3 == 0) return 0 != 0;
        n3 = this.c;
        n4 = ((Rl2$a)object).c;
        if (n3 != n4) return 0 != 0;
        n3 = this.d;
        int n7 = ((Rl2$a)object).d;
        if (n3 != n7) return 0 != 0;
        return 1 != 0;
    }

    public final int hashCode() {
        int n3 = ((Object)this.b).hashCode();
        int n4 = this.a;
        n3 += n4;
        n4 = this.c;
        n3 += n4;
        n4 = this.d;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PagingDataEvent.Append loaded ");
        Object object = this.b;
        int n3 = object.size();
        stringBuilder.append(n3);
        stringBuilder.append(" items (\n                    |   startIndex: ");
        n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append("\n                    |   first item: ");
        Object object2 = CollectionsKt.firstOrNull((List)object);
        stringBuilder.append(object2);
        stringBuilder.append("\n                    |   last item: ");
        object = CollectionsKt.T((List)object);
        stringBuilder.append(object);
        stringBuilder.append("\n                    |   newPlaceholdersBefore: ");
        int n4 = this.c;
        stringBuilder.append(n4);
        stringBuilder.append("\n                    |   oldPlaceholdersBefore: ");
        n4 = this.d;
        stringBuilder.append(n4);
        stringBuilder.append("\n                    |)\n                    |");
        return ee3_2.c(stringBuilder.toString());
    }
}

