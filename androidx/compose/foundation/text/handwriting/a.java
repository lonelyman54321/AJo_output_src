/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.text.handwriting.StylusHandwritingElementWithNegativePadding;
import kotlin.jvm.functions.Function0;

public final class a {
    public static final float a = 40;
    public static final float b = 10;

    public static final LP1 a(Function0 function0, boolean bl2) {
        LP1 lP1 = LP1$a.b;
        if (bl2 && (bl2 = ef3_0.a)) {
            StylusHandwritingElementWithNegativePadding stylusHandwritingElementWithNegativePadding = new StylusHandwritingElementWithNegativePadding(function0);
            float f5 = b;
            float f6 = a;
            lP1 = h.f(stylusHandwritingElementWithNegativePadding, f5, f6);
        }
        return lP1;
    }
}

