/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.selection;

import androidx.compose.foundation.selection.TriStateToggleableElement;
import androidx.compose.foundation.selection.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f {
    public static final LP1 a(ao3 ao32, wr1_1 wr1_12, Lg1 lg1, boolean bl2, CP2 cP2, Function0 function0) {
        LP1 lP1;
        boolean bl3 = lg1 instanceof Qg1;
        if (bl3) {
            Lg1 lg12 = lg1;
            lg12 = (Qg1)lg1;
            TriStateToggleableElement triStateToggleableElement = lP1;
            Function0 function02 = function0;
            lP1 = new TriStateToggleableElement(ao32, wr1_12, (Qg1)lg12, bl2, cP2, function0);
        } else if (lg1 == null) {
            Object var7_8 = null;
            TriStateToggleableElement triStateToggleableElement = lP1;
            Function0 function03 = function0;
            lP1 = new TriStateToggleableElement(ao32, wr1_12, null, bl2, cP2, function0);
        } else if (wr1_12 != null) {
            TriStateToggleableElement triStateToggleableElement;
            lP1 = androidx.compose.foundation.f.a(lg1, wr1_12);
            Object var7_9 = null;
            TriStateToggleableElement triStateToggleableElement2 = triStateToggleableElement;
            Function0 function04 = function0;
            triStateToggleableElement = new TriStateToggleableElement(ao32, wr1_12, null, bl2, cP2, function0);
            lP1 = lP1.then(triStateToggleableElement);
        } else {
            e e2;
            Lambda lambda = e2;
            e2 = new e(lg1, ao32, bl2, cP2, function0);
            lambda = ji1.a;
            lP1 = new Z20((Function1)((Object)lambda), e2);
        }
        return lP1;
    }
}

