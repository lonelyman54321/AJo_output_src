/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation;

import androidx.compose.foundation.IndicationModifierElement;
import androidx.compose.foundation.f$a;

public final class f {
    public static final vc3_1 a;

    static {
        vc3_1 vc3_12;
        f$a f$a = f$a.c;
        a = vc3_12 = new H30(f$a);
    }

    public static final LP1 a(Lg1 lg1, wr1_1 wr1_12) {
        LP1 lP1 = LP1$a.b;
        if (lg1 == null) {
            return lP1;
        }
        boolean bl2 = lg1 instanceof Qg1;
        if (bl2) {
            lg1 = (Qg1)lg1;
            lP1 = new IndicationModifierElement(wr1_12, (Qg1)lg1);
            return lP1;
        }
        ji1$a ji1$a = ji1.a;
        Ng1 ng1 = new Ng1(lg1, wr1_12);
        return a30_0.a(lP1, ji1$a, ng1);
    }
}

