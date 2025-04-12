/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cO
 */
public final class co_1
implements Serializable {
    public final boolean a;
    public final List b;
    public List c;

    public co_1() {
        this(false, null, null);
    }

    public co_1(boolean bl2, List list, List list2) {
        this.a = bl2;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof co_1;
        if (!bl3) {
            return false;
        }
        object = (co_1)object;
        boolean bl4 = this.a;
        bl3 = ((co_1)object).a;
        if (bl4 != bl3) {
            return false;
        }
        List list = this.b;
        List list2 = ((co_1)object).b;
        bl3 = Intrinsics.areEqual(list, list2);
        if (!bl3) {
            return false;
        }
        list = this.c;
        object = ((co_1)object).c;
        boolean bl5 = Intrinsics.areEqual(list, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.a;
        n4 = n4 != 0 ? 1231 : 1237;
        n4 *= 31;
        int n7 = 0;
        List list = this.b;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        n4 = (n4 + n3) * 31;
        list = this.c;
        if (list != null) {
            n7 = ((Object)list).hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        List list = this.c;
        StringBuilder stringBuilder = new StringBuilder("CartListExtra(isCartTabSelected=");
        boolean bl2 = this.a;
        stringBuilder.append(bl2);
        stringBuilder.append(", entriesFromPayment=");
        List list2 = this.b;
        stringBuilder.append(list2);
        stringBuilder.append(", cartModificationList=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

