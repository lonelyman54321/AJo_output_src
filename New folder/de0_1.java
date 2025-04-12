/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dE0
 */
public final class de0_1
implements lg3_0 {
    public final lg3_0 a;
    public final lg3_0 b;

    public de0_1(oO0 oO02, lg3_0 lg3_02) {
        this.a = oO02;
        this.b = lg3_02;
    }

    public final int a(Vo0 vo0) {
        lg3_0 lg3_02 = this.a;
        int n3 = lg3_02.a(vo0);
        lg3_0 lg3_03 = this.b;
        int n4 = lg3_03.a(vo0);
        if ((n3 -= n4) < 0) {
            n3 = 0;
            lg3_02 = null;
        }
        return n3;
    }

    public final int b(Vo0 vo0, bp1_0 bp1_02) {
        lg3_0 lg3_02 = this.a;
        int n3 = lg3_02.b(vo0, bp1_02);
        lg3_0 lg3_03 = this.b;
        int n4 = lg3_03.b(vo0, bp1_02);
        if ((n3 -= n4) < 0) {
            n3 = 0;
            lg3_02 = null;
        }
        return n3;
    }

    public final int c(Vo0 vo0) {
        lg3_0 lg3_02 = this.a;
        int n3 = lg3_02.c(vo0);
        lg3_0 lg3_03 = this.b;
        int n4 = lg3_03.c(vo0);
        if ((n3 -= n4) < 0) {
            n3 = 0;
            lg3_02 = null;
        }
        return n3;
    }

    public final int d(Vo0 vo0, bp1_0 bp1_02) {
        lg3_0 lg3_02 = this.a;
        int n3 = lg3_02.d(vo0, bp1_02);
        lg3_0 lg3_03 = this.b;
        int n4 = lg3_03.d(vo0, bp1_02);
        if ((n3 -= n4) < 0) {
            n3 = 0;
            lg3_02 = null;
        }
        return n3;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof de0_1;
        if (!bl4) {
            return false;
        }
        object = (de0_1)object;
        lg3_0 lg3_02 = ((de0_1)object).a;
        lg3_0 lg3_03 = this.a;
        bl4 = Intrinsics.areEqual(lg3_02, lg3_03);
        if (!bl4 || !(bl2 = Intrinsics.areEqual(object = ((de0_1)object).b, lg3_02 = this.b))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        lg3_0 lg3_02 = this.a;
        stringBuilder.append(lg3_02);
        stringBuilder.append(" - ");
        lg3_02 = this.b;
        stringBuilder.append(lg3_02);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

