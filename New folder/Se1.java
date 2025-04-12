/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Se1 {
    public static final Se1 g;
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final iw1 f;

    static {
        Se1 se1;
        iw1 iw12 = iw1.c;
        g = se1 = new Se1(false, 0, true, 1, 1, iw12);
    }

    public Se1(boolean bl2, int n3, boolean bl3, int n4, int n7, iw1 iw12) {
        this.a = bl2;
        this.b = n3;
        this.c = bl3;
        this.d = n4;
        this.e = n7;
        this.f = iw12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Se1;
        if (n3 == 0) {
            return false;
        }
        object = (Se1)object;
        int n4 = this.a;
        n3 = ((Se1)object).a;
        if (n4 != n3) {
            return false;
        }
        n3 = this.b;
        n4 = ((Se1)object).b;
        if ((n3 = (int)(xo1_1.a(n3, n4) ? 1 : 0)) == 0) {
            return false;
        }
        n3 = this.c ? 1 : 0;
        n4 = ((Se1)object).c ? 1 : 0;
        if (n3 != n4) {
            return false;
        }
        n3 = this.d;
        n4 = ((Se1)object).d;
        if ((n3 = (int)(zo1_0.a(n3, n4) ? 1 : 0)) == 0) {
            return false;
        }
        n3 = this.e;
        n4 = ((Se1)object).e;
        if ((n3 = (int)(Qe1.a(n3, n4) ? 1 : 0)) == 0) {
            return false;
        }
        object.getClass();
        iw1 iw12 = null;
        n3 = Intrinsics.areEqual(null, null) ? 1 : 0;
        if (n3 == 0) {
            return false;
        }
        iw12 = this.f;
        object = ((Se1)object).f;
        boolean bl3 = Intrinsics.areEqual(iw12, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = 1237;
        int n4 = this.a;
        n4 = n4 != 0 ? 1231 : 1237;
        n4 *= 31;
        int n7 = this.b;
        n4 = (n4 + n7) * 31;
        n7 = this.c ? 1 : 0;
        if (n7 != 0) {
            n3 = 1231;
        }
        n4 = (n4 + n3) * 31;
        n3 = this.d;
        n4 = (n4 + n3) * 31;
        n3 = this.e;
        n4 = (n4 + n3) * 961;
        return ((Object)this.f.a).hashCode() + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ImeOptions(singleLine=");
        boolean bl2 = this.a;
        stringBuilder.append(bl2);
        stringBuilder.append(", capitalization=");
        Object object = xo1_1.b(this.b);
        stringBuilder.append(object);
        stringBuilder.append(", autoCorrect=");
        bl2 = this.c;
        stringBuilder.append(bl2);
        stringBuilder.append(", keyboardType=");
        object = zo1_0.b(this.d);
        stringBuilder.append(object);
        stringBuilder.append(", imeAction=");
        object = Qe1.b(this.e);
        stringBuilder.append(object);
        stringBuilder.append(", platformImeOptions=null, hintLocales=");
        object = this.f;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

