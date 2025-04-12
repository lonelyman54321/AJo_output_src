/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class gi1
implements mk2_0 {
    public final lg3_0 a;
    public final Vo0 b;

    public gi1(lg3_0 lg3_02, Vo0 vo0) {
        this.a = lg3_02;
        this.b = vo0;
    }

    public final float calculateBottomPadding-D9Ej5fM() {
        lg3_0 lg3_02 = this.a;
        Vo0 vo0 = this.b;
        int n3 = lg3_02.c(vo0);
        return vo0.D0(n3);
    }

    public final float calculateLeftPadding-u2uoSUM(bp1_0 bp1_02) {
        lg3_0 lg3_02 = this.a;
        Vo0 vo0 = this.b;
        int n3 = lg3_02.d(vo0, bp1_02);
        return vo0.D0(n3);
    }

    public final float calculateRightPadding-u2uoSUM(bp1_0 bp1_02) {
        lg3_0 lg3_02 = this.a;
        Vo0 vo0 = this.b;
        int n3 = lg3_02.b(vo0, bp1_02);
        return vo0.D0(n3);
    }

    public final float calculateTopPadding-D9Ej5fM() {
        lg3_0 lg3_02 = this.a;
        Vo0 vo0 = this.b;
        int n3 = lg3_02.a(vo0);
        return vo0.D0(n3);
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof gi1;
        if (!bl4) {
            return false;
        }
        object = (gi1)object;
        lg3_0 lg3_02 = this.a;
        Object object2 = ((gi1)object).a;
        bl4 = Intrinsics.areEqual(lg3_02, object2);
        if (!bl4 || !(bl2 = Intrinsics.areEqual(object2 = this.b, object = ((gi1)object).b))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("InsetsPaddingValues(insets=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", density=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

