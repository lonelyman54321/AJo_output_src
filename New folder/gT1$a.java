/*
 * Decompiled with CFR 0.152.
 */
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class gT1$a
implements Comparable {
    public final String a;
    public final String b;

    public gT1$a(String object) {
        Intrinsics.checkNotNullParameter(object, "mimeType");
        Object object2 = "/";
        object = fT1.a((String)object2, (String)object);
        int n3 = object.isEmpty();
        int n4 = 1;
        if (n3 == 0) {
            int n7;
            n3 = object.size();
            object2 = object.listIterator(n3);
            while ((n7 = object2.hasPrevious()) != 0) {
                String string2 = (String)object2.previous();
                n7 = string2.length();
                if (n7 == 0) continue;
                object = (Iterable)object;
                n3 = object2.nextIndex() + n4;
                object = CollectionsKt.f0((Iterable)object, n3);
                break;
            }
        } else {
            object = mz0_2.a;
        }
        this.a = object2 = (String)object.get(0);
        this.b = object = (String)object.get(n4);
    }

    public final int compareTo(Object object) {
        object = (gT1$a)object;
        Intrinsics.checkNotNullParameter(object, "other");
        String string2 = ((gT1$a)object).a;
        String string3 = this.a;
        int n3 = Intrinsics.areEqual(string3, string2);
        if (n3 != 0) {
            n3 = 2;
        } else {
            n3 = 0;
            string2 = null;
        }
        string3 = this.b;
        object = ((gT1$a)object).b;
        boolean bl2 = Intrinsics.areEqual(string3, object);
        if (bl2) {
            ++n3;
        }
        return n3;
    }
}

