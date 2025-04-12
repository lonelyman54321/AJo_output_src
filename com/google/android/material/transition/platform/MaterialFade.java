/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 */
package com.google.android.material.transition.platform;

import android.animation.TimeInterpolator;
import com.google.android.material.R$attr;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.transition.platform.FadeProvider;
import com.google.android.material.transition.platform.MaterialVisibility;
import com.google.android.material.transition.platform.ScaleProvider;
import com.google.android.material.transition.platform.VisibilityAnimatorProvider;

public final class MaterialFade
extends MaterialVisibility {
    private static final float DEFAULT_FADE_END_THRESHOLD_ENTER = 0.3f;
    private static final float DEFAULT_START_SCALE = 0.8f;
    private static final int DEFAULT_THEMED_INCOMING_DURATION_ATTR = R$attr.motionDurationMedium4;
    private static final int DEFAULT_THEMED_INCOMING_EASING_ATTR;
    private static final int DEFAULT_THEMED_OUTGOING_DURATION_ATTR;
    private static final int DEFAULT_THEMED_OUTGOING_EASING_ATTR;

    static {
        DEFAULT_THEMED_OUTGOING_DURATION_ATTR = R$attr.motionDurationShort3;
        DEFAULT_THEMED_INCOMING_EASING_ATTR = R$attr.motionEasingEmphasizedDecelerateInterpolator;
        DEFAULT_THEMED_OUTGOING_EASING_ATTR = R$attr.motionEasingEmphasizedAccelerateInterpolator;
    }

    public MaterialFade() {
        FadeProvider fadeProvider = MaterialFade.createPrimaryAnimatorProvider();
        VisibilityAnimatorProvider visibilityAnimatorProvider = MaterialFade.createSecondaryAnimatorProvider();
        super(fadeProvider, visibilityAnimatorProvider);
    }

    private static FadeProvider createPrimaryAnimatorProvider() {
        FadeProvider fadeProvider = new FadeProvider();
        fadeProvider.setIncomingEndThreshold(0.3f);
        return fadeProvider;
    }

    private static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        ScaleProvider scaleProvider = new ScaleProvider();
        scaleProvider.setScaleOnDisappear(false);
        scaleProvider.setIncomingStartScale(0.8f);
        return scaleProvider;
    }

    public TimeInterpolator getDefaultEasingInterpolator(boolean bl2) {
        return AnimationUtils.LINEAR_INTERPOLATOR;
    }

    /*
     * WARNING - void declaration
     */
    public int getDurationThemeAttrResId(boolean bl2) {
        void var1_4;
        if (bl2) {
            int n3 = DEFAULT_THEMED_INCOMING_DURATION_ATTR;
        } else {
            int n4 = DEFAULT_THEMED_OUTGOING_DURATION_ATTR;
        }
        return (int)var1_4;
    }

    /*
     * WARNING - void declaration
     */
    public int getEasingThemeAttrResId(boolean bl2) {
        void var1_4;
        if (bl2) {
            int n3 = DEFAULT_THEMED_INCOMING_EASING_ATTR;
        } else {
            int n4 = DEFAULT_THEMED_OUTGOING_EASING_ATTR;
        }
        return (int)var1_4;
    }
}

