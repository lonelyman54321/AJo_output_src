/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ym2
 */
public final class ym2_0 {
    public final int a;
    public final int b;
    public final long c;
    public final vl3_0 d;
    public final ot2_1 e;
    public final yu1_1 f;
    public final int g;
    public final int h;
    public final im3_0 i;

    public ym2_0(int n3, int n4, long l2, vl3_0 vl3_02, int n7) {
        vl3_0 vl3_03;
        int n8 = n7 & 1;
        int n10 = n8 != 0 ? -1 << -1 : n3;
        n8 = n7 & 2;
        int n14 = n8 != 0 ? -1 << -1 : n4;
        n8 = n7 & 8;
        if (n8 != 0) {
            n8 = 0;
            vl3_03 = null;
        } else {
            vl3_03 = vl3_02;
        }
        this(n10, n14, l2, vl3_03, null, null, 0, -1 << -1, null);
    }

    public ym2_0(int n3, int n4, long l2, vl3_0 vl3_02, ot2_1 ot2_12, yu1_1 yu1_12, int n7, int n8, im3_0 im3_02) {
        this.a = n3;
        this.b = n4;
        this.c = l2;
        this.d = vl3_02;
        this.e = ot2_12;
        this.f = yu1_12;
        this.g = n7;
        this.h = n8;
        this.i = im3_02;
        long l3 = Dm3.c;
        n3 = (int)(Dm3.a(l2, l3) ? 1 : 0);
        if (n3 == 0) {
            float f5 = Dm3.c(l2);
            n4 = 0;
            float f6 = 0.0f;
            IllegalStateException illegalStateException = null;
            float f7 = f5 - 0.0f;
            n3 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
            if (n3 < 0) {
                CharSequence charSequence = new StringBuilder("lineHeight can't be negative (");
                f6 = Dm3.c(l2);
                ((StringBuilder)charSequence).append(f6);
                ((StringBuilder)charSequence).append(')');
                charSequence = ((StringBuilder)charSequence).toString();
                charSequence = ((Object)charSequence).toString();
                illegalStateException = new IllegalStateException((String)charSequence);
                throw illegalStateException;
            }
        }
    }

    public final ym2_0 a(ym2_0 ym2_02) {
        if (ym2_02 == null) {
            return this;
        }
        int n3 = ym2_02.h;
        im3_0 im3_02 = ym2_02.i;
        int n4 = ym2_02.a;
        int n7 = ym2_02.b;
        long l2 = ym2_02.c;
        vl3_0 vl3_02 = ym2_02.d;
        ot2_1 ot2_12 = ym2_02.e;
        yu1_1 yu1_12 = ym2_02.f;
        int n8 = ym2_02.g;
        return zm2_1.a(this, n4, n7, l2, vl3_02, ot2_12, yu1_12, n8, n3, im3_02);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ym2_0;
        if (n3 == 0) {
            return false;
        }
        object = (ym2_0)object;
        n3 = ((ym2_0)object).a;
        int n4 = this.a;
        if ((n3 = (int)(Cj3.a(n4, n3) ? 1 : 0)) == 0) {
            return false;
        }
        n3 = this.b;
        n4 = ((ym2_0)object).b;
        if ((n3 = (int)(Pj3.a(n3, n4) ? 1 : 0)) == 0) {
            return false;
        }
        long l2 = this.c;
        long l3 = ((ym2_0)object).c;
        n3 = (int)(Dm3.a(l2, l3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        Object object2 = this.d;
        Object object3 = ((ym2_0)object).d;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.e;
        object3 = ((ym2_0)object).e;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.f;
        object3 = ((ym2_0)object).f;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = this.g;
        n4 = ((ym2_0)object).g;
        if (n3 == n4) {
            n3 = this.h;
            n4 = ((ym2_0)object).h;
            if ((n3 = (int)(gc1_1.a(n3, n4) ? 1 : 0)) == 0) {
                return false;
            }
            object2 = this.i;
            object = ((ym2_0)object).i;
            boolean bl3 = Intrinsics.areEqual(object2, object);
            if (!bl3) {
                return false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.a * 31;
        int n7 = this.b;
        n4 = (n4 + n7) * 31;
        long l2 = this.c;
        n7 = (Dm3.d(l2) + n4) * 31;
        n4 = 0;
        Object object = this.d;
        if (object != null) {
            n3 = ((vl3_0)object).hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        object = this.e;
        if (object != null) {
            n3 = ((ot2_1)object).hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        object = this.f;
        if (object != null) {
            n3 = ((yu1_1)object).hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        n3 = this.g;
        n7 = (n7 + n3) * 31;
        n3 = this.h;
        n7 = (n7 + n3) * 31;
        object = this.i;
        if (object != null) {
            n4 = ((im3_0)object).hashCode();
        }
        return n7 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ParagraphStyle(textAlign=");
        Object object = Cj3.b(this.a);
        stringBuilder.append(object);
        stringBuilder.append(", textDirection=");
        object = Pj3.b(this.b);
        stringBuilder.append(object);
        stringBuilder.append(", lineHeight=");
        object = Dm3.e(this.c);
        stringBuilder.append(object);
        stringBuilder.append(", textIndent=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", platformStyle=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(", lineHeightStyle=");
        object = this.f;
        stringBuilder.append(object);
        stringBuilder.append(", lineBreak=");
        object = wu1_1.a(this.g);
        stringBuilder.append(object);
        stringBuilder.append(", hyphens=");
        object = gc1_1.b(this.h);
        stringBuilder.append(object);
        stringBuilder.append(", textMotion=");
        object = this.i;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

