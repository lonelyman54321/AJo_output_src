/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Ps2
implements Tg2 {
    public final bl1_0 a;
    public final tb1_0 b;

    public Ps2(bl1_0 bl1_02, tb1_0 tb1_02) {
        this.a = bl1_02;
        this.b = tb1_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Ps2;
        if (!bl3) {
            return false;
        }
        object = (Ps2)object;
        bl1_0 bl1_02 = this.a;
        Object object2 = ((Ps2)object).a;
        bl3 = Intrinsics.areEqual(bl1_02, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((Ps2)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        return this.b.hashCode() + n3;
    }

    public final boolean s0() {
        return this.b.u0().e();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlaceableResult(result=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", placeable=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

