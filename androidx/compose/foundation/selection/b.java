/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.selection;

import androidx.compose.foundation.f;
import androidx.compose.foundation.selection.SelectableElement;
import androidx.compose.foundation.selection.b$a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b {
    public static final LP1 a(LP1 lP1, boolean bl2, wr1_1 wr1_12, Lg1 lg1, boolean bl3, CP2 cP2, Function0 function0) {
        LP1 lP12;
        boolean bl4 = lg1 instanceof Qg1;
        if (bl4) {
            Lg1 lg12 = lg1;
            lg12 = (Qg1)lg1;
            SelectableElement selectableElement = lP12;
            Function0 function02 = function0;
            lP12 = new SelectableElement(bl2, wr1_12, (Qg1)lg12, bl3, cP2, function0);
        } else if (lg1 == null) {
            Object var8_9 = null;
            SelectableElement selectableElement = lP12;
            Function0 function03 = function0;
            lP12 = new SelectableElement(bl2, wr1_12, null, bl3, cP2, function0);
        } else if (wr1_12 != null) {
            SelectableElement selectableElement;
            lP12 = f.a(lg1, wr1_12);
            Object var8_10 = null;
            SelectableElement selectableElement2 = selectableElement;
            Function0 function04 = function0;
            selectableElement = new SelectableElement(bl2, wr1_12, null, bl3, cP2, function0);
            lP12 = lP12.then(selectableElement);
        } else {
            b$a b$a;
            Lambda lambda = b$a;
            b$a = new b$a(lg1, bl2, bl3, cP2, function0);
            lambda = ji1.a;
            lP12 = new Z20((Function1)((Object)lambda), b$a);
        }
        return lP1.then(lP12);
    }
}

