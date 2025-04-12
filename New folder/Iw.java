/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public abstract class Iw {
    public final Sl a;
    public final long b;
    public final Tl3 c;
    public final i72 d;
    public final lm3 e;
    public long f;
    public final Sl g;

    public Iw(Sl sl, long l2, Tl3 tl3, i72 i722, lm3 lm32) {
        this.a = sl;
        this.b = l2;
        this.c = tl3;
        this.d = i722;
        this.e = lm32;
        this.f = l2;
        this.g = sl;
    }

    public final Integer a() {
        Object object = this.c;
        if (object != null) {
            long l2 = this.f;
            int n3 = mm3.d(l2);
            i72 i722 = this.d;
            n3 = i722.b(n3);
            n3 = ((Tl3)object).f(n3);
            boolean bl2 = true;
            int n4 = ((Tl3)object).e(n3, bl2);
            n4 = i722.a(n4);
            object = n4;
        } else {
            boolean bl3 = false;
            object = null;
        }
        return object;
    }

    public final Integer b() {
        Object object = this.c;
        if (object != null) {
            long l2 = this.f;
            int n3 = mm3.e(l2);
            i72 i722 = this.d;
            n3 = i722.b(n3);
            n3 = ((Tl3)object).f(n3);
            int n4 = ((Tl3)object).i(n3);
            n4 = i722.a(n4);
            object = n4;
        } else {
            boolean bl2 = false;
            object = null;
        }
        return object;
    }

    public final Integer c() {
        Object object = this.c;
        if (object != null) {
            int n3;
            block5: {
                int n4;
                int n7 = this.x();
                while (true) {
                    CharSequence charSequence = this.a;
                    String string2 = ((Sl)charSequence).a;
                    n4 = string2.length();
                    if (n7 >= n4) {
                        object = ((Sl)charSequence).a;
                        n3 = ((String)object).length();
                        break block5;
                    }
                    charSequence = this.g.a;
                    int n8 = ((String)charSequence).length() + -1;
                    if (n7 <= n8) {
                        n8 = n7;
                    }
                    long l2 = ((Tl3)object).l(n8);
                    long l3 = 0xFFFFFFFFL;
                    n4 = (int)(l2 &= l3);
                    if (n4 > n7) break;
                    ++n7;
                }
                object = this.d;
                n3 = object.a(n4);
            }
            object = n3;
        } else {
            boolean bl2 = false;
            object = null;
        }
        return object;
    }

    public final Integer d() {
        Object object = this.c;
        if (object != null) {
            int n3;
            block5: {
                int n4;
                int n7 = this.x();
                while (true) {
                    if (n7 <= 0) {
                        n3 = 0;
                        object = null;
                        break block5;
                    }
                    String string2 = this.g.a;
                    int n8 = string2.length() + -1;
                    if (n7 <= n8) {
                        n8 = n7;
                    }
                    long l2 = ((Tl3)object).l(n8);
                    int n10 = mm3.c;
                    n10 = 32;
                    n4 = (int)(l2 >>= n10);
                    if (n4 < n7) break;
                    n7 += -1;
                }
                object = this.d;
                n3 = object.a(n4);
            }
            object = n3;
        } else {
            boolean bl2 = false;
            object = null;
        }
        return object;
    }

    public final boolean e() {
        boolean bl2;
        Object object = this.c;
        if (object != null) {
            int n3 = this.x();
            object = object.j(n3);
        } else {
            bl2 = false;
            object = null;
        }
        uk2_0 uk2_02 = uk2_0.Rtl;
        if (object != uk2_02) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final int f(Tl3 tl3, int n3) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f11;
        int n4 = this.x();
        Object object = this.e;
        Float f12 = ((lm3)object).a;
        if (f12 == null) {
            f11 = tl3.c((int)n4).a;
            ((lm3)object).a = f12 = Float.valueOf(f11);
        }
        if ((n4 = tl3.f(n4) + n3) < 0) {
            return 0;
        }
        RQ1 rQ1 = tl3.b;
        int n7 = rQ1.f;
        if (n4 >= n7) {
            return this.g.a.length();
        }
        f11 = rQ1.b(n4);
        boolean bl2 = true;
        float f14 = (float)bl2;
        f11 -= f14;
        object = ((lm3)object).a;
        Intrinsics.checkNotNull(object);
        f14 = ((Number)object).floatValue();
        int n8 = this.e();
        if (n8 != 0 && (n8 = (f8 = f14 - (f7 = tl3.h(n4))) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) >= 0 || (n8 = this.e()) == 0 && (f6 = (f5 = f14 - (f7 = tl3.g(n4))) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) <= 0) {
            return tl3.e(n4, bl2);
        }
        long l2 = h72.a(((Number)object).floatValue(), f11);
        int n10 = rQ1.e(l2);
        return this.d.a(n10);
    }

    public final void g() {
        lm3 lm32 = this.e;
        lm32.a = null;
        String string2 = this.g.a;
        int n3 = string2.length();
        if (n3 > 0) {
            n3 = this.e() ? 1 : 0;
            if (n3 != 0) {
                this.l();
            } else {
                this.i();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void h() {
        lm3 lm32 = this.e;
        lm32.a = null;
        String string2 = this.g.a;
        int n3 = string2.length();
        if (n3 > 0) {
            n3 = this.e() ? 1 : 0;
            if (n3 != 0) {
                this.n();
            } else {
                this.k();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void i() {
        CharSequence charSequence = this.g;
        lm3 lm32 = this.e;
        lm32.a = null;
        String string2 = charSequence.a;
        int n3 = string2.length();
        if (n3 > 0) {
            charSequence = charSequence.a;
            long l2 = this.f;
            long l3 = 0xFFFFFFFFL;
            int n4 = (int)(l2 &= l3);
            int n7 = ie3_1.b(n4, (String)charSequence);
            if (n7 != (n3 = -1)) {
                this.w(n7, n7);
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void j() {
        this.e.a = null;
        CharSequence charSequence = this.g;
        String string2 = ((Sl)charSequence).a;
        int n3 = string2.length();
        if (n3 > 0) {
            long l2;
            int n4;
            long l3 = this.f;
            n3 = mm3.d(l3);
            charSequence = ((Sl)charSequence).a;
            if ((n3 = lj_1.a(n3, charSequence)) == (n4 = mm3.d(l2 = this.f)) && n3 != (n4 = ((String)charSequence).length())) {
                n3 = lj_1.a(n3 + 1, charSequence);
            }
            this.w(n3, n3);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void k() {
        lm3 lm32 = this.e;
        lm32.a = null;
        Object object = this.g.a;
        int n3 = ((String)object).length();
        if (n3 > 0 && (object = this.c()) != null) {
            n3 = ((Number)object).intValue();
            this.w(n3, n3);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void l() {
        CharSequence charSequence = this.g;
        lm3 lm32 = this.e;
        lm32.a = null;
        String string2 = charSequence.a;
        int n3 = string2.length();
        if (n3 > 0) {
            charSequence = charSequence.a;
            long l2 = this.f;
            long l3 = 0xFFFFFFFFL;
            int n4 = (int)(l2 &= l3);
            int n7 = ie3_1.c(n4, (String)charSequence);
            if (n7 != (n3 = -1)) {
                this.w(n7, n7);
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void m() {
        this.e.a = null;
        CharSequence charSequence = this.g;
        String string2 = charSequence.a;
        int n3 = string2.length();
        if (n3 > 0) {
            long l2;
            int n4;
            long l3 = this.f;
            n3 = mm3.e(l3);
            charSequence = charSequence.a;
            if ((n3 = lj_1.b(n3, charSequence)) == (n4 = mm3.e(l2 = this.f)) && n3 != 0) {
                n3 = lj_1.b(n3 + -1, charSequence);
            }
            this.w(n3, n3);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void n() {
        lm3 lm32 = this.e;
        lm32.a = null;
        Object object = this.g.a;
        int n3 = ((String)object).length();
        if (n3 > 0 && (object = this.d()) != null) {
            n3 = ((Number)object).intValue();
            this.w(n3, n3);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void o() {
        lm3 lm32 = this.e;
        lm32.a = null;
        String string2 = this.g.a;
        int n3 = string2.length();
        if (n3 > 0) {
            n3 = this.e() ? 1 : 0;
            if (n3 != 0) {
                this.i();
            } else {
                this.l();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void p() {
        lm3 lm32 = this.e;
        lm32.a = null;
        String string2 = this.g.a;
        int n3 = string2.length();
        if (n3 > 0) {
            n3 = this.e() ? 1 : 0;
            if (n3 != 0) {
                this.k();
            } else {
                this.n();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void q() {
        int n3 = 0;
        this.e.a = null;
        CharSequence charSequence = this.g;
        String string2 = ((Sl)charSequence).a;
        int n4 = string2.length();
        if (n4 > 0) {
            charSequence = ((Sl)charSequence).a;
            n3 = ((String)charSequence).length();
            this.w(n3, n3);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void r() {
        lm3 lm32 = this.e;
        lm32.a = null;
        Object object = this.g.a;
        int n3 = ((String)object).length();
        if (n3 > 0 && (object = this.a()) != null) {
            n3 = ((Number)object).intValue();
            this.w(n3, n3);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void s() {
        lm3 lm32 = this.e;
        lm32.a = null;
        String string2 = this.g.a;
        int n3 = string2.length();
        if (n3 > 0) {
            n3 = this.e() ? 1 : 0;
            if (n3 != 0) {
                this.u();
            } else {
                this.r();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void t() {
        lm3 lm32 = this.e;
        lm32.a = null;
        String string2 = this.g.a;
        int n3 = string2.length();
        if (n3 > 0) {
            n3 = this.e() ? 1 : 0;
            if (n3 != 0) {
                this.r();
            } else {
                this.u();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void u() {
        lm3 lm32 = this.e;
        lm32.a = null;
        Object object = this.g.a;
        int n3 = ((String)object).length();
        if (n3 > 0 && (object = this.b()) != null) {
            n3 = ((Number)object).intValue();
            this.w(n3, n3);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void v() {
        String string2 = this.g.a;
        int n3 = string2.length();
        if (n3 > 0) {
            long l2;
            n3 = mm3.c;
            long l3 = this.b;
            int n4 = (int)(l3 >> 32);
            long l4 = this.f;
            long l7 = 0xFFFFFFFFL;
            n3 = (int)(l4 &= l7);
            this.f = l2 = nm3.a(n4, n3);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void w(int n3, int n4) {
        long l2;
        this.f = l2 = nm3.a(n3, n4);
    }

    public final int x() {
        long l2 = this.f;
        int n3 = (int)(l2 & 0xFFFFFFFFL);
        return this.d.b(n3);
    }
}

