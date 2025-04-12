/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nZ0
 */
public final class nz0_0 {
    public final List a;

    public nz0_0(List list) {
        Intrinsics.checkNotNullParameter(list, "topics");
        this.a = list;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof nz0_0;
        HashSet hashSet = null;
        if (!bl2) {
            return false;
        }
        Collection collection = this.a;
        int n3 = collection.size();
        object = (nz0_0)object;
        List list = ((nz0_0)object).a;
        int n4 = list.size();
        if (n3 != n4) {
            return false;
        }
        collection = collection;
        hashSet = new HashSet(collection);
        object = ((nz0_0)object).a;
        collection = new HashSet(object);
        return Intrinsics.areEqual(hashSet, collection);
    }

    public final int hashCode() {
        List list = this.a;
        Object[] objectArray = new Object[]{list};
        return Objects.hash(objectArray);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Topics=");
        List list = this.a;
        stringBuilder.append(list);
        return stringBuilder.toString();
    }
}

