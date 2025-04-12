/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.b;
import androidx.compose.foundation.gestures.i;
import androidx.compose.foundation.gestures.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

final class ScrollableElement
extends up1_0 {
    public final dU2 b;
    public final pg2_0 c;
    public final Pg2 d;
    public final boolean e;
    public final boolean f;
    public final TR0 g;
    public final wr1_1 h;
    public final UD i;

    public ScrollableElement(UD uD, TR0 tR0, wr1_1 wr1_12, pg2_0 pg2_02, Pg2 pg2, dU2 dU22, boolean bl2, boolean bl3) {
        this.b = dU22;
        this.c = pg2_02;
        this.d = pg2;
        this.e = bl2;
        this.f = bl3;
        this.g = tR0;
        this.h = wr1_12;
        this.i = uD;
    }

    public final LP1$c b() {
        boolean bl2 = this.e;
        boolean bl3 = this.f;
        dU2 dU22 = this.b;
        Pg2 pg2 = this.d;
        TR0 tR0 = this.g;
        pg2_0 pg2_02 = this.c;
        wr1_1 wr1_12 = this.h;
        UD uD = this.i;
        l l2 = new l(uD, tR0, wr1_12, pg2_02, pg2, dU22, bl2, bl3);
        return l2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ScrollableElement;
        if (!bl3) {
            return false;
        }
        object = (ScrollableElement)object;
        Object object2 = this.b;
        Object object3 = ((ScrollableElement)object).b;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((ScrollableElement)object).c;
        if (object3 != object2) {
            return false;
        }
        object3 = this.d;
        object2 = ((ScrollableElement)object).d;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        bl3 = this.e;
        boolean bl4 = ((ScrollableElement)object).e;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.f;
        bl4 = ((ScrollableElement)object).f;
        if (bl3 != bl4) {
            return false;
        }
        object3 = this.g;
        object2 = ((ScrollableElement)object).g;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.h;
        object2 = ((ScrollableElement)object).h;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.i;
        object = ((ScrollableElement)object).i;
        boolean bl5 = Intrinsics.areEqual(object3, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.b.hashCode() * 31;
        pg2_0 pg2_02 = this.c;
        int n7 = (((Object)((Object)pg2_02)).hashCode() + n4) * 31;
        n4 = 0;
        Object object = this.d;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        n3 = 1237;
        int n8 = this.e;
        n8 = n8 != 0 ? 1231 : 1237;
        n7 = (n7 + n8) * 31;
        n8 = (int)(this.f ? 1 : 0);
        if (n8 != 0) {
            n3 = 1231;
        }
        n7 = (n7 + n3) * 31;
        object = this.g;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        object = this.h;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        object = this.i;
        if (object != null) {
            n4 = object.hashCode();
        }
        return n7 + n4;
    }

    public final void j(LP1$c object) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        Object object2;
        object = (l)object;
        boolean bl5 = ((b)object).r;
        boolean bl6 = this.e;
        boolean bl7 = false;
        float f5 = 0.0f;
        Object object3 = null;
        if (bl5 != bl6) {
            ((l)object).D.b = bl6;
            object2 = ((l)object).A;
            ((ut2_1)object2).o = bl6;
            bl4 = true;
        } else {
            bl4 = false;
        }
        object2 = this.g;
        Object object4 = object2 == null ? ((l)object).B : object2;
        ku2_0 ku2_02 = ((l)object).C;
        Object object5 = ku2_02.a;
        Object object6 = this.b;
        boolean bl8 = Intrinsics.areEqual(object5, object6);
        if (!bl8) {
            ku2_02.a = object6;
            bl7 = true;
            f5 = Float.MIN_VALUE;
        }
        ku2_02.b = object5 = this.d;
        object6 = ku2_02.d;
        pg2_0 pg2_02 = this.c;
        if (object6 != pg2_02) {
            ku2_02.d = pg2_02;
            bl7 = true;
            f5 = Float.MIN_VALUE;
        }
        if ((bl3 = ku2_02.e) != (bl2 = this.f)) {
            ku2_02.e = bl2;
            bl3 = true;
        } else {
            bl3 = bl7;
        }
        ku2_02.c = object4;
        Object object7 = ((l)object).z;
        ku2_02.f = object7;
        object7 = ((l)object).E;
        ((G60)object7).n = pg2_02;
        ((G60)object7).p = bl2;
        ((G60)object7).q = object3 = this.i;
        ((l)object).x = object5;
        ((l)object).y = object2;
        object7 = androidx.compose.foundation.gestures.i.a;
        object2 = ku2_02.d;
        object3 = pg2_0.Vertical;
        object4 = object2 == object3 ? object3 : (object2 = pg2_0.Horizontal);
        object3 = this.h;
        object2 = object;
        ((b)object).C1((Function1)object7, bl6, (wr1_1)object3, (pg2_0)((Object)object4), bl3);
        if (bl4) {
            bl5 = false;
            object2 = null;
            ((l)object).G = null;
            ((l)object).H = null;
            object = go0.f((fo0)object);
            ((xp1_0)object).J();
        }
    }
}

