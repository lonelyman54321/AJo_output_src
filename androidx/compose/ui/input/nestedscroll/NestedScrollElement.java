/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.input.nestedscroll;

import kotlin.jvm.internal.Intrinsics;

final class NestedScrollElement
extends up1_0 {
    public final oU1 b;
    public final pU1 c;

    public NestedScrollElement(oU1 oU12, pU1 pU12) {
        this.b = oU12;
        this.c = pU12;
    }

    public final LP1$c b() {
        oU1 oU12 = this.b;
        pU1 pU12 = this.c;
        ru1_0 ru1_02 = new ru1_0(oU12, pU12);
        return ru1_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof NestedScrollElement;
        if (!bl2) {
            return false;
        }
        object = (NestedScrollElement)object;
        Object object2 = ((NestedScrollElement)object).b;
        oU1 oU12 = this.b;
        bl2 = Intrinsics.areEqual(object2, oU12);
        if (!bl2) {
            return false;
        }
        object = ((NestedScrollElement)object).c;
        object2 = this.c;
        boolean bl3 = Intrinsics.areEqual(object, object2);
        return bl3;
    }

    public final int hashCode() {
        int n3;
        oU1 oU12 = this.b;
        int n4 = oU12.hashCode() * 31;
        pU1 pU12 = this.c;
        if (pU12 != null) {
            n3 = pU12.hashCode();
        } else {
            n3 = 0;
            pU12 = null;
        }
        return n4 + n3;
    }

    public final void j(LP1$c object) {
        boolean bl2;
        object = (ru1_0)object;
        Object object2 = this.b;
        ((ru1_0)object).n = object2;
        object2 = ((ru1_0)object).o;
        Object object3 = ((pU1)object2).a;
        if (object3 == object) {
            object3 = null;
            ((pU1)object2).a = null;
        }
        if ((object3 = this.c) == null) {
            ((ru1_0)object).o = object2 = new pU1();
        } else {
            bl2 = Intrinsics.areEqual(object3, object2);
            if (!bl2) {
                ((ru1_0)object).o = object3;
            }
        }
        bl2 = ((LP1$c)object).m;
        if (bl2) {
            object2 = ((ru1_0)object).o;
            ((pU1)object2).a = object;
            ((pU1)object2).b = object3 = new su1_0(object, 0);
            object2 = ((ru1_0)object).o;
            ((pU1)object2).c = object = ((LP1$c)object).f1();
        }
    }
}

