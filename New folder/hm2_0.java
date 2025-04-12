/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from Hm2
 */
public final class hm2_0
implements Iterable,
KMappedMarker {
    public static final hm2_0 b;
    public final Map a;

    static {
        hm2_0 hm2_02;
        b = hm2_02 = new hm2_0();
    }

    public hm2_0() {
        nz0_2 nz0_22 = fh1_2.f();
        this(nz0_22);
    }

    public hm2_0(Map map2) {
        this.a = map2;
    }

    public final boolean equals(Object object) {
        Map map2;
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof hm2_0;
        if (!bl4 || !(bl2 = Intrinsics.areEqual(map2 = this.a, object = ((hm2_0)object).a))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        return ((Object)this.a).hashCode();
    }

    public final Iterator iterator() {
        Object object = this.a;
        int n3 = object.size();
        ArrayList<Pair> arrayList = new ArrayList<Pair>(n3);
        object = object.entrySet().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Object object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            object2 = (Hm2$b)object2.getValue();
            Pair pair = new Pair(string2, object2);
            arrayList.add(pair);
        }
        return arrayList.iterator();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Parameters(entries=");
        Map map2 = this.a;
        stringBuilder.append(map2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

