/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.text.modifiers;

import kotlin.jvm.internal.Intrinsics;

public final class TextStringSimpleElement
extends up1_0 {
    public final String b;
    public final xm3 c;
    public final RU0$a d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final gy_1 i;

    public TextStringSimpleElement(String string2, xm3 xm32, RU0$a rU0$a, int n3, boolean bl2, int n4, int n7, gy_1 gy_12) {
        this.b = string2;
        this.c = xm32;
        this.d = rU0$a;
        this.e = n3;
        this.f = bl2;
        this.g = n4;
        this.h = n7;
        this.i = gy_12;
    }

    public final LP1$c b() {
        int n3;
        wm3 wm32 = new LP1$c();
        Object object = this.b;
        wm32.n = object;
        wm32.o = object = this.c;
        wm32.p = object = this.d;
        wm32.q = n3 = this.e;
        n3 = (int)(this.f ? 1 : 0);
        wm32.r = n3;
        wm32.s = n3 = this.g;
        wm32.t = n3 = this.h;
        wm32.u = object = this.i;
        return wm32;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof TextStringSimpleElement;
        if (n3 == 0) {
            return false;
        }
        object = (TextStringSimpleElement)object;
        Object object2 = this.i;
        Object object3 = ((TextStringSimpleElement)object).i;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object3 = this.b;
        object2 = ((TextStringSimpleElement)object).b;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.c;
        object2 = ((TextStringSimpleElement)object).c;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.d;
        object2 = ((TextStringSimpleElement)object).d;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        n3 = this.e;
        int n4 = ((TextStringSimpleElement)object).e;
        if ((n3 = (int)(km3.b(n3, n4) ? 1 : 0)) == 0) {
            return false;
        }
        n3 = (int)(this.f ? 1 : 0);
        n4 = (int)(((TextStringSimpleElement)object).f ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = this.g;
        n4 = ((TextStringSimpleElement)object).g;
        if (n3 != n4) {
            return false;
        }
        n3 = this.h;
        int n7 = ((TextStringSimpleElement)object).h;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.b.hashCode() * 31;
        Object object = this.c;
        int n4 = (((xm3)object).hashCode() + n3) * 31;
        RU0$a rU0$a = this.d;
        n3 = (rU0$a.hashCode() + n4) * 31;
        n4 = this.e;
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.f ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        n3 = (n3 + n4) * 31;
        n4 = this.g;
        n3 = (n3 + n4) * 31;
        n4 = this.h;
        n3 = (n3 + n4) * 31;
        object = this.i;
        if (object != null) {
            n4 = object.hashCode();
        } else {
            n4 = 0;
            object = null;
        }
        return n3 + n4;
    }

    public final void j(LP1$c lP1$c) {
        Object object;
        Object object2;
        Object object3;
        boolean bl2;
        int n3;
        boolean bl3;
        Object object4;
        block16: {
            block13: {
                Object object5;
                block15: {
                    block14: {
                        lP1$c = (wm3)lP1$c;
                        object5 = ((wm3)lP1$c).u;
                        object4 = this.i;
                        bl3 = Intrinsics.areEqual(object4, object5);
                        n3 = 1;
                        ((wm3)lP1$c).u = object4;
                        bl2 = false;
                        object4 = null;
                        object3 = this.c;
                        if (bl3 ^= n3) break block13;
                        object5 = ((wm3)lP1$c).o;
                        if (object3 == object5) break block14;
                        object2 = ((xm3)object3).a;
                        object5 = ((xm3)object5).a;
                        bl3 = ((S93)object2).b((S93)object5);
                        if (!bl3) break block13;
                        break block15;
                    }
                    object3.getClass();
                }
                bl3 = false;
                object5 = null;
                break block16;
            }
            bl3 = true;
        }
        object2 = ((wm3)lP1$c).n;
        Object object6 = this.b;
        boolean bl4 = Intrinsics.areEqual(object2, object6);
        if (bl4) {
            bl4 = false;
            object2 = null;
        } else {
            ((wm3)lP1$c).n = object6;
            ((wm3)lP1$c).y = null;
            bl4 = true;
        }
        object6 = ((wm3)lP1$c).o;
        int n4 = ((xm3)object6).c((xm3)object3) ^ n3;
        ((wm3)lP1$c).o = object3;
        int n7 = ((wm3)lP1$c).t;
        int n8 = this.h;
        if (n7 != n8) {
            ((wm3)lP1$c).t = n8;
            n4 = 1;
        }
        if ((n7 = ((wm3)lP1$c).s) != (n8 = this.g)) {
            ((wm3)lP1$c).s = n8;
            n4 = 1;
        }
        if ((n7 = (int)(((wm3)lP1$c).r ? 1 : 0)) != (n8 = (int)(this.f ? 1 : 0))) {
            ((wm3)lP1$c).r = n8;
            n4 = 1;
        }
        if ((n7 = (int)(Intrinsics.areEqual(object3 = ((wm3)lP1$c).p, object = this.d) ? 1 : 0)) == 0) {
            ((wm3)lP1$c).p = object;
            n4 = 1;
        }
        n7 = ((wm3)lP1$c).q;
        n8 = this.e;
        if ((n7 = (int)(km3.b(n7, n8) ? 1 : 0)) == 0) {
            ((wm3)lP1$c).q = n8;
        } else {
            n3 = n4;
        }
        if (bl4 || n3 != 0) {
            long l2;
            object3 = ((wm3)lP1$c).s1();
            object6 = ((wm3)lP1$c).n;
            object = ((wm3)lP1$c).o;
            RU0$a rU0$a = ((wm3)lP1$c).p;
            int n10 = ((wm3)lP1$c).q;
            boolean bl5 = ((wm3)lP1$c).r;
            int n14 = ((wm3)lP1$c).s;
            int n15 = ((wm3)lP1$c).t;
            ((xm2_0)object3).a = object6;
            ((xm2_0)object3).b = object;
            ((xm2_0)object3).c = rU0$a;
            ((xm2_0)object3).d = n10;
            ((xm2_0)object3).e = bl5;
            ((xm2_0)object3).f = n14;
            ((xm2_0)object3).g = n15;
            ((xm2_0)object3).j = null;
            ((xm2_0)object3).n = null;
            ((xm2_0)object3).o = null;
            ((xm2_0)object3).q = n4 = -1;
            ((xm2_0)object3).r = n4;
            ((xm2_0)object3).p = l2 = f60.i(0, 0, 0, 0);
            ((xm2_0)object3).l = l2 = dj1.a(0, 0);
            ((xm2_0)object3).k = false;
        }
        if (bl2 = lP1$c.m) {
            if (bl4 || bl3 && (object4 = ((wm3)lP1$c).x) != null) {
                object4 = go0.f(lP1$c);
                ((xp1_0)object4).J();
            }
            if (bl4 || n3 != 0) {
                object4 = go0.f(lP1$c);
                ((xp1_0)object4).I();
                jt0_0.a((it0_0)((Object)lP1$c));
            }
            if (bl3) {
                jt0_0.a((it0_0)((Object)lP1$c));
            }
        }
    }
}

