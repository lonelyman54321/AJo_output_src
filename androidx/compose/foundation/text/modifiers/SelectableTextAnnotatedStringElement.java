/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.a;
import androidx.compose.foundation.text.modifiers.b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class SelectableTextAnnotatedStringElement
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

    public SelectableTextAnnotatedStringElement() {
        throw null;
    }

    public SelectableTextAnnotatedStringElement(Sl sl, xm3 xm32, RU0$a rU0$a, Function1 function1, int n3, boolean bl2, int n4, int n7, List list, Function1 function12, UX2 uX2, gy_1 gy_12) {
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
        this.l = uX2;
        this.m = gy_12;
    }

    public final LP1$c b() {
        Function1 function1 = this.k;
        UX2 uX2 = this.l;
        Sl sl = this.b;
        xm3 xm32 = this.c;
        RU0$a rU0$a = this.d;
        Function1 function12 = this.e;
        int n3 = this.f;
        boolean bl2 = this.g;
        int n4 = this.h;
        int n7 = this.i;
        List list = this.j;
        gy_1 gy_12 = this.m;
        a a2 = new a(sl, xm32, rU0$a, function12, n3, bl2, n4, n7, list, function1, uX2, gy_12);
        return a2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof SelectableTextAnnotatedStringElement;
        if (n3 == 0) {
            return false;
        }
        object = (SelectableTextAnnotatedStringElement)object;
        Object object2 = this.m;
        Object object3 = ((SelectableTextAnnotatedStringElement)object).m;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object3 = this.b;
        object2 = ((SelectableTextAnnotatedStringElement)object).b;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.c;
        object2 = ((SelectableTextAnnotatedStringElement)object).c;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.j;
        object2 = ((SelectableTextAnnotatedStringElement)object).j;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.d;
        object2 = ((SelectableTextAnnotatedStringElement)object).d;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.e;
        object2 = ((SelectableTextAnnotatedStringElement)object).e;
        if (object3 != object2) {
            return false;
        }
        n3 = this.f;
        int n4 = ((SelectableTextAnnotatedStringElement)object).f;
        if ((n3 = (int)(km3.b(n3, n4) ? 1 : 0)) == 0) {
            return false;
        }
        n3 = (int)(this.g ? 1 : 0);
        n4 = (int)(((SelectableTextAnnotatedStringElement)object).g ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        n3 = this.h;
        n4 = ((SelectableTextAnnotatedStringElement)object).h;
        if (n3 != n4) {
            return false;
        }
        n3 = this.i;
        n4 = ((SelectableTextAnnotatedStringElement)object).i;
        if (n3 != n4) {
            return false;
        }
        object3 = this.k;
        object2 = ((SelectableTextAnnotatedStringElement)object).k;
        if (object3 != object2) {
            return false;
        }
        object3 = this.l;
        object = ((SelectableTextAnnotatedStringElement)object).l;
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
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void j(LP1$c lP1$c) {
        Object object;
        boolean bl2;
        boolean bl3;
        Object object2;
        b b2;
        block0: {
            block2: {
                block1: {
                    lP1$c = (a)lP1$c;
                    b2 = ((a)lP1$c).r;
                    object2 = b2.y;
                    Object object3 = this.m;
                    bl3 = Intrinsics.areEqual(object3, object2);
                    bl2 = true;
                    b2.y = object3;
                    object = this.c;
                    if (bl3 ^= bl2) break block0;
                    object2 = b2.o;
                    if (object == object2) break block1;
                    object3 = ((xm3)object).a;
                    object2 = ((xm3)object2).a;
                    bl3 = ((S93)object3).b((S93)object2);
                    if (!bl3) break block0;
                    break block2;
                }
                object.getClass();
            }
            bl2 = false;
        }
        object2 = this.b;
        bl3 = b2.x1((Sl)object2);
        int n3 = this.h;
        boolean bl4 = this.g;
        Object object4 = ((a)lP1$c).r;
        Object object5 = this.j;
        int n4 = this.i;
        RU0$a rU0$a = this.d;
        int n7 = this.f;
        boolean bl5 = ((b)object4).w1((xm3)object, (List)object5, n4, n3, bl4, rU0$a, n7);
        object4 = ((a)lP1$c).q;
        object = this.e;
        object5 = this.k;
        UX2 uX2 = this.l;
        boolean bl6 = b2.v1((Function1)object, (Function1)object5, uX2, (Function1)object4);
        b2.s1(bl2, bl3, bl5, bl6);
        ((a)lP1$c).p = uX2;
        go0.f(lP1$c).I();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SelectableTextAnnotatedStringElement(text=");
        Object object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", style=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", fontFamilyResolver=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", onTextLayout=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(", overflow=");
        object = km3.c(this.f);
        stringBuilder.append(object);
        stringBuilder.append(", softWrap=");
        int n3 = this.g;
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", maxLines=");
        n3 = this.h;
        stringBuilder.append(n3);
        stringBuilder.append(", minLines=");
        n3 = this.i;
        stringBuilder.append(n3);
        stringBuilder.append(", placeholders=");
        object = this.j;
        stringBuilder.append(object);
        stringBuilder.append(", onPlaceholderLayout=");
        object = this.k;
        stringBuilder.append(object);
        stringBuilder.append(", selectionController=");
        object = this.l;
        stringBuilder.append(object);
        stringBuilder.append(", color=");
        object = this.m;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

