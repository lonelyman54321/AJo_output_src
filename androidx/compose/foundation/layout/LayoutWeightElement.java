/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

public final class LayoutWeightElement
extends up1_0 {
    public final float b;
    public final boolean c;

    public LayoutWeightElement(float f5, boolean bl2) {
        this.b = f5;
        this.c = bl2;
    }

    public final LP1$c b() {
        boolean bl2;
        float f5;
        pq1_1 pq1_12 = new LP1$c();
        pq1_12.n = f5 = this.b;
        pq1_12.o = bl2 = this.c;
        return pq1_12;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof LayoutWeightElement;
        if (bl4) {
            object = (LayoutWeightElement)object;
        } else {
            bl2 = false;
            object = null;
        }
        bl4 = false;
        if (object == null) {
            return false;
        }
        float f5 = this.b;
        float f6 = ((LayoutWeightElement)object).b;
        float f7 = f5 - f6;
        Object object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object2 != false || (object2 = (Object)this.c) != (bl2 = ((LayoutWeightElement)object).c)) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        float f5 = this.b;
        int n3 = Float.floatToIntBits(f5) * 31;
        int n4 = this.c;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final void j(LP1$c lP1$c) {
        boolean bl2;
        float f5;
        lP1$c = (pq1_1)lP1$c;
        ((pq1_1)lP1$c).n = f5 = this.b;
        ((pq1_1)lP1$c).o = bl2 = this.c;
    }
}

