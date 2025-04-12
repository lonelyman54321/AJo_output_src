/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yo1
 */
public final class yo1_0 {
    public static final yo1_0 g;
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final Boolean e;
    public final iw1 f;

    static {
        yo1_0 yo1_02;
        g = yo1_02 = new yo1_0(0, 0, 127);
    }

    public /* synthetic */ yo1_0(int n3, int n4, int n7) {
        int n8;
        int n10;
        int n14 = n7 & 4;
        if (n14 != 0) {
            n3 = 0;
            n10 = 0;
        } else {
            n10 = n3;
        }
        n3 = n7 & 8;
        if (n3 != 0) {
            n4 = -1;
            n8 = -1;
        } else {
            n8 = n4;
        }
        this(-1, null, n10, n8, null, null);
    }

    public yo1_0(int n3, Boolean bl2, int n4, int n7, Boolean bl3, iw1 iw12) {
        this.a = n3;
        this.b = bl2;
        this.c = n4;
        this.d = n7;
        this.e = bl3;
        this.f = iw12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof yo1_0;
        if (n3 == 0) {
            return false;
        }
        object = (yo1_0)object;
        n3 = ((yo1_0)object).a;
        int n4 = this.a;
        if ((n3 = (int)(xo1_1.a(n4, n3) ? 1 : 0)) == 0) {
            return false;
        }
        Object object2 = this.b;
        Boolean bl3 = ((yo1_0)object).b;
        n3 = (int)(Intrinsics.areEqual(object2, bl3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = this.c;
        n4 = ((yo1_0)object).c;
        if ((n3 = (int)(zo1_0.a(n3, n4) ? 1 : 0)) == 0) {
            return false;
        }
        n3 = this.d;
        n4 = ((yo1_0)object).d;
        if ((n3 = (int)(Qe1.a(n3, n4) ? 1 : 0)) == 0) {
            return false;
        }
        object.getClass();
        object2 = null;
        n3 = (int)(Intrinsics.areEqual(null, null) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.e;
        bl3 = ((yo1_0)object).e;
        n3 = (int)(Intrinsics.areEqual(object2, bl3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.f;
        object = ((yo1_0)object).f;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.a * 31;
        int n7 = 0;
        List list = null;
        Object object = this.b;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        n3 = this.c;
        n4 = (n4 + n3) * 31;
        n3 = this.d;
        n4 = (n4 + n3) * 961;
        object = this.e;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.f;
        if (object != null) {
            list = ((iw1)object).a;
            n7 = ((Object)list).hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("KeyboardOptions(capitalization=");
        Object object = xo1_1.b(this.a);
        stringBuilder.append(object);
        stringBuilder.append(", autoCorrectEnabled=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", keyboardType=");
        object = zo1_0.b(this.c);
        stringBuilder.append(object);
        stringBuilder.append(", imeAction=");
        object = Qe1.b(this.d);
        stringBuilder.append(object);
        stringBuilder.append(", platformImeOptions=nullshowKeyboardOnFocus=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(", hintLocales=");
        object = this.f;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

