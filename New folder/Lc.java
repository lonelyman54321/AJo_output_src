/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class Lc
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
            ((G50)object).g();
            Object object2 = this.N;
            boolean bl3 = false;
            float f7 = 0.0f;
            Fb3$b fb3$b = null;
            if (object2 != null) {
                ((G50)object).o(object2);
            } else {
                object2 = this.O;
                if (object2 != null) {
                    Fb3$b fb3$b2;
                    ((G50)object).d0 = fb3$b2 = Fb3$b.START_TO_END;
                    ((G50)object).O = object2;
                } else {
                    object2 = 0;
                    ((G50)object).o(object2);
                }
            }
            object2 = this.P;
            if (object2 != null) {
                ((G50)object).d0 = fb3$b = Fb3$b.END_TO_START;
                ((G50)object).P = object2;
            } else {
                object2 = this.Q;
                if (object2 != null) {
                    ((G50)object).i(object2);
                } else {
                    object2 = 0;
                    ((G50)object).i(object2);
                }
            }
            if (!(bl3 = (f6 = (f5 = this.n0) - (f7 = 0.5f)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) continue;
            ((G50)object).h = f5;
        }
    }
}

