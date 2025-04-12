/*
 * Decompiled with CFR 0.152.
 */
import kotlin.ranges.f;

public final class Dh {
    public final int a;

    public Dh(int n3) {
        this.a = n3;
    }

    public final RU0 a(RU0 rU0) {
        return rU0;
    }

    public final int b(int n3) {
        return n3;
    }

    public final int c(int n3) {
        return n3;
    }

    public final tv0_0 d(tv0_0 tv0_02) {
        int n3;
        int n4 = this.a;
        if (n4 != 0 && n4 != (n3 = -1 >>> 1)) {
            int n7 = f.g(tv0_02.a + n4, 1, 1000);
            tv0_0 tv0_03 = new tv0_0(n7);
            return tv0_03;
        }
        return tv0_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Dh;
        if (n3 == 0) {
            return false;
        }
        object = (Dh)object;
        n3 = this.a;
        int n4 = ((Dh)object).a;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment=");
        int n3 = this.a;
        return tu.a(stringBuilder, n3, ')');
    }
}

