/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.BlockGraphicsLayerElement;
import androidx.compose.ui.graphics.GraphicsLayerElement;
import kotlin.jvm.functions.Function1;

public final class a {
    public static final LP1 a(LP1 lP1, Function1 function1) {
        BlockGraphicsLayerElement blockGraphicsLayerElement = new BlockGraphicsLayerElement(function1);
        return lP1.then(blockGraphicsLayerElement);
    }

    public static LP1 b(LP1 lP1, float f5, float f6, float f7, float f8, i13 i132, boolean bl2, int n3) {
        boolean bl3;
        GraphicsLayerElement graphicsLayerElement;
        i13 i133;
        float f11;
        Object object;
        int n4 = n3;
        int n7 = n3 & 1;
        float f12 = n7 != 0 ? 1.0f : f5;
        n7 = n4 & 2;
        float f14 = n7 != 0 ? 1.0f : f6;
        n7 = n4 & 4;
        float f15 = n7 != 0 ? 1.0f : f7;
        n7 = n4 & 0x100;
        if (n7 != 0) {
            n7 = 0;
            object = null;
            f11 = 0.0f;
        } else {
            f11 = f8;
        }
        long l2 = Oq3.b;
        n7 = n4 & 0x800;
        if (n7 != 0) {
            object = fg2_1.a;
            i133 = object;
        } else {
            i133 = i132;
        }
        if ((n4 &= 0x1000) != 0) {
            n4 = 0;
            graphicsLayerElement = null;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        long l3 = b11_0.a;
        graphicsLayerElement = new GraphicsLayerElement(f12, f14, f15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f11, 8.0f, l2, i133, bl3, l3, l3, 0);
        object = lP1;
        return lP1.then(graphicsLayerElement);
    }
}

