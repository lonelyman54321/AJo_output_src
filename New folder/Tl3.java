/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class Tl3 {
    public final Sl3 a;
    public final RQ1 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public Tl3(Sl3 object, RQ1 rQ1, long l2) {
        sm2 sm22;
        float f5;
        float f6;
        this.a = object;
        this.b = rQ1;
        this.c = l2;
        object = rQ1.h;
        boolean bl2 = ((ArrayList)object).isEmpty();
        float f7 = 0.0f;
        if (bl2) {
            f6 = 0.0f;
            object = null;
        } else {
            bl2 = false;
            f5 = 0.0f;
            sm22 = null;
            object = ((tm2)((ArrayList)object).get((int)0)).a;
            f6 = object.e();
        }
        this.d = f6;
        object = rQ1.h;
        bl2 = ((ArrayList)object).isEmpty();
        if (!bl2) {
            object = (tm2)CollectionsKt.S((List)object);
            sm22 = ((tm2)object).a;
            f5 = sm22.q();
            f6 = ((tm2)object).f;
            f7 = f5 + f6;
        }
        this.e = f7;
        this.f = object = rQ1.g;
    }

    public final uk2_0 a(int n3) {
        Object object = this.b;
        ((RQ1)object).j(n3);
        Object object2 = ((RQ1)object).a.a.a;
        int n4 = ((String)object2).length();
        object = ((RQ1)object).h;
        n4 = n3 == n4 ? xx_2.h((List)object) : TQ1.a(n3, (ArrayList)object);
        object = (tm2)((ArrayList)object).get(n4);
        object2 = ((tm2)object).a;
        n3 = ((tm2)object).b(n3);
        return object2.t(n3);
    }

    public final aG2 b(int n3) {
        Object object = this.b;
        ((RQ1)object).i(n3);
        object = ((RQ1)object).h;
        int n4 = TQ1.a(n3, (ArrayList)object);
        object = (tm2)((ArrayList)object).get(n4);
        sm2 sm22 = ((tm2)object).a;
        n3 = ((tm2)object).b(n3);
        aG2 aG22 = sm22.v(n3);
        float f5 = ((tm2)object).f;
        long l2 = h72.a(0.0f, f5);
        return aG22.i(l2);
    }

    public final aG2 c(int n3) {
        Object object = this.b;
        ((RQ1)object).j(n3);
        Object object2 = ((RQ1)object).a.a.a;
        int n4 = ((String)object2).length();
        object = ((RQ1)object).h;
        n4 = n3 == n4 ? xx_2.h((List)object) : TQ1.a(n3, (ArrayList)object);
        object = (tm2)((ArrayList)object).get(n4);
        object2 = ((tm2)object).a;
        n3 = ((tm2)object).b(n3);
        aG2 aG22 = object2.c(n3);
        float f5 = ((tm2)object).f;
        long l2 = h72.a(0.0f, f5);
        return aG22.i(l2);
    }

    public final boolean d() {
        float f5;
        long l2;
        int n3;
        float f6;
        float f7;
        int n4;
        long l3 = this.c;
        long l4 = l3 >> 32;
        int n7 = (int)l4;
        float f8 = n7;
        RQ1 rQ1 = this.b;
        float f11 = rQ1.d;
        float f12 = f8 - f11;
        float f14 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (f14 >= 0 && (f14 = (float)rQ1.c) == false && (n4 = (f7 = (f6 = (float)(n3 = (int)(l3 &= (l2 = 0xFFFFFFFFL)))) - (f5 = rQ1.e)) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) >= 0) {
            n4 = 0;
            f6 = 0.0f;
        } else {
            n4 = 1;
            f6 = Float.MIN_VALUE;
        }
        return n4 != 0;
    }

    public final int e(int n3, boolean bl2) {
        Object object = this.b;
        ((RQ1)object).k(n3);
        object = ((RQ1)object).h;
        int n4 = TQ1.b(n3, (List)object);
        object = (tm2)((ArrayList)object).get(n4);
        sm2 sm22 = ((tm2)object).a;
        int n7 = ((tm2)object).d;
        n3 -= n7;
        n3 = sm22.h(n3, bl2);
        int n8 = ((tm2)object).b;
        return n3 + n8;
    }

    public final boolean equals(Object object) {
        float f5;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Tl3;
        if (!n3) {
            return false;
        }
        object = (Tl3)object;
        Object object2 = this.a;
        Object object3 = ((Tl3)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (!n3) {
            return false;
        }
        object3 = this.b;
        object2 = ((Tl3)object).b;
        n3 = Intrinsics.areEqual(object3, object2);
        if (!n3) {
            return false;
        }
        long l2 = this.c;
        long l3 = ((Tl3)object).c;
        n3 = bj1.b(l2, l3);
        if (!n3) {
            return false;
        }
        float f6 = this.d;
        float f7 = ((Tl3)object).d;
        float f8 = f6 - f7;
        n3 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (!n3 && !(n3 = (f5 = (f6 = this.e) - (f7 = ((Tl3)object).e)) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1))) {
            object3 = this.f;
            object = ((Tl3)object).f;
            boolean bl3 = Intrinsics.areEqual(object3, object);
            if (!bl3) {
                return false;
            }
            return bl2;
        }
        return false;
    }

    public final int f(int n3) {
        Object object = this.b;
        Object object2 = ((RQ1)object).a.a.a;
        int n4 = ((String)object2).length();
        object = ((RQ1)object).h;
        if (n3 >= n4) {
            n4 = xx_2.h((List)object);
        } else if (n3 < 0) {
            n4 = 0;
            object2 = null;
        } else {
            n4 = TQ1.a(n3, (ArrayList)object);
        }
        object = (tm2)((ArrayList)object).get(n4);
        object2 = ((tm2)object).a;
        n3 = ((tm2)object).b(n3);
        n3 = object2.s(n3);
        int n7 = ((tm2)object).d;
        return n3 + n7;
    }

    public final float g(int n3) {
        Object object = this.b;
        ((RQ1)object).k(n3);
        object = ((RQ1)object).h;
        int n4 = TQ1.b(n3, (List)object);
        object = (tm2)((ArrayList)object).get(n4);
        sm2 sm22 = ((tm2)object).a;
        int n7 = ((tm2)object).d;
        return sm22.n(n3 -= n7);
    }

    public final float h(int n3) {
        Object object = this.b;
        ((RQ1)object).k(n3);
        object = ((RQ1)object).h;
        int n4 = TQ1.b(n3, (List)object);
        object = (tm2)((ArrayList)object).get(n4);
        sm2 sm22 = ((tm2)object).a;
        int n7 = ((tm2)object).d;
        return sm22.i(n3 -= n7);
    }

    public final int hashCode() {
        int n3 = this.a.hashCode();
        int n4 = 31;
        int n7 = (this.b.hashCode() + (n3 *= 31)) * 31;
        long l2 = this.c;
        long l3 = l2 >>> 32;
        n3 = ((int)(l2 ^ l3) + n7) * 31;
        n3 = UR0.a(this.d, n3, n4);
        n3 = UR0.a(this.e, n3, n4);
        return ((Object)this.f).hashCode() + n3;
    }

    public final int i(int n3) {
        Object object = this.b;
        ((RQ1)object).k(n3);
        object = ((RQ1)object).h;
        int n4 = TQ1.b(n3, (List)object);
        object = (tm2)((ArrayList)object).get(n4);
        sm2 sm22 = ((tm2)object).a;
        int n7 = ((tm2)object).d;
        n3 -= n7;
        n3 = sm22.g(n3);
        int n8 = ((tm2)object).b;
        return n3 + n8;
    }

    public final uk2_0 j(int n3) {
        Object object = this.b;
        ((RQ1)object).j(n3);
        Object object2 = ((RQ1)object).a.a.a;
        int n4 = ((String)object2).length();
        object = ((RQ1)object).h;
        n4 = n3 == n4 ? xx_2.h((List)object) : TQ1.a(n3, (ArrayList)object);
        object = (tm2)((ArrayList)object).get(n4);
        object2 = ((tm2)object).a;
        n3 = ((tm2)object).b(n3);
        return object2.a(n3);
    }

    public final ki k(int n3, int n4) {
        String string2;
        int n7;
        Object object = this.b;
        Object object2 = ((RQ1)object).a;
        if (n3 >= 0 && n3 <= n4 && n4 <= (n7 = (string2 = ((sq1_0)object2).a.a).length())) {
            Object object3;
            if (n3 == n4) {
                object3 = ni.a();
            } else {
                object2 = ni.a();
                object = ((RQ1)object).h;
                long l2 = nm3.a(n3, n4);
                qq1_2 qq1_22 = new qq1_2((ki)object2, n3, n4);
                TQ1.d((ArrayList)object, l2, qq1_22);
                object3 = object2;
            }
            return object3;
        }
        CharSequence charSequence = fQ2.a("Start(", ") or End(", ") is out of range [0..", n3, n4);
        n4 = ((sq1_0)object2).a.a.length();
        ((StringBuilder)charSequence).append(n4);
        ((StringBuilder)charSequence).append("), or start > end!");
        charSequence = ((StringBuilder)charSequence).toString();
        charSequence = ((Object)charSequence).toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
        throw illegalArgumentException;
    }

    public final long l(int n3) {
        Object object = this.b;
        ((RQ1)object).j(n3);
        Object object2 = ((RQ1)object).a.a.a;
        int n4 = ((String)object2).length();
        object = ((RQ1)object).h;
        n4 = n3 == n4 ? xx_2.h((List)object) : TQ1.a(n3, (ArrayList)object);
        object = (tm2)((ArrayList)object).get(n4);
        object2 = ((tm2)object).a;
        n3 = ((tm2)object).b(n3);
        long l2 = object2.d(n3);
        return ((tm2)object).a(l2, false);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TextLayoutResult(layoutInput=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", multiParagraph=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", size=");
        object = bj1.e(this.c);
        stringBuilder.append(object);
        stringBuilder.append(", firstBaseline=");
        float f5 = this.d;
        stringBuilder.append(f5);
        stringBuilder.append(", lastBaseline=");
        f5 = this.e;
        stringBuilder.append(f5);
        stringBuilder.append(", placeholderRects=");
        object = this.f;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

