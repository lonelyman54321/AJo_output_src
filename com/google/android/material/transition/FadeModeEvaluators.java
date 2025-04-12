/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.transition;

import com.google.android.material.transition.FadeModeEvaluator;
import com.google.android.material.transition.FadeModeEvaluators$1;
import com.google.android.material.transition.FadeModeEvaluators$2;
import com.google.android.material.transition.FadeModeEvaluators$3;
import com.google.android.material.transition.FadeModeEvaluators$4;

class FadeModeEvaluators {
    private static final FadeModeEvaluator CROSS;
    private static final FadeModeEvaluator IN;
    private static final FadeModeEvaluator OUT;
    private static final FadeModeEvaluator THROUGH;

    static {
        FadeModeEvaluator fadeModeEvaluator = new FadeModeEvaluators$1();
        IN = fadeModeEvaluator;
        fadeModeEvaluator = new FadeModeEvaluators$2();
        OUT = fadeModeEvaluator;
        fadeModeEvaluator = new FadeModeEvaluators$3();
        CROSS = fadeModeEvaluator;
        fadeModeEvaluator = new FadeModeEvaluators$4();
        THROUGH = fadeModeEvaluator;
    }

    private FadeModeEvaluators() {
    }

    public static FadeModeEvaluator get(int n3, boolean n4) {
        if (n3 != 0) {
            int n7 = 1;
            if (n3 != n7) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 == n4) {
                        return THROUGH;
                    }
                    String string2 = hj0_0.a(n3, "Invalid fade mode: ");
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                    throw illegalArgumentException;
                }
                return CROSS;
            }
            FadeModeEvaluator fadeModeEvaluator = n4 != 0 ? OUT : IN;
            return fadeModeEvaluator;
        }
        FadeModeEvaluator fadeModeEvaluator = n4 != 0 ? IN : OUT;
        return fadeModeEvaluator;
    }
}

