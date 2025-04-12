/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

final class FillElement
extends up1_0 {
    public final Hq0 b;
    public final float c;

    public FillElement(Hq0 hq0, float f5) {
        this.b = hq0;
        this.c = f5;
    }

    public final LP1$c b() {
        float f5;
        Hq0 hq0;
        tm0_0 tm0_02 = new LP1$c();
        tm0_02.n = hq0 = this.b;
        tm0_02.o = f5 = this.c;
        return tm0_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FillElement;
        if (!bl3) {
            return false;
        }
        object = (FillElement)object;
        Hq0 hq0 = this.b;
        Hq0 hq02 = ((FillElement)object).b;
        if (hq0 != hq02) {
            return false;
        }
        float f5 = this.c;
        float f6 = ((FillElement)object).c;
        float f7 = f5 - f6;
        Object object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object2 == false) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = ((Object)((Object)this.b)).hashCode() * 31;
        return Float.floatToIntBits(this.c) + n3;
    }

    public final void j(LP1$c lP1$c) {
        float f5;
        Hq0 hq0;
        lP1$c = (tm0_0)lP1$c;
        ((tm0_0)lP1$c).n = hq0 = this.b;
        ((tm0_0)lP1$c).o = f5 = this.c;
    }
}

