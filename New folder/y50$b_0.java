/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from y50$b
 */
public final class y50$b_0 {
    public final Object a;
    public final int b;
    public final oq1_1 c;

    public y50$b_0(Object object, int n3, oq1_1 oq1_12) {
        this.a = object;
        this.b = n3;
        this.c = oq1_12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof y50$b_0;
        if (n3 == 0) {
            return false;
        }
        object = (y50$b_0)object;
        Object object2 = this.a;
        Object object3 = ((y50$b_0)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.b;
        int n4 = ((y50$b_0)object).b;
        if (n3 != n4) {
            return false;
        }
        object3 = this.c;
        object = ((y50$b_0)object).c;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        return this.c.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("VerticalAnchor(id=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", index=");
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", reference=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

