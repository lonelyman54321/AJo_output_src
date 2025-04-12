/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class nB2 {
    public static final nB2 d;
    public final float a;
    public final cw_2 b;
    public final int c;

    static {
        nB2 nB22;
        bw_2 bw_22 = new bw_2();
        d = nB22 = new nB2(bw_22);
    }

    public nB2() {
        throw null;
    }

    public nB2(bw_2 object) {
        String string2 = null;
        this.a = 0.0f;
        this.b = object;
        object = null;
        this.c = 0;
        boolean bl2 = Float.isNaN(0.0f) ^ true;
        if (bl2) {
            return;
        }
        string2 = "current must not be NaN".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof nB2;
        if (object2 == 0) {
            return false;
        }
        object = (nB2)object;
        float f5 = this.a;
        float f6 = ((nB2)object).a;
        float f7 = f5 - f6;
        object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object2 == 0) {
            cw_2 cw_22 = this.b;
            cw_2 cw_23 = ((nB2)object).b;
            object2 = Intrinsics.areEqual(cw_22, cw_23);
            if (object2 == 0) {
                return false;
            }
            object2 = this.c;
            int n3 = ((nB2)object).c;
            if (object2 != n3) {
                return false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.a) * 31;
        int n4 = (this.b.hashCode() + n3) * 31;
        n3 = this.c;
        return n4 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ProgressBarRangeInfo(current=");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append(", range=");
        cw_2 cw_22 = this.b;
        stringBuilder.append(cw_22);
        stringBuilder.append(", steps=");
        int n3 = this.c;
        return tu.a(stringBuilder, n3, ')');
    }
}

