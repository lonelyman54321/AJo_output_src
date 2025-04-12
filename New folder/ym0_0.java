/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yM0
 */
public final class ym0_0 {
    public boolean a = false;
    public String b = null;

    public ym0_0() {
        this(0);
    }

    public ym0_0(int n3) {
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ym0_0;
        if (!bl3) {
            return false;
        }
        object = (ym0_0)object;
        bl3 = this.a;
        boolean bl4 = ((ym0_0)object).a;
        if (bl3 != bl4) {
            return false;
        }
        String string2 = this.b;
        object = ((ym0_0)object).b;
        boolean bl5 = Intrinsics.areEqual(string2, object);
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
        String string2 = this.b;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        return n4 + n3;
    }

    public final String toString() {
        boolean bl2 = this.a;
        String string2 = this.b;
        StringBuilder stringBuilder = new StringBuilder("FilterData(isAppendProductsQueryParam=");
        stringBuilder.append(bl2);
        stringBuilder.append(", pincode=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

