/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class ki3$b {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public ki3$b(String string2, String string3, String string4, List list, List list2) {
        Intrinsics.checkNotNullParameter(string2, "referenceTable");
        Intrinsics.checkNotNullParameter(string3, "onDelete");
        Intrinsics.checkNotNullParameter(string4, "onUpdate");
        Intrinsics.checkNotNullParameter(list, "columnNames");
        Intrinsics.checkNotNullParameter(list2, "referenceColumnNames");
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof ki3$b;
        boolean bl3 = false;
        if (!bl2) {
            return false;
        }
        object = (ki3$b)object;
        Object object2 = this.a;
        Object object3 = ((ki3$b)object).a;
        bl2 = Intrinsics.areEqual(object2, object3);
        if (!bl2) {
            return false;
        }
        object3 = this.b;
        object2 = ((ki3$b)object).b;
        bl2 = Intrinsics.areEqual(object3, object2);
        if (!bl2) {
            return false;
        }
        object3 = this.c;
        object2 = ((ki3$b)object).c;
        bl2 = Intrinsics.areEqual(object3, object2);
        if (!bl2) {
            return false;
        }
        object3 = this.d;
        object2 = ((ki3$b)object).d;
        bl2 = Intrinsics.areEqual(object3, object2);
        if (bl2) {
            object3 = this.e;
            object = ((ki3$b)object).e;
            bl3 = Intrinsics.areEqual(object3, object);
        }
        return bl3;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode();
        int n4 = 31;
        n3 *= 31;
        Object object = this.b;
        n3 = zy_2.b(n3, n4, (String)object);
        object = this.c;
        n3 = zy_2.b(n3, n4, (String)object);
        object = this.d;
        n3 = ne_0.a(n3, n4, (List)object);
        return ((Object)this.e).hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ForeignKey{referenceTable='");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append("', onDelete='");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(" +', onUpdate='");
        object = this.c;
        stringBuilder.append((String)object);
        stringBuilder.append("', columnNames=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", referenceColumnNames=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

