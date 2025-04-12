/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.transition;

import com.google.android.material.R$attr;
import com.google.android.material.transition.FadeThroughProvider;
import com.google.android.material.transition.MaterialVisibility;
import com.google.android.material.transition.ScaleProvider;
import com.google.android.material.transition.VisibilityAnimatorProvider;

public final class MaterialFadeThrough
extends MaterialVisibility {
    private static final float DEFAULT_START_SCALE = 0.92f;
    private static final int DEFAULT_THEMED_DURATION_ATTR = R$attr.motionDurationLong1;
    private static final int DEFAULT_THEMED_EASING_ATTR = R$attr.motionEasingEmphasizedInterpolator;

    public MaterialFadeThrough() {
        FadeThroughProvider fadeThroughProvider = MaterialFadeThrough.createPrimaryAnimatorProvider();
        VisibilityAnimatorProvider visibilityAnimatorProvider = MaterialFadeThrough.createSecondaryAnimatorProvider();
        super(fadeThroughProvider, visibilityAnimatorProvider);
    }

    private static FadeThroughProvider createPrimaryAnimatorProvider() {
        FadeThroughProvider fadeThroughProvider = new FadeThroughProvider();
        return fadeThroughProvider;
    }

    private static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        ScaleProvider scaleProvider = new ScaleProvider();
        scaleProvider.setScaleOnDisappear(false);
        scaleProvider.setIncomingStartScale(0.92f);
        return scaleProvider;
    }

    public int getDurationThemeAttrResId(boolean bl2) {
        return DEFAULT_THEMED_DURATION_ATTR;
    }

    public int getEasingThemeAttrResId(boolean bl2) {
        return DEFAULT_THEMED_EASING_ATTR;
    }
}

