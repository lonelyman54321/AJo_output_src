/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class Mc
extends D41 {
    public float n0;

    public final void apply() {
        boolean bl2;
        Iterator iterator = this.m0.iterator();
        while (bl2 = iterator.hasNext()) {
            float f5;
            float f6;
            Object object = iterator.next();
            object = this.k0.b(object);
            ((G50)object).h();
            Object object2 = this.R;
            boolean bl3 = false;
            float f7 = 0.0f;
            Fb3$b fb3$b = null;
            if (object2 != null) {
                ((G50)object).p(object2);
            } else {
                object2 = this.S;
                if (object2 != null) {
                    Fb3$b fb3$b2;
                    ((G50)object).d0 = fb3$b2 = Fb3$b.TOP_TO_BOTTOM;
                    ((G50)object).S = object2;
                } else {
                    object2 = 0;
                    ((G50)object).p(object2);
                }
            }
            object2 = this.U;
            if (object2 != null) {
                ((G50)object).d0 = fb3$b = Fb3$b.BOTTOM_TO_TOP;
                ((G50)object).U = object2;
            } else {
                object2 = this.V;
                if (object2 != null) {
                    ((G50)object).e(object2);
                } else {
                    object2 = 0;
                    ((G50)object).e(object2);
                }
            }
            if (!(bl3 = (f6 = (f5 = this.n0) - (f7 = 0.5f)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) continue;
            ((G50)object).i = f5;
        }
    }
}

