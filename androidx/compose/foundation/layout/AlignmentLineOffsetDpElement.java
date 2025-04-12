/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

final class AlignmentLineOffsetDpElement
extends up1_0 {
    public final Oc b;
    public final float c;
    public final float d;
    public final Function1 e;

    public AlignmentLineOffsetDpElement() {
        throw null;
    }

    public AlignmentLineOffsetDpElement(Oc object, float f5, float f6, Function1 function1) {
        float f7;
        int n3;
        this.b = object;
        this.c = f5;
        this.d = f6;
        this.e = function1;
        int n4 = 2143289344;
        float f8 = 0.0f / 0.0f;
        function1 = null;
        float f11 = f5 - 0.0f;
        float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (f12 < 0 && (n3 = xs0_0.a(f5, f8)) == 0 || (n3 = (f7 = f6 - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) < 0 && (n4 = (int)(xs0_0.a(f6, f8) ? 1 : 0)) == 0) {
            String string2 = "Padding from alignment line must be a non-negative number".toString();
            object = new IllegalArgumentException(string2);
            throw object;
        }
    }

    public final LP1$c b() {
        float f5;
        Oc oc;
        Rc rc = new LP1$c();
        rc.n = oc = this.b;
        rc.o = f5 = this.c;
        rc.p = f5 = this.d;
        return rc;
    }

    public final boolean equals(Object object) {
        float f5;
        float f6;
        float f7;
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof AlignmentLineOffsetDpElement;
        if (bl4) {
            object = (AlignmentLineOffsetDpElement)object;
        } else {
            bl2 = false;
            f7 = 0.0f;
            object = null;
        }
        bl4 = false;
        if (object == null) {
            return false;
        }
        Oc oc = this.b;
        Oc oc2 = ((AlignmentLineOffsetDpElement)object).b;
        boolean bl5 = Intrinsics.areEqual(oc, oc2);
        if (!(bl5 && (bl5 = xs0_0.a(f6 = this.c, f5 = ((AlignmentLineOffsetDpElement)object).c)) && (bl2 = xs0_0.a(f6 = this.d, f7 = ((AlignmentLineOffsetDpElement)object).d)))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        int n3 = this.b.hashCode() * 31;
        n3 = UR0.a(this.c, n3, 31);
        return Float.floatToIntBits(this.d) + n3;
    }

    public final void j(LP1$c lP1$c) {
        float f5;
        Oc oc;
        lP1$c = (Rc)lP1$c;
        ((Rc)lP1$c).n = oc = this.b;
        ((Rc)lP1$c).o = f5 = this.c;
        ((Rc)lP1$c).p = f5 = this.d;
    }
}

