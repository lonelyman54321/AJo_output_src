/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tV0
 */
public final class tv0_0
implements Comparable {
    public static final tv0_0 b;
    public static final tv0_0 c;
    public static final tv0_0 d;
    public static final tv0_0 e;
    public static final tv0_0 f;
    public static final tv0_0 g;
    public static final tv0_0 h;
    public static final tv0_0 i;
    public static final tv0_0 j;
    public static final tv0_0 k;
    public static final tv0_0 l;
    public static final tv0_0 m;
    public static final tv0_0 n;
    public static final tv0_0 o;
    public static final tv0_0 p;
    public static final List q;
    public final int a;

    static {
        tv0_0 tv0_02;
        tv0_0 tv0_03;
        tv0_0 tv0_04;
        tv0_0 tv0_05;
        tv0_0 tv0_06;
        tv0_0 tv0_07;
        tv0_0 tv0_08;
        tv0_0 tv0_09;
        tv0_0 tv0_010;
        b = tv0_010 = new tv0_0(100);
        c = tv0_09 = new tv0_0(200);
        d = tv0_08 = new tv0_0(300);
        e = tv0_07 = new tv0_0(400);
        f = tv0_06 = new tv0_0(500);
        g = tv0_05 = new tv0_0(600);
        h = tv0_04 = new tv0_0(700);
        i = tv0_03 = new tv0_0(800);
        j = tv0_02 = new tv0_0(900);
        k = tv0_010;
        l = tv0_08;
        m = tv0_07;
        n = tv0_06;
        o = tv0_04;
        p = tv0_02;
        Object[] objectArray = new tv0_0[]{tv0_010, tv0_09, tv0_08, tv0_07, tv0_06, tv0_05, tv0_04, tv0_03, tv0_02};
        q = xx_2.i(objectArray);
    }

    public tv0_0(int n3) {
        this.a = n3;
        int n4 = 1;
        if (n4 <= n3 && n3 < (n4 = 1001)) {
            return;
        }
        String string2 = hj0_0.a(n3, "Font weight can be in range [1, 1000]. Current value: ");
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final int a(tv0_0 tv0_02) {
        int n3 = this.a;
        int n4 = tv0_02.a;
        return Intrinsics.compare(n3, n4);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof tv0_0;
        if (n3 == 0) {
            return false;
        }
        object = (tv0_0)object;
        n3 = this.a;
        int n4 = ((tv0_0)object).a;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FontWeight(weight=");
        int n3 = this.a;
        return tu.a(stringBuilder, n3, ')');
    }
}

