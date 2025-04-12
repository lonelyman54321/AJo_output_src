/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Z31
 */
public final class z31_0 {
    public final String a;
    public final List b;
    public final double c;

    public z31_0(String object, List object2) {
        Object object3;
        Object object4;
        block5: {
            block4: {
                String string2;
                Object object5;
                boolean bl2;
                Intrinsics.checkNotNullParameter(object, "value");
                object4 = "params";
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                this.a = object;
                this.b = object2;
                object2 = (Iterable)object2;
                object = object2.iterator();
                do {
                    object3 = object.hasNext();
                    object4 = null;
                    if (object3 == 0) break block4;
                    object5 = object2 = object.next();
                } while (!(bl2 = Intrinsics.areEqual(object5 = ((a41_0)object2).a, string2 = "q")));
                break block5;
            }
            object3 = 0;
            object2 = null;
        }
        object2 = (a41_0)object2;
        double d2 = 1.0;
        if (object2 != null && (object = ((a41_0)object2).b) != null && (object = je3_2.d((String)object)) != null) {
            double d5 = 0.0;
            double d7 = ((Number)object).doubleValue();
            double d9 = d5 - d7;
            object3 = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
            if (object3 <= 0 && (object3 = (Object)(d7 == d2 ? 0 : (d7 < d2 ? -1 : 1))) <= 0) {
                object4 = object;
            }
            if (object4 != null) {
                d2 = (Double)object4;
            }
        }
        this.c = d2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof z31_0;
        if (!bl3) {
            return false;
        }
        object = (z31_0)object;
        String string2 = this.a;
        Object object2 = ((z31_0)object).a;
        bl3 = Intrinsics.areEqual(string2, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((z31_0)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        return ((Object)this.b).hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HeaderValue(value=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", params=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

