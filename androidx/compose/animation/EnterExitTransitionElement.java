/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.animation;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

final class EnterExitTransitionElement
extends up1_0 {
    public final gr3 b;
    public final gr3$a c;
    public final gr3$a d;
    public final gr3$a e;
    public final yA0 f;
    public final JE0 g;
    public final Function0 h;
    public final X01 i;

    public EnterExitTransitionElement(gr3 gr32, gr3$a gr3$a, gr3$a gr3$a2, gr3$a gr3$a3, yA0 yA02, JE0 jE0, Function0 function0, X01 x01) {
        this.b = gr32;
        this.c = gr3$a;
        this.d = gr3$a2;
        this.e = gr3$a3;
        this.f = yA02;
        this.g = jE0;
        this.h = function0;
        this.i = x01;
    }

    public final LP1$c b() {
        yA0 yA02 = this.f;
        JE0 jE0 = this.g;
        gr3 gr32 = this.b;
        gr3$a gr3$a = this.c;
        gr3$a gr3$a2 = this.d;
        gr3$a gr3$a3 = this.e;
        Function0 function0 = this.h;
        X01 x01 = this.i;
        xA0 xA02 = new xA0(gr32, gr3$a, gr3$a2, gr3$a3, yA02, jE0, function0, x01);
        return xA02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof EnterExitTransitionElement;
        if (!bl3) {
            return false;
        }
        object = (EnterExitTransitionElement)object;
        Object object2 = this.b;
        Object object3 = ((EnterExitTransitionElement)object).b;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((EnterExitTransitionElement)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        object2 = ((EnterExitTransitionElement)object).d;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.e;
        object2 = ((EnterExitTransitionElement)object).e;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.f;
        object2 = ((EnterExitTransitionElement)object).f;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.g;
        object2 = ((EnterExitTransitionElement)object).g;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.h;
        object2 = ((EnterExitTransitionElement)object).h;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.i;
        object = ((EnterExitTransitionElement)object).i;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        gr3 gr32 = this.b;
        int n4 = gr32.hashCode() * 31;
        int n7 = 0;
        gr3$a gr3$a = this.c;
        if (gr3$a == null) {
            n3 = 0;
            gr3$a = null;
        } else {
            n3 = gr3$a.hashCode();
        }
        n4 = (n4 + n3) * 31;
        gr3$a = this.d;
        if (gr3$a == null) {
            n3 = 0;
            gr3$a = null;
        } else {
            n3 = gr3$a.hashCode();
        }
        n4 = (n4 + n3) * 31;
        gr3$a = this.e;
        if (gr3$a != null) {
            n7 = gr3$a.hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = (this.f.hashCode() + n4) * 31;
        n4 = (this.g.hashCode() + n7) * 31;
        n7 = (this.h.hashCode() + n4) * 31;
        return this.i.hashCode() + n7;
    }

    public final void j(LP1$c lP1$c) {
        lP1$c = (xA0)lP1$c;
        Object object = this.b;
        ((xA0)lP1$c).n = object;
        ((xA0)lP1$c).o = object = this.c;
        ((xA0)lP1$c).p = object = this.d;
        ((xA0)lP1$c).q = object = this.e;
        ((xA0)lP1$c).r = object = this.f;
        ((xA0)lP1$c).s = object = this.g;
        ((xA0)lP1$c).t = object = this.h;
        ((xA0)lP1$c).u = object = this.i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("EnterExitTransitionElement(transition=");
        Object object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", sizeAnimation=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", offsetAnimation=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", slideAnimation=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(", enter=");
        object = this.f;
        stringBuilder.append(object);
        stringBuilder.append(", exit=");
        object = this.g;
        stringBuilder.append(object);
        stringBuilder.append(", isEnabled=");
        object = this.h;
        stringBuilder.append(object);
        stringBuilder.append(", graphicsLayerBlock=");
        object = this.i;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

