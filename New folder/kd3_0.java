/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kd3
 */
public final class kd3_0 {
    public rg1_2 a;
    public ef1_1 b;
    public final pt1_2 c;
    public final yf1_2 d;
    public final fm0_0 e;

    public kd3_0(pt1_2 pt1_22, yf1_2 yf1_22, fm0_0 fm0_02) {
        Intrinsics.checkNotNullParameter(pt1_22, "legacyInAppStore");
        Intrinsics.checkNotNullParameter(yf1_22, "inAppAssetsStore");
        Intrinsics.checkNotNullParameter(fm0_02, "filesStore");
        this.a = null;
        this.b = null;
        this.c = pt1_22;
        this.d = yf1_22;
        this.e = fm0_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof kd3_0;
        if (!bl3) {
            return false;
        }
        object = (kd3_0)object;
        Object object2 = this.a;
        Object object3 = ((kd3_0)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object3 = ((kd3_0)object).b;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.c;
        object3 = ((kd3_0)object).c;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.d;
        object3 = ((kd3_0)object).d;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.e;
        object = ((kd3_0)object).e;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        rg1_2 rg1_22 = this.a;
        int n4 = 0;
        if (rg1_22 == null) {
            n3 = 0;
            rg1_22 = null;
        } else {
            n3 = rg1_22.hashCode();
        }
        n3 *= 31;
        ef1_1 ef1_12 = this.b;
        if (ef1_12 != null) {
            n4 = ef1_12.hashCode();
        }
        n3 = (n3 + n4) * 31;
        n4 = (this.c.hashCode() + n3) * 31;
        n3 = (this.d.hashCode() + n4) * 31;
        return this.e.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StoreRegistry(inAppStore=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", impressionStore=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", legacyInAppStore=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", inAppAssetsStore=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", filesStore=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

