/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.IntrinsicHeightElement;
import androidx.compose.foundation.layout.IntrinsicWidthElement;

public final class f {
    public static final LP1 a(LP1 lP1, Tj1 tj1) {
        ji1$a ji1$a = ji1.a;
        IntrinsicHeightElement intrinsicHeightElement = new IntrinsicHeightElement(tj1, ji1$a);
        return lP1.then(intrinsicHeightElement);
    }

    public static final LP1 b(LP1 lP1, Tj1 tj1) {
        ji1$a ji1$a = ji1.a;
        IntrinsicWidthElement intrinsicWidthElement = new IntrinsicWidthElement(tj1, ji1$a);
        return lP1.then(intrinsicWidthElement);
    }
}

