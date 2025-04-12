/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cD2
 */
public abstract class cd2_2 {
    public static final cD2$a a;
    public static final k1_0 b;

    static {
        int n3;
        int n4 = 0;
        Object object = new cD2$a(null);
        a = object;
        ft2_2.a.getClass();
        object = Nk1$a.b;
        object = object != null && (n3 = ((Integer)object).intValue()) < (n4 = 34) ? new ui0_2() : new cd2_2();
        b = object;
    }

    public abstract int a(int var1);

    public int b() {
        return this.a(32);
    }

    public int c(int n3) {
        return this.d(0, n3);
    }

    public int d(int n3, int n4) {
        if (n4 > n3) {
            int n7;
            int n8 = n4 - n3;
            if (n8 <= 0 && n8 != (n7 = -1 << -1)) {
                while (n3 > (n8 = this.b()) || n8 >= n4) {
                }
                return n8;
            }
            n4 = -n8 & n8;
            if (n4 == n8) {
                n4 = Integer.numberOfLeadingZeros(n8);
                n4 = 31 - n4;
                n4 = this.a(n4);
            } else {
                int n10;
                do {
                    n4 = this.b() >>> 1;
                } while ((n10 = n8 + -1 + (n4 -= (n7 = n4 % n8))) < 0);
                n4 = n7;
            }
            return n3 + n4;
        }
        Object object = n3;
        Serializable serializable = n4;
        Intrinsics.checkNotNullParameter(object, "from");
        Intrinsics.checkNotNullParameter(serializable, "until");
        StringBuilder stringBuilder = new StringBuilder("Random range is empty: [");
        stringBuilder.append(object);
        stringBuilder.append(", ");
        stringBuilder.append(serializable);
        stringBuilder.append(").");
        object = stringBuilder.toString();
        object = object.toString();
        serializable = new IllegalArgumentException((String)object);
        throw serializable;
    }
}

