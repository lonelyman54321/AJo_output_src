/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.BoxChildDataElement;

public final class d
implements KA {
    public static final d a;

    static {
        d d2;
        a = d2 = new Object();
    }

    public final LP1 a(LP1 lP1, Nc nc) {
        ji1$a ji1$a = ji1.a;
        BoxChildDataElement boxChildDataElement = new BoxChildDataElement(nc, false, ji1$a);
        return lP1.then(boxChildDataElement);
    }

    public final LP1 e(LP1 lP1) {
        Gx gx = Nc$a.e;
        ji1$a ji1$a = ji1.a;
        BoxChildDataElement boxChildDataElement = new BoxChildDataElement(gx, true, ji1$a);
        return lP1.then(boxChildDataElement);
    }
}

