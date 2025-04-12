/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class A13 {
    public final q90_0 a;
    public final q90_0 b;
    public final q90_0 c;

    public A13() {
        this(0);
    }

    public A13(int n3) {
        n3 = 4;
        rp2_0 rp2_02 = SP2.a(n3);
        rp2_0 rp2_03 = SP2.a(n3);
        rp2_0 rp2_04 = SP2.a(0.0f);
        this(rp2_02, rp2_03, rp2_04);
    }

    public A13(q90_0 q90_02, q90_0 q90_03, q90_0 q90_04) {
        this.a = q90_02;
        this.b = q90_03;
        this.c = q90_04;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof A13;
        if (!bl3) {
            return false;
        }
        object = (A13)object;
        q90_0 q90_02 = this.a;
        q90_0 q90_03 = ((A13)object).a;
        bl3 = Intrinsics.areEqual(q90_02, q90_03);
        if (!bl3) {
            return false;
        }
        q90_03 = this.b;
        q90_02 = ((A13)object).b;
        bl3 = Intrinsics.areEqual(q90_03, q90_02);
        if (!bl3) {
            return false;
        }
        q90_03 = this.c;
        object = ((A13)object).c;
        boolean bl4 = Intrinsics.areEqual(q90_03, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = (this.b.hashCode() + n3) * 31;
        return this.c.hashCode() + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Shapes(small=");
        q90_0 q90_02 = this.a;
        stringBuilder.append(q90_02);
        stringBuilder.append(", medium=");
        q90_02 = this.b;
        stringBuilder.append(q90_02);
        stringBuilder.append(", large=");
        q90_02 = this.c;
        stringBuilder.append(q90_02);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

