/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.transition.platform;

import com.google.android.material.transition.platform.FadeProvider;
import com.google.android.material.transition.platform.MaterialVisibility;
import com.google.android.material.transition.platform.ScaleProvider;
import com.google.android.material.transition.platform.VisibilityAnimatorProvider;

public final class MaterialElevationScale
extends MaterialVisibility {
    private static final float DEFAULT_SCALE = 0.85f;
    private final boolean growing;

    public MaterialElevationScale(boolean bl2) {
        ScaleProvider scaleProvider = MaterialElevationScale.createPrimaryAnimatorProvider(bl2);
        VisibilityAnimatorProvider visibilityAnimatorProvider = MaterialElevationScale.createSecondaryAnimatorProvider();
        super(scaleProvider, visibilityAnimatorProvider);
        this.growing = bl2;
    }

    private static ScaleProvider createPrimaryAnimatorProvider(boolean bl2) {
        ScaleProvider scaleProvider = new ScaleProvider(bl2);
        float f5 = 0.85f;
        scaleProvider.setOutgoingEndScale(f5);
        scaleProvider.setIncomingStartScale(f5);
        return scaleProvider;
    }

    private static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        FadeProvider fadeProvider = new FadeProvider();
        return fadeProvider;
    }

    public boolean isGrowing() {
        return this.growing;
    }
}

