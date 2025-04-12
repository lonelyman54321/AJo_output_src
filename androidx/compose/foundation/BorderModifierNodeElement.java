/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation;

import kotlin.jvm.internal.Intrinsics;

public final class BorderModifierNodeElement
extends up1_0 {
    public final float b;
    public final ZD c;
    public final i13 d;

    public BorderModifierNodeElement(float f5, ZD zD, i13 i132) {
        this.b = f5;
        this.c = zD;
        this.d = i132;
    }

    public final LP1$c b() {
        ZD zD = this.c;
        i13 i132 = this.d;
        float f5 = this.b;
        mz_1 mz_12 = new mz_1(f5, zD, i132);
        return mz_12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BorderModifierNodeElement;
        if (!bl3) {
            return false;
        }
        object = (BorderModifierNodeElement)object;
        float f5 = this.b;
        float f6 = ((BorderModifierNodeElement)object).b;
        bl3 = xs0_0.a(f5, f6);
        if (!bl3) {
            return false;
        }
        Object object2 = this.c;
        ZD zD = ((BorderModifierNodeElement)object).c;
        bl3 = Intrinsics.areEqual(object2, zD);
        if (!bl3) {
            return false;
        }
        object2 = this.d;
        object = ((BorderModifierNodeElement)object).d;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.b) * 31;
        int n4 = (this.c.hashCode() + n3) * 31;
        return this.d.hashCode() + n4;
    }

    public final void j(LP1$c lP1$c) {
        Object object;
        Object object2;
        lP1$c = (mz_1)lP1$c;
        float f5 = ((mz_1)lP1$c).q;
        float f6 = this.b;
        boolean bl2 = xs0_0.a(f5, f6);
        ui_0 ui_02 = ((mz_1)lP1$c).t;
        if (!bl2) {
            ((mz_1)lP1$c).q = f6;
            ui_02.q0();
        }
        if (!(bl2 = Intrinsics.areEqual(object2 = ((mz_1)lP1$c).r, object = this.c))) {
            ((mz_1)lP1$c).r = object;
            ui_02.q0();
        }
        if (!(bl2 = Intrinsics.areEqual(object2 = ((mz_1)lP1$c).s, object = this.d))) {
            ((mz_1)lP1$c).s = object;
            ui_02.q0();
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BorderModifierNodeElement(width=");
        Object object = xs0_0.b(this.b);
        stringBuilder.append(object);
        stringBuilder.append(", brush=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", shape=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

