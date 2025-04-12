/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.relocation;

import kotlin.jvm.internal.Intrinsics;

final class BringIntoViewRequesterElement
extends up1_0 {
    public final MD b;

    public BringIntoViewRequesterElement(MD mD) {
        this.b = mD;
    }

    public final LP1$c b() {
        MD mD;
        OD oD = new LP1$c();
        oD.n = mD = this.b;
        return oD;
    }

    public final boolean equals(Object object) {
        MD mD;
        boolean bl2;
        boolean bl3;
        if (!(this == object || (bl3 = object instanceof BringIntoViewRequesterElement) && (bl2 = Intrinsics.areEqual(mD = this.b, object = ((BringIntoViewRequesterElement)object).b)))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void j(LP1$c lP1$c) {
        Object object;
        lP1$c = (OD)lP1$c;
        Object object2 = ((OD)lP1$c).n;
        boolean bl2 = object2 instanceof ND;
        if (bl2) {
            object = "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl";
            Intrinsics.checkNotNull(object2, (String)object);
            object2 = ((ND)object2).a;
            ((WR1)object2).m(lP1$c);
        }
        if (bl2 = (object2 = this.b) instanceof ND) {
            object = object2;
            object = ((ND)object2).a;
            ((WR1)object).b(lP1$c);
        }
        ((OD)lP1$c).n = (MD)object2;
    }
}

