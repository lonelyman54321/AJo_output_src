/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation;

import androidx.compose.foundation.FocusableElement;
import androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1;

public final class FocusableKt {
    static {
        new FocusableKt$FocusableInNonTouchModeElement$1();
    }

    public static final LP1 a(LP1 lP1, boolean bl2, wr1_1 wr1_12) {
        LP1 lP12 = bl2 ? new FocusableElement(wr1_12) : LP1$a.b;
        return lP1.then(lP12);
    }

    public static /* synthetic */ LP1 b(LP1 lP1, boolean bl2, int n3) {
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            bl2 = true;
        }
        return FocusableKt.a(lP1, bl2, null);
    }
}

