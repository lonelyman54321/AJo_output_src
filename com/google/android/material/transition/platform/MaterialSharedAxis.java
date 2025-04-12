/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.transition.platform;

import com.google.android.material.R$attr;
import com.google.android.material.transition.platform.FadeThroughProvider;
import com.google.android.material.transition.platform.MaterialVisibility;
import com.google.android.material.transition.platform.ScaleProvider;
import com.google.android.material.transition.platform.SlideDistanceProvider;
import com.google.android.material.transition.platform.VisibilityAnimatorProvider;

public final class MaterialSharedAxis
extends MaterialVisibility {
    private static final int DEFAULT_THEMED_DURATION_ATTR = 0;
    private static final int DEFAULT_THEMED_EASING_ATTR = 0;
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;
    private final int axis;
    private final boolean forward;

    static {
        DEFAULT_THEMED_DURATION_ATTR = R$attr.motionDurationLong1;
        DEFAULT_THEMED_EASING_ATTR = R$attr.motionEasingEmphasizedInterpolator;
    }

    public MaterialSharedAxis(int n3, boolean bl2) {
        VisibilityAnimatorProvider visibilityAnimatorProvider = MaterialSharedAxis.createPrimaryAnimatorProvider(n3, bl2);
        VisibilityAnimatorProvider visibilityAnimatorProvider2 = MaterialSharedAxis.createSecondaryAnimatorProvider();
        super(visibilityAnimatorProvider, visibilityAnimatorProvider2);
        this.axis = n3;
        this.forward = bl2;
    }

    /*
     * WARNING - void declaration
     */
    private static VisibilityAnimatorProvider createPrimaryAnimatorProvider(int n3, boolean bl2) {
        void var1_7;
        if (n3 != 0) {
            void var1_4;
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 == n4) {
                    ScaleProvider scaleProvider = new ScaleProvider(bl2);
                    return scaleProvider;
                }
                String string2 = hj0_0.a(n3, "Invalid axis: ");
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                throw illegalArgumentException;
            }
            if (bl2) {
                int n7 = 80;
            } else {
                int n8 = 48;
            }
            SlideDistanceProvider slideDistanceProvider = new SlideDistanceProvider((int)var1_4);
            return slideDistanceProvider;
        }
        if (bl2) {
            int n10 = 0x800005;
        } else {
            int n14 = 0x800003;
        }
        SlideDistanceProvider slideDistanceProvider = new SlideDistanceProvider((int)var1_7);
        return slideDistanceProvider;
    }

    private static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        FadeThroughProvider fadeThroughProvider = new FadeThroughProvider();
        return fadeThroughProvider;
    }

    public int getAxis() {
        return this.axis;
    }

    public int getDurationThemeAttrResId(boolean bl2) {
        return DEFAULT_THEMED_DURATION_ATTR;
    }

    public int getEasingThemeAttrResId(boolean bl2) {
        return DEFAULT_THEMED_EASING_ATTR;
    }

    public boolean isForward() {
        return this.forward;
    }
}

