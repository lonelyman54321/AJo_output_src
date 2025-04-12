/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Vv3
implements lg3_0 {
    public final lg3_0 a;
    public final lg3_0 b;

    public Vv3(oO0 oO02, lg3_0 lg3_02) {
        this.a = lg3_02;
        this.b = oO02;
    }

    public final int a(Vo0 vo0) {
        int n3 = this.a.a(vo0);
        int n4 = this.b.a(vo0);
        return Math.max(n3, n4);
    }

    public final int b(Vo0 vo0, bp1_0 bp1_02) {
        int n3 = this.a.b(vo0, bp1_02);
        int n4 = this.b.b(vo0, bp1_02);
        return Math.max(n3, n4);
    }

    public final int c(Vo0 vo0) {
        int n3 = this.a.c(vo0);
        int n4 = this.b.c(vo0);
        return Math.max(n3, n4);
    }

    public final int d(Vo0 vo0, bp1_0 bp1_02) {
        int n3 = this.a.d(vo0, bp1_02);
        int n4 = this.b.d(vo0, bp1_02);
        return Math.max(n3, n4);
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof Vv3;
        if (!bl4) {
            return false;
        }
        object = (Vv3)object;
        lg3_0 lg3_02 = ((Vv3)object).a;
        lg3_0 lg3_03 = this.a;
        bl4 = Intrinsics.areEqual(lg3_02, lg3_03);
        if (!bl4 || !(bl2 = Intrinsics.areEqual(object = ((Vv3)object).b, lg3_02 = this.b))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode();
        return this.b.hashCode() * 31 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        lg3_0 lg3_02 = this.a;
        stringBuilder.append(lg3_02);
        stringBuilder.append(" \u222a ");
        lg3_02 = this.b;
        stringBuilder.append(lg3_02);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

