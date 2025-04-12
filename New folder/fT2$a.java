/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public class fT2$a
implements Set,
KMappedMarker {
    public final /* synthetic */ ft2_0 a;

    public fT2$a(ft2_0 ft2_02) {
        this.a = ft2_02;
    }

    public final boolean contains(Object object) {
        return this.a.a(object);
    }

    public final boolean containsAll(Collection object) {
        boolean bl2;
        String string2 = "elements";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((Iterable)object).iterator();
        while (bl2 = object.hasNext()) {
            ft2_0 ft2_02 = this.a;
            string2 = object.next();
            bl2 = ft2_02.a(string2);
            if (bl2) continue;
            return false;
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.a.b();
    }

    public final int size() {
        return this.a.d;
    }

    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public final Object[] toArray(Object[] objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "array");
        return CollectionToArray.toArray(this, objectArray);
    }
}

