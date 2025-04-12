/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ct2
 */
public final class ct2_0 {
    public final st2_1 a;
    public final ot2_1 b;

    public ct2_0(st2_1 st2_12, ot2_1 ot2_12) {
        this.a = st2_12;
        this.b = ot2_12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ct2_0;
        if (!bl3) {
            return false;
        }
        object = (ct2_0)object;
        ot2_1 ot2_12 = this.b;
        Object object2 = ((ct2_0)object).b;
        bl3 = Intrinsics.areEqual(ot2_12, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.a;
        object = ((ct2_0)object).a;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        st2_1 st2_12 = this.a;
        if (st2_12 != null) {
            n3 = st2_12.hashCode();
        } else {
            n3 = 0;
            st2_12 = null;
        }
        n3 *= 31;
        ot2_1 ot2_12 = this.b;
        if (ot2_12 != null) {
            n4 = ot2_12.hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlatformTextStyle(spanStyle=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", paragraphSyle=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

