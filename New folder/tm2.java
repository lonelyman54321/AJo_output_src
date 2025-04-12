/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

public final class tm2 {
    public final sm2 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public tm2(gi_0 gi_02, int n3, int n4, int n7, int n8, float f5, float f6) {
        this.a = gi_02;
        this.b = n3;
        this.c = n4;
        this.d = n7;
        this.e = n8;
        this.f = f5;
        this.g = f6;
    }

    public final long a(long l2, boolean bl2) {
        if (bl2) {
            int n3 = mm3.c;
            long l3 = mm3.b;
            boolean bl3 = mm3.a(l2, l3);
            if (bl3) {
                return l3;
            }
        }
        int n7 = mm3.c;
        n7 = (int)(l2 >> 32);
        int n8 = this.b;
        int n10 = n7 + n8;
        int n14 = (int)(l2 & 0xFFFFFFFFL) + n8;
        return nm3.a(n10, n14);
    }

    public final int b(int n3) {
        int n4 = this.c;
        int n7 = this.b;
        return kotlin.ranges.f.g(n3, n7, n4) - n7;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof tm2;
        if (n3 == 0) {
            return false;
        }
        object = (tm2)object;
        sm2 sm22 = this.a;
        sm2 sm23 = ((tm2)object).a;
        n3 = Intrinsics.areEqual(sm22, sm23);
        if (n3 == 0) {
            return false;
        }
        n3 = this.b;
        int n4 = ((tm2)object).b;
        if (n3 != n4) {
            return false;
        }
        n3 = this.c;
        n4 = ((tm2)object).c;
        if (n3 != n4) {
            return false;
        }
        n3 = this.d;
        n4 = ((tm2)object).d;
        if (n3 != n4) {
            return false;
        }
        n3 = this.e;
        n4 = ((tm2)object).e;
        if (n3 != n4) {
            return false;
        }
        float f5 = this.f;
        float f6 = ((tm2)object).f;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f5 = this.g;
        float f7 = ((tm2)object).g;
        int n7 = Float.compare(f5, f7);
        if (n7 != 0) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        n4 = this.c;
        n3 = (n3 + n4) * 31;
        n4 = this.d;
        n3 = (n3 + n4) * 31;
        n4 = this.e;
        n3 = (n3 + n4) * 31;
        n3 = UR0.a(this.f, n3, 31);
        return Float.floatToIntBits(this.g) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ParagraphInfo(paragraph=");
        sm2 sm22 = this.a;
        stringBuilder.append(sm22);
        stringBuilder.append(", startIndex=");
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", endIndex=");
        n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(", startLineIndex=");
        n3 = this.d;
        stringBuilder.append(n3);
        stringBuilder.append(", endLineIndex=");
        n3 = this.e;
        stringBuilder.append(n3);
        stringBuilder.append(", top=");
        float f5 = this.f;
        stringBuilder.append(f5);
        stringBuilder.append(", bottom=");
        f5 = this.g;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

