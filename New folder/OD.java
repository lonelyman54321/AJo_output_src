/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class OD
extends LP1$c {
    public MD n;

    public final boolean g1() {
        return false;
    }

    public final void j1() {
        Object object;
        MD mD = this.n;
        boolean bl2 = mD instanceof ND;
        if (bl2) {
            Intrinsics.checkNotNull(mD, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            object = mD;
            object = ((ND)mD).a;
            ((WR1)object).m(this);
        }
        if (bl2 = mD instanceof ND) {
            object = mD;
            object = ((ND)mD).a;
            ((WR1)object).b(this);
        }
        this.n = mD;
    }

    public final void k1() {
        Object object = this.n;
        boolean bl2 = object instanceof ND;
        if (bl2) {
            String string2 = "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl";
            Intrinsics.checkNotNull(object, string2);
            object = ((ND)object).a;
            ((WR1)object).m(this);
        }
    }
}

