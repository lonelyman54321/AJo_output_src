/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.draw;

import androidx.compose.ui.draw.PainterElement;

public final class b {
    public static LP1 a(LP1 lP1, im2 im22, Nc object, i70_0 i70_02, float f5, TX tX, int n3) {
        float f6;
        int n4 = n3 & 4;
        if (n4 != 0) {
            object = Nc$a.e;
        }
        Nc nc = object;
        int n7 = n3 & 8;
        if (n7 != 0) {
            i70_02 = i70$a.e;
        }
        i70_0 i70_03 = i70_02;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            f5 = 1.0f;
            f6 = 1.0f;
        } else {
            f6 = f5;
        }
        n7 = n3 & 0x20;
        if (n7 != 0) {
            tX = null;
        }
        object = new PainterElement(im22, true, nc, i70_03, f6, tX);
        return lP1.then((LP1)object);
    }
}

