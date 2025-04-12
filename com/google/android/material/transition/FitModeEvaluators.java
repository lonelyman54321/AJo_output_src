/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
package com.google.android.material.transition;

import android.graphics.RectF;
import com.google.android.material.transition.FitModeEvaluator;
import com.google.android.material.transition.FitModeEvaluators$1;
import com.google.android.material.transition.FitModeEvaluators$2;

class FitModeEvaluators {
    private static final FitModeEvaluator HEIGHT;
    private static final FitModeEvaluator WIDTH;

    static {
        FitModeEvaluator fitModeEvaluator = new FitModeEvaluators$1();
        WIDTH = fitModeEvaluator;
        fitModeEvaluator = new FitModeEvaluators$2();
        HEIGHT = fitModeEvaluator;
    }

    private FitModeEvaluators() {
    }

    public static FitModeEvaluator get(int n3, boolean n4, RectF rectF, RectF rectF2) {
        if (n3 != 0) {
            n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 == n4) {
                    return HEIGHT;
                }
                String string2 = hj0_0.a(n3, "Invalid fit mode: ");
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                throw illegalArgumentException;
            }
            return WIDTH;
        }
        n3 = (int)(FitModeEvaluators.shouldAutoFitToWidth(n4 != 0, rectF, rectF2) ? 1 : 0);
        FitModeEvaluator fitModeEvaluator = n3 != 0 ? WIDTH : HEIGHT;
        return fitModeEvaluator;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean shouldAutoFitToWidth(boolean object, RectF rectF, RectF rectF2) {
        void var2_4;
        void var1_3;
        float f5 = var1_3.width();
        float f6 = var1_3.height();
        float f7 = var2_4.width();
        float f8 = var2_4.height();
        float f11 = f8 * f5 / f7;
        f7 = f7 * f6 / f5;
        boolean bl2 = false;
        f5 = 0.0f;
        if (object != 0) {
            Object object2 = f11 == f6 ? 0 : (f11 > f6 ? 1 : -1);
            if (object2 < 0) return bl2;
            return true;
        }
        Object object3 = f7 == f8 ? 0 : (f7 > f8 ? 1 : -1);
        if (object3 < 0) return bl2;
        return true;
    }
}

