/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation;

import kotlin.jvm.internal.Intrinsics;

final class IndicationModifierElement
extends up1_0 {
    public final wr1_1 b;
    public final Qg1 c;

    public IndicationModifierElement(wr1_1 wr1_12, Qg1 qg1) {
        this.b = wr1_12;
        this.c = qg1;
    }

    public final LP1$c b() {
        Object object = this.c;
        wr1_1 wr1_12 = this.b;
        object = object.a(wr1_12);
        pg1_0 pg1_02 = new mo0_0();
        pg1_02.p = object;
        pg1_02.r1((fo0)object);
        return pg1_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof IndicationModifierElement;
        if (!bl3) {
            return false;
        }
        object = (IndicationModifierElement)object;
        wr1_1 wr1_12 = this.b;
        Object object2 = ((IndicationModifierElement)object).b;
        bl3 = Intrinsics.areEqual(wr1_12, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.c;
        object = ((IndicationModifierElement)object).c;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.b.hashCode() * 31;
        return this.c.hashCode() + n3;
    }

    public final void j(LP1$c lP1$c) {
        lP1$c = (pg1_0)lP1$c;
        Object object = this.c;
        Object object2 = this.b;
        object = object.a((wr1_1)object2);
        object2 = ((pg1_0)lP1$c).p;
        ((mo0_0)lP1$c).s1((fo0)object2);
        ((pg1_0)lP1$c).p = object;
        ((mo0_0)lP1$c).r1((fo0)object);
    }
}

