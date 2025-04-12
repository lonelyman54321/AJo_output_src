/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class ki3$d {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    public ki3$d(String string2, boolean n3, List object, List collection) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(object, "columns");
        String string3 = "orders";
        Intrinsics.checkNotNullParameter(collection, string3);
        this.a = string2;
        this.b = n3;
        this.c = object;
        this.d = collection;
        collection = collection;
        int n4 = collection.isEmpty();
        if (n4 != 0) {
            n4 = object.size();
            super(n4);
            for (n3 = 0; n3 < n4; ++n3) {
                object = Fg1.ASC.name();
                ((ArrayList)collection).add(object);
            }
        }
        collection = (List)collection;
        this.d = collection;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof ki3$d;
        if (!bl2) {
            return false;
        }
        object = (ki3$d)object;
        boolean bl3 = this.b;
        bl2 = ((ki3$d)object).b;
        if (bl3 != bl2) {
            return false;
        }
        Object object2 = this.c;
        Object object3 = ((ki3$d)object).c;
        bl2 = Intrinsics.areEqual(object2, object3);
        if (!bl2) {
            return false;
        }
        object2 = this.d;
        object3 = ((ki3$d)object).d;
        bl2 = Intrinsics.areEqual(object2, object3);
        if (!bl2) {
            return false;
        }
        object2 = this.a;
        object3 = "index_";
        boolean bl4 = kotlin.text.b.s((String)object2, (String)object3, false);
        object = ((ki3$d)object).a;
        boolean bl5 = bl4 ? kotlin.text.b.s((String)object, (String)object3, false) : Intrinsics.areEqual(object2, object);
        return bl5;
    }

    public final int hashCode() {
        String string2 = this.a;
        Object object = "index_";
        int n3 = kotlin.text.b.s(string2, (String)object, false);
        n3 = n3 != 0 ? -1184239155 : string2.hashCode();
        n3 *= 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        object = this.c;
        n3 = ne_0.a(n3, 31, (List)object);
        return ((Object)this.d).hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Index{name='");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append("', unique=");
        boolean bl2 = this.b;
        stringBuilder.append(bl2);
        stringBuilder.append(", columns=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", orders=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append("'}");
        return stringBuilder.toString();
    }
}

