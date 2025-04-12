/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.PaddingElement;
import androidx.compose.foundation.layout.PaddingValuesElement;
import androidx.compose.foundation.layout.h$a;
import androidx.compose.foundation.layout.h$b;
import androidx.compose.foundation.layout.h$c;
import androidx.compose.foundation.layout.h$d;
import kotlin.jvm.internal.Lambda;

public final class h {
    public static nk2_0 a(float f5, float f6, float f7, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = 0.0f;
        }
        float f8 = 0.0f;
        int n7 = n3 & 4;
        if (n7 != 0) {
            f6 = 0.0f;
        }
        if ((n3 &= 8) != 0) {
            f7 = 0.0f;
        }
        nk2_0 nk2_02 = new nk2_0(f5, f8, f6, f7);
        return nk2_02;
    }

    public static final float b(mk2_0 mk2_02, bp1_0 bp1_02) {
        bp1_0 bp1_03 = bp1_0.Ltr;
        float f5 = bp1_02 == bp1_03 ? mk2_02.calculateRightPadding-u2uoSUM(bp1_02) : mk2_02.calculateLeftPadding-u2uoSUM(bp1_02);
        return f5;
    }

    public static final float c(mk2_0 mk2_02, bp1_0 bp1_02) {
        bp1_0 bp1_03 = bp1_0.Ltr;
        float f5 = bp1_02 == bp1_03 ? mk2_02.calculateLeftPadding-u2uoSUM(bp1_02) : mk2_02.calculateRightPadding-u2uoSUM(bp1_02);
        return f5;
    }

    public static final LP1 d(LP1 lP1, mk2_0 mk2_02) {
        h$d h$d = new h$d(mk2_02);
        PaddingValuesElement paddingValuesElement = new PaddingValuesElement(mk2_02, h$d);
        return lP1.then(paddingValuesElement);
    }

    public static final LP1 e(LP1 lP1, float f5) {
        h$c h$c = new Lambda(1);
        PaddingElement paddingElement = new PaddingElement(f5, f5, f5, f5, h$c);
        return lP1.then(paddingElement);
    }

    public static final LP1 f(LP1 lP1, float f5, float f6) {
        h$b h$b = new h$b(f5, f6);
        PaddingElement paddingElement = new PaddingElement(f5, f6, f5, f6, h$b);
        return lP1.then(paddingElement);
    }

    public static LP1 g(LP1 lP1, float f5, float f6, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = 0.0f;
        }
        if ((n3 &= 2) != 0) {
            f6 = 0.0f;
        }
        return h.f(lP1, f5, f6);
    }

    public static final LP1 h(LP1 lP1, float f5, float f6, float f7, float f8) {
        h$a h$a = new h$a(f5, f6, f7, f8);
        PaddingElement paddingElement = new PaddingElement(f5, f6, f7, f8, h$a);
        return lP1.then(paddingElement);
    }

    public static LP1 i(LP1 lP1, float f5, float f6, float f7, float f8, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = 0.0f;
        }
        if ((n4 = n3 & 2) != 0) {
            f6 = 0.0f;
        }
        if ((n4 = n3 & 4) != 0) {
            f7 = 0.0f;
        }
        if ((n3 &= 8) != 0) {
            f8 = 0.0f;
        }
        return h.h(lP1, f5, f6, f7, f8);
    }
}

