/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Insets
 */
import android.graphics.Insets;

public final class ei1 {
    public static final ei1 e;
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        ei1 ei12;
        e = ei12 = new ei1(0, 0, 0, 0);
    }

    public ei1(int n3, int n4, int n7, int n8) {
        this.a = n3;
        this.b = n4;
        this.c = n7;
        this.d = n8;
    }

    public static ei1 a(ei1 ei12, ei1 ei13) {
        int n3 = ei12.a;
        int n4 = ei13.a;
        n3 = Math.max(n3, n4);
        n4 = ei12.b;
        int n7 = ei13.b;
        n4 = Math.max(n4, n7);
        n7 = ei12.c;
        int n8 = ei13.c;
        n7 = Math.max(n7, n8);
        int n10 = ei12.d;
        int n14 = ei13.d;
        n10 = Math.max(n10, n14);
        return ei1.b(n3, n4, n7, n10);
    }

    public static ei1 b(int n3, int n4, int n7, int n8) {
        if (n3 == 0 && n4 == 0 && n7 == 0 && n8 == 0) {
            return e;
        }
        ei1 ei12 = new ei1(n3, n4, n7, n8);
        return ei12;
    }

    public static ei1 c(Insets insets) {
        int n3 = mu0_0.a(insets);
        int n4 = ou0_1.a(insets);
        int n7 = qu0_0.a(insets);
        int n8 = su0_0.a(insets);
        return ei1.b(n3, n4, n7, n8);
    }

    public final Insets d() {
        int n3 = this.c;
        int n4 = this.d;
        int n7 = this.a;
        int n8 = this.b;
        return ei1$a.a(n7, n8, n3, n4);
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<ei1> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = ei1.class) == (clazz = object.getClass())) {
            object = (ei1)object;
            int n3 = this.d;
            int n4 = ((ei1)object).d;
            if (n3 != n4) {
                return false;
            }
            n3 = this.a;
            n4 = ((ei1)object).a;
            if (n3 != n4) {
                return false;
            }
            n3 = this.c;
            n4 = ((ei1)object).c;
            if (n3 != n4) {
                return false;
            }
            n3 = this.b;
            int n7 = ((ei1)object).b;
            if (n3 != n7) {
                return false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        n4 = this.c;
        n3 = (n3 + n4) * 31;
        n4 = this.d;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Insets{left=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", top=");
        n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", right=");
        n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(", bottom=");
        n3 = this.d;
        return tu.a(stringBuilder, n3, '}');
    }
}

