/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class TextAnnotatedStringElement
extends up1_0 {
    public final Sl b;
    public final xm3 c;
    public final RU0$a d;
    public final Function1 e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;
    public final List j;
    public final Function1 k;
    public final UX2 l;
    public final gy_1 m;
    public final Function1 n;

    public TextAnnotatedStringElement() {
        throw null;
    }

    public TextAnnotatedStringElement(Sl sl, xm3 xm32, RU0$a rU0$a, Function1 function1, int n3, boolean bl2, int n4, int n7, List list, Function1 function12, gy_1 gy_12, Function1 function13) {
        this.b = sl;
        this.c = xm32;
        this.d = rU0$a;
        this.e = function1;
        this.f = n3;
        this.g = bl2;
        this.h = n4;
        this.i = n7;
        this.j = list;
        this.k = function12;
        this.l = null;
        this.m = gy_12;
        this.n = function13;
    }

    public final LP1$c b() {
        Function1 function1 = this.k;
        Function1 function12 = this.n;
        Sl sl = this.b;
        xm3 xm32 = this.c;
        RU0$a rU0$a = this.d;
        Function1 function13 = this.e;
        int n3 = this.f;
        boolean bl2 = this.g;
        int n4 = this.h;
        int n7 = this.i;
        List list = this.j;
        UX2 uX2 = this.l;
        gy_1 gy_12 = this.m;
        b b2 = new b(sl, xm32, rU0$a, function13, n3, bl2, n4, n7, list, function1, uX2, gy_12, function12);
        return b2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof TextAnnotatedStringElement;
        if (n3 == 0) {
            return false;
        }
        object = (TextAnnotatedStringElement)object;
        Object object2 = this.m;
        Object object3 = ((TextAnnotatedStringElement)object).m;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object3 = this.b;
        object2 = ((TextAnnotatedStringElement)object).b;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.c;
        object2 = ((TextAnnotatedStringElement)object).c;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.j;
        object2 = ((TextAnnotatedStringElement)object).j;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.d;
        object2 = ((TextAnnotatedStringElement)object).d;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.e;
        object2 = ((TextAnnotatedStringElement)object).e;
        if (object3 != object2) {
            return false;
        }
        object3 = this.n;
        object2 = ((TextAnnotatedStringElement)object).n;
        if (object3 != object2) {
            return false;
        }
        n3 = this.f;
        int n4 = ((TextAnnotatedStringElement)object).f;
        if ((n3 = (int)(km3.b(n3, n4) ? 1 : 0)) == 0) {
            return false;
        }
        n3 = (int)(this.g ? 1 : 0);
        n4 = (int)(((TextAnnotatedStringElement)object).g ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = this.h;
        n4 = ((TextAnnotatedStringElement)object).h;
        if (n3 != n4) {
            return false;
        }
        n3 = this.i;
        n4 = ((TextAnnotatedStringElement)object).i;
        if (n3 != n4) {
            return false;
        }
        object3 = this.k;
        object2 = ((TextAnnotatedStringElement)object).k;
        if (object3 != object2) {
            return false;
        }
        object3 = this.l;
        object = ((TextAnnotatedStringElement)object).l;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.b.hashCode() * 31;
        int n7 = (this.c.hashCode() + n4) * 31;
        RU0$a rU0$a = this.d;
        n4 = (rU0$a.hashCode() + n7) * 31;
        n7 = 0;
        Object object = this.e;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        n3 = this.f;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.g ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        n3 = this.h;
        n4 = (n4 + n3) * 31;
        n3 = this.i;
        n4 = (n4 + n3) * 31;
        object = this.j;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.k;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.l;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.m;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.n;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void j(LP1$c lP1$c) {
        boolean bl2;
        Object object;
        boolean bl3;
        Object object2;
        Object object3;
        block3: {
            block0: {
                boolean bl4;
                block2: {
                    block1: {
                        lP1$c = (b)lP1$c;
                        object3 = ((b)lP1$c).y;
                        object2 = this.m;
                        bl3 = Intrinsics.areEqual(object2, object3);
                        bl4 = true;
                        ((b)lP1$c).y = object2;
                        if (bl3 ^= bl4) break block0;
                        object2 = this.c;
                        object3 = ((b)lP1$c).o;
                        if (object2 == object3) break block1;
                        object2 = ((xm3)object2).a;
                        object3 = ((xm3)object3).a;
                        bl3 = ((S93)object2).b((S93)object3);
                        if (!bl3) break block0;
                        break block2;
                    }
                    object2.getClass();
                }
                bl4 = false;
                object = null;
                bl2 = false;
                break block3;
            }
            bl2 = true;
        }
        object3 = this.b;
        boolean bl5 = ((b)lP1$c).x1((Sl)object3);
        RU0$a rU0$a = this.d;
        int n3 = this.f;
        object2 = this.c;
        object = this.j;
        int n4 = this.i;
        int n7 = this.h;
        boolean bl6 = this.g;
        object3 = lP1$c;
        bl3 = ((b)lP1$c).w1((xm3)object2, (List)object, n4, n7, bl6, rU0$a, n3);
        object2 = this.l;
        object = this.n;
        Function1 function1 = this.e;
        Function1 function12 = this.k;
        boolean bl7 = ((b)lP1$c).v1(function1, function12, (UX2)object2, (Function1)object);
        ((b)lP1$c).s1(bl2, bl5, bl3, bl7);
    }
}

