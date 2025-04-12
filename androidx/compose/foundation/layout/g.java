/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.OffsetElement;
import androidx.compose.foundation.layout.OffsetPxElement;
import androidx.compose.foundation.layout.g$a;
import androidx.compose.foundation.layout.g$b;
import kotlin.jvm.functions.Function1;

public final class g {
    public static LP1 a(LP1 lP1, float f5) {
        float f6 = 0.0f;
        g72 g722 = new g72(f5, f6);
        OffsetElement offsetElement = new OffsetElement(f5, f6, false, g722);
        return lP1.then(offsetElement);
    }

    public static final LP1 b(LP1 lP1, Function1 function1) {
        g$b g$b = new g$b(function1);
        OffsetPxElement offsetPxElement = new OffsetPxElement(function1, g$b);
        return lP1.then(offsetPxElement);
    }

    public static final LP1 c(LP1 lP1, float f5, float f6) {
        g$a g$a = new g$a(f5, f6);
        OffsetElement offsetElement = new OffsetElement(f5, f6, true, g$a);
        return lP1.then(offsetElement);
    }

    public static LP1 d(LP1 lP1, float f5, float f6, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = 0.0f;
        }
        if ((n3 &= 2) != 0) {
            f6 = 0.0f;
        }
        return g.c(lP1, f5, f6);
    }
}

