/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DraggableElement$a;
import androidx.compose.foundation.gestures.b;
import androidx.compose.foundation.gestures.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class DraggableElement
extends up1_0 {
    public static final DraggableElement$a j = DraggableElement$a.c;
    public final at0 b;
    public final pg2_0 c;
    public final boolean d;
    public final wr1_1 e;
    public final boolean f;
    public final gx0_2 g;
    public final gx0_2 h;
    public final boolean i;

    public DraggableElement(at0 at02, pg2_0 pg2_02, boolean bl2, wr1_1 wr1_12, boolean bl3, gx0_2 gx0_22, gx0_2 gx0_23, boolean bl4) {
        this.b = at02;
        this.c = pg2_02;
        this.d = bl2;
        this.e = wr1_12;
        this.f = bl3;
        this.g = gx0_22;
        this.h = gx0_23;
        this.i = bl4;
    }

    public final LP1$c b() {
        boolean bl2;
        Object object = j;
        boolean bl3 = this.d;
        wr1_1 wr1_12 = this.e;
        pg2_0 pg2_02 = this.c;
        h h3 = new b((Function1)object, bl3, wr1_12, pg2_02);
        h3.x = object = this.b;
        h3.y = pg2_02;
        h3.z = bl2 = this.f;
        h3.A = object = this.g;
        h3.B = object = this.h;
        h3.C = bl2 = this.i;
        return h3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object == null) {
            return false;
        }
        Object object2 = DraggableElement.class;
        Object object3 = object.getClass();
        if (object2 != object3) {
            return false;
        }
        object = (DraggableElement)object;
        object3 = this.b;
        object2 = ((DraggableElement)object).b;
        boolean bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((DraggableElement)object).c;
        if (object3 != object2) {
            return false;
        }
        bl3 = this.d;
        boolean bl4 = ((DraggableElement)object).d;
        if (bl3 != bl4) {
            return false;
        }
        object3 = this.e;
        object2 = ((DraggableElement)object).e;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        bl3 = this.f;
        bl4 = ((DraggableElement)object).f;
        if (bl3 != bl4) {
            return false;
        }
        object3 = this.g;
        object2 = ((DraggableElement)object).g;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.h;
        object2 = ((DraggableElement)object).h;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        bl3 = this.i;
        boolean bl5 = ((DraggableElement)object).i;
        if (bl3 != bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        at0 at02 = this.b;
        int n3 = at02.hashCode() * 31;
        Object object = this.c;
        int n4 = (object.hashCode() + n3) * 31;
        n3 = 1237;
        int n7 = this.d;
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        Object object2 = this.e;
        if (object2 != null) {
            n7 = object2.hashCode();
        } else {
            n7 = 0;
            object2 = null;
        }
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.f ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        object2 = this.g;
        n7 = (object2.hashCode() + n4) * 31;
        object = this.h;
        n4 = (object.hashCode() + n7) * 31;
        n7 = (int)(this.i ? 1 : 0);
        if (n7 != 0) {
            n3 = 1231;
        }
        return n4 + n3;
    }

    public final void j(LP1$c object) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        LP1$c lP1$c = object;
        lP1$c = (h)object;
        object = ((h)lP1$c).x;
        Object object2 = this.b;
        boolean bl5 = Intrinsics.areEqual(object, object2);
        boolean bl6 = true;
        if (!bl5) {
            ((h)lP1$c).x = object2;
            bl5 = true;
        } else {
            bl5 = false;
            object = null;
        }
        object2 = ((h)lP1$c).y;
        pg2_0 pg2_02 = this.c;
        if (object2 != pg2_02) {
            ((h)lP1$c).y = pg2_02;
            bl5 = true;
        }
        if ((bl4 = ((h)lP1$c).C) != (bl3 = this.i)) {
            ((h)lP1$c).C = bl3;
            bl2 = true;
        } else {
            bl2 = bl5;
        }
        ((h)lP1$c).A = object = this.g;
        ((h)lP1$c).B = object = this.h;
        ((h)lP1$c).z = bl5 = this.f;
        bl6 = this.d;
        wr1_1 wr1_12 = this.e;
        object2 = j;
        ((b)lP1$c).C1((Function1)object2, bl6, wr1_12, pg2_02, bl2);
    }
}

