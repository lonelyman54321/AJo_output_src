/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation;

import androidx.compose.foundation.ClickableElement;
import androidx.compose.foundation.CombinedClickableElement;
import androidx.compose.foundation.b;
import androidx.compose.foundation.c;
import androidx.compose.foundation.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class d {
    public static LP1 a(LP1 lP1, wr1_1 object, Lg1 object2, boolean bl2, CP2 cP2, Function0 function0, int n3) {
        int n4 = n3 & 4;
        if (n4 != 0) {
            bl2 = true;
        }
        if ((n3 &= 0x10) != 0) {
            cP2 = null;
        }
        if ((n3 = object2 instanceof Qg1) != 0) {
            Lg1 lg1 = object2;
            lg1 = (Qg1)object2;
            object2 = new ClickableElement((wr1_1)object, (Qg1)lg1, bl2, null, cP2, function0);
        } else if (object2 == null) {
            Object var8_9 = null;
            object2 = new ClickableElement((wr1_1)object, null, bl2, null, cP2, function0);
        } else if (object != null) {
            object2 = f.a((Lg1)object2, (wr1_1)object);
            Object var8_10 = null;
            ClickableElement clickableElement = new ClickableElement((wr1_1)object, null, bl2, null, cP2, function0);
            object2 = object2.then(clickableElement);
        } else {
            object = new c((Lg1)object2, bl2, null, cP2, function0);
            object2 = ji1.a;
            Z20 z20 = new Z20((Function1)object2, (gx0_2)object);
            object2 = z20;
        }
        return lP1.then((LP1)object2);
    }

    public static LP1 b(LP1 lP1, boolean bl2, String string2, Function0 function0, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = true;
        }
        n4 = 0;
        if ((n3 &= 2) != 0) {
            string2 = null;
        }
        ji1$a ji1$a = ji1.a;
        b b2 = new b(bl2, string2, null, function0);
        return a30_0.a(lP1, ji1$a, b2);
    }

    public static LP1 c(LP1 lP1, wr1_1 wr1_12, Function0 function0) {
        CombinedClickableElement combinedClickableElement = new CombinedClickableElement(wr1_12, true, null, null, function0, null, null, null);
        return lP1.then(combinedClickableElement);
    }
}

