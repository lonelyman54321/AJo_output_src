/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color;

import com.google.android.material.color.ColorContrastOptions$1;
import com.google.android.material.color.ColorContrastOptions$Builder;

public class ColorContrastOptions {
    private final int highContrastThemeOverlayResourceId;
    private final int mediumContrastThemeOverlayResourceId;

    private ColorContrastOptions(ColorContrastOptions$Builder colorContrastOptions$Builder) {
        int n3;
        int n4;
        this.mediumContrastThemeOverlayResourceId = n4 = ColorContrastOptions$Builder.access$000(colorContrastOptions$Builder);
        this.highContrastThemeOverlayResourceId = n3 = ColorContrastOptions$Builder.access$100(colorContrastOptions$Builder);
    }

    public /* synthetic */ ColorContrastOptions(ColorContrastOptions$Builder colorContrastOptions$Builder, ColorContrastOptions$1 colorContrastOptions$1) {
        this(colorContrastOptions$Builder);
    }

    public int getHighContrastThemeOverlay() {
        return this.highContrastThemeOverlayResourceId;
    }

    public int getMediumContrastThemeOverlay() {
        return this.mediumContrastThemeOverlayResourceId;
    }
}

